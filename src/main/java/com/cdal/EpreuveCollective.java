package main.java.com.cdal;

import java.util.Set;
import java.util.HashSet;

/**
 * Classe représentant une épreuve collective.
 */
public class EpreuveCollective extends Epreuve {
    private Set<Equipe> equipesParticipantes;

    /**
     * Constructeur de la classe EpreuveCollective.
     * @param intitule Le titre de l'épreuve.
     * @param sexe Indique si l'épreuve est masculine (true) ou féminine (false).
     * @param sport Le sport associé à l'épreuve.
     */
    public EpreuveCollective(String intitule, boolean sexe, Sport sport) {
        super(intitule, sexe, sport);
        this.equipesParticipantes = new HashSet<>();
    }

    /**
     * Retourne l'ensemble des partcipants de l'épreuve.
     * @return Un ensemble de Participants representant des équipes.
     */
    public Set<Equipe> getParticipants() {
        return this.equipesParticipantes;
    }

    /**
     * Ajoute une équipe à l'épreuve collective.
     * @param equipe L'équipe à ajouter.
     * @return true si l'équipe a été ajoutée avec succès, false sinon.
     * @throws MauvaisSexeException Si l'équipe a un sexe différent de celui de l'épreuve.
     */
    public boolean ajouterEquipe(Equipe equipe) throws MauvaisSexeException {
        if (equipe.estMasculin() == this.sexe) {
            return this.equipesParticipantes.add(equipe);
        }
        throw new MauvaisSexeException(this.sexe, "epreuve");
    }

    /**
     * Enlève une équipe de l'épreuve collective.
     * @param equipe L'équipe à enlever.
     * @return true si l'équipe a été enlevée avec succès, false sinon.
     */
    public boolean enleverEquipe(Equipe equipe) {
        return this.equipesParticipantes.remove(equipe);
    }
}
