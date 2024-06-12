package main.java.com.cdal;

/**
 * Exception levée lorsqu'un participant tente de rejoindre une équipe ou une épreuve mais son sexe ne correspond pas.
 */
public class MauvaisSexeException extends Exception {
    
    /**
     * Constructeur de la classe MauvaisSexeException.
     * @param sexeEpreuve Sexe de l'épreuve ou de l'équipe (true pour masculin, false pour féminin).
     * @param ensAthlete Le type de participant (épreuve ou équipe).
     */
    public MauvaisSexeException(boolean sexeEpreuve, String ensAthlete) {
        super("Ce participant ne peut pas rejoindre cette " +
            ensAthlete + ", car c'est une " + ensAthlete + 
            ((sexeEpreuve) ? " masculine " : " féminine ") + "!");
    }
}