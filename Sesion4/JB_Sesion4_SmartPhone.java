package Sesion4;

public class JB_Sesion4_SmartPhone extends JB_Sesion4_SmartDevice {

        boolean tiene_5g;
        String sistema_operativo;

        public JB_Sesion4_SmartPhone(){

        }
        public JB_Sesion4_SmartPhone(String tipo_dispositivo, String modelo, String marca, double precio,
                                     boolean tiene_5g, String sistema_operativo){

            super(tipo_dispositivo,modelo,marca,precio);
            this.tiene_5g=tiene_5g;
            this.sistema_operativo=sistema_operativo;

        }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "tipo_dispositivo='" + tipo_dispositivo + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", tiene_5g=" + tiene_5g +
                ", sistema_operativo='" + sistema_operativo + '\'' +
                '}';
    }
}
