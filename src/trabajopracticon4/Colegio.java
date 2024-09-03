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
 */
package trabajopracticon4;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Colegio {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        //1
        Materia m1 = new Materia(1, "Ingles 1", 1);
        Materia m2 = new Materia(2, "Matematicas", 1);
        Materia m3 = new Materia(3, "Laboratorio", 1);

        //2
        Alumno a1 = new Alumno(1001, "Lopez", "Martin");
        Alumno a2 = new Alumno(1002, "Martinez", "Brenda");

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
