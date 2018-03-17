/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dam_ed04_actividad;


public class Main {

    public static void main(String[] args) {
        CCuenta cuenta2;
        double saldoActual;

        cuenta2 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta2.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        operativa_cuenta(cuenta2, null);
    }

    private static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
