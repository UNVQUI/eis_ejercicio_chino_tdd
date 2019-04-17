public class Papas {
    private Costo costo;

    public Papas(Costo costo) {
        this.costo = costo;
    }

    public Papas(int costo) {
        this( new Costo(costo));
    }

    public Margen venderA(PrecioVenta precioVenta) {


        return precioVenta.menos(costo);
    }

    public Costo acumularCostoEn(Costo result) {
        return this.costo.mas(result);
    }
}
