import java.util.Map;
import java.util.HashMap;

public abstract class Epreuve {
    protected String intitule;
    protected boolean sexe;
    protected Map<Integer, Participant> classement;
    private Sport sport;

    public Epreuve(String intitule, boolean sexe, Sport sport) {
        this.intitule = intitule;
        this.sexe = sexe;
        this.sport = sport;
        this.classement = new HashMap<>();
    }

    public String getIntitule() {
        return this.intitule;
    }

    public boolean estMasculine() {
        return this.sexe;
    }

    public Sport getSport() {
        return this.sport;
    }

    public Map<Integer,Participant> genererClassement() {
        Map<Integer, Participant> tmp = new HashMap<>();
        return tmp;
    }
}
