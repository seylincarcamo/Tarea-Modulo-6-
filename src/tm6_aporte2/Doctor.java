package tm6_aporte2;
import tm6_aporte1.Persona;
/**
 *
 * @author PC 2
 */
public class Doctor extends Persona{
    private final String profesion = "DOCTOR";
    private int diploma;
    public Doctor(){   
        initV();
    }
    public Doctor(String nombre, String apellido, String direccion, int edad){ 
        super(nombre, apellido, direccion, edad);
        initV();
    }
     //Asignacion de variables
    private void initV(){
       diploma = 0;
    }
    //Metodos de la clase      
    public void setDiploma(int diploma){
        this.diploma=diploma;
    }
    public int getDiploma(){
        return this.diploma;
    }
    //Implementacion metodos abstractos
    @Override    
    public String getProfesion(){
        return profesion;
    }
    @Override  
    public void print_All_Info(){
        System.out.print(getBasicInfo() + "Profesion: "+ profesion +"\n" +"Especialidad: " + especialidad + "\n" + "Experiencia (Años): " +  experiencia);
    }
}