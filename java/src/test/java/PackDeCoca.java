public class PackDeCoca {
    private int unidades;
    private int costoDelPack;

    public PackDeCoca(int unidades, int costoDelPack) {
        this.unidades = unidades;
        this.costoDelPack = costoDelPack;
    }

    public Coca item() {
        return new Coca(new Costo(this.costoDelPack / this.unidades));
    }
}
