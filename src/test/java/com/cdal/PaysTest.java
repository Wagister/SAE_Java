package test.java.com.cdal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.com.cdal.Pays;
import main.java.com.cdal.PaysExistantException;

public class PaysTest {
    private Pays pays;

    @BeforeEach
    public void setUp() {
        try {
            this.pays = new Pays("Allemagne");
        } catch (PaysExistantException e) {}
    }

    @Test
    public void testGetNomPays() {
        assertEquals("Allemagne", this.pays.getNomPays());
    }

}
