package main.java.com.cdal;

/**
 * Interface représentant un participant.
 */
public interface Participant {

    /**
     * Vérifie si le participant est de sexe masculin.
     * @return true si le participant est masculin, false sinon.
     */
    public boolean estMasculin();

    /**
     * Retourne la force du participant.
     * @return la force du participant sous forme d'un entier.
     */
    public int getForce();

    /**
     * Retourne l'endurance du participant.
     * @return l'endurance du participant sous forme d'un entier.
     */
    public int getEndurance();

    /**
     * Retourne l'agilité du participant.
     * @return l'agilité du participant sous forme d'un entier.
     */
    public int getAgilite();

    /**
     * Retourne la moyenne des statistiques du participant.
     * @return la moyenne des statistiques du participant sous forme d'un entier.
     */
    public double getMoyenne();

    /**
     * Compare cet objet à l'objet spécifié. 
     * @param o l'objet à comparer.
     * @return true si les objets sont égaux, false sinon.
     */
    public boolean equals(Object o);

    /**
     * Retourne un hashCode pour cet objet.
     * @return un entier représentant le hashCode.
     */
    public int hashCode();

    /**
     * Retourne la nationalité du participant.
     * @return un Pays représentant la nationalité du participant.
     */
    public Pays getNationalite();
}
