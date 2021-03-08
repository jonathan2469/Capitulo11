/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author jonat
 */
public class DemoPhoneCalls {
    
    public static void main(String[] args) {
        IncomingPhoneCall llamada = new IncomingPhoneCall("645684651");
        OutgoingPhoneCall llamada2 = new OutgoingPhoneCall(12,"6161521");
        
        llamada.information();
        llamada2.information();
    }
}
