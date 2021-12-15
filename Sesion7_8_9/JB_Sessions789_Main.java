package Sesion7_8_9;

import java.io.*;
import java.util.*;

public class JB_Sessions789_Main {

    public static void main(String[] args) {

        JB_Sessions789_Funciones funcion=new JB_Sessions789_Funciones();

        Scanner ejercicio=new Scanner(System.in);
        System.out.println("Introduce que ejercicio del 1 al 9 de esta sesion quieres ejecutar: ");
        int opcion=ejercicio.nextInt();

        switch(opcion){
            case 1:
            {
                System.out.print(JB_Sessions789_Funciones.reverse("Hola Mundo"));

                System.out.println("");
                funcion.print_array(new String[]{"Sevilla", "Malaga", "Granada", "Huelva", "Cadiz", "Cordoba", "Jaen", "Almeria"});
                break;
            }
            case 2:
            {
                funcion.print_array_bi(new int[][]{{1, 2, 3, 4}, {2, 4, 6, 8}});
                break;
            }
            case 3:
            {
                Vector<Integer> vector= new Vector<>();
                vector.add(2);
                vector.add(4);
                vector.add(6);
                vector.add(8);
                vector.add(10);
                vector.remove(1);//remove the 2nd element from Vector
                vector.remove(1);//remove the 2nd element from new Vector,which is the 3rd from the original one
                funcion.print_Vector(vector);
                break;
            }
            case 4:
            {
                System.out.println("Ver respuesta en el apartado 4. de la Clase Funciones");
                break;
            }
            case 5:
            {
                ArrayList<String> array=new ArrayList<>();
                array.add("Rojo");
                array.add("Verde");
                array.add("Azul");
                array.add("Amarillo");
                funcion.print_ArrayList_and_LinkedList(array);
                break;
            }
            case 6:
            {
                funcion.print_oddNumbers_ArrayList();
                break;
            }
            case 7:
            {
                Scanner scanner=new Scanner(System.in);
                System.out.println("Introduce 2 numeros: ");
                int a= scanner.nextInt();
                int b= scanner.nextInt();
                try{
                    funcion.DividePorCero(a,b);
                }catch (ArithmeticException e){
                    System.out.println("Esto no puede hacerse");
                }finally{
                    System.out.println("Demo de codigo");
                }
                scanner.close();
                break;
            }
            case 8:
            {
                try{
                    InputStream fileIn= new FileInputStream("C:\\Users\\Jose\\IdeaProjects\\Project_JavaBasico\\src\\Sesion7_8_9\\fileIn.txt");
                    PrintStream fileOut=new PrintStream("C:\\Users\\Jose\\IdeaProjects\\Project_JavaBasico\\src\\Sesion7_8_9\\fileOut.txt");
                    funcion.inputFile_to_outputFile(fileIn, fileOut);
                    fileIn.close();
                    fileOut.close();
                }catch( FileNotFoundException e){
                    System.out.println("No existe el fichero");
                }catch( IOException e){
                    System.out.println("Error al leer del fichero");
                }

                break;
            }
            case 9:
            {
                try {

                    InputStream ficheroIn = new FileInputStream("C:\\Users\\Jose\\IdeaProjects\\Project_JavaBasico\\src\\Sesion7_8_9\\fileIn_Ejercicio9.txt");
                    funcion.print_ASCII_from_inputFile(ficheroIn);

                    PrintWriter ficheroOut= new PrintWriter("C:\\Users\\Jose\\IdeaProjects\\Project_JavaBasico\\src\\Sesion7_8_9\\fileOut_Ejercicio9.txt");
                    funcion.print_to_outputFile(ficheroOut);

                    int[] array=new int[5];
                    funcion.treat_array(array);


                }catch ( FileNotFoundException e){
                    System.out.println("No existe el fichero"+e.getMessage());
                }catch( IOException e){
                    System.out.println("Error al leer del fichero");
                }catch ( ArrayIndexOutOfBoundsException e){
                    System.out.println("No se pueden introducir mas valores en ese array");
                }

                Map<Integer,String> map= new HashMap<>();
                funcion.game_dice(map);

                break;
            }
            default:
                System.out.println("No existe el ejercicio numero"+opcion);

        }
        ejercicio.close();
    }

}
