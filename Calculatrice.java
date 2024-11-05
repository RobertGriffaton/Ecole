

/**
 * Présentation de la classe principale de la calculatrice qui permet de tester des calculs.
 * Celle ci a été programmer pour une SAE en S2
 * 
 * 
 * <p>Cette classe utilise les classes d'opérations comme Addition, Soustraction,
 * Division, et des nombres pour effectuer des calculs basiques.</p>
 * 
 */
public class Calculatrice {

    /**
     * Méthode principale exécutant un exemple de calcul en utilisant les opérations de base.
     * <p>Exemple de calcul réalisé :
     * ((17 - 2) / (2 + 3)) */
    public static void main(String[] args) {
        // Exemple de test de l'opération (17-2) / (2+3)
        Expression deux = new Nombre(2);
        Expression trois = new Nombre(3);
        Expression dixSept = new Nombre(17);
        Expression s = new Soustraction(dixSept, deux);
        Expression a = new Addition(deux, trois);
        Expression d = new Division(s, a);

        System.out.println(d + " = " + d.valeur());
    }
}
