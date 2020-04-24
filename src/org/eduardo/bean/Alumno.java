 
package org.eduardo.bean;

public class Alumno {
    private String nombre;
    private String apellido;
    private String correo;
    private int edad;

    //Este es un contructor
    public Alumno(String nombre, String apellido, String correo, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.edad = edad;
    }
    //consstructor vacio
    public Alumno(){
        
    }

    // get es obtener
    public String getNombre() {
        return nombre;
    }
    // set es cambiar
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
