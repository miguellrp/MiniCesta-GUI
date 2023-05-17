package Clases;

/**
 *
 * @author MIGUEL ROMERO
 */
public class Producto {
    int id;
    String descripcion;
    Float precio;
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripción(String descripcion) {
        this.descripcion = descripcion;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }
    
    
    public Producto(int id, String descripcion, float precio) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
    }
}
