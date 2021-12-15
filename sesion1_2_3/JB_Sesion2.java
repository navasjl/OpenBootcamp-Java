package sesion1_2_3;

import java.util.Scanner;

public class JB_Sesion2 {

    public static final double IVA =0.21 ;

    public static void main(String[] args) {

        Scanner entrada=new Scanner(System.in);

        System.out.println("Introduce un precio, por favor: ");
        double precio=entrada.nextDouble();

        System.out.println("El precio con IVA es: "+devolver_precio_con_IVA(precio));
        entrada.close();
    }

    private static double devolver_precio_con_IVA(double precio){

        double precio_IVA=precio*IVA;
        return precio + precio_IVA;
    }
}

