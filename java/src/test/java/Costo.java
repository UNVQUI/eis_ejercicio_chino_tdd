public class Costo {
    private int valor;

    public Costo(int valor) {
        this.valor = valor;
    }

    public Costo(double costo) {
        this.valor = (int) costo;
    }

    public Costo() {
        this.valor = 0;
    }

    public Integer calcularDiferenciaCon(int valor) {
        return new Integer(valor - this.valor);
    }

    public Costo mas(Costo result) {
        return new Costo(valor + result.valor);
    }
}
