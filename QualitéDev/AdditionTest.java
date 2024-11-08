import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AdditionTest {

    @Test
    void testAddition() {
        // Opération : 5 + 3
        Addition addition = new Addition(new Nombre(5), new Nombre(3));
        
        // Vérifie que le résultat est correct
        assertEquals(8, addition.valeur(), "L'addition doit donner 8");
    }
}
