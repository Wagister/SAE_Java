package main.java.com.cdal;

/**
 * Exception levée lorsqu'un participant tente de rejoindre une équipe mais sa nationalité ne correspond pas.
 */
public class MauvaisPaysException extends Exception {
    
    /**
     * Constructeur de la classe MauvaisPaysException.
     * @param natio La nationalité attendue par l'équipe.
     */
    public MauvaisPaysException(Pays natio) {
        super("Ce participant ne peut pas rejoindre cette équipe, car il doit venir de : " + natio.getNomPays());
    }
}
