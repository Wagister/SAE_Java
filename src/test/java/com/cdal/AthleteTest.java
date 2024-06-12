package test.java.com.cdal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.com.cdal.Athlete;
import main.java.com.cdal.Pays;
import main.java.com.cdal.PaysExistantException;

public class AthleteTest {
    private Athlete athlete;
    private Pays pays;

    @BeforeEach
    public void setUp() {
        try {
            Pays.ensemblePays = new HashSet<String>();
            this.pays = new Pays("France");
        } catch (PaysExistantException e) {}
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
    public void testToString() {
        assertEquals("Paul Pogba", this.athlete.toString());
    }

}