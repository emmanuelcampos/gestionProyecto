/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControllerViewAdministrador;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;

/**
 *
 * @author Jesus
 */
public class ViewBaseAdministrador extends javax.swing.JPanel {
    ControllerViewAdministrador controller;
    /**
     * Creates new form ViewBaseAdministrador
     */
    public ViewBaseAdministrador() {
        initComponents();
        initController();
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

        jPanelEncabezado = new javax.swing.JPanel();
        inicio = new javax.swing.JButton();
        productos = new javax.swing.JButton();
        inventario = new javax.swing.JButton();
        proveedores = new javax.swing.JButton();
        ventas = new javax.swing.JButton();
        reportes = new javax.swing.JButton();
        jPanelCentral = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabelHora1 = new javax.swing.JLabel();

        jPanelEncabezado.setBackground(new java.awt.Color(255, 255, 255));
        jPanelEncabezado.setForeground(new java.awt.Color(205, 212, 205));
        jPanelEncabezado.setToolTipText("");

        inicio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        inicio.setForeground(new java.awt.Color(51, 51, 51));
        inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/InicioDisable.png"))); // NOI18N
        inicio.setContentAreaFilled(false);
        inicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inicio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        inicio.setSelected(true);
        inicio.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
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
        productos.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
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
        inventario.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
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
        proveedores.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
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
        ventas.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
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
        reportes.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEncabezadoLayout = new javax.swing.GroupLayout(jPanelEncabezado);
        jPanelEncabezado.setLayout(jPanelEncabezadoLayout);
        jPanelEncabezadoLayout.setHorizontalGroup(
            jPanelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEncabezadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(productos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inventario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(proveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ventas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reportes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelEncabezadoLayout.setVerticalGroup(
            jPanelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEncabezadoLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reportes, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(proveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inventario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanelCentral.setBackground(new java.awt.Color(204, 204, 204));
        jPanelCentral.setForeground(new java.awt.Color(204, 204, 204));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Logo.png"))); // NOI18N

        jLabelHora1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelHora1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHora1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelHora1.setText("Nombre");

        javax.swing.GroupLayout jPanelCentralLayout = new javax.swing.GroupLayout(jPanelCentral);
        jPanelCentral.setLayout(jPanelCentralLayout);
        jPanelCentralLayout.setHorizontalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelHora1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelCentralLayout.setVerticalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelHora1, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(312, 312, 312))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelEncabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelHora1;
    private javax.swing.JPanel jPanelCentral;
    private javax.swing.JPanel jPanelEncabezado;
    private javax.swing.JButton productos;
    private javax.swing.JButton proveedores;
    private javax.swing.JButton reportes;
    private javax.swing.JButton ventas;
    // End of variables declaration//GEN-END:variables
}
