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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un objeto (Crear una instancia de la clase)
        Banco bBank = new Banco();
        
        bBank.sNombreCliente = "Gema Itziyoali Trevizo Granados";
        bBank.dSaldoCuenta = 1000000;
        System.out.println("Cliente: " +bBank.sNombreCliente);
        System.out.println("Saldo: " +bBank.dSaldoCuenta);
        
        bBank.dSaldoCuenta = 0;
        System.out.println("Cliente: " +bBank.sNombreCliente);
        System.out.println("Saldo: " +bBank.dSaldoCuenta);
    }
    
}
//Forma de representar un banco
class Banco{
//En general, los atributos de una clase son privados
    private String sNombreCliente;
    private double dSaldoCuenta;
}