package circuits;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Circuit {
    protected String nom;
    protected List<Composant> composants = new ArrayList<Composant>();
    protected SondesTable tableSondes = new SondesTable();

    public Circuit() {}

    public Circuit(String nom, Composant[] cps) {
        this.nom = nom;
        this.composants.addAll(Arrays.asList(cps));
        Collections.sort(composants);
    }

    public void addComposant(Composant c) {
        composants.add(c);
    }

    public List<String> nomenclature() {
        List<String> output = new ArrayList<String>();
        
        for (Composant c : composants) {
            output.add(c.getId());
        }

        return output;
    }

    public String description() {
        String desc = this.nom + " : ";

        for (Composant c : composants) {
            desc += c.description() + "; ";
        }

        return desc;
        //System.out.println(desc);
    }

    //public String description() {}

    public String getName() {
        return this.nom;
    }

    public void traceEtat() {
        for (Composant comp : composants) {
			System.out.println(comp.traceEtat());
		}
    }

    public List<Interrupteur> getIns() {
        List<Interrupteur> output = new ArrayList<Interrupteur>();
        
        for (Composant c : composants) {
            if (c instanceof Interrupteur) {
                output.add((Interrupteur)c);
            }
        }
        
        return output;
    }

    public List<Vanne> getOuts() {
        List<Vanne> output = new ArrayList<Vanne>();
        
        for (Composant c : composants) {
            if (c instanceof Vanne) {
                output.add((Vanne)c);
            }
        }
        
        return output;
    }
    
    public void probe() {
        for (Composant c : composants) {
            c.probe(this.tableSondes);
        }
    }

    public void resetSondes() {
        tableSondes.resetSondes();
    }

    public void unprobe() {
        for (Composant c : composants) {
            c.unprobe(this.tableSondes);
        }
        tableSondes.clear();
    }

    public void save(String fileName) throws IOException{
        ObjectOutputStream file = new ObjectOutputStream(new FileOutputStream(fileName));
        file.writeObject(this.nom);
        file.writeObject(this.composants);
        file.close();
    }

    public void load(String fileName) throws IOException, ClassNotFoundException {
        ObjectInputStream file = new ObjectInputStream(new FileInputStream(fileName));
        this.nom = (String)file.readObject();
        this.composants = (ArrayList<Composant>)file.readObject();
        file.close();
    }

}
