package Sesion7_8_9;

import java.io.*;
import java.util.*;

public class JB_Sessions789_Funciones {


    public JB_Sessions789_Funciones() {
    }

    /*1. Funcion reverse con el mismo esqueleto que en el enunciado*/

    public static String reverse(String cadena){
        StringBuilder result= new StringBuilder();
        for( int i=cadena.length()-1;i>=0;i--)
            result.append(cadena.charAt(i));
        return result.toString();
    }
    /*1.Crear array unidimensional de Strings y recorrerlo mostrando sus valores*/

    public void print_array(String[] array){
        for( int i=0;i< array.length;i++)
            System.out.print(array[i]+" ");
    }
    /*2. Crear array bidimensional de enteros y recorrerlo mostrando posicion y valor para cada elemento*/

    public void print_array_bi(int[][] array){
        for( int i=0;i< array.length;i++)
            for(int j=0;j< array[i].length;j++)
                System.out.println("La posicion ("+i+","+j+") tiene valor: "+array[i][j]);
    }
    /*3. A�adir 5 elementos a un vector dado, eliminar el de la 2 y 3 posicion. Imprimir vector*/

    public void print_Vector(Vector<Integer> vector){
        /*for(int i=0;i<5;i++)
            vector.add(i+1);
        vector.remove(1);
        vector.remove(1);*/
        for(int i=0;i<vector.size();i++)
            System.out.print(vector.get(i).toString()+" ");
    }
    /*4. Creo que el problema de utilizar un Vector con la capacidad por defecto al añadir 1000 elementos es
    * que la capacidad se dobla dinamicamente cuando se sobrepasa el tamaño del Vector, con lo que se
    * reservaria en memoria 2000 posiciones(mucho espacio)que seguramente no se vuelvan a utilizar. Seguramente
    * el programa iria muy despacio y se consumirian muchisimos recursos*/

    /*5. Crear ArrayList de tipo String con 4 elementos. Copiarlo en una LinkedList. Recorrer ambos, ArrayList y
    * LinkedList, mostrando solo el valor de cada elemento*/

    public void print_ArrayList_and_LinkedList(ArrayList<String> array){
        LinkedList<String> lista=new LinkedList<>();

        System.out.print("El ArrayList tiene los valores: ");
        for(int i=0;i< array.size();i++) {
            lista.add(array.get(i));
            System.out.print(array.get(i)+" ");
        }
        System.out.print("La LinkedList tiene los valores: ");
        for(String elemento:lista)
            System.out.print(elemento+" ");

    }
    /*6. Crear array de enteros, de 1 a 10. Elimina numeros pares y lo imprime*/

    public void print_oddNumbers_ArrayList(){
        ArrayList<Integer> array=new ArrayList<>();
        for(int i=0;i<10;i++)
            array.add(i + 1);


        for(int j=0;j<array.size();j++) {
            if (array.get(j) % 2 == 0)
                array.remove(array.get(j));
        }
        for(int i=0;i< array.size();i++)
            System.out.print(array.get(i)+" ");

        /*for(int j=0;j<array.size();j++){
            if(array.get(j)%2==0)
                array.remove(array.get(j));
            System.out.print(array.get(j)+ " ");
        }
         Si lo hago asi me da una excepcion que tendria que tratar, luego el codigo seria mas complejo/
         */


    }


    /*7. Crear funcion DividePorCero y que lance la excepcion capturada en main*/

    public void DividePorCero(int a,int b) throws ArithmeticException {
        int result = a / b;
        if (result == 0)
            throw new ArithmeticException();
    }

    /*8. Crear una funcion que copie el contenido de un fichero de entrada en un fichero de salida*/

    public void inputFile_to_outputFile(InputStream fileIn, PrintStream fileOut) throws FileNotFoundException,IOException{
        byte[] datos=new byte[20];

        datos=fileIn.readAllBytes();
        fileOut.write(datos);

    }

    /*9. Diferentes funciones para este ejercicio*/

    /*Lee bytes de fichero de entrada e Imprime codigo ASCII correspondiente a cada byte*/

    public void print_ASCII_from_inputFile (InputStream ficheroIn) throws FileNotFoundException,IOException{
        int dato=ficheroIn.read();
        while(dato!=-1){
            System.out.print(dato+" ");
            dato=ficheroIn.read();
        }
        if(dato==-1) {
            System.out.println("Se termino de leer");
            ficheroIn.close();
        }
        else
           throw new IOException();
    }
    /*Le paso bytes por la consola y los escribo en un fichero de salida*/

    public void print_to_outputFile(PrintWriter ficheroOut) {
        Scanner entrada=new Scanner(System.in);
        for(int i=0;i<5;i++) {
            System.out.println("Introduce un entero hasta un total de cinco: ");
            ficheroOut.write(entrada.nextInt());

        }
        ficheroOut.close();
        entrada.close();
    }

    /*Inicializo un array hasta su tamano definido. Trato la excepcion cuando llega al final del array*/

    public void treat_array(int[] array) throws ArrayIndexOutOfBoundsException{
        boolean sigue=true;
        int cont=0;

        while(cont< array.length && sigue) {
            array[cont] = cont + 1;
            System.out.println(array[cont]);
            cont++;
            if(cont==5){
                sigue=false;
                throw new ArrayIndexOutOfBoundsException();
            }

        }


    }

    /*Lee un numero entre 1 y 6 por consola (dado) y devuleve el valor asociado a esa clave en un mapa*/

    public void game_dice(Map<Integer, String> map) {
        map.put(1,"Fatal");
        map.put(2,"Mala");
        map.put(3,"Regular");
        map.put(4,"Buena");
        map.put(5,"Muy buena");
        map.put(6,"Excelente");

        Scanner dice=new Scanner(System.in);
        System.out.println("Tira el dado: ");
        int points= dice.nextInt();

        if(map.containsKey(points))
            System.out.println("Tu puntuacion es: "+map.get(points));
        else
            System.out.println("El numero tiene que estar entre 1 y 6");
        
        dice.close();
    }





}
