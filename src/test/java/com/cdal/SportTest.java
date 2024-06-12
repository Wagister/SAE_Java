package test.java.com.cdal;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.com.cdal.Sport;

public class SportTest {
    private Sport sport;

    @BeforeEach
    public void setUp() {
        this.sport = new Sport("Football");
    }

    @Test
    public void testGetNomSport() {
        assertEquals("Football", this.sport.getNomSport());
    }
    @Test 
    public void testEquals() {
        assertEquals(true, this.sport.equals(new Sport("Football")));
    }

}
