/**
 * Classe Soustraction
 */

public class Soustraction extends Operation {

    /**
     * Constructeur d'une soustraction.
     *
     * @param operande1 Le premier opérande de la soustraction.
     * @param operande2 Le second opérande de la soustraction.
     */
    public Soustraction(Expression operande1, Expression operande2) {
        super(operande1, operande2);
    }

    /**
     * Retourne la valeur de la soustraction.
     *
     * @return La valeur de la soustraction.
     */
    @Override
    public double valeur() {
        return getOperande1().valeur() - getOperande2().valeur();
    }

    /**
     * Retourne la représentation textuelle de la soustraction.
     *
     * @return La représentation textuelle de la soustraction.
     */
    @Override
    public String toString() {
        return "(" + getOperande1() + " - " + getOperande2() + ")";
    }
}