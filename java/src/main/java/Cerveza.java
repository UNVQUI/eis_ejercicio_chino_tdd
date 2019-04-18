public class Cerveza {

    private Costo costo;

    public Cerveza(double costo) {
        this.costo = new Costo(costo);
    }

    public Costo acumularCostoEn(Costo result) {

        return costo.mas(result);
    }
}
