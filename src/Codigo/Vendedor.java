
package Codigo;

public class Vendedor extends Persona{
   private String tipoContrato;
   private Double sueldo;
   //metodo
   public void calcularSueldo(Double sueldoBase){
       if (this.getTipoContrato().toLowerCase()=="C"){
       this.setSueldo(sueldoBase+350);}
   }
    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }
   
    
}
