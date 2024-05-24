/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Menus;

import finalproject.BD;
import finalproject.FinalProject;
import finalproject.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Iniciar_Se extends javax.swing.JFrame {

    /**
     * Creates new form Iniciar_Se
     */
    public Iniciar_Se() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Text_Usu = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Boton_ir_Registro = new javax.swing.JButton();
        Boton_Entrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Text_cont = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(718, 599));
        setMinimumSize(new java.awt.Dimension(718, 599));
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(625, 559));
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Iniciar Sesión");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setText("Usuario");

        Text_Usu.setToolTipText("Usuario");

        jLabel3.setText("Contraseña");

        Boton_ir_Registro.setText("Registrarse");
        Boton_ir_Registro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_ir_Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_ir_RegistroActionPerformed(evt);
            }
        });

        Boton_Entrar.setText("Entrar");
        Boton_Entrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_Entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton_EntrarMouseClicked(evt);
            }
        });
        Boton_Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_EntrarActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/home.png"))); // NOI18N
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Text_cont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_contActionPerformed(evt);
            }
        });
        Text_cont.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Text_contKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel2)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Text_Usu)
                                    .addComponent(Boton_ir_Registro, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                    .addComponent(Boton_Entrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Text_cont)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButton1)))
                .addContainerGap(187, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(Text_Usu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Text_cont, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Boton_Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(Boton_ir_Registro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_EntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_EntrarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Boton_EntrarMouseClicked

    private void Boton_ir_RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_ir_RegistroActionPerformed
        Registro v2 = new Registro();
        v2.setVisible(true);
        v2.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_Boton_ir_RegistroActionPerformed

    private void Boton_EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_EntrarActionPerformed
        try {
            BD.Conectar();
            //si al registrarse algun espacio está vacio entonces saldrá un error
            if (Text_Usu.getText().isEmpty() || String.copyValueOf(Text_cont.getPassword()).isEmpty()) { 
                JOptionPane.showMessageDialog(this,
                        "Algun espacio está vacio",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }  else try {
                
                
                String nU = Text_Usu.getText();
                String pass = String.copyValueOf(Text_cont.getPassword());
                if (BD.coincide(BD.select_usu()+BD.select_condicion("nombre", nU))) {
                    if (BD.coincide(BD.select_usu()+BD.select_condicion("nombre", nU)+BD.select_condicion_and("contraseña", pass))) {
                        
                        System.out.println("inicio de sesion hecha");
                        Sesion.setNomUsu(nU);
                        ResultSet a = BD.datos(BD.select_usu()+BD.select_condicion("nombre", Sesion.getNom()));
                        a.next();
                        if (a.getInt(4) == 1) {
                            System.out.println("entro a menuadmin");
                            Registrado_Admin V2 = new Registrado_Admin();
                            V2.setVisible(true);
                            V2.setLocationRelativeTo(null);
                            this.setVisible(false);
                        } else {
                        Registrado_Usuario V1 = new Registrado_Usuario();
                        V1.setVisible(true);
                        V1.setLocationRelativeTo(null);
                        this.setVisible(false);
                        }
                        
                        
                    } else  {
                        JOptionPane.showMessageDialog(this,
                                "Contraseña incorrecto",
                                "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this,
                            "Usuario incorrecto",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Iniciar_Se.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Iniciar_Se.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Iniciar_Se.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Iniciar_Se.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_Boton_EntrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Eleccion V3 = null;
        try {
            V3 = new Eleccion();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Iniciar_Se.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Iniciar_Se.class.getName()).log(Level.SEVERE, null, ex);
        }
        V3.setVisible(true);
        V3.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Text_contActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_contActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_contActionPerformed

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed
        presionado(evt.getKeyCode());
    }//GEN-LAST:event_jPanel1KeyPressed

    private void Text_contKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Text_contKeyPressed
        presionado(evt.getKeyCode());
    }//GEN-LAST:event_Text_contKeyPressed
    private void presionado(int a){
        if (a ==10) {
            Boton_Entrar.doClick();
        }
    }
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Iniciar_Se.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Iniciar_Se.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Iniciar_Se.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Iniciar_Se.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Iniciar_Se().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Entrar;
    private javax.swing.JButton Boton_ir_Registro;
    private javax.swing.JTextField Text_Usu;
    private javax.swing.JPasswordField Text_cont;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
