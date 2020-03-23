package tm6_aporte5;
import tm6_aporte1.Persona;
import tm6_aporte3.Deportista;
import tm6_aporte2.Doctor;
import tm6_aporte4.Ingeniero;
/**
 *
 * @author PC 5
 */
public class Main
{
    public static void main(String[] args) {
       Persona doctor= new Doctor("Xavier","Castillo","Col.Azulejos", 19); 
       doctor.setEspecialidad("Cirujano");
       doctor.setExperiencia(3);
       doctor.print_All_Info();
       
       System.out.println("");
       System.out.println("");
       
       Deportista deportista = new Deportista("Cristiano","Ronaldo","Portugal",35);
       deportista.setMedallas(12);
       deportista.setEspecialidad("Delantero");
       deportista.setExperiencia(20);
       deportista.print_All_Info();
       
       System.out.println("");
       System.out.println("");
       
       Persona ingeniero= new Ingeniero("Camen","Jimenez","Col.Monte Bonito", 25); 
       ingeniero.setEspecialidad("Sistemas");
       ingeniero.setExperiencia(2);
       ingeniero.print_All_Info();
       
    }
}
