
package lab.pkg8_fabiohenriquez;

import java.util.Date;


public class producto {
    private String nombre;
    private int cantidad;
    private double precio;
    private Date fecha_caducidad;

    public producto() {
    }

    public producto(String nombre, int cantidad, double precio, Date fecha_caducidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.fecha_caducidad = fecha_caducidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getFecha_caducidad() {
        return fecha_caducidad;
    }

    public void setFecha_caducidad(Date fecha_caducidad) {
        this.fecha_caducidad = fecha_caducidad;
    }

    @Override
    public String toString() {
        return "producto{" + "nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio + ", fecha_caducidad=" + fecha_caducidad + '}';
    }
    
    
}
