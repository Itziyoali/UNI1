
import NewPackage.Main;


/*
 * Demostración de niveles de acceso
Public | Private | Protected | Default
 */

/**
 *
 * @author Gema Itziyoali Trevizo Granados 18550294
 */
public class Principal {
    public int Atributo1 = 10;
    private int Atributo2 = 20;
    protected int Atributo3 = 30;
    int Atributo4 = 40;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // <Default - Package>
        Principal pPrincipal = new Principal();
        System.out.println(pPrincipal.Atributo1);
        System.out.println(pPrincipal.Atributo2);
        System.out.println(pPrincipal.Atributo3);
        System.out.println(pPrincipal.Atributo4);
        
        Default dDefault = new Default();
        System.out.println(dDefault.Atributo1);
        System.out.println(dDefault.Atributo3);
        System.out.println(dDefault.Atributo4);
        
        Secundaria sSec = new Secundaria();
        System.out.println(sSec.Atributo1);
        System.out.println(sSec.Atributo3);
        System.out.println(sSec.Atributo4);
        
        DefaultSec dDefaultSecun = new DefaultSec();
        System.out.println(dDefaultSecun.Atributo1);
        System.out.println(dDefaultSecun.Atributo3);
        System.out.println(dDefaultSecun.Atributo4);
        
        //<NewPackage>
        Main mMain = new Main();
        System.out.println(mMain.Atributo1);
        
    }
    
}
class Default{
    public int Atributo1 = 10;
	private int Atributo2 = 20;
	protected int Atributo3 = 30;
	int Atributo4 = 40;
}