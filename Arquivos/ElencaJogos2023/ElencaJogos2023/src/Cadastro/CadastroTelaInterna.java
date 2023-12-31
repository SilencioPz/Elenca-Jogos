/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Cadastro;

import DAO.Usuario;
import DAO.UsuarioDAO;
import Login.TelaLogin;
import java.awt.Color;
import javax.swing.JInternalFrame;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Bruno Pz
 */
public class CadastroTelaInterna extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastroTelaInterna
     */
    public CadastroTelaInterna() {
        initComponents();
        this.setResizable(false); //Deixa a tela fixa.
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
        jLabel1 = new javax.swing.JLabel();
        botaoSairInterno = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        campoDataNascimento = new javax.swing.JTextField();
        campoEmail = new javax.swing.JTextField();
        campoSenha = new javax.swing.JPasswordField();
        campoConfirmaSenha = new javax.swing.JPasswordField();
        botaoCadastrarInterno = new javax.swing.JButton();
        botaoVoltarInterno = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));
        setBorder(null);

        jDesktopPane1.setBackground(new java.awt.Color(0, 0, 0));
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/android store logo.png"))); // NOI18N
        jDesktopPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 124, 104));

        botaoSairInterno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoSairInterno.setText("SAIR");
        botaoSairInterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairInternoActionPerformed(evt);
            }
        });
        jDesktopPane1.add(botaoSairInterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome:");
        jDesktopPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Data Nascimento: ");
        jDesktopPane1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("E-mail: ");
        jDesktopPane1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Senha: ");
        jDesktopPane1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Confirmar Senha: ");
        jDesktopPane1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, -1, -1));
        jDesktopPane1.add(campoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 200, -1));
        jDesktopPane1.add(campoDataNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 200, -1));
        jDesktopPane1.add(campoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 200, -1));
        jDesktopPane1.add(campoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 200, -1));
        jDesktopPane1.add(campoConfirmaSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 200, -1));

        botaoCadastrarInterno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoCadastrarInterno.setText("CADASTRAR");
        botaoCadastrarInterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarInternoActionPerformed(evt);
            }
        });
        jDesktopPane1.add(botaoCadastrarInterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 200, -1));

        botaoVoltarInterno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoVoltarInterno.setText("VOLTAR");
        botaoVoltarInterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarInternoActionPerformed(evt);
            }
        });
        jDesktopPane1.add(botaoVoltarInterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 815, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSairInternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairInternoActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botaoSairInternoActionPerformed

    private void botaoCadastrarInternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarInternoActionPerformed
        Usuario v = new Usuario();
        UsuarioDAO dao = new UsuarioDAO();
        
        String nome = campoNome.getText();
        if (nome.length() < 5) {
            JOptionPane.showMessageDialog(null, "O nome "
                    + "do usuário deve conter ao menos 5 letras!");
            return;
        }
        
        String dataNasc = campoDataNascimento.getText();
        if (!dataNasc.matches("\\d{2}/\\d{2}/\\d{4}")) {
            JOptionPane.showMessageDialog(null, "A data de "
                    + "nascimento no formato dd/mm/aaaa!");
            return;
        }
        
        String email = campoEmail.getText();
        if (!email.endsWith("@gmail.com")) {
            JOptionPane.showMessageDialog(null, "Por se tratar de, "
                    + "um programa voltado pra Android, só são aceitos e-mails "
                    + "do Gmail!");
            return;
        }
        
        String senha = new String(campoSenha.getPassword());
        String senhaConf = new String(campoConfirmaSenha.getPassword());

        if (!senha.equals(senhaConf)) {
            JOptionPane.showMessageDialog(null, "As senhas "
                    + "não correspondem! Por favor, digite novamente.");
            return;
        }

        v.setNome(campoNome.getText());
        v.setData_nasc(campoDataNascimento.getText());
        v.setEmail(campoEmail.getText());
        v.setSenha(new String(campoSenha.getPassword()));

        dao.inserir(v.getNome(), v.getData_nasc(), v.getEmail(),
                v.getSenha());

        campoNome.setText("");
        campoDataNascimento.setText("");
        campoEmail.setText("");
        campoSenha.setText("");
        campoConfirmaSenha.setText("");
    }//GEN-LAST:event_botaoCadastrarInternoActionPerformed

    private void botaoVoltarInternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarInternoActionPerformed
        /*Este botão volta para a tela de Login, caso o usuário queira apenas
        vere as telas ou não saiba a senha.*/
        this.hide();
        TelaLogin loginObj = new TelaLogin();
        loginObj.show();
    }//GEN-LAST:event_botaoVoltarInternoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton botaoCadastrarInterno;
    public static javax.swing.JButton botaoSairInterno;
    public static javax.swing.JButton botaoVoltarInterno;
    public static javax.swing.JPasswordField campoConfirmaSenha;
    public static javax.swing.JTextField campoDataNascimento;
    public static javax.swing.JTextField campoEmail;
    public static javax.swing.JTextField campoNome;
    public static javax.swing.JPasswordField campoSenha;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
