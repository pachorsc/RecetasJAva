/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Menus;

import java.sql.*;
import finalproject.BD;
import finalproject.FinalProject;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Registrado_Puntuar extends javax.swing.JFrame {

    /**
     * Creates new form Registrado_Puntuar
     */
    public Registrado_Puntuar() throws ClassNotFoundException, SQLException {
        initComponents();
        jLabel1.setText(FinalProject.getRece().getNombre());
        ResultSet rece = BD.datos(BD.select("pasos", "recetas")+BD.select_condicion("nombre",FinalProject.getRece().getNombre()));
        rece.next();
        Texto_Receta.setText(rece.getString(1));
        
        ResultSet pun = BD.datos(BD.select("cod","recetas")+BD.select_condicion("nombre",FinalProject.getRece().getNombre()));
        pun.next();
        if (BD.coincide(BD.select("count(*)","puntuaciones")+BD.select_condicion("receta",pun.getString(1))+BD.select_condicion_and("usuario",Sesion.getCod(Sesion.getNom())))) {
            Puntuacion_dar.hide();
            jButton8.hide();               
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        Texto_Receta = new javax.swing.JTextPane();
        jButton7 = new javax.swing.JButton();
        Puntuacion_dar = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(718, 599));
        setMinimumSize(new java.awt.Dimension(718, 599));
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(718, 599));
        jPanel1.setMinimumSize(new java.awt.Dimension(718, 599));
        jPanel1.setPreferredSize(new java.awt.Dimension(718, 599));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nombre Receta");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jScrollPane1.setViewportView(Texto_Receta);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/home.png"))); // NOI18N
        jButton7.setText("Volver");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        Puntuacion_dar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Puntuacion_dar.setText("0 -10");
        Puntuacion_dar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Puntuacion_darActionPerformed(evt);
            }
        });

        jButton8.setText("Puntuar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(Puntuacion_dar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(146, 146, 146))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Puntuacion_dar)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addGap(132, 132, 132))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Registrado_Usuario V3 = null;
        try {
            V3 = new Registrado_Usuario(Sesion.getNom());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Registrado_Puntuar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Registrado_Puntuar.class.getName()).log(Level.SEVERE, null, ex);
        }
        V3.setVisible(true);
        V3.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            int punt;
            ResultSet pun = BD.datos(BD.select("cod","recetas")+BD.select_condicion("nombre",FinalProject.getRece().getNombre()));
            if (BD.coincide(BD.select("count(*)","recetas")+BD.select_condicion("receta",pun.getString(1))+BD.select_condicion_and("usuario",Sesion.getCod(Sesion.getNom())))) {
                Puntuacion_dar.hide();
                jButton8.hide();               
            }
            
            if (Puntuacion_dar.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, 
                        "puntuacion vacia",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                
            }else {
                try {
                    punt = Integer.valueOf(Puntuacion_dar.getText());
                    System.out.println("Converted integer: " + punt);

                    if(punt>10 || punt<0) {
                        JOptionPane.showMessageDialog(this,
                                "La puntuacion está erronea",
                                "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }else {
                        Puntuacion_dar.hide();
                        jButton8.hide();
                        
                        String receta_usu = "";
                        pun = BD.datos(BD.select("cod","recetas")+BD.select_condicion("nombre",FinalProject.getRece().getNombre()));
                        pun.next();
                        receta_usu=Sesion.getCod(Sesion.getNom())+", "+pun.getString(1)+", "+Puntuacion_dar.getText();
                        BD.basedatos(BD.insertar("puntuaciones (usuario, receta, nota)",receta_usu));
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid integer input");
                    JOptionPane.showMessageDialog(this,
                            "Ha puesto letras en la puntuacion",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Registrado_Puntuar.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Registrado_Puntuar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Registrado_Puntuar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Registrado_Puntuar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
            
            
        
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void Puntuacion_darActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Puntuacion_darActionPerformed
       
    }//GEN-LAST:event_Puntuacion_darActionPerformed

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
            java.util.logging.Logger.getLogger(Registrado_Puntuar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrado_Puntuar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrado_Puntuar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrado_Puntuar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Registrado_Puntuar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Puntuacion_dar;
    private javax.swing.JTextPane Texto_Receta;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
