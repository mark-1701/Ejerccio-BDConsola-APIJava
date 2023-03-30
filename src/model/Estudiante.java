package model;

public class Estudiante {
    int id;
    String nombre;
    String apellido;
    int edad;
    int nota_promedio;

    public Estudiante() {
    }

    
    public Estudiante(int id, String nombre, String apellido, int edad, int nota_promedio) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nota_promedio = nota_promedio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNota_promedio() {
        return nota_promedio;
    }

    public void setNota_promedio(int nota_promedio) {
        this.nota_promedio = nota_promedio;
    }         
}
