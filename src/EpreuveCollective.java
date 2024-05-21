import java.util.Set;
import java.util.HashSet;

public class EpreuveCollective extends Epreuve {
    private Set<Equipe> equipesParticipantes;

    public EpreuveCollective(String intitule, boolean sexe, Sport sport) {
        super(intitule, sexe, sport);
        this.equipesParticipantes = new HashSet<>();
    }

    public boolean ajouterEquipe(Equipe equipe) {
        if (equipe.estMasculin() == this.sexe) {
            return this.equipesParticipantes.add(equipe);
        }
        return false;
    }

    public boolean enleverEquipe(Equipe equipe) {
        return this.equipesParticipantes.remove(equipe);
    }
}
