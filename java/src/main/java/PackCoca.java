public class PackCoca {
    private final int unidades;
    private final double precioDeCompra;

    public PackCoca(int unidades, double precioDeCompra) {
        this.unidades = unidades;
        this.precioDeCompra = precioDeCompra;
    }

    public Coca unidad() {
        return new Coca(precioDeCompra / unidades);
    }
}
