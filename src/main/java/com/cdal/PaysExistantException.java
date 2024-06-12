package main.java.com.cdal;

/**
 * Exception levée lorsque l'on tente de créer un pays qui existe déjà.
 */
public class PaysExistantException extends Exception {

    /**
     * Constructeur de l'exception PaysExistantException.
     */
    public PaysExistantException() {
        super("Ce pays existe déjà, vous ne pouvez pas le créer à nouveau !");
    }
}
