import java.util.Set;
import java.util.HashSet;

public class Pays {
    private String nom;
    private Set<Participant> sportifs; 

    public Pays(String nom) {
        this.nom = nom;
        this.sportifs = new HashSet<>();
    }

    public String getNomPays() {
        return this.nom;
    }

    public boolean ajouterSportif(Participant participant) {
        return this.sportifs.add(participant);
    }   

    public boolean enleverSportif(Participant participant) {
        return this.sportifs.remove(participant);
    }
}