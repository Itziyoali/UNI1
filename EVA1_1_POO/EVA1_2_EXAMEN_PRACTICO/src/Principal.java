
import java.util.Scanner;

/*
 * PRÁCTICA DEL EXAMEN PRACTICO
 */
/**
 *
 * @author Gema Itziyoali Trevizo Granados 18550294
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sCaptu = new Scanner(System.in); //VARIABLE PARA CAPTURA DEL TECLADO
        //SCANNER ES UNA CLASE PARA FACILITAR LA LECTURA DEL TECLADO
        //System.in ES LA ENTRADA DE PERIFERICOS DE JAVA

        //COMUNICAR AL USUARIO LAS INSTRUCCIONES
        System.out.println("Introduce un número del 1 al 12: ");
        int iCaptuMes = sCaptu.nextInt(); //LO QUE EL USUARIO TECLEE, LO CONVERTIMOS A ENTERO.
        switch (iCaptuMes) { //VERIFICAMOS EL NÚMERO
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
            default: //SIEMPRE AL FINAL, SIN BREAK.
                System.out.println("No existe el mes");
        }
    }
}
