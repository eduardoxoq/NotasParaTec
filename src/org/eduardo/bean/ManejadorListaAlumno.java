package org.eduardo.bean;

import java.util.ArrayList;

/**
 *
 * @author Eduardo Xoquic
 */
public class ManejadorListaAlumno {
    private ArrayList<Alumno> listaAlumno;

    public ManejadorListaAlumno() {
        listaAlumno= new ArrayList<Alumno>();
        
    }
    //agregar un alumno al listado
    public void agregarAlumno(Alumno alumno){
        listaAlumno.add(alumno);
    }
    
    public Alumno buscarAlumno(String nombre){
        Alumno alumnoEncontrado = new Alumno();
        for(Alumno alumnoTemporal:listaAlumno){
            if(alumnoTemporal.getNombre().equals(nombre)){
                alumnoEncontrado.setNombre(alumnoTemporal.getNombre());
                alumnoEncontrado.setApellido(alumnoTemporal.getApellido());
                alumnoEncontrado.setCorreo(alumnoTemporal.getCorreo());
                alumnoEncontrado.setEdad(alumnoTemporal.getEdad());               
            }
        }
        return alumnoEncontrado;
        
    }
    
    public ArrayList<Alumno> getListaAlumno() {
        return listaAlumno;
    }

    public void setListaAlumno(ArrayList<Alumno> listaAlumno) {
        this.listaAlumno = listaAlumno;
    }


    
    
}
