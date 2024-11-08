/**
 * Classe Multiplication
 */

public class Multiplication extends Operation {

    /**
     * Constructeur d'une multiplication.
     *
     * @param operande1 Le premier opérande de la multiplication.
     * @param operande2 Le second opérande de la multiplication.
     */
    public Multiplication(Expression operande1, Expression operande2) {
        super(operande1, operande2);
    }

    /**
     * Retourne la valeur de la multiplication.
     *
     * @return La valeur de la multiplication.
     */
    @Override
    public double valeur() {
        return getOperande1().valeur() * getOperande2().valeur();
    }

    /**
     * Retourne la représentation textuelle de la multiplication.
     *
     * @return La représentation textuelle de la multiplication.
     */
    @Override
    public String toString() {
        return "(" + getOperande1() + " * " + getOperande2() + ")";
    }
}