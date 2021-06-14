
public class Persona {
    private String nombre;
    private String documento;
    private Arbol celular;

    public Persona(String nombre, String documento){
        this.nombre = nombre;
        this.documento = documento;
        this.celular = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }



    public String getDocumento() {
        return documento;
    }
}
