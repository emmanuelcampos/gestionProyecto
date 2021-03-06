/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import Controller.ControllerClockPanel;
import Controller.ControllerDatePanel;
import Controller.ControllerPaneles;
import Controller.ControllerViewAdministradorBotoneraPrincipal;
import Model.ModelEmpresa;
import Model.ModelUsuario;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JPanel;

/**
 *
 * @author Jesus
 */
public class ViewBasePrincipal extends javax.swing.JFrame {
    ControllerPaneles controllerPaneles;
    ModelEmpresa modelEmpresa;
    ModelUsuario modelUsuario;
    ControllerClockPanel hiloHora;
    ControllerViewAdministradorBotoneraPrincipal controller;
    /**
     * Creates new form principal
     * @param modelEmpresa
     * @param modelUsuario
     */
    public ViewBasePrincipal(ModelEmpresa modelEmpresa, ModelUsuario modelUsuario) {
        this.modelEmpresa = modelEmpresa;
        this.modelUsuario = modelUsuario;
        initComponents();
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Image/Logo_Empresa.png"));
        setIconImage(icon);
        user.setText("Bienvenido, "+modelUsuario.getNombre()+" "+modelUsuario.getaPaterno());
        initClock();
        initFecha();
        configInit();
        controllerPaneles = new ControllerPaneles();
        controllerPaneles.setModelEmpresa(modelEmpresa);
        controllerPaneles.setModelUsuario(modelUsuario);
        controllerPaneles.setPanelCentral(panelCentral);
        controllerPaneles.setUserData(user);
        controllerPaneles.setPanelBotoneraPrincipal(panelBotoneraPrincipal);
        controllerPaneles.configPanel(panelBotoneraPrincipal);
        controllerPaneles.configPanel(panelCentral);
        controllerPaneles.addPanel(panelBotoneraPrincipal, new ViewBaseAdministradorBotoneraPrincipal(controllerPaneles,true));
    }
    
    private void configInit(){
        Dimension dim = super.getToolkit().getScreenSize(); 
        super.setBackground(new Color(44,62,80));
        super.setSize(dim); 
        super.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
    }
    
    private void initFecha(){
       jLabelFecha.setText(ControllerDatePanel.getFecha());
    }
    
    private void initClock(){
        hiloHora = new ControllerClockPanel(jLabelHora);
        Thread clock=new Thread(hiloHora);
        clock.start();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBase = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JPanel();
        BCerrar = new javax.swing.JButton();
        BMin = new javax.swing.JButton();
        labelTituloSoftware = new javax.swing.JLabel();
        panelDataUser = new javax.swing.JPanel();
        jLabelFecha = new javax.swing.JLabel();
        ajustes = new javax.swing.JButton();
        user = new javax.swing.JButton();
        jLabelHora = new javax.swing.JLabel();
        panelBotoneraPrincipal = new javax.swing.JPanel();
        panelBase = new javax.swing.JPanel();
        panelCentral = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanelBase.setBackground(new java.awt.Color(245, 246, 247));

        panelTitulo.setBackground(new java.awt.Color(230, 230, 230));
        panelTitulo.setForeground(new java.awt.Color(0, 51, 51));

        BCerrar.setBackground(new java.awt.Color(255, 255, 255));
        BCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/IconClose.png"))); // NOI18N
        BCerrar.setToolTipText("Salir");
        BCerrar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        BCerrar.setBorderPainted(false);
        BCerrar.setContentAreaFilled(false);
        BCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCerrarActionPerformed(evt);
            }
        });

        BMin.setBackground(new java.awt.Color(255, 255, 255));
        BMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/minim.png"))); // NOI18N
        BMin.setToolTipText("Minimizar");
        BMin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        BMin.setBorderPainted(false);
        BMin.setContentAreaFilled(false);
        BMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMinActionPerformed(evt);
            }
        });

        labelTituloSoftware.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelTituloSoftware.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logo_empresa.png"))); // NOI18N
        labelTituloSoftware.setText("POS Cake");

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTituloLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelTituloSoftware, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BMin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BCerrar)
                .addContainerGap())
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BMin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelTituloSoftware, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelDataUser.setBackground(new java.awt.Color(53, 107, 161));

        jLabelFecha.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabelFecha.setForeground(new java.awt.Color(245, 246, 247));
        jLabelFecha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelFecha.setText("Fecha");

        ajustes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ajustes.setForeground(new java.awt.Color(245, 246, 247));
        ajustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/settings.png"))); // NOI18N
        ajustes.setToolTipText("Ajustes");
        ajustes.setContentAreaFilled(false);
        ajustes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ajustes.setSelected(true);
        ajustes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajustesActionPerformed(evt);
            }
        });

        user.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        user.setForeground(new java.awt.Color(245, 246, 247));
        user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/user.png"))); // NOI18N
        user.setText("Mensaje de bienvenida");
        user.setContentAreaFilled(false);
        user.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        user.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        user.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        user.setSelected(true);
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });

        jLabelHora.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabelHora.setForeground(new java.awt.Color(245, 246, 247));
        jLabelHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/clock.png"))); // NOI18N
        jLabelHora.setText("Clock");

        javax.swing.GroupLayout panelDataUserLayout = new javax.swing.GroupLayout(panelDataUser);
        panelDataUser.setLayout(panelDataUserLayout);
        panelDataUserLayout.setHorizontalGroup(
            panelDataUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDataUserLayout.createSequentialGroup()
                .addComponent(user, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelHora, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ajustes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        panelDataUserLayout.setVerticalGroup(
            panelDataUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ajustes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(user, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelHora, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelBotoneraPrincipal.setBackground(new java.awt.Color(20, 20, 20));

        javax.swing.GroupLayout panelBotoneraPrincipalLayout = new javax.swing.GroupLayout(panelBotoneraPrincipal);
        panelBotoneraPrincipal.setLayout(panelBotoneraPrincipalLayout);
        panelBotoneraPrincipalLayout.setHorizontalGroup(
            panelBotoneraPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelBotoneraPrincipalLayout.setVerticalGroup(
            panelBotoneraPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        panelBase.setBackground(new java.awt.Color(245, 246, 247));
        panelBase.setForeground(new java.awt.Color(204, 204, 204));

        panelCentral.setBackground(new java.awt.Color(245, 246, 247));

        javax.swing.GroupLayout panelCentralLayout = new javax.swing.GroupLayout(panelCentral);
        panelCentral.setLayout(panelCentralLayout);
        panelCentralLayout.setHorizontalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelCentralLayout.setVerticalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 549, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelBaseLayout = new javax.swing.GroupLayout(panelBase);
        panelBase.setLayout(panelBaseLayout);
        panelBaseLayout.setHorizontalGroup(
            panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBaseLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );
        panelBaseLayout.setVerticalGroup(
            panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBaseLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelBaseLayout = new javax.swing.GroupLayout(jPanelBase);
        jPanelBase.setLayout(jPanelBaseLayout);
        jPanelBaseLayout.setHorizontalGroup(
            jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelBotoneraPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelDataUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelBaseLayout.setVerticalGroup(
            jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBaseLayout.createSequentialGroup()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelDataUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelBotoneraPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCerrarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_BCerrarActionPerformed

    private void BMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMinActionPerformed
        // TODO add your handling code here:
        setExtendedState(ViewBasePrincipal.CROSSHAIR_CURSOR); 
    }//GEN-LAST:event_BMinActionPerformed

    private void ajustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajustesActionPerformed
        controllerPaneles.addPanel(panelCentral, new ViewBaseAjustes(controllerPaneles));
        controllerPaneles.addPanel(panelBotoneraPrincipal, new ViewBaseAdministradorBotoneraPrincipal(controllerPaneles,false));
    }//GEN-LAST:event_ajustesActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
        controllerPaneles.addPanel(panelCentral, new ViewBaseDatosUsuario(controllerPaneles));
        controllerPaneles.addPanel(panelBotoneraPrincipal, new ViewBaseAdministradorBotoneraPrincipal(controllerPaneles,false));
    }//GEN-LAST:event_userActionPerformed

    public void agregaJPanel(JPanel panelBase, JPanel panelAdd){
        panelBase.removeAll();
        panelBase.add(panelAdd);
        panelBase.updateUI();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BCerrar;
    private javax.swing.JButton BMin;
    private javax.swing.JButton ajustes;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JPanel jPanelBase;
    private javax.swing.JLabel labelTituloSoftware;
    private javax.swing.JPanel panelBase;
    private javax.swing.JPanel panelBotoneraPrincipal;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelDataUser;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JButton user;
    // End of variables declaration//GEN-END:variables
}
