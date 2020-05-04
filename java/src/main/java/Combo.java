import java.util.Arrays;
import java.util.List;

public class Combo {
    private final List<Producto> productos;

    public Combo(Producto ...products) {
        this.productos = Arrays.asList(products);
    }

    public Double vender(Double precioVenta) {
        Double costoAcumulado = 0.0;

        for(Producto p : this.productos) {
            costoAcumulado = p.acumular(costoAcumulado);
        }

        return precioVenta - costoAcumulado;
    }
}

