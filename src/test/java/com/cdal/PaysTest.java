package test.java.com.cdal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.com.cdal.Pays;
import main.java.com.cdal.PaysExistantException;
import main.java.com.cdal.Athlete;

public class PaysTest {
    private Pays pays;

    @BeforeEach
    public void setUp() {
        try {
            this.pays = new Pays("Allemagne");
        } catch (PaysExistantException e) {
        }
    }

    @Test
    public void testGetNomPays() {
        assertEquals("Allemagne", this.pays.getNomPays());
    }

    @Test
    public void testEquals() {
        Pays pays2 = null;
        try {
            pays2 = new Pays("Allemagne");
        } catch (PaysExistantException e) {
        }
        assertEquals(true, this.pays.equals(pays2));
    }

    @Test
    public void testAjouterCoequipier() {
        Athlete sportif = new Athlete("Muller", "Thomas", true, 10, 10, 10, this.pays);
        assertEquals(true, this.pays.ajouterSportif(sportif));
    }

    @Test
    public void testAjouterCoequipierMauvaiseNationalite() {
        Pays pays2 = null;
        try {
            pays2 = new Pays("France");
        } catch (PaysExistantException e) {
        }
        Athlete sportif = new Athlete("Muller", "Thomas", true, 10, 10, 10, pays2);
        assertEquals(false, this.pays.ajouterSportif(sportif));
    }

    @Test
    public void testEnleverCoequipier() {
        Athlete sportif = new Athlete("Muller", "Thomas", true, 10, 10, 10, this.pays);
        this.pays.ajouterSportif(sportif);
        assertEquals(true, this.pays.enleverSportif(sportif));
    }

    @Test
    public void getSportifs() {
        Athlete sportif = new Athlete("Muller", "Thomas", true, 10, 10, 10, this.pays);
        this.pays.ajouterSportif(sportif);
        assertEquals(true, this.pays.getSportifs().contains(sportif));
    }

    @Test
    public void testEqualsMauvaiseNationalite() {
        Pays pays2 = null;
        try {
            pays2 = new Pays("France");
        } catch (PaysExistantException e) {
        }
        assertEquals(false, this.pays.equals(pays2));
    }

    @Test
    public void testEqualsNull() {
        assertEquals(false, this.pays.equals(null));
    }

    @Test
    public void testEqualsMauvaisType() {
        assertEquals(false, this.pays.equals("test"));
    }

}
