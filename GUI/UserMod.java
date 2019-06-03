package GUI;

import static GUI.Entrada.con;
import static GUI.Entrada.conexion;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Raul Niño Salas
 */
public class UserMod extends javax.swing.JFrame {

    PreparedStatement ps;
    ResultSet rs;

    private void limpiarCajas() {
        jTextName.setText(null);
        jTextEmail.setText(null);
        jPassword.setText(null);
        jTextEdad.setText(null);
    }

    public UserMod() {
        con = conexion();
        initComponents();
        Entrada user = new Entrada();
        AltaUser user1 = new AltaUser();
        jLabelPrintU.setText(user.nickname);
        jLabelPrintU2.setText(user1.nickname);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupHoM = new javax.swing.ButtonGroup();
        jTextEdad = new javax.swing.JTextField();
        jLabelName = new javax.swing.JLabel();
        jTextEmail = new javax.swing.JTextField();
        jLabelAp1 = new javax.swing.JLabel();
        jTextName = new javax.swing.JTextField();
        jLabelAge = new javax.swing.JLabel();
        jButtonHecho = new javax.swing.JButton();
        jPassword = new javax.swing.JPasswordField();
        jLabelPass = new javax.swing.JLabel();
        jButtonCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextAp2 = new javax.swing.JTextField();
        jLabelPrintU = new javax.swing.JLabel();
        jLabelPrintU2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 300));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTextEdad.setText("      ");
        jTextEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextEdadKeyTyped(evt);
            }
        });

        jLabelName.setText("Nombre:");

        jTextEmail.setText("           ");

        jLabelAp1.setText("Apelllido 1:");

        jTextName.setText("           ");

        jLabelAge.setText("Edad:");

        jButtonHecho.setText("Hecho");
        jButtonHecho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHechoActionPerformed(evt);
            }
        });

        jPassword.setText("         ");

        jLabelPass.setText("Contraseña:");

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCancelarMouseClicked(evt);
            }
        });
        jButtonCancelar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonCancelarKeyPressed(evt);
            }
        });

        jLabel1.setText("Email:");

        jTextAp2.setText("           ");

        jLabelPrintU.setText("jLabel2");

        jLabelPrintU2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jButtonCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPass)
                            .addComponent(jLabelAp1)
                            .addComponent(jLabelName)
                            .addComponent(jLabelAge)
                            .addComponent(jLabel1))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextAp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(138, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jButtonHecho))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelPrintU2)
                            .addComponent(jLabelPrintU))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabelPrintU)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPrintU2)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelName)
                    .addComponent(jTextName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextAp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAp1))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPass)
                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAge)
                    .addComponent(jTextEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addComponent(jButtonHecho)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCancelar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //evento de raton vuelve al menuUser
    private void jButtonCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelarMouseClicked
        MenuUser menu1 = new MenuUser();
        menu1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarMouseClicked
    //evento key vuelve con ENTER a menuUser
    private void jButtonCancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonCancelarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            MenuUser menuU = new MenuUser();
            menuU.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButtonCancelarKeyPressed
    //PopUp de Mod hecha
    private void jButtonHechoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHechoActionPerformed
        //poner en una variable el usuario inical
        int SIoNO = JOptionPane.showConfirmDialog(null, "¿Estas seguro de querer modificar tu perfil?", "Si", JOptionPane.YES_NO_OPTION);
        if (SIoNO == 0) {
            try {
                ps = con.prepareStatement("update user_account set first_name ='" + jTextName.getText()
                        + "', last_name= '" + jTextEmail.getText() + "', age= " + jTextEdad.getText() + ", email='" + jTextEmail.getText()
                        + "',password='" + String.valueOf(jPassword.getPassword()) + "' where nickname='" + jLabelPrintU.getText() + "';");
                int resultado = ps.executeUpdate();
                if (resultado != 0) {
                    JOptionPane.showMessageDialog(this, "¡Ya has modificado tu perfil!");
                }
                MenuUser menu1 = new MenuUser();
                menu1.setVisible(true);
                this.dispose();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "No se ha podido modificar el perfil");
                Logger.getLogger(AltaUser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButtonHechoActionPerformed

    private void jTextEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextEdadKeyTyped
        char car = evt.getKeyChar();
        if (car < '0' || car > '9') {
            evt.consume();
        }
     }//GEN-LAST:event_jTextEdadKeyTyped

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        limpiarCajas();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(UserMod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new UserMod().setVisible(true);
        });
    }

    public void modificar() {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupHoM;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonHecho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAge;
    private javax.swing.JLabel jLabelAp1;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelPass;
    private javax.swing.JLabel jLabelPrintU;
    private javax.swing.JLabel jLabelPrintU2;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jTextAp2;
    private javax.swing.JTextField jTextEdad;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextName;
    // End of variables declaration//GEN-END:variables
}
