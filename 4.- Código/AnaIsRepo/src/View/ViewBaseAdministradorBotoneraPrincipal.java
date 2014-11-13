/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControllerViewAdministrador;
import java.util.ArrayList;

/**
 *
 * @author Jesus
 */
public class ViewBaseAdministradorBotoneraPrincipal extends javax.swing.JPanel {
    ControllerViewAdministrador controller;
    /**
     * Creates new form ViewBaseAdministradorBotoneraPrincipal
     */
    public ViewBaseAdministradorBotoneraPrincipal() {
        initComponents();
        initController();
        controller.accionButton(1);
    }
    
     private void initController(){
        ArrayList components = new ArrayList<>();
        components.add(inicio);
        components.add(productos);
        components.add(inventario);
        components.add(proveedores);
        components.add(ventas);
        components.add(reportes);
        controller = new ControllerViewAdministrador(components);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inicio = new javax.swing.JButton();
        productos = new javax.swing.JButton();
        inventario = new javax.swing.JButton();
        proveedores = new javax.swing.JButton();
        ventas = new javax.swing.JButton();
        reportes = new javax.swing.JButton();

        setBackground(new java.awt.Color(245, 246, 247));

        inicio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        inicio.setForeground(new java.awt.Color(51, 51, 51));
        inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/InicioDisable.png"))); // NOI18N
        inicio.setContentAreaFilled(false);
        inicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inicio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        inicio.setSelected(true);
        inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioActionPerformed(evt);
            }
        });

        productos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        productos.setForeground(new java.awt.Color(51, 51, 51));
        productos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/productoDisable.png"))); // NOI18N
        productos.setContentAreaFilled(false);
        productos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        productos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        productos.setSelected(true);
        productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productosActionPerformed(evt);
            }
        });

        inventario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        inventario.setForeground(new java.awt.Color(51, 51, 51));
        inventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/inventarioDisable.png"))); // NOI18N
        inventario.setContentAreaFilled(false);
        inventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inventario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        inventario.setSelected(true);
        inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventarioActionPerformed(evt);
            }
        });

        proveedores.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        proveedores.setForeground(new java.awt.Color(51, 51, 51));
        proveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/proveedoresDisable.png"))); // NOI18N
        proveedores.setContentAreaFilled(false);
        proveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        proveedores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        proveedores.setSelected(true);
        proveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proveedoresActionPerformed(evt);
            }
        });

        ventas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ventas.setForeground(new java.awt.Color(51, 51, 51));
        ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ventasDisable.png"))); // NOI18N
        ventas.setContentAreaFilled(false);
        ventas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ventas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ventas.setSelected(true);
        ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventasActionPerformed(evt);
            }
        });

        reportes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        reportes.setForeground(new java.awt.Color(51, 51, 51));
        reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/reportesDisable.png"))); // NOI18N
        reportes.setContentAreaFilled(false);
        reportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reportes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        reportes.setSelected(true);
        reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(proveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 149, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ventas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reportes, javax.swing.GroupLayout.PREFERRED_SIZE, 123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(productos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(inventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(proveedores, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(ventas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioActionPerformed
        controller.accionButton(1);
    }//GEN-LAST:event_inicioActionPerformed

    private void productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productosActionPerformed
        controller.accionButton(2);
    }//GEN-LAST:event_productosActionPerformed

    private void inventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventarioActionPerformed
        // TODO add your handling code here:
        controller.accionButton(3);
    }//GEN-LAST:event_inventarioActionPerformed

    private void proveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proveedoresActionPerformed
        // TODO add your handling code here:
        controller.accionButton(4);
    }//GEN-LAST:event_proveedoresActionPerformed

    private void ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventasActionPerformed
        // TODO add your handling code here:
        controller.accionButton(5);
    }//GEN-LAST:event_ventasActionPerformed

    private void reportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportesActionPerformed
        // TODO add your handling code here:
        controller.accionButton(6);
    }//GEN-LAST:event_reportesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton inicio;
    private javax.swing.JButton inventario;
    private javax.swing.JButton productos;
    private javax.swing.JButton proveedores;
    private javax.swing.JButton reportes;
    private javax.swing.JButton ventas;
    // End of variables declaration//GEN-END:variables
}
