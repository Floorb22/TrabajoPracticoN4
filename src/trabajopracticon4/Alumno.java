/*
Un Alumno tiene un nro de legajo, un apellido, un nombre y una lista HashSet de
materias en las que está inscripto; para ello tiene un método agregarMateria que permite
inscribir al Alumno en una materia determinada (implementar de manera tal que no deje
inscribir un alumno en dos materias iguales.) y otro método cantidadMaterias que devuelve la
cantidad de materias a las que está inscripto el alumno.
 */
package trabajopracticon4;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author analf
 */
public class Alumno {

    private int nroLegajo;
    private String apellido;
    private String nombre;
    private Set<Materia> materias;

    public Alumno(int nroLegajo, String apellido, String nombre) {
        this.nroLegajo = nroLegajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.materias = new HashSet<>();
    }

    public Alumno(String apellido, String nombre) {
        this.apellido = apellido;
        this.nombre = nombre;
    }

    Alumno() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

    public int getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected void agregarMateria(Materia m) {
        if (materias.contains(m)) {
            System.out.println(nombre + " ya está inscripto en " + m.getNombre());
        } else {
            materias.add(m);
            System.out.println(nombre + " se ha inscripto en " + m.getNombre());
        }
    }

    protected int cantidadMaterias() {
        return materias.size();
    }

    @Override
    public String toString() {
        return apellido + " " + nombre ;
    }

    
}
