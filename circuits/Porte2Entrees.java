package circuits;

public abstract class Porte2Entrees extends Porte {
	
	protected Composant in1;
	protected Composant in2;

	public void setIn1(Composant comp) {
		in1 = comp;
	}

	public void setIn2(Composant comp) {
		in2 = comp;
	}
	
	public String description() {	
		return super.description() + " in1: " + (in1 == null ? "not connected" : in1.getId()) + " in2: " + (in2 == null ? "not connected" : in2.getId()) ;
	}

	public boolean getEtat() throws NonConnectedException {
		if (in1 == null || in2 == null) {
			throw new NonConnectedException();
		}
		else {
			return eval() ;
		}
	}

	public abstract boolean eval() throws NonConnectedException;

	public void probe(SondesTable tableSondes) {
        if (this.in1 instanceof Interrupteur) {
            this.in1 = tableSondes.getSonde((Interrupteur)this.in1, this, "in1");
        }
        if (this.in2 instanceof Interrupteur) {
            this.in2 = tableSondes.getSonde((Interrupteur)this.in2, this, "in2");
        }
    }

	public void unprobe(SondesTable tableSondes) {
		if (this.in1 instanceof LazySonde) {
            this.in1 = tableSondes.getInterrupteur((LazySonde)this.in1);
        }
        if (this.in2 instanceof LazySonde) {
            this.in2 = tableSondes.getInterrupteur((LazySonde)this.in2);
        }
	}

}