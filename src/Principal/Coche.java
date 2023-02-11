package Principal;

public class Coche {
    protected String marca, modelo;
    protected int año, nPuertas;
    protected double precio;

    public Coche(String marca, String modelo, int año, int numeroPuertas, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.nPuertas = numeroPuertas;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + ", modelo: " + modelo + ", año: " + año + ", numeroPuertas: "
                + nPuertas
                + ", precio: " + precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }

    public int getnPuertas() {
        return nPuertas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setnPuertas(int numeroPuertas) {
        this.nPuertas = numeroPuertas;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
