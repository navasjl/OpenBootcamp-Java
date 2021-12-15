package Sesion4;

public class JB_Sesion4_SmartDevice {

    String tipo_dispositivo;
    String modelo;
    String marca;
    double precio;

    public JB_Sesion4_SmartDevice() {
    }

    public JB_Sesion4_SmartDevice(String t, String mo, String ma, double precio){
        tipo_dispositivo=t;
        modelo=mo;
        marca=ma;
        this.precio=precio;
    }

    public String toString1(){ //lo he hecho parecido al que se genera por defecto
        System.out.println("SmartDevice{ Tipo dispositivo= "+'\"'+tipo_dispositivo+'\"'
                +",Modelo= "+'\"'+modelo+'\"'+",Marca= "+'\"'+marca+'\"'
                +",Precio= "+'\"'+precio+'\"'+"}");
        return null;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "tipo_dispositivo='" + tipo_dispositivo + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                '}';
    }
}
