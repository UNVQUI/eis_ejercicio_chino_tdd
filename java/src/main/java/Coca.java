public class Coca extends Producto {

    public Coca(double precioCompra) {

        super(precioCompra);
    }


    public Double vender(double precioVenta) {

        return precioVenta - this.acumular(0.0);
    }

}
