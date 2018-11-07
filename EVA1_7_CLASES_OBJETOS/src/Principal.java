
import manchas.Banco;
import manchas.MejorBanco;

/*
 * clase Banco ejemplificar uso de atributos
   metodos y modificaciones de acceso
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
        Banco bMiCuenta = new Banco();
        bMiCuenta.nombre = "Gema Itziyoali Trevizo Granados";
        bMiCuenta.saldo = 1000000;
        System.out.println("INFORMACION DE LA CUENTA");
        System.out.println("Titular: " + bMiCuenta.nombre);
        System.out.println("Saldo: " + bMiCuenta.saldo);
        // ME BOLARON LA LANA, ME CAMBIO DE BANCO
        MejorBanco mbMimejorCuenta = new MejorBanco();
        mbMimejorCuenta.setNombre("Gema Itziyoali Trevizo Granados");
        mbMimejorCuenta.setSaldo(1000000);
        System.out.println("MI NUEVA CUENTA EN UN MEJOR BANCO");
        System.out.println("Titular: " + mbMimejorCuenta.getNombre());
        System.out.println("Saldo: " + mbMimejorCuenta.getSaldo());
        
    }
    
}
