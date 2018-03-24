
package lab.pkg8_fabiohenriquez;

import java.util.ArrayList;


public class cliente {
    private String nombre;
    private String cuenta;
    private String contraseña;
    private String numero_identidad;
    private double saldo;
    private ArrayList<producto> productos = new ArrayList();

    public cliente() {
    }

    public cliente(String nombre, String cuenta, String contraseña,String numero_identidad, double saldo) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.contraseña = contraseña;
        this.numero_identidad= numero_identidad;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public ArrayList<producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<producto> productos) {
        this.productos = productos;
    }

    public String getNumero_identidad() {
        return numero_identidad;
    }

    public void setNumero_identidad(String numero_identidad) {
        this.numero_identidad = numero_identidad;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    

    @Override
    public String toString() {
        return "cliente{" + "nombre=" + nombre + ", cuenta=" + cuenta + ", contrase\u00f1a=" + contraseña + ", productos=" + productos + '}';
    }
    
    
    
}
