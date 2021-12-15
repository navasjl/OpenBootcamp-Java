package Sesion4;

public class JB_Sesion4_Main {
    public static void main(String[] args) {

        JB_Sesion4_SmartDevice sd=new JB_Sesion4_SmartDevice("Lavadora","Zanussi","Best",500d);
        JB_Sesion4_SmartPhone sp= new JB_Sesion4_SmartPhone("Telefono","Huawei", "Y678", 400d,true,"Android");
        JB_Sesion4_SmartWatch sw=new JB_Sesion4_SmartWatch("Reloj","Samsung","R849",300.00, new String[]{"Tactil", "WIFI", "LCD"});

        System.out.println(sd);
        System.out.println(sp);
        System.out.println(sw);
        System.out.println(sw.toString());
        System.out.println(sw.toString1());//llama al toString1() de SmartDevice porque ese metodo no existe
                                            //en SmartWatch

        /*Tanto imprimir el objeto como el objeto con toString, en ambos casos imprime en la forma que definamos
        * en el metodo toString() en la clase. Si no ponemos el metodo en la clase
        * , imprimira segun el de la clase padre*/
    }
}
