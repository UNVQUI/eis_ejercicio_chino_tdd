public class Coca {
    private Costo costo;

    public Coca(Costo costo) {

        this.costo = costo;
    }

    public Coca(int valor) {


        this(new Costo(valor));
    }

    public Margen venderA(PrecioVenta precioVenta) {

        return precioVenta.menos(this.costo);
    }

    public Costo acumularCostoEn(Costo result) {


        return costo.mas(result);
    }
}
