package test.java.com.cdal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.com.cdal.EpreuveIndividuelle;
import main.java.com.cdal.Pays;
import main.java.com.cdal.PaysExistantException;
import main.java.com.cdal.Sport;
import main.java.com.cdal.Athlete;
import main.java.com.cdal.Epreuve;
import main.java.com.cdal.MauvaisSexeException;

public class EpreuveIndivTest {

    private EpreuveIndividuelle epreuveIndividuelle;

    @BeforeEach
    public void setUp() {
        this.epreuveIndividuelle = new EpreuveIndividuelle("100m", false, new Sport("Athletisme"));
    }

    @Test
    public void testGetNomEpreuve() {
        assertEquals("100m", this.epreuveIndividuelle.getIntitule());
    }

    @Test
    public void testEstMasculine() {
        assertEquals(false, this.epreuveIndividuelle.estMasculine());
    }

    @Test
    public void testGetSport() {
        assertEquals(new Sport("Athletisme"), this.epreuveIndividuelle.getSport());
    }

    @Test
    public void testGenererClassement() {
        assertEquals(true, Epreuve.genererClassement(new ArrayList<>(this.epreuveIndividuelle.getParticipants()), null) instanceof java.util.Map);
    }

    @Test
    public void testAjouterAthlete() {

        try {
            Pays france = new Pays("France");
            this.epreuveIndividuelle.ajouterAthlete(new Athlete("Pogba", "Paul", true, 10, 10, 10, france));
            assertEquals(false, this.epreuveIndividuelle
                    .ajouterAthlete(new Athlete("Pogba", "Paul", true, 10, 10, 10, france)));
        } 
        catch (MauvaisSexeException e) {} 
        catch (PaysExistantException e) {}
    }
}
