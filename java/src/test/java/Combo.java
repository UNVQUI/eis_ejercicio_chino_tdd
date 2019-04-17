public class Combo {
    private Papas papas;
    private Coca coca;
    private final Cerveza cerveza;
    private final Mani mani;


    public Combo(Papas papas, Coca coca) {

        this.papas = papas;
        this.coca = coca;
        this.cerveza = null;
        this.mani=null;
    }

    public Combo(Coca coca, Cerveza cerveza, Mani mani) {

        this.coca = coca;
        this.cerveza = cerveza;
        this.mani = mani;
    }

    public Margen venderA(PrecioVenta precioVenta) {
        return precioVenta.menos(costoAcumulado());
    }

    private Costo costoAcumulado() {
        Costo result = new Costo();

        if(papas!=null){
            result = papas.acumularCostoEn(result);
        }
        if(coca!=null){
            result = coca.acumularCostoEn(result);
        }
        if(cerveza!=null){
            result = cerveza.acumularCostoEn(result);
        }
        if(mani!=null){
            result = mani.acumularCostoEn(result);
        }

        return result;

    }
}
