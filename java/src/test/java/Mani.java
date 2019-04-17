public class Mani {

    private Costo costo;

    public Mani(int costo) {

        this.costo = new Costo(costo);
    }

    public Costo acumularCostoEn(Costo result) {
        return costo.mas(result);
    }
}
