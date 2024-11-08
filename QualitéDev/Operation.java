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
     * @throws IllegalArgumentException Si un des opérandes est null.
     * @throws MismatchException Si les types des opérandes ne correspondent pas.
     */
    public Operation(Expression operande1, Expression operande2) throws MismatchException {
        if (operande1 == null || operande2 == null) {
            throw new IllegalArgumentException("Les opérandes ne peuvent pas être nuls.");
        }
        
        // Vérification de la correspondance des types entre les opérandes
        if (!operande1.getClass().equals(operande2.getClass())) {
            throw new MismatchException("Les types des opérandes doivent correspondre.");
        }
        
        this.operande1 = operande1;
        this.operande2 = operande2;
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
