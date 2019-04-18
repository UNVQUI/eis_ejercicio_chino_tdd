public class PrecioVenta {
    private int valor;

    public PrecioVenta(int valor) {
        this.valor = valor;
    }

    public Margen menos(Costo costo) {
        return new Margen(costo.calcularDiferenciaCon(valor));
    }
}
