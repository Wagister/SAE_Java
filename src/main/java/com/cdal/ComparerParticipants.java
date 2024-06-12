package main.java.com.cdal;

import java.util.Comparator;

/**
 * Classe pour comparer deux participants en fonction d'un critère de comparaison spécifié.
 */
public class ComparerParticipants implements Comparator<Participant> {
    
    /**
     * Le critère de comparaison utilisé pour comparer les participants.
     */
    private Comparaison comparaison;

    /**
     * Constructeur qui initialise le comparateur avec un critère de comparaison.
     * @param c Le critère de comparaison de type {@link Comparaison}.
     */
    public ComparerParticipants(Comparaison c) {
        this.comparaison = c;
    }

    /**
     * Compare deux participants en fonction du critère spécifié.
     * @param o1 Le premier participant à comparer.
     * @param o2 Le deuxième participant à comparer.
     * @return Un entier négatif, zéro ou un entier positif si le premier participant est respectivement
     *         moins, égal ou supérieur au deuxième participant selon le critère de comparaison.
     */
    @Override
    public int compare(Participant o1, Participant o2) {
        switch (this.comparaison) {
            case FORCE:
                return o2.getForce() - o1.getForce();

            case ENDURANCE:
                return o2.getEndurance() - o1.getEndurance();

            case AGILITE:
                return o2.getAgilite() - o1.getAgilite();

            case MOYENNE:
                return Double.compare(o1.getMoyenne(), o2.getMoyenne());

            default:
                Boolean b1 = (Boolean) o1.estMasculin();
                Boolean b2 = (Boolean) o2.estMasculin();
                return b2.compareTo(b1);
        }
    }
}
