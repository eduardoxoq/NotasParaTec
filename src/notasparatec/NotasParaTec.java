package notasparatec;

import java.util.ArrayList;
import java.util.Scanner;
import org.eduardo.bean.Alumno;
import org.eduardo.bean.ManejadorListaAlumno;

/**
 *
 * @author Eduardo Xoquic
 */
public class NotasParaTec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ManejadorListaAlumno listaAlumno= new ManejadorListaAlumno();       
        Scanner leer = new Scanner(System.in); 
        Alumno a = new Alumno();
        
       /* System.out.println("Ingrese un nombre separado por coma");
        String nombre=leer.nextLine();
        System.out.println(nombre.indexOf(","));
        System.out.println(nombre.substring(0,nombre.indexOf(",")));
        System.out.println(nombre.substring(nombre.indexOf(",")+1)); 
        for (int contador =nombre.length()-1;contador>=0; contador--) {
            System.out.println(nombre.charAt(contador));
        }
        */
        
        
        for (int cotador = 1; cotador < 3; cotador++) {
            a = new Alumno();
             System.out.println(" ");
            System.out.println("Ingresa Tu Nombre");
            a.setNombre(leer.nextLine());
            System.out.println("Ingresa Tu Apellido");
            a.setApellido(leer.nextLine());
            System.out.println("Ingresa Tu Correo");
            a.setCorreo(leer.nextLine());
            System.out.println("Ingresa Tu Edad");
            a.setEdad(leer.nextInt());
            listaAlumno.agregarAlumno(a);
        }
        
        for(Alumno alumnoActual:listaAlumno.getListaAlumno()){
            System.out.println(alumnoActual.getNombre());
            System.out.println(alumnoActual.getApellido());
            System.out.println(alumnoActual.getCorreo());
            System.out.println(alumnoActual.getEdad());
        }

        
        String nombre;
        System.out.println("Ingresa tu nombre");
        nombre = leer.nextLine();
        nombre = leer.nextLine();
        
        a = new Alumno();
        
        a = listaAlumno.buscarAlumno(nombre);
        if(a.getNombre().equals(nombre)){
            System.out.println(a.getNombre());
            System.out.println(a.getApellido());
            System.out.println(a.getCorreo());
            System.out.println(a.getEdad());
        }else{
            System.out.println("No existe este alumno");
        }
            
//agregar comentario

    }

}
