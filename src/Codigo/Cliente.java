
package Codigo;
public class Cliente extends Persona {
    private String categoria;
    private String codigo;
    // metodos
    public void genrarCodigo(){
        this.setCodigo("C"+this.getNombres().substring(0,3) +this.getDocumento().substring(0,2));
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "categoria=" + categoria + ", codigo=" + codigo + '}';
    }
    
    
    
}
