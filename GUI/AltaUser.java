package GUI;

import static GUI.Entrada.con;
import static GUI.Entrada.conexion;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Raul Niño Salas
 */
public class AltaUser extends javax.swing.JFrame {

    PreparedStatement ps;
    ResultSet rs;
    public static String nickname = " ";

    private void limpiarCajas() {
        jTextName.setText(null);
        jTextAp1.setText(null);
        jTextAlias.setText(null);
        jPassword.setText(null);
        jPasswordR.setText(null);
        jTextEdad.setText(null);
        jTextEmail.setText(null);
    }

    public AltaUser() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.jComboBoxGenero.removeAllItems();
        String nickname = jTextAlias.getText();
        try {
            con = conexion();
            Statement ps = con.createStatement();
            rs = ps.executeQuery("select name from gender;");
            while (rs.next()) {
                this.jComboBoxGenero.addItem(rs.getString("name"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AltaUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Verifica que los campos esten llenos
    public boolean verificarCampos() {
        if (jTextName.getText().trim().equals("") || jTextAp1.getText().trim().equals("")
                || jTextAlias.getText().trim().equals("") || jPassword.getText().trim().equals("")
                || jTextEdad.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Rellena todos los campos por favor");
            return false;
        } else if (jPassword.equals(jPasswordR)) {
            JOptionPane.showMessageDialog(null, "Las contaseñas no coinciden");
            return false;
        } else {
            return true;
        }
    }

    //Verifica si se usa ese Alias
    public boolean chekearUser(String nickname) {
        boolean userexist = false;
        try {
            ps = con.prepareStatement("select * from user_account where nickname ='" + nickname + "';");
            rs = ps.executeQuery();
            if (rs.next()) {
                userexist = true;
                JOptionPane.showMessageDialog(null, "Este Alias ya existe. Elige otro por favor.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(AltaUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userexist;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupHoM = new javax.swing.ButtonGroup();
        jLabelName = new javax.swing.JLabel();
        jLabelApe1 = new javax.swing.JLabel();
        jLabelEdad = new javax.swing.JLabel();
        jLabelAlias = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();
        jLabelPass = new javax.swing.JLabel();
        jTextEdad = new javax.swing.JTextField();
        jTextAlias = new javax.swing.JTextField();
        jTextAp1 = new javax.swing.JTextField();
        jTextName = new javax.swing.JTextField();
        jButtonHecho = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelSexo = new javax.swing.JLabel();
        jComboBoxGenero = new javax.swing.JComboBox<>();
        jLabelPassR = new javax.swing.JLabel();
        jPasswordR = new javax.swing.JPasswordField();
        jLabelPrintU = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jTextEmail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MateApp");
        setLocation(new java.awt.Point(500, 300));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabelName.setText("Nombre:");

        jLabelApe1.setText("Apelllido 1:");

        jLabelEdad.setText("Edad:");

        jLabelAlias.setText("Nickname: ");

        jPassword.setText("jPasswordField1");

        jLabelPass.setText("Contraseña:");

        jTextEdad.setText("Edad");
        jTextEdad.setToolTipText("int");
        jTextEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextEdadKeyTyped(evt);
            }
        });

        jTextAlias.setText("Nickname");

        jTextAp1.setText("Apellido1");

        jTextName.setText("Nombre");

        jButtonHecho.setText("Hecho");
        jButtonHecho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHechoActionPerformed(evt);
            }
        });

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

        jLabelSexo.setText("Sexo:");

        jComboBoxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelPassR.setText("Contraseña:");

        jPasswordR.setText("jPasswordField1");

        jLabelPrintU.setText("jLabel1");

        jLabelEmail.setText("Email:");

        jTextEmail.setText("Nombre");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelApe1)
                                    .addComponent(jLabelName)
                                    .addComponent(jLabelSexo))
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextAp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabelPass)
                            .addComponent(jLabelPassR)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPasswordR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelEdad)
                                    .addComponent(jLabelAlias)
                                    .addComponent(jLabelEmail))
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextAlias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButtonCancelar)
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPrintU)
                            .addComponent(jButtonHecho))))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabelPrintU)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSexo)
                    .addComponent(jComboBoxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelName)
                    .addComponent(jTextName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelApe1)
                    .addComponent(jTextAp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPass)
                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPassR)
                    .addComponent(jPasswordR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEdad)
                    .addComponent(jTextEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAlias)
                    .addComponent(jTextAlias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail)
                    .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jButtonCancelar)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonHecho)
                        .addGap(37, 37, 37))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Evento raton vuelta a Entrada
    private void jButtonCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelarMouseClicked
        Entrada menu1 = new Entrada();
        menu1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarMouseClicked
    //Evento Key vuelta a MenuUser
    private void jButtonCancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonCancelarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            MenuUser menuU = new MenuUser();
            menuU.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButtonCancelarKeyPressed
    //PopUp y vuelta a MenuUser
    private void jButtonHechoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHechoActionPerformed
        //String sexo = jComboBoxGenero.getItemAt();
        String name = jTextName.getText();
        String ape1 = jTextAp1.getText();
        String pass = String.valueOf(jPassword.getPassword());
        String passR = String.valueOf(jPasswordR.getPassword());
        String edad = jTextEdad.getText();
        int edadInt = Integer.parseInt(edad);
        nickname = jTextAlias.getText();
        String email = jTextEmail.getText();
        if (verificarCampos()) {
            if (!chekearUser(nickname)) {
                try {
                    ps = con.prepareStatement("select * from user_account");
                    rs = ps.executeQuery();
                    int total = 0;
                    while (rs.next()) {
                        total++;
                    }
                    total = total + 1;
                    System.out.println(total);
                    ps = con.prepareStatement("insert into user_account (id,first_name,last_name,password,age,nickname,email) values ("
                            + (total + ",'" + name + "','" + ape1 + "','" + pass + "'," + edadInt + ",'" + nickname + "','" + email + "');"));
                    int resultado = ps.executeUpdate();
                    if (resultado != 0) {
                        JOptionPane.showMessageDialog(this, "¡Ya has creado tu perfil!");

                    }
                } catch (SQLException ex) {
                    Logger.getLogger(AltaUser.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    MenuUser menuU = new MenuUser();
                    menuU.setVisible(true);
                    this.setVisible(false);
                }
            }
        }
    }//GEN-LAST:event_jButtonHechoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        limpiarCajas();

    }//GEN-LAST:event_formWindowOpened

    private void jTextEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextEdadKeyTyped
        char car = evt.getKeyChar();
        if (car < '0' || car > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_jTextEdadKeyTyped

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AltaUser().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupHoM;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonHecho;
    private javax.swing.JComboBox<String> jComboBoxGenero;
    private javax.swing.JLabel jLabelAlias;
    private javax.swing.JLabel jLabelApe1;
    private javax.swing.JLabel jLabelEdad;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelPass;
    private javax.swing.JLabel jLabelPassR;
    private javax.swing.JLabel jLabelPrintU;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JPasswordField jPasswordR;
    private javax.swing.JTextField jTextAlias;
    private javax.swing.JTextField jTextAp1;
    private javax.swing.JTextField jTextEdad;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextName;
    // End of variables declaration//GEN-END:variables
    ArrayList<Integer> busca;
}
