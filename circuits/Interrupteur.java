/**
 *
 * @author Bernard.Carre@polytech-lille.fr
 */

package circuits;

public class Interrupteur extends Composant {
    protected String name;
	protected boolean etat;

    public Interrupteur(String n) {
        this.name = n;
    }

    public void on() {
        etat = true;
    }

    public void off() {
        etat = false;
    }

    public boolean getEtat() {
        return etat;
    }

    public void probe(SondesTable tableSondes) {}
	public void unprobe(SondesTable tableSondes) {}
    
}