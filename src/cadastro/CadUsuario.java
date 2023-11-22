/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro;

import conecta.Conexao;
    import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.User;

/**
 *
 * @author matheus_n_pereira
 */
public class CadUsuario extends javax.swing.JInternalFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    /**
     * Creates new form CadUsuario
     */
    public CadUsuario() {
        initComponents();
        setSize(854,480);
        conexao = Conexao.conector();
        
    }
    //metodo adicionar 

    private void adicionar() {
        String sql = "insert into Funcionario(nm_user,ds_login,ds_password,ds_email) values(?,?,?,?)";

        User usuario = new User();
        usuario.setNm_user(nm_user.getText());
        usuario.setDs_login(ds_login.getText());
        usuario.setDs_password(ds_password.getText());
        usuario.setDs_email(ds_email.getText());
    

        if(usuario.getNm_user().equals(""))
            
        {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatorios ");
        }else{
            
        }
        
        
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, usuario.getNm_user());
            pst.setString(2, usuario.getDs_login());
            pst.setString(3, usuario.getDs_password());
            pst.setString(4, usuario.getDs_email());

            if (nm_user.getText().isEmpty() || ds_password.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios");
            } else {
                int adicionado = pst.executeUpdate();

                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
                } else {
                    JOptionPane.showMessageDialog(null, "Ha um erro na inserção");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }//Fim do método adicionar

    //metodo consultar 
    private void consultar() {
        String sql = "Select * from Funcionario where id_user = ?";

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, id_user.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                nm_user.setText(rs.getString(2));
                ds_login.setText(rs.getString(3));
                ds_password.setText(rs.getString(4));
                ds_email.setText(rs.getString(5));
            } else {
                nm_user.setText(null);
                ds_login.setText(null);
                ds_password.setText(null);
                ds_email.setText(null);

                JOptionPane.showMessageDialog(null, "Usuário não encontrado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//Fim do método consultar    

    //Método alterar
    public void alterar() {
        String sql = "update Funcionario set nm_user = ?,ds_login = ?,ds_password = ?,ds_email = ? where id_user = ? ";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, nm_user.getText());
            pst.setString(2, ds_login.getText());
            pst.setString(3, ds_password.getText());
            pst.setString(4, ds_email.getText());
            pst.setString(5, id_user.getText());

            if (id_user.getText().isEmpty() || nm_user.getText().isEmpty()
                    || ds_login.getText().isEmpty() || ds_password.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios");
            } else {
                int alterado = pst.executeUpdate();
                if (alterado > 0) {
                    JOptionPane.showMessageDialog(null, "Alteração realizado com sucesso");
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }
    //Fim do método alterar

    //Método para excluir
    private void excluir() {
        String sql = "delete from Funcionario where id_user = ?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, id_user.getText());

            int excluir = JOptionPane.showConfirmDialog(null, "Confirma a exclusão ?", "Atenção", JOptionPane.YES_NO_OPTION);
            if (excluir == JOptionPane.YES_OPTION) {
                int excluido = pst.executeUpdate();
                if (excluido > 0) {
                    JOptionPane.showMessageDialog(null, "Exclusão realizado com sucesso");
                    nm_user.setText(null);
                    ds_login.setText(null);
                    ds_password.setText(null);
                    id_user.setText(null);
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }
    //Fim do método para excluir    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        id_user = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nm_user = new javax.swing.JTextField();
        ds_login = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ds_password = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        ds_email = new javax.swing.JTextField();
        btnAdicionar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnProcurar = new javax.swing.JButton();
        desktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jButton3.setText("jButton1");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(184, 176, 59));
        jLabel2.setText("ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(47, 55, 70, 24);

        id_user.setBackground(new java.awt.Color(0, 0, 0));
        id_user.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        id_user.setForeground(new java.awt.Color(184, 176, 59));
        id_user.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 176, 59), 3));
        id_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_userActionPerformed(evt);
            }
        });
        getContentPane().add(id_user);
        id_user.setBounds(38, 85, 62, 30);

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(184, 176, 59));
        jLabel3.setText("Usuário");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(38, 127, 130, 24);

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(184, 176, 59));
        jLabel4.setText("Login");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(38, 205, 44, 24);

        nm_user.setBackground(new java.awt.Color(0, 0, 0));
        nm_user.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        nm_user.setForeground(new java.awt.Color(184, 176, 59));
        nm_user.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 176, 59), 3));
        nm_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nm_userActionPerformed(evt);
            }
        });
        getContentPane().add(nm_user);
        nm_user.setBounds(40, 160, 356, 30);

        ds_login.setBackground(new java.awt.Color(0, 0, 0));
        ds_login.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ds_login.setForeground(new java.awt.Color(184, 176, 59));
        ds_login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 176, 59), 3));
        ds_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ds_loginActionPerformed(evt);
            }
        });
        getContentPane().add(ds_login);
        ds_login.setBounds(38, 251, 135, 30);

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(184, 176, 59));
        jLabel5.setText("Senha");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(208, 205, 52, 24);

        ds_password.setBackground(new java.awt.Color(0, 0, 0));
        ds_password.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ds_password.setForeground(new java.awt.Color(184, 176, 59));
        ds_password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 176, 59), 3));
        getContentPane().add(ds_password);
        ds_password.setBounds(208, 251, 165, 30);

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(184, 176, 59));
        jLabel6.setText("E-mail");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(38, 293, 50, 24);

        ds_email.setBackground(new java.awt.Color(0, 0, 0));
        ds_email.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ds_email.setForeground(new java.awt.Color(184, 176, 59));
        ds_email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 176, 59), 3));
        getContentPane().add(ds_email);
        ds_email.setBounds(38, 329, 357, 30);

        btnAdicionar.setBackground(new java.awt.Color(0, 0, 0));
        btnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/create.png"))); // NOI18N
        btnAdicionar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 176, 59), 3));
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdicionar);
        btnAdicionar.setBounds(433, 67, 74, 124);

        btnAlterar.setBackground(new java.awt.Color(0, 0, 0));
        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/update.png"))); // NOI18N
        btnAlterar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 176, 59), 3));
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterar);
        btnAlterar.setBounds(525, 197, 74, 124);

        btnExcluir.setBackground(new java.awt.Color(0, 0, 0));
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/delete.png"))); // NOI18N
        btnExcluir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 176, 59), 3));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(434, 197, 73, 124);

        btnProcurar.setBackground(new java.awt.Color(0, 0, 0));
        btnProcurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/read.png"))); // NOI18N
        btnProcurar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(184, 176, 59), 3));
        btnProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarActionPerformed(evt);
            }
        });
        getContentPane().add(btnProcurar);
        btnProcurar.setBounds(525, 67, 75, 124);
        getContentPane().add(desktop);
        desktop.setBounds(0, 0, 0, 0);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(184, 176, 59));
        jLabel1.setText("Cadastro de Funcionários");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(270, 10, 310, 24);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/2 (1).jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 850, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void id_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_userActionPerformed

    private void nm_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nm_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nm_userActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed

        adicionar();
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed

        alterar();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarActionPerformed

        consultar();
    }//GEN-LAST:event_btnProcurarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        excluir();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void ds_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ds_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ds_loginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnProcurar;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JTextField ds_email;
    private javax.swing.JTextField ds_login;
    private javax.swing.JPasswordField ds_password;
    private javax.swing.JTextField id_user;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField nm_user;
    // End of variables declaration//GEN-END:variables
}
