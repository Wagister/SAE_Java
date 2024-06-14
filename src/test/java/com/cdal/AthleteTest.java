package test.java.com.cdal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Comparator;
import java.util.HashSet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.com.cdal.Athlete;
import main.java.com.cdal.Pays;
import main.java.com.cdal.PaysExistantException;
import main.java.com.cdal.ComparerParticipants;
import main.java.com.cdal.Comparaison;

public class AthleteTest {
    private Athlete athlete;
    private Pays pays;

    @BeforeEach
    public void setUp() {
        try {
            Pays.ensemblePays = new HashSet<String>();
            this.pays = new Pays("France");
        } catch (PaysExistantException e) {
        }
        this.athlete = new Athlete("Pogba", "Paul", true, 10, 10, 10, this.pays);
    }

    @Test
    public void testEstMasculin() {
        assertEquals(true, this.athlete.estMasculin());
    }

    @Test
    public void testGetForce() {
        assertEquals(10, this.athlete.getForce());
    }

    @Test
    public void testGetEndurance() {
        assertEquals(10, this.athlete.getEndurance());
    }

    @Test
    public void testGetAgilite() {
        assertEquals(10, this.athlete.getAgilite());
    }

    @Test
    public void testGetNationalite() {
        assertEquals(this.pays, this.athlete.getNationalite());
    }

    @Test
    public void testGetNom() {
        assertEquals("Pogba", this.athlete.getNomAthlete());
    }

    @Test
    public void testGetPrenom() {
        assertEquals("Paul", this.athlete.getPrenom());
    }

    @Test
    public void testEquals() {
        assertEquals(true, this.athlete.equals(new Athlete("Pogba", "Paul", true, 10, 10, 10, this.pays)));
    }

    @Test
    public void testEqualsFalse() {
        assertEquals(false, this.athlete.equals(new Athlete("Pogba", "Paulo", false, 10, 10, 10, this.pays)));
    }

    @Test
    public void testEqualsNull() {
        assertEquals(false, this.athlete.equals(null));
    }

    @Test
    public void testGetMoyenne() {
        assertEquals(10, this.athlete.getMoyenne());
    }

    @Test
    public void testToString() {
        assertEquals("Paul Pogba", this.athlete.toString());
    }

    @Test
    public void testComparerParticipantsF() {
        Athlete athlete2 = new Athlete("Pogba", "Paul", true, 8, 10, 10, this.pays);
        ComparerParticipants comparer = new ComparerParticipants(Comparaison.FORCE);
        assertEquals(2, comparer.compare(athlete, athlete2));
    }

    @Test
    public void testComparerParticipantsM() {
        Athlete athlete2 = new Athlete("Pogba", "Paul", true, 8, 9, 10, this.pays);
        ComparerParticipants comparer = new ComparerParticipants(Comparaison.MOYENNE);
        assertEquals(1, comparer.compare(athlete, athlete2));
    }

    @Test
    public void testComparerParticipantsE() {
        Athlete athlete2 = new Athlete("Pogba", "Paul", true, 8, 9, 10, this.pays);
        ComparerParticipants comparer = new ComparerParticipants(Comparaison.ENDURANCE);
        assertEquals(1, comparer.compare(athlete, athlete2));
    }

    @Test
    public void testComparerParticipantsA() {
        Athlete athlete2 = new Athlete("Pogba", "Paul", true, 8, 9, 10, this.pays);
        ComparerParticipants comparer = new ComparerParticipants(Comparaison.AGILITE);
        assertEquals(0, comparer.compare(athlete, athlete2));
    }

}
