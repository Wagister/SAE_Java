package test.java.com.cdal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.com.cdal.Athlete;
import main.java.com.cdal.Equipe;
import main.java.com.cdal.MauvaisPaysException;
import main.java.com.cdal.MauvaisSexeException;
import main.java.com.cdal.Pays;
import main.java.com.cdal.PaysExistantException;

public class EquipeTest {

    private Pays pays;
    private Equipe equipe;

    @BeforeEach
    public void setUp() {
        try {
            Pays.ensemblePays = new HashSet<String>();
            this.pays = new Pays("France");
            this.equipe = new Equipe(true, 11, this.pays);
            this.equipe.ajouterCoequipier(new Athlete("Pogba", "Paul", true, 10, 10, 10, this.pays));
            this.equipe.ajouterCoequipier(new Athlete("Giroud", "Olivier", true, 10, 10, 10, this.pays));
            this.equipe.ajouterCoequipier(new Athlete("Lloris", "Hugo", true, 10, 10, 10, this.pays));
        } 
        catch (PaysExistantException e) {} 
        catch (MauvaisSexeException e) {}
        catch (MauvaisPaysException e) {}
    }

    @Test
    public void testEstMasculin() {
        assertEquals(true, this.equipe.estMasculin());
    }

    @Test
    public void testGetEffectif() {
        assertEquals(11, this.equipe.getTaille());
    }

    @Test
    public void testGetNationalite() {
        assertEquals(this.pays, this.equipe.getNationalite());
    }

    @Test
    public void testGetForce() {
        assertEquals(30, this.equipe.getForce());
    }

    @Test
    public void testGetEndurance() {
        assertEquals(30, this.equipe.getEndurance());
    }

    @Test
    public void testGetAgilite() {
        assertEquals(30, this.equipe.getAgilite());
    }

    @Test

    public void testAjouterCoequipier() {
        try {
            assertEquals(false,
                    this.equipe.ajouterCoequipier(new Athlete("Pogba", "Paul", true, 10, 10, 10, this.pays)));
        } catch (MauvaisSexeException e) {
            e.toString();
        } catch (MauvaisPaysException e) {
            e.toString();
        }

    }

    @Test
    public void testEnleverCoequipier() {
        assertEquals(true,
                this.equipe.enleverCoequipier(new Athlete("Pogba", "Paul", true, 10, 10, 10, this.pays)));
    }

    @Test
    public void testEquals() {
        Equipe equipe2 = new Equipe(true, 11, this.pays);
        try {
            equipe2.ajouterCoequipier(new Athlete("Pogba", "Paul", true, 10, 10, 10, this.pays));
            equipe2.ajouterCoequipier(new Athlete("Giroud", "Olivier", true, 10, 10, 10, this.pays));
            equipe2.ajouterCoequipier(new Athlete("Lloris", "Hugo", true, 10, 10, 10, this.pays));
        } catch (MauvaisSexeException e) {
            e.toString();
        } catch (MauvaisPaysException e) {
            e.toString();
        }
        assertEquals(true, this.equipe.equals(equipe2));
    }
}
