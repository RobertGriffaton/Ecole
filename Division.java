/** CLasse Division */

public class Division extends Operation {

    /**
     * Constructeur d'une division.
     *
     * @param operande1 Le premier opérande de la division.
     * @param operande2 Le second opérande de la division.
     */
    public Division(Expression operande1, Expression operande2) {
        super(operande1, operande2);
    }

    /**
     * Retourne la valeur de la division.
     *
     * @return La valeur de la division.
     */
    @Override
    public double valeur() {
        return getOperande1().valeur() / getOperande2().valeur();
    }

    /**
     * Retourne la représentation textuelle de la division.
     *
     * @return La représentation textuelle de la division.
     */
    @Override
    public String toString() {
        return "(" + getOperande1() + " / " + getOperande2() + ")";
    }
}