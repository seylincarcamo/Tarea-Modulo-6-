package tm6_aporte1;

/**
 *
 * @author PC 1
 */
public abstract class Persona {    
    protected String nombre;
    protected String apellido;    
    protected String direccion;
    protected int edad;     
    protected String especialidad;
    protected int experiencia;
    
    public Persona(){        
    }  
    public Persona(String nombre, String apellido, String direccion, int edad){  
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.edad = edad;  
        especialidad = "Ninguna";
        experiencia = 0;
    } 
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }
     public void setEspecialidad(String especialidad){
        this.especialidad=especialidad;
    }
    public void setExperiencia(int experiencia){
        this.experiencia=experiencia;
    }  
    public void setEdad(int edad){
        this.edad=edad;
    }
    //obtener informacion basica de la persona
    public String getBasicInfo(){
       return ("Nombre: "+ nombre +"\n" + "Apellido: "+ apellido +"\n" + "Direccion: "+ direccion +"\n" +  "Edad: "+ edad +"\n");       
    }
    //Metodos abstractos y obligatorios para las subclases
    abstract public String getProfesion();    
    abstract public void print_All_Info();
    
}
