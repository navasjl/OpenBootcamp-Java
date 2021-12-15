package Sesion4;

import java.util.Arrays;

public class JB_Sesion4_SmartWatch extends JB_Sesion4_SmartDevice {

    String[] propiedades=new String[3];

    public JB_Sesion4_SmartWatch(){

    }

    public JB_Sesion4_SmartWatch(String t, String mo, String ma, double precio, String[] propiedades) {
        super(t, mo, ma, precio);
        this.propiedades = propiedades;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "tipo_dispositivo='" + tipo_dispositivo + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", propiedades=" + Arrays.toString(propiedades) +//ese array propiedades se imprime de la forma
                '}';                                          // que diga ToString en clase ARRAYS
    }
}
