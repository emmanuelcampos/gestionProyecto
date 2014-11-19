/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;
import javax.swing.JTextField;

/**
 *
 * @author nel
 */
public class ControllerViewCategoria 
{
    JTextField idCategoria;
    JTextField nombre;
    JTextField descripcion;

    public ControllerViewCategoria(ArrayList components) {
        this.idCategoria = (JTextField)components.get(0);
        this.nombre = (JTextField)components.get(1);
        this.descripcion = (JTextField)components.get(2);
    }

    
    public void validations(){
        ControllerValidation.limitarCaracteres(idCategoria, 11);        
        ControllerValidation.soloNumeros(idCategoria);        
        ControllerValidation.limitarCaracteres(nombre, 45);        
        ControllerValidation.limitarCaracteres(descripcion, 45);        
    }    
    
    
    
    private String reviewInfo(JTextField box, String value,boolean flag)
    {
        if(flag)
        {
            if(box.getText().equals(value))
                return "";
            else
                return box.getText();
        }else{
            if(box.getText().equals(value))
                return "0";
            else
                return box.getText();
        }       
    }    
}