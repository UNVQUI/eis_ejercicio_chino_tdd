public class Combo {
    private Papas papas;
    private Coca coca;

    public Combo(Papas papas, Coca coca) {

        this.papas = papas;
        this.coca = coca;
    }

    public Margen venderA(PrecioVenta precioVenta) {
        return precioVenta.menos(costoAcumulado());
    }

    private Costo costoAcumulado() {
        Costo result = new Costo();

        result = papas.acumularCostoEn(result);
        result = coca.acumularCostoEn(result);

        return result;

    }
}
