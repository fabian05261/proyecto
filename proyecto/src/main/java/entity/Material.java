package entity;

public class Material {

    private long codigo;
    private String nombre;
    private String descripcion;
    private Instalacion instalacion;
    private Escultura escultura;

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Instalacion getInstalacion() {
        return instalacion;
    }

    public void setInstalacion(Instalacion instalacion) {
        this.instalacion = instalacion;
    }

    public Escultura getEscultura() {
        return escultura;
    }

    public void setEscultura(Escultura escultura) {
        this.escultura = escultura;
    }

    public Material(long codigo, String nombre) {

        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Material() {
    }
}
