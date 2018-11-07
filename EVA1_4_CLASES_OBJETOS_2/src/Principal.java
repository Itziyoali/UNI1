
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gema Itziyoali Trevizo Granados 18550294
 */
public class Principal {
		public static Scanner scan = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instanciar la clase persona -->
			// 1.- Los objetos son identificadores (variables)
			//int val; // Declara
			//Persona pPersona1; // Declaración
			// Instanciar = Asignar valor (memoria)  -> new 
			//val = 10;
			
			// Declaración y uso de Persona 1
			//pPersona1 = new Persona(); // El objeto existe
			//System.out.println("Introducir nombre: ");
			//pPersona1.Nombre = scan.nextLine();
			//System.out.println(pPersona1.Nombre); // Aquí si podemos usarlos
        
        Persona pPersona2 = new Persona(); //Declaración de una segunda persona
        System.out.println("Introduce tu nombre: ");
        pPersona2.Nombre = scan.nextLine();
        System.out.println("Introduce tu apellido: ");
        pPersona2.Apellido = scan.nextLine();
                pPersona2.MostrarNombre();
    }
    public static void LimpiarScanner(){
			scan = new Scanner(System.in);
		}
    

static class Persona{
    //Atributos de la clase
    //Determinan el estado del objeto
    String Nombre;
    String Apellido;
    int Edad;
    String RFC;
    String Genero;
    int EdoNac;
    String EdoCivil;
    String Cd;
    
    //Comportamiento de las clases
    //Métodos y/o funciones
    //Nivel de acceso | Valor de retorno | Nombre (Argumentos)
    
    public void MostrarNombre(){
        System.out.println("El nombre es: " +Nombre + " " +Apellido);
    }
}
}