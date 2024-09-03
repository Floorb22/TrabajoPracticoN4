/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
    private Set <Materia> materias;

    public Alumno(int nroLegajo, String apellido, String nombre) {
        this.nroLegajo = nroLegajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.materias = new HashSet<>();
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

   

    public void agregartMaterias(Materia materia) {
        this.materias = materias;
    }
    
    
    
}
