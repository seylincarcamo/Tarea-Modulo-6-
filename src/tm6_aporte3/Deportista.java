package tm6_aporte3;
import tm6_aporte1.Persona;
/**
 *
 * @author PC 3
 */
public class Deportista extends Persona{
    private final String profesion = "DEPORTISTA";
    private int medallas;
    public Deportista(){     
      initV();
    }
    public Deportista(String nombre, String apellido, String direccion, int edad){ 
       super(nombre, apellido, direccion, edad);   
       initV();
    }
    //Asignacion de variables
    private void initV(){
       experiencia = 0;
    }
    //Metodos de la clase
    public void setMedallas(int medallas){
         this.medallas = medallas;
    }
    public int getMedallas(){
        return this.medallas;
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
