import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DivisionTest {

    @Test
    void testDivision() {
        // Opération : 20 / 4
        Division division = new Division(new Nombre(20), new Nombre(4));
        
        // Vérifie que le résultat est correct
        assertEquals(5, division.valeur(), "La division doit donner 5");
    }
}
