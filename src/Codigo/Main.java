/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;


public class Main {
    public static void  main (String []args){
        Cliente cliente1=new Cliente();
        cliente1.setNombres("david");
        cliente1.setCategoria("c");
        cliente1.setDocumento("74912934");
        cliente1.setTipo("R");
        cliente1.setApellidos("camala");
        cliente1.getApellidos();
        cliente1.getDocumento();
        System.out.println(cliente1);
       
    }
}
