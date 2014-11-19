/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ModelCategoria;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.accessibility.AccessibleRelation;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
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
    
    
    
    public LinkedList combo(JComboBox categoria,JButton botoneEitar,JButton botonEliminar,String cadena)
    {
        categoria.removeAllItems();
        LinkedList categoriaLis=ControllerConsults.findCategoria(cadena);
        if (!categoriaLis.isEmpty()) 
        {
            for (int i = 0; i < categoriaLis.size(); i++) 
            {
                ModelCategoria cat=(ModelCategoria) categoriaLis.get(i);
                categoria.addItem(cat.getNombre());
            }
            botonEliminar.setEnabled(true);
            botoneEitar.setEnabled(true);                   
        }else
        {
            botonEliminar.setEnabled(false);
            botoneEitar.setEnabled(false);                   
        }
        return categoriaLis;
    }
    
    
    public void delCategoria(JComboBox categoria)
    {   
        ControllerConsults.deleteCategoria(categoria.getSelectedItem().toString());
        JOptionPane.showMessageDialog(null,"\"Se elimino la categoria \""+categoria.getSelectedItem().toString());                            
        
    }
    

    
    public void next(ModelCategoria emp){
        if(!idCategoria.getText().equals("Id Categoria(*)") && !idCategoria.getText().isEmpty()){
            if(!nombre.getText().equals("Nombre de la categoria(*)") && !nombre.getText().isEmpty()){
                emp.setIdCategoria(Integer.parseInt(idCategoria.getText()));
                emp.setNombre(nombre.getText());
                emp.setDescripcion(reviewInfo(descripcion,"Descripcion",true));                                
                if (!ControllerConsults.checkExistCategoria(idCategoria.getText())) {
                    if(ControllerConsults.addInfoCategoria(emp)){                        
                        JOptionPane.showMessageDialog(null,"Los datos se han agregado con éxito");                                                
                    }else                        
                    JOptionPane.showMessageDialog(null,"\"Error interno para almacenar la información\"");                    
                }else
                {
                    JOptionPane.showMessageDialog(null,"\"Id de la categoria ya existe\"");                    
                }                                    
            }else
                ControllerViewMsj.muestraMensajeGlobo("Agregua el nombre de la categoria", nombre);
        }else
            ControllerViewMsj.muestraMensajeGlobo("Agrega el id de la categoria", idCategoria);
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