package Clases;

/**
 *
 * @author MIGUEL ROMERO
 */
public class Pedido {
    int id;
    String descripcion;
    Float precio;
    int cantidad;
    Float importe;

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Float getImporte() {
        return importe;
    }

    public void setImporte(Float importe) {
        this.importe = importe;
    }
    
    
    public Pedido(int id, String descripcion, float precio, int cantidad, float importe) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.importe = importe;
    }
}
