/*
La Materia tiene un idMateria, un nombre de la materia y año al que pertenece, tiene además
un constructor que inicializa sus propiedades y métodos get y set para cada uno de sus atributos.
 */
package trabajopracticon4;

/**
 *
 * @author analf
 */
public class Materia {
    
    private int idMateria;
    private String nombre;
    private int año;

    public Materia(int idMateria, String nombre, int año) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.año = año;
    }

    public Materia(String nombre) {
        this.nombre = nombre;
    }

    Materia() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
