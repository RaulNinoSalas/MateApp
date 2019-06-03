package GUI;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Ventana de menu para usuario ya registrado.
 * MODIFICAR, BORRAR PERFIL, MATCHES (lista de usuarios a quien gustas) Y 
 * BUSCAR (elegir si te interesa otros usuarios o no)
 * @author Raul Niño Salas
 */
public class MenuUser extends javax.swing.JFrame {

    PreparedStatement ps;
    ResultSet rs;

    public MenuUser() {
        initComponents();
        this.setLocationRelativeTo(null);
        Entrada user = new Entrada();
        jLabelPrintU.setText(user.nickname);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenu1 = new javax.swing.JMenu();
        jDialog1 = new javax.swing.JDialog();
        jButtonBuscar = new javax.swing.JButton();
        jButtonMod = new javax.swing.JButton();
        jButtonBorrar = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelPrintU = new javax.swing.JLabel();
        jButtonMatches = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MateApp");
        setLocation(new java.awt.Point(500, 300));

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jButtonMod.setText("Modificar");
        jButtonMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModActionPerformed(evt);
            }
        });

        jButtonBorrar.setText("Borrar perfil");
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
            }
        });

        jLabelTitulo.setText("Menu usuario");

        jLabelPrintU.setText("usuario");

        jButtonMatches.setText("Matches");
        jButtonMatches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMatchesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButtonBuscar)
                    .addComponent(jLabelTitulo)
                    .addComponent(jLabelPrintU)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonMod)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonMatches)
                        .addGap(0, 0, 0)
                        .addComponent(jButtonBorrar)))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButtonMod)
                    .addComponent(jButtonBorrar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTitulo)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelPrintU)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                                .addComponent(jButtonBuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jButtonMatches)))))
                .addGap(71, 71, 71))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Evento raton vuelta a FichaSoN 
     * @param evt 
     */
    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        FichaSoN ficha1 = new FichaSoN();
        ficha1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonBuscarActionPerformed
    
    /**
     * Evento raton vuelta a UserMod
     * @param evt 
     */
    private void jButtonModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModActionPerformed
        UserMod modU = new UserMod();
        modU.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonModActionPerformed
   
    /**
     * Evento raton vuelta a FichaMatch
     * @param evt 
     */
    private void jButtonMatchesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMatchesActionPerformed
        FichaMatch fichaM = new FichaMatch();
        fichaM.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonMatchesActionPerformed

    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed
        
    }//GEN-LAST:event_jButtonBorrarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUser.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MenuUser().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonMatches;
    private javax.swing.JButton jButtonMod;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabelPrintU;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPopupMenu jPopupMenu1;
    // End of variables declaration//GEN-END:variables
}
