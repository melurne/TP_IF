/**
 *
 * @author Bernard.Carre@polytech-lille.fr
 */

package circuits;

public class Not extends Porte {
	
	protected Composant in;
	
	public void setIn(Composant comp) {	
		in = comp;
	}

	public String description() {
		return super.description() + " in1: " + (in == null ? "not connected" : in.getId());
	
	}
	
	public boolean getEtat() throws NonConnectedException {
		if (in == null) {
			throw new NonConnectedException();
		}
		else {
			return !in.getEtat();
		}
	}

	public void probe(SondesTable tableSondes) {
        if (this.in instanceof Interrupteur) {
            this.in = tableSondes.getSonde((Interrupteur)this.in, this, "in");
        }
    }

	public void unprobe(SondesTable tableSondes) {
		if (this.in instanceof LazySonde) {
            this.in = tableSondes.getInterrupteur((LazySonde)this.in);
        }
	}

}
