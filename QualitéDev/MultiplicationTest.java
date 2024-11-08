import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MultiplicationTest {

    @Test
    void testMultiplication() {
        // Opération : 6 * 4
        Multiplication multiplication = new Multiplication(new Nombre(6), new Nombre(4));
        
        // Vérifie que le résultat est correct
        assertEquals(24, multiplication.valeur(), "La multiplication doit donner 24");
    }
}
