public class Papas extends Producto {

    public Papas(int precioCompra) {
        super(new Double(precioCompra));
    }

    public Double vender(double precioVenta) {

        return precioVenta - this.acumular(.00);
    }

}
