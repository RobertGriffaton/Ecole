/**
 * Classe Nombre
 */

public class Nombre extends Expression {
    private double valeurNombre;

    /**
     * Constructeur d'un nombre.
     *
     * @param valeurNombre La valeur du nombre.
     */
    public Nombre(double valeurNombre) {
        this.valeurNombre = valeurNombre;
    }

    /**
     * Retourne la valeur du nombre.
     *
     * @return La valeur du nombre.
     */
    public double getValeurNombre() {
        return valeurNombre;
    }

    /**
     * Modifie la valeur du nombre.
     *
     * @param valeurNombre La nouvelle valeur du nombre.
     */
    public void setValeurNombre(double valeurNombre) {
        this.valeurNombre = valeurNombre;
    }

    /**
     * Retourne la valeur du nombre.
     *
     * @return La valeur du nombre.
     */
    @Override
    public double valeur() {
        return valeurNombre;
    }

    /**
     * Retourne la représentation textuelle du nombre.
     *
     * @return La représentation textuelle du nombre.
     */
    @Override
    public String toString() {
        return String.valueOf(valeurNombre);
    }
}