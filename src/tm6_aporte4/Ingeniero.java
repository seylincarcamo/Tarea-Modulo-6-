package tm6_aporte4;
import tm6_aporte1.Persona;
/**
 *
 * @author PC 4
 */
public class Ingeniero extends Persona{
    private final String profesion = "INGENIERO";
    public Ingeniero(){  
      especialidad = "Ninguna";
      experiencia = 0;
    }
    public Ingeniero(String nombre, String apellido, String direccion, int edad){ 
        super(nombre, apellido, direccion, edad);
    }    
    //Implementacion metodos abstractos
    @Override    
    public String getProfesion(){
        return  profesion;
    } 
    @Override  
    public void print_All_Info(){
        System.out.print(getBasicInfo() + "Profesion: "+ profesion +"\n" +"Especialidad: " + especialidad + "\n" + "Experiencia (Años): " +  experiencia);
    }
}
