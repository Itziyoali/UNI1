/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manchas;

/**
 *
 * @author Gema Trevizo
 */
public class MejorBanco {
    //ATRIBUTOS DE LA CLASE
    //SIEMPRE TIENEN QUE SER PRIVADOS 
    private String nombre;
    private double saldo;
    
    //SIEMPRE DEBE EXISTIR UN INTERMEDIARIO CON LOS DATOS
    //INTERMEDIARIOS SON METODOS: get(lectura) y set (escritura)
    //METODOS: 
    //NIVEL DE ACCESO - VALOR DE RETORNO - NOMBRE (VARIABELES DE ENTRADA)
    //LEER DATOS DE NUESTRA CLASE 
    //TODOS LOS MÉTODOS PUBLICOS DE LA CLASE ES LA INTERFAZ DE
    //COMUNICACIÓN DE LA CLASE

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
