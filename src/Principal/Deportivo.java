package Principal;

public class Deportivo extends Coche {
    private int maximaVelocidad;

    public Deportivo(String marca, String modelo, int año, int nPuertas, double precio, int maximaVelocidad) {
        super(marca, modelo, año, nPuertas, precio);
        this.maximaVelocidad = maximaVelocidad;

    }

    @Override
    public String toString() {
        return "Marca: " + marca + ", modelo: " + modelo + ", año: " + año + ", numeroPuertas: "
                + nPuertas
                + ", precio: " + precio + ", Maxima velocidad: " + maximaVelocidad;
    }

}
