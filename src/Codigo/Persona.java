
package Codigo;

import javax.swing.JOptionPane;


public class Persona {
    private String Apellidos;
    private String nombres;
    private String Documento;
    private String tipo;
    //constructores
    public Persona(){
    }

    public Persona(String Apellidos, String nombres, String Documento, String tipo) {
        this.Apellidos = Apellidos;
        this.nombres = nombres;
        this.Documento = Documento;
        this.tipo = tipo;
    }
    //METODOS 

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String Documento) {
        if (Documento.length()==8){
        this.Documento = Documento;
        }else {
            JOptionPane.showMessageDialog(null,"error");}
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Persona{" + "Apellidos=" + Apellidos + ", nombres=" + nombres + ", Documento=" + Documento + ", tipo=" + tipo + '}';
    }
    
}
