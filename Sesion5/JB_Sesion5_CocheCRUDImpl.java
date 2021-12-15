package Sesion5;

import java.util.ArrayList;
import java.util.List;

public class JB_Sesion5_CocheCRUDImpl implements JB_Sesion5_CocheCRUD {

     private List<JB_Sesion5_Coche> coches= new ArrayList<>();

    public JB_Sesion5_CocheCRUDImpl() {

    }

    public JB_Sesion5_CocheCRUDImpl(List<JB_Sesion5_Coche> coches) {
        this.coches = coches;
    }

    @Override
    public String toString() {
        return "CocheCRUDImpl{" +
                "coches=" + coches +
                '}';
    }

    @Override
    public void save() {
        System.out.println("save");
    }

    public void save(JB_Sesion5_Coche JBSesion5Coche){//anadido al ejercicio de la sesion 5 para practicar
        coches.add(JBSesion5Coche);

    }

    public List<JB_Sesion5_Coche> findAll() {// anadido al ejercicio de la sesion 5 para practicar
        System.out.println("findAll");
        return coches;
    }

    @Override
    public void delete() {
        System.out.println("delete");

    }

    public void delete(JB_Sesion5_Coche c) {//anadido al ejercicio de la sesion 5 para practicar
        coches.remove(c);

    }
}
