package circuits;

public class And extends Porte2Entrees {
    public boolean eval() throws NonConnectedException {
        return in1.getEtat() && in2.getEtat();
    }
}