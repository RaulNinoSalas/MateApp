package GUI;

import java.sql.ResultSet;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Raul Niño Salas
 */
public class Entrada extends javax.swing.JFrame {

    public Entrada() {
        con = conexion();
        this.setLocationRelativeTo(null);
        initComponents();
    }

    PreparedStatement ps;
    ResultSet rs;
    public static String nickname = " ";

    private void limpiarCajas() {
        jTextUsuario.setText(null);
        jPassword.setText(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        buttonSalir = new javax.swing.JButton();
        jPassword = new javax.swing.JPasswordField();
        jLabelUser = new javax.swing.JLabel();
        jLabelPass = new javax.swing.JLabel();
        buttonCrearU = new javax.swing.JButton();
        jTextUsuario = new javax.swing.JTextField();
        buttonOk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MateApp");
        setLocation(new java.awt.Point(500, 300));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        buttonSalir.setText("Salir");
        buttonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalirActionPerformed(evt);
            }
        });
        buttonSalir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buttonSalirKeyPressed(evt);
            }
        });

        jPassword.setText("********");
        jPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordActionPerformed(evt);
            }
        });
        jPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordKeyPressed(evt);
            }
        });

        jLabelUser.setText("Usuario:");

        jLabelPass.setText("Contaseña:");

        buttonCrearU.setText("Crear usuario");
        buttonCrearU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCrearUMouseClicked(evt);
            }
        });
        buttonCrearU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCrearUActionPerformed(evt);
            }
        });
        buttonCrearU.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buttonCrearUKeyPressed(evt);
            }
        });

        jTextUsuario.setText("Usuario");

        buttonOk.setText("Ok");
        buttonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelUser, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelPass, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(buttonOk))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonSalir)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonCrearU)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUser)
                    .addComponent(jTextUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPass)
                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSalir)
                    .addComponent(buttonOk))
                .addGap(18, 18, 18)
                .addComponent(buttonCrearU)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordActionPerformed

    }//GEN-LAST:event_jPasswordActionPerformed
    //PopUp dialogo de seguridad de accion
    private void buttonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalirActionPerformed
        int SIoNO = JOptionPane.showConfirmDialog(null, "¿Estas seguro de salir?", "Si", JOptionPane.YES_NO_OPTION);
        if (SIoNO == 0) {
            cerrarConexion(con);
            System.exit(0);
        }
    }//GEN-LAST:event_buttonSalirActionPerformed
    //Evento Accion cambio a AltaUser
    private void buttonCrearUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCrearUActionPerformed
        AltaUser alta = new AltaUser();
        alta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonCrearUActionPerformed
    //Evento raton vuelta a AltaUser
    private void buttonCrearUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCrearUMouseClicked
        AltaUser alta = new AltaUser();
        alta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonCrearUMouseClicked
    //Evento raton  vuelta a MenuUser
    private void buttonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOkActionPerformed
        //select user y pass
        nickname = jTextUsuario.getText();
        String pass = String.valueOf(jPassword.getText());
        try {
            ps = con.prepareStatement("Select * from user_account where nickname= ? and password = ?;");
            ps.setString(1, nickname);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Usuario y contaseña correctos.");
                nickname = jTextUsuario.getText();
                MenuUser menuU = new MenuUser();
                menuU.setVisible(true);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Usuario y contraseña incorrectos. Intentalo de nuevo, por favor.");
                limpiarCajas();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexion");
            Logger.getLogger(Entrada.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_buttonOkActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

    }//GEN-LAST:event_formKeyPressed
    //Evento key ENTER vuelta a MenuUser
    private void jPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            //select user y pass
            nickname = jTextUsuario.getText();
            String pass = String.valueOf(jPassword.getText());
            try {
                ps = con.prepareStatement("Select * from user_account where nickname= ? and password = ?;");
                ps.setString(1, nickname);
                ps.setString(2, pass);
                rs = ps.executeQuery();
                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Usuario y contaseña correctos.");
                                    nickname = jTextUsuario.getText();
                    MenuUser menuU = new MenuUser();
                    menuU.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario y contraseña incorrectos. Intentalo de nuevo, por favor.");
                    limpiarCajas();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error de conexion");
                Logger.getLogger(Entrada.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }//GEN-LAST:event_jPasswordKeyPressed
    // Evento key ENTER vuelta AltaUser
    private void buttonCrearUKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buttonCrearUKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            AltaUser alta = new AltaUser();
            alta.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_buttonCrearUKeyPressed
    //Evento Key salida
    private void buttonSalirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buttonSalirKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            System.exit(0);
        }
    }//GEN-LAST:event_buttonSalirKeyPressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        limpiarCajas();
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        limpiarCajas();
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(Entrada.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Entrada().setVisible(true);
        });
    }

    private static final String url = "jdbc:mysql://localhost:3306/mateapp";
    private static final String user = "root";
    private static final String pass = "dvpy1234";
    static Connection con;

    public static Connection conexion() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url + "?verifyServerCertificate=false" + "&useSSL=true", user, pass);
        } catch (SQLException ex) {
            System.out.println("sqlstate" + ex.getSQLState());
        }
        return conn;
    }

    public static void cerrarConexion(Connection con) {//CERRAR CONEXION
        try {
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCrearU;
    private javax.swing.JButton buttonOk;
    private javax.swing.JButton buttonSalir;
    private javax.swing.JLabel jLabelPass;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JTextField jTextUsuario;
    // End of variables declaration//GEN-END:variables
}
