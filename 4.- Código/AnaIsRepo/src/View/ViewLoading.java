/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

/**
 *
 * @author Jesus
 */
public class ViewLoading extends javax.swing.JPanel {

    /**
     * Creates new form login
     */
    public ViewLoading() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCharger = new javax.swing.JPanel();
        logoCarga = new javax.swing.JLabel();

        panelCharger.setBackground(new java.awt.Color(53, 107, 161));

        logoCarga.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoCarga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logoCharger.gif"))); // NOI18N

        javax.swing.GroupLayout panelChargerLayout = new javax.swing.GroupLayout(panelCharger);
        panelCharger.setLayout(panelChargerLayout);
        panelChargerLayout.setHorizontalGroup(
            panelChargerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChargerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoCarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelChargerLayout.setVerticalGroup(
            panelChargerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChargerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoCarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCharger, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCharger, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel logoCarga;
    private javax.swing.JPanel panelCharger;
    // End of variables declaration//GEN-END:variables
}
