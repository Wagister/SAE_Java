import java.util.Set;
import java.util.HashSet;

public class EpreuveIndividuelle extends Epreuve {
    private Set<Athlete> athletesParticipants;

    public EpreuveIndividuelle(String intitule, boolean sexe, Sport sport) {
        super(intitule, sexe, sport);
        this.athletesParticipants = new HashSet<>();
    }

    public boolean ajouterAthlete(Athlete athlete) {
        if (athlete.estMasculin() == this.sexe) {
            return this.athletesParticipants.add(athlete);
        }
        return false;
    }

    public boolean enleverAthlete(Athlete athlete) {
        return this.athletesParticipants.remove(athlete);
    }
}
