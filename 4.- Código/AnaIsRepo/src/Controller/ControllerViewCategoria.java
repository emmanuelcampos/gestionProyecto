/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ModelCategoria;
import Model.ModelEmpresa;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author nel
 */
public class ControllerViewCategoria 
{   
    JTextField nombre;
    JTextField descripcion;

    public ControllerViewCategoria(ArrayList components) { 
        this.nombre = (JTextField)components.get(0);
        this.descripcion = (JTextField)components.get(1);
    }

    
    public void validations(){            
        ControllerValidation.limitarCaracteres(nombre, 45);        
        ControllerValidation.limitarCaracteres(descripcion, 45);        
    }    
    
    
    public void next(ModelCategoria emp){
        
            if(!nombre.getText().equals("Nombre de la categoria(*)") && !nombre.getText().isEmpty()){                
                emp.setNombre(nombre.getText());
                emp.setDescripcion(reviewInfo(descripcion,"Descripcion de la categoria",true));                                                
                    if(ControllerConsults.addInfoCategoria(emp))
                    {
                        JOptionPane.showMessageDialog(null, "Categoria "+nombre.getText()+"registrada");
                        nombre.setText("Nombre de la categoria(*)");
                        nombre.setForeground(new Color(180, 180, 180));
                        descripcion.setText("Descripcion de la categoria");
                        descripcion.setForeground(new Color(180, 180, 180));
                    }else
                    {                        
                        JOptionPane.showMessageDialog(null,"Error interno para almacenar la información");
                    }
            }else
                ControllerViewMsj.muestraMensajeGlobo("Agregua el nombre de la categoria", nombre);        
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