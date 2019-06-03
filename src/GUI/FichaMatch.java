package GUI;

import GUI.user;
import static GUI.Entrada.con;
import static GUI.Entrada.conexion;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *Ventana en la que se imprimen los usuarios al cual le gustan el usuario inicial.
 * @author Raul Niño Salas
 */
public class FichaMatch extends javax.swing.JFrame {

    PreparedStatement ps;
    ResultSet rs;

    public FichaMatch() {

        con = conexion();
        initComponents();
        this.setLocationRelativeTo(null);
        Entrada user = new Entrada();
        jLabelPrintU.setText(user.nickname);
        Mostrar_tabla();

    }
/**
 * Crea una lista de usuarios para imprimir en el Jtable.
 * @return 
 */
    public ArrayList<user> listarUser() {
        ArrayList<user> listaU = new ArrayList<>();
        try {
            ps = con.prepareStatement("SELECT * FROM mateapp.matches inner join user_account where "
                    + "user_account.id = matches.usr_id_match and usr_id in"
                    + "(select id from mateapp.user_account where nickname ='" + jLabelPrintU.getText() + "');");
            rs = ps.executeQuery();
            user user;
            while (rs.next()) {
                user = new user(rs.getInt("id"), rs.getString("first_name"),
                        rs.getString("last_name"), rs.getInt("gender_id"), rs.getInt("age"),
                        rs.getString("nickname"), rs.getString("email"), rs.getString("password"));
                listaU.add(user);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FichaMatch.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaU;
    }
/**
 * Muestra la tabla.
 */
    public void Mostrar_tabla() {
        ArrayList<user> lista = listarUser();
        DefaultTableModel model = (DefaultTableModel) jTableMatch.getModel();
        Object[] row = new Object[4];
        for (int i = 0; i < lista.size(); i++) {
            row[0] = lista.get(i).getNickname();
            row[1] = lista.get(i).getEmail();
            row[2] = lista.get(i).getGender_id();
            row[3] = lista.get(i).getAge();
            model.addRow(row);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonVolver = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableMatch = new javax.swing.JTable();
        jLabelPrintU = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MateApp");
        setLocation(new java.awt.Point(500, 300));

        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });
        jButtonVolver.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonVolverKeyPressed(evt);
            }
        });

        jTableMatch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nickname", "Contacto", "Sexo", "Edad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableMatch);

        jLabelPrintU.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jButtonVolver))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabelPrintU)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPrintU)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(jButtonVolver)
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Evento raton vuelta a MenuUser
     * @param evt 
     */
    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        MenuUser menuU1 = new MenuUser();
        menuU1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonVolverActionPerformed
 
    /**
     * Evento Key ENTER vuelta a MenuUser
     * @param evt 
     */
    private void jButtonVolverKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonVolverKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            MenuUser menuU = new MenuUser();
            menuU.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButtonVolverKeyPressed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FichaMatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FichaMatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FichaMatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FichaMatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FichaMatch().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabelPrintU;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableMatch;
    // End of variables declaration//GEN-END:variables
}
