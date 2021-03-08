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
public class IncomingPhoneCall extends PhoneCall{
    
    public IncomingPhoneCall(String telefono) {
        super(telefono);
        super.setPrecio(0.2);
    }

    
    @Override
    public String getTelefono() {
        return telefono;
    }

    @Override
    public Double getPrecio() {
        return precio;
    }

    @Override
    public void information() {
        System.out.println(String.format("Llamada al numero telefonico %s con un costo de $%.2f", getTelefono(),getPrecio()));
    }
}
