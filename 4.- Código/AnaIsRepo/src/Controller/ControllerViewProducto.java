/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ModelCategoria;
import Model.ModelProducto;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author nel
 */
public class ControllerViewProducto 
{
    JTextField idProducto;
    JTextField nombre;
    JTextArea descripcion;
    JTextField linkFoto;
    JTextField kilos;
    JTextField numPersonas;
    JTextField precioUnitario;
    JTextField categoria_idCategoria;    
    

    public ControllerViewProducto(ArrayList components) {
        this.idProducto = (JTextField)components.get(0);
        this.nombre = (JTextField)components.get(1);
        this.descripcion = (JTextArea)components.get(2);
        this.linkFoto = (JTextField)components.get(3);
        this.kilos = (JTextField)components.get(4);
        this.numPersonas = (JTextField)components.get(5);
        this.precioUnitario = (JTextField)components.get(6);
        this.categoria_idCategoria = (JTextField)components.get(7);
       
    }
    
    
        public LinkedList combo(JComboBox categoria,JButton botoneEitar,String cadena)
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
            botoneEitar.setEnabled(true);                   

        }else
        {            
            botoneEitar.setEnabled(false);                   
        }
        return categoriaLis;
    }
    
    public void validations(){
        ControllerValidation.limitarCaracteres(idProducto, 11);        
        ControllerValidation.soloNumeros(idProducto);                
        ControllerValidation.limitarCaracteres(nombre, 250);        
        ControllerValidation.limitarCaracteres(descripcion, 250);        
        ControllerValidation.limitarCaracteres(linkFoto, 250);                 
        ControllerValidation.limitarCaracteres(kilos, 11);        
        ControllerValidation.soloNumeros(kilos);        
        ControllerValidation.limitarCaracteres(numPersonas, 11);        
        ControllerValidation.soloNumeros(numPersonas);                        
        ControllerValidation.limitarCaracteres(precioUnitario, 13);        
        ControllerValidation.soloNumeros(precioUnitario);                        
        ControllerValidation.limitarCaracteres(categoria_idCategoria, 11);        
        ControllerValidation.soloNumeros(categoria_idCategoria);                
    }
    
    
    
    
    public void next(ModelProducto emp,JComboBox categoria){
        if(!idProducto.getText().equals("Id Producto(*)") && !idProducto.getText().isEmpty()){
            if(!nombre.getText().equals("Nombre del Producto(*)") && !nombre.getText().isEmpty()){
                
                
                
                emp.setIdProducto(Integer.parseInt(idProducto.getText()));
                emp.setNombre(nombre.getText());
                emp.setDescripcion(reviewInfo(descripcion,"Descripcion",true));                                
                emp.setLinkFoto(reviewInfo(linkFoto,"link foto",true));                                
                emp.setKilos(Integer.parseInt(reviewInfo(kilos,"Kilos",false)));                                
                emp.setNumPersonas(Integer.parseInt(reviewInfo(numPersonas,"Numero de personas",false)));                                
                emp.setPrecioUnitario(Double.parseDouble(reviewInfo(precioUnitario,"Precio unitario",false)));                                
                emp.setIdCategoria(ControllerConsults.idCategoria(categoria.getSelectedItem().toString()));                                
                emp.setIdEmpresa(1);                                
                if (!ControllerConsults.checkExistProducto(idProducto.getText())) 
                {
                    if(ControllerConsults.addInfoProducto(emp)){                        
                        JOptionPane.showMessageDialog(null,"Los datos se han agregado con éxito");                                                
                    }else                        
                    JOptionPane.showMessageDialog(null,"\"Error interno para almacenar la información\"");                    
                }else
                {
                    JOptionPane.showMessageDialog(null,"\"Id del producto ya existe\"");                    
                }                                    
            }else
                ControllerViewMsj.muestraMensajeGlobo("Agregue el nombre del producto", nombre);
        }else
            ControllerViewMsj.muestraMensajeGlobo("Agrega el id del producto", idProducto);
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
    
    private String reviewInfo(JTextArea box, String value,boolean flag)
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
    
    
    
    
    public void delProducto(JComboBox producto)
    {   
        ControllerConsults.deleteProducto(producto.getSelectedItem().toString());
        JOptionPane.showMessageDialog(null,"\"Se elimino el producto \""+producto.getSelectedItem().toString());                            
        
    }
}
