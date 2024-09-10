/*
En el método main de una clase de nombre Colegio:
1. Crear las materias:
a. Ingles I de primer año.
b. Matemáticas de primer año.
c. Laboratorio 1 de primer año
2. Crear 2 alumnos.
a. López Martin con legajo 1001.
b. Martínez Brenda con legajo 1002.
3. Inscribir a López en las 3 materias.
4. Inscribir a Martínez en las 3 materias y volver a inscribirlo en Laboratorio 1.
5. Visualizar la cantidad de materias a las que está inscripto cada alumno.
--
CREAR EN LA VISTA PRINCIPAL 2 HashSet que serán STATIC.
1. HashSet <Alumno> A COMPARTIR con vista Alumnos y Vista Inscripción
2. HashSet <Materia> A COMPARTIR con vista Materias y Vista Inscripción
3. Al invocar el constructor de los JinternalFrame, pase los SET como
argumentos, para cargarlos o mostrarlos.
 */
package trabajopracticon4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author ACER
 */
public class Colegio {

    public static Set<Alumno> alumnosSet = new HashSet<>();
    public static Set<Materia> materiasSet = new HashSet<>();

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        //1
        Materia m1 = new Materia(1, "Ingles 1", 1);
        Materia m2 = new Materia(2, "Matematicas", 1);
        Materia m3 = new Materia(3, "Laboratorio", 1);
        Materia ingles = new Materia("Ingles 1");
        Materia matematicas = new Materia ("Matematicas");
        Materia laboratorio = new Materia ("Laboratorio");
        
        materiasSet.add(ingles);
        materiasSet.add(matematicas);
        materiasSet.add(laboratorio);

        //2
        Alumno a1 = new Alumno(1001, "Lopez", "Martin");
        Alumno a2 = new Alumno(1002, "Martinez", "Brenda");
        Alumno lopezMartin = new Alumno("Lopez", "Martin");
        Alumno martinezBrenda = new Alumno ("Martinez" , "Brenda");
        
        alumnosSet.add(lopezMartin);
        alumnosSet.add(martinezBrenda);

        //3
        a1.agregarMateria(m1);
        a1.agregarMateria(m2);
        a1.agregarMateria(m3);

        //4
        a2.agregarMateria(m1);
        a2.agregarMateria(m2);
        a2.agregarMateria(m3);
        a2.agregarMateria(m3);

        //5
        System.out.println("El alumno " + a1.getNombre() + " " + a1.getApellido() + " está inscripto en " + a1.cantidadMaterias() + " materias.");
        System.out.println("El alumno " + a2.getNombre() + " " + a2.getApellido() + " está inscripto en " + a2.cantidadMaterias() + " materias.");

    }
}
