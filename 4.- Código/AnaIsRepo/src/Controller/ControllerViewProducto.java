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
public class ControllerViewProducto 
{
    JTextField idProducto;
    JTextField nombre;
    JTextField descripcion;
    JTextField linkFoto;
    JTextField kilos;
    JTextField numPersonas;
    JTextField precioUnitario;
    JTextField categoria_idCategoria;
    JTextField empresa_idEmpresa;

    public ControllerViewProducto(ArrayList components) {
        this.idProducto = (JTextField)components.get(0);
        this.nombre = (JTextField)components.get(1);
        this.descripcion = (JTextField)components.get(2);
        this.linkFoto = (JTextField)components.get(3);
        this.kilos = (JTextField)components.get(4);
        this.numPersonas = (JTextField)components.get(5);
        this.precioUnitario = (JTextField)components.get(6);
        this.categoria_idCategoria = (JTextField)components.get(7);
        this.empresa_idEmpresa = (JTextField)components.get(8);
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
        ControllerValidation.limitarCaracteres(empresa_idEmpresa, 11);        
        ControllerValidation.soloNumeros(empresa_idEmpresa);                
    }
    
    
}
