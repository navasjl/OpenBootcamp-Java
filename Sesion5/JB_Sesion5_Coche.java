package Sesion5;

public class JB_Sesion5_Coche {

    String modelo;
    String marca;
    String color;
    double peso;
    double longitud;

    public JB_Sesion5_Coche() {
        modelo="Seat";
        marca="600";
        color="Blanco";
        peso=700.0;
        longitud=2.8;
    }

    public JB_Sesion5_Coche(String modelo, String marca, String color, double peso, double longitud) {
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.peso = peso;
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", peso=" + peso +
                ", longitud=" + longitud +
                '}';
    }
}
