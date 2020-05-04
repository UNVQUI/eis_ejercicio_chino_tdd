public class Producto {
    private Double precioCompra;

    public Producto(Double precioCompra) {

        this.precioCompra = precioCompra;
    }

    public Double acumular(Double costoAcumulado) {
        return costoAcumulado + precioCompra;
    }
}
