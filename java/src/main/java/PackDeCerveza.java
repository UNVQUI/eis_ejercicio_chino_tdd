public class PackDeCerveza {
    private final double unidades;
    private final double costo;

    public PackDeCerveza(int unidades, int costo) {
        this.unidades = unidades;
        this.costo = costo;

    }

    public Cerveza item() {
        return new Cerveza(costo/unidades);
    }
}
