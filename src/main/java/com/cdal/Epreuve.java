package main.java.com.cdal;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Classe abstraite représentant une épreuve sportive.
 */
public abstract class Epreuve {
    protected String intitule;
    protected boolean sexe;
    private Sport sport;

    /**
     * Constructeur de la classe Epreuve.
     * @param intitule Le titre de l'épreuve.
     * @param sexe Indique si l'épreuve est masculine (true) ou féminine (false).
     * @param sport Le sport de l'épreuve.
     */
    public Epreuve(String intitule, boolean sexe, Sport sport) {
        this.intitule = intitule;
        this.sexe = sexe;
        this.sport = sport;
    }

    /**
     * Retourne le titre de l'épreuve.
     * @return Le titre de l'épreuve.
     */
    public String getIntitule() {
        return this.intitule;
    }

    /**
     * Vérifie si l'épreuve est masculine.
     * @return true si l'épreuve est masculine, false sinon.
     */
    public boolean estMasculine() {
        return this.sexe;
    }

    /**
     * Retourne le sport de l'épreuve.
     * @return Le sport associé à l'épreuve.
     */
    public Sport getSport() {
        return this.sport;
    }

    /**
     * Génère un classement des participants.
     * @param c Un comparateur utilisé pour définir l'ordre de classement des participants.
     * @param liste Une liste contenant des participants.
     * @return Une map où la clé représente la position dans le classement 
     *         et la valeur est le participant correspondant.
     */
    public static Map<Integer, Participant> genererClassement(List<Participant> liste, Comparator<Participant> c) {
        List<Participant> copie = new ArrayList<>(liste);
        Collections.sort(copie, c);

        Map<Integer, Participant> classement = new HashMap<>();
        for (int i = 0; i < copie.size(); i++) {
            Participant participant = copie.get(i);
            classement.put(i + 1, participant);
        }

        List<String> prix = Arrays.asList("Or", "Argent", "Bronze");
        for (int i = 0; i < 3; i++) {
            Map<String, Integer> medaillesPays = classement.get(i + 1).getNationalite().medailles;
            String currPrix = prix.get(i);
            medaillesPays.replace(currPrix, medaillesPays.get(currPrix) + 1);
        }

        return classement;
    }
}
