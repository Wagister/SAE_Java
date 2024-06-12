package main.java.com.cdal;

import java.util.Set;
import java.util.HashSet;

/**
 * Classe représentant une épreuve individuelle.
 */
public class EpreuveIndividuelle extends Epreuve {
    private Set<Athlete> athletesParticipants;

    /**
     * Constructeur de la classe EpreuveIndividuelle.
     * @param intitule Le titre de l'épreuve.
     * @param sexe Indique si l'épreuve est masculine (true) ou féminine (false).
     * @param sport Le sport associé à l'épreuve.
     */
    public EpreuveIndividuelle(String intitule, boolean sexe, Sport sport) {
        super(intitule, sexe, sport);
        this.athletesParticipants = new HashSet<>();
    }

    /**
     * Retourne l'ensemble des partcipants de l'épreuve.
     * @return Un ensemble de Participants representant des athlètes.
     */
    public Set<Athlete> getParticipants() {
        return this.athletesParticipants;
    }

    /**
     * Ajoute un athlète à l'épreuve individuelle.
     * @param athlete L'athlète à ajouter.
     * @return true si l'athlète a été ajouté avec succès, false sinon.
     * @throws MauvaisSexeException Si l'athlète a un sexe différent de celui de l'épreuve.
     */
    public boolean ajouterAthlete(Athlete athlete) throws MauvaisSexeException {
        if (athlete.estMasculin() == this.sexe) {
            return this.athletesParticipants.add(athlete);
        }
        throw new MauvaisSexeException(this.sexe, "epreuve");
    }

    /**
     * Enlève un athlète de l'épreuve individuelle.
     * @param athlete L'athlète à enlever.
     * @return true si l'athlète a été enlevé avec succès, false sinon.
     */
    public boolean enleverAthlete(Athlete athlete) {
        return this.athletesParticipants.remove(athlete);
    }
}
