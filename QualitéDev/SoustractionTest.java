import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SoustractionTest {

    @Test
    void testSoustraction() {
        // Opération : 10 - 4
        Soustraction soustraction = new Soustraction(new Nombre(10), new Nombre(4));
        
        // Vérifie que le résultat est correct
        assertEquals(6, soustraction.valeur(), "La soustraction doit donner 6");
    }
}
