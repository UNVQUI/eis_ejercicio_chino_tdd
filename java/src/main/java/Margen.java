public class Margen {
    private Double valor;

    public Margen(Integer valor) {
        this.valor = new Double(valor);
    }

    public Margen(Double valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        Margen otro = (Margen)o;

        return otro.valor.compareTo(valor) == 0;
    }

    @Override
    public String toString() {
        return this.valor.toString();
    }
}
