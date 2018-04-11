public class Paquete {
    private int cantidad;
    private int costo;

    public Paquete(Producto producto, int cantidad, int costo) {
        this.cantidad = cantidad;
        this.costo = costo;
    }

    public Producto unidad() {
        return new Coca(this.costo / this.cantidad);
    }
}
