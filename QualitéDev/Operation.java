/**
 * Classe Operation
 */
public abstract class Operation extends Expression {
    private Expression operande1;
    private Expression operande2;

    /**
     * Constructeur d'une opération.
     *
     * @param operande1 Le premier opérande de l'opération.
     * @param operande2 Le second opérande de l'opération.
     * @throws IllegalArgumentException si l'un des opérandes ne correspond pas aux attentes.
     */
    public Operation(Expression operande1, Expression operande2) {
        if (operande1 == null || operande2 == null) {
            throw new IllegalArgumentException("Les opérandes ne peuvent pas être null.");
        }

        // Exemple de vérification de type ou de valeur
        if (!isValidOperande(operande1) || !isValidOperande(operande2)) {
            throw new IllegalArgumentException("Les opérandes ne sont pas compatibles avec cette opération.");
        }

        this.operande1 = operande1;
        this.operande2 = operande2;
    }

    /**
     * Méthode de validation des opérandes.
     * @param operande L'opérande à vérifier.
     * @return true si l'opérande est valide, sinon false.
     */
    private boolean isValidOperande(Expression operande) {
        // Ajoute des conditions de validation selon les besoins
        return true;
    }

    /**
     * Retourne le premier opérande de l'opération.
     *
     * @return Le premier opérande.
     */
    public Expression getOperande1() {
        return operande1;
    }

    /**
     * Retourne le second opérande de l'opération.
     *
     * @return Le second opérande.
     */
    public Expression getOperande2() {
        return operande2;
    }
}
