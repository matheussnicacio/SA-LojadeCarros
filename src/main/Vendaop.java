/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import conecta.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import cadastro.opCompra;
import main.Principal;
import model.Venda;
/**
 *
 * @author matheus_n_pereira
 */
public class Vendaop extends javax.swing.JFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    /**
     * Creates new form teste
     */
    public Vendaop() {
        initComponents();
         setSize(854,480);
        conexao = Conexao.conector();
        setLocationRelativeTo(null);
    }
private void venda() {
        String sql = "delete from carro where txtid = ?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtid.getText());

            int excluir = JOptionPane.showConfirmDialog(null, "Confirma a venda ?", "Atenção", JOptionPane.YES_NO_OPTION);
            if (excluir == JOptionPane.YES_OPTION) {
                int excluido = pst.executeUpdate();
                if (excluido > 0) {
                    JOptionPane.showMessageDialog(null, "Venda realizado com sucesso");
                    txtprecov.setText(null);
                    
                    txtid.setText(null);
                    txtmarca.setText(null);
                    txtmodelo.setText(null);
                    txtanov.setText(null);
                    txtdesc.setText(null);
                    txtplaca.setText(null);
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }
  //metodo consultar 
    private void pesquisar() {
     String sql = "Select * from carro where txtid = ?";

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtid.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                txtmanuntencao.setText(rs.getString(9));
                txtplaca.setText(rs.getString(8));//
                txtvalorc.setText(rs.getString(10));//
                txtmodelo.setText(rs.getString(5));//
                 txtanov.setText(rs.getString(11));//
                txtdesc.setText(rs.getString(7));//
                txtmarca.setText(rs.getString(6));//
                
            } else {
                 txtmanuntencao.setText(rs.getString(9));
                txtmarca.setText(null);
                txtmodelo.setText(null);
               txtvalorc.setText(rs.getString(10));
                txtdesc.setText(null);
                txtplaca.setText(null);

                JOptionPane.showMessageDialog(null, "Usuário não encontrado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        desktop = new javax.swing.JDesktopPane();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtplaca = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtanov = new javax.swing.JTextField();
        txtmarca = new javax.swing.JTextField();
        txtprecov = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txtvalorc = new javax.swing.JTextField();
        txtmanuntencao = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtdesc = new javax.swing.JTextField();
        txtmodelo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(184, 176, 59));
        jButton2.setText("Cancelar");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 176, 59), 3));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton2);
        jButton2.setBounds(620, 260, 180, 30);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(184, 176, 59));
        jButton3.setText("Confirmar");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 176, 59), 3));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton3);
        jButton3.setBounds(620, 210, 180, 30);

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(184, 176, 59));
        jLabel11.setText("Deseja confirmar a venda");
        desktop.add(jLabel11);
        jLabel11.setBounds(620, 170, 210, 24);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(184, 176, 59));
        jLabel1.setText("Opção de venda");
        desktop.add(jLabel1);
        jLabel1.setBounds(340, 10, 177, 32);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(184, 176, 59));
        jLabel2.setText("Digite o código de compra do veículo");
        desktop.add(jLabel2);
        jLabel2.setBounds(250, 50, 390, 24);

        txtplaca.setBackground(new java.awt.Color(0, 0, 0));
        txtplaca.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtplaca.setForeground(new java.awt.Color(184, 176, 59));
        txtplaca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 176, 59), 3));
        desktop.add(txtplaca);
        txtplaca.setBounds(300, 250, 220, 30);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(184, 176, 59));
        jButton1.setText("Pesquisar");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 176, 59), 3));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        desktop.add(jButton1);
        jButton1.setBounds(410, 90, 100, 30);

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(184, 176, 59));
        jLabel8.setText("Digite o valor de venda");
        desktop.add(jLabel8);
        jLabel8.setBounds(300, 360, 210, 24);

        txtanov.setBackground(new java.awt.Color(0, 0, 0));
        txtanov.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtanov.setForeground(new java.awt.Color(184, 176, 59));
        txtanov.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 176, 59), 3));
        txtanov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtanovActionPerformed(evt);
            }
        });
        desktop.add(txtanov);
        txtanov.setBounds(50, 320, 185, 30);

        txtmarca.setBackground(new java.awt.Color(0, 0, 0));
        txtmarca.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtmarca.setForeground(new java.awt.Color(184, 176, 59));
        txtmarca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 176, 59), 3));
        desktop.add(txtmarca);
        txtmarca.setBounds(50, 180, 185, 30);

        txtprecov.setBackground(new java.awt.Color(0, 0, 0));
        txtprecov.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtprecov.setForeground(new java.awt.Color(184, 176, 59));
        txtprecov.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 176, 59), 3));
        txtprecov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecovActionPerformed(evt);
            }
        });
        desktop.add(txtprecov);
        txtprecov.setBounds(300, 390, 220, 30);

        txtid.setBackground(new java.awt.Color(0, 0, 0));
        txtid.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtid.setForeground(new java.awt.Color(184, 176, 59));
        txtid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 176, 59), 3));
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        desktop.add(txtid);
        txtid.setBounds(300, 90, 100, 30);

        txtvalorc.setBackground(new java.awt.Color(0, 0, 0));
        txtvalorc.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtvalorc.setForeground(new java.awt.Color(184, 176, 59));
        txtvalorc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 176, 59), 3));
        txtvalorc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvalorcActionPerformed(evt);
            }
        });
        desktop.add(txtvalorc);
        txtvalorc.setBounds(50, 390, 185, 30);

        txtmanuntencao.setBackground(new java.awt.Color(0, 0, 0));
        txtmanuntencao.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtmanuntencao.setForeground(new java.awt.Color(184, 176, 59));
        txtmanuntencao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 176, 59), 3));
        desktop.add(txtmanuntencao);
        txtmanuntencao.setBounds(300, 320, 220, 30);

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(184, 176, 59));
        jLabel14.setText("Manuntenção do veículo");
        desktop.add(jLabel14);
        jLabel14.setBounds(300, 290, 260, 24);

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(184, 176, 59));
        jLabel13.setText("Valor de compra");
        desktop.add(jLabel13);
        jLabel13.setBounds(50, 360, 170, 24);

        txtdesc.setBackground(new java.awt.Color(0, 0, 0));
        txtdesc.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtdesc.setForeground(new java.awt.Color(184, 176, 59));
        txtdesc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 176, 59), 3));
        desktop.add(txtdesc);
        txtdesc.setBounds(300, 180, 212, 30);

        txtmodelo.setBackground(new java.awt.Color(0, 0, 0));
        txtmodelo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtmodelo.setForeground(new java.awt.Color(184, 176, 59));
        txtmodelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 176, 59), 3));
        txtmodelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmodeloActionPerformed(evt);
            }
        });
        desktop.add(txtmodelo);
        txtmodelo.setBounds(50, 250, 185, 30);

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(184, 176, 59));
        jLabel6.setText("Marca");
        desktop.add(jLabel6);
        jLabel6.setBounds(50, 150, 140, 24);

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(184, 176, 59));
        jLabel4.setText("Ano do veículo");
        desktop.add(jLabel4);
        jLabel4.setBounds(50, 290, 170, 24);

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(184, 176, 59));
        jLabel12.setText("Modelo");
        desktop.add(jLabel12);
        jLabel12.setBounds(50, 220, 59, 24);

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(184, 176, 59));
        jLabel7.setText("Placa");
        desktop.add(jLabel7);
        jLabel7.setBounds(300, 220, 150, 24);

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(184, 176, 59));
        jLabel5.setText("Descrição do veículo");
        desktop.add(jLabel5);
        jLabel5.setBounds(300, 150, 230, 24);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/2 (1).jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        desktop.add(jLabel9);
        jLabel9.setBounds(0, 0, 850, 450);

        jDesktopPane1.add(desktop);
        desktop.setBounds(0, 0, 850, 450);

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(184, 176, 59));
        jLabel10.setText("Digite o código de compra do veículo");
        jDesktopPane1.add(jLabel10);
        jLabel10.setBounds(260, 60, 380, 24);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 854, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Principal principal = new Principal();
        principal.setVisible(true);
        desktop.add(principal);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      
        
        jButton3.setVisible(false);
        
        venda();
        Principal principal = new Principal();
        principal.setVisible(true);
        desktop.add(principal);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtmodeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmodeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmodeloActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        pesquisar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtprecovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecovActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprecovActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void txtanovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtanovActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtanovActionPerformed

    private void txtvalorcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvalorcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvalorcActionPerformed

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
            java.util.logging.Logger.getLogger(Vendaop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vendaop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vendaop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vendaop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vendaop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtanov;
    private javax.swing.JTextField txtdesc;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmanuntencao;
    private javax.swing.JTextField txtmarca;
    private javax.swing.JTextField txtmodelo;
    private javax.swing.JTextField txtplaca;
    private javax.swing.JTextField txtprecov;
    private javax.swing.JTextField txtvalorc;
    // End of variables declaration//GEN-END:variables
}
