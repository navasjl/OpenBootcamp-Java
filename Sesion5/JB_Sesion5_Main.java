package Sesion5;

public class JB_Sesion5_Main {

    public static void main(String[] args) {

        JB_Sesion5_CocheCRUDImpl coches= new JB_Sesion5_CocheCRUDImpl();//el objeto es de la Clase CocheCRUDImpl que se crea con new
                                            //aunque sea del tipo de la interfaz CocheCRUD que implementa
                                            //como cuando es del tipo de la clase padre de la que hereda
                                            // pero lo creamos de la clase hija  de la que sera ese objeto

        JB_Sesion5_Coche JBSesion5Coche1 =new JB_Sesion5_Coche("Audi","A4","gris",1200d,3.6);
        JB_Sesion5_Coche JBSesion5Coche2 =new JB_Sesion5_Coche("BMW","6","negro",1250d,3.7);
        JB_Sesion5_Coche JBSesion5Coche3 =new JB_Sesion5_Coche("Peugeot","406","blanco",1300d,4.2);
        JB_Sesion5_Coche JBSesion5Coche4 =new JB_Sesion5_Coche("Renault","Clio","azul",1100.0,3.4);

        coches.save(JBSesion5Coche1);
        coches.save(JBSesion5Coche2);
        coches.save(JBSesion5Coche3);
        coches.save(JBSesion5Coche4);
        System.out.println(coches);

        coches.save();//imprime save
        System.out.println(coches.findAll());//imprime findall y tambien imprime todos los coches de la lista
                                            //pero no como toString() de CocheCRUD sino como ArrayList


        coches.delete();//imprime delete
        coches.delete(JBSesion5Coche4);
        System.out.println(coches);
    }
}
