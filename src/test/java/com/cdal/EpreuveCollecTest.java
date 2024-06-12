package test.java.com.cdal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.com.cdal.EpreuveCollective;
import main.java.com.cdal.Sport;
import main.java.com.cdal.Equipe;
import main.java.com.cdal.MauvaisSexeException;
import main.java.com.cdal.Pays;
import main.java.com.cdal.PaysExistantException;
import main.java.com.cdal.Epreuve;

public class EpreuveCollecTest {

    private EpreuveCollective epreuveCollective;

    @BeforeEach
    public void setUp() {
        this.epreuveCollective = new EpreuveCollective("Relais 4x100m", true, new Sport("Athletisme"));
    }

    @Test
    public void testGetNomEpreuve() {
        assertEquals("Relais 4x100m", this.epreuveCollective.getIntitule());
    }

    @Test
    public void testEstMasculine() {
        assertEquals(true, this.epreuveCollective.estMasculine());
    }

    @Test
    public void testGetSport() {
        assertEquals(new Sport("Athletisme"), this.epreuveCollective.getSport());
    }

    @Test
    public void testGenererClassement() {
        assertEquals(true, Epreuve.genererClassement(new ArrayList<>(this.epreuveCollective.getParticipants()), null) instanceof java.util.Map);
    }

    @Test
    public void testAjouterEquipe() {
        try {
            assertEquals(true, this.epreuveCollective.ajouterEquipe(new Equipe(true, 4, new Pays("Maroc"))));
        } 
        catch (MauvaisSexeException e) {}
        catch (PaysExistantException e) {}
    }

}
