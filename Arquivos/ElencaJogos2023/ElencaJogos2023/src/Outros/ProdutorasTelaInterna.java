/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Outros;

import Principal.PrincipalTelaInterna;
import java.awt.Desktop;
import java.net.URI;

/**
 *
 * @author silen
 */
public class ProdutorasTelaInterna extends javax.swing.JInternalFrame {

    /**
     * Creates new form ProdutorasTelaInterna
     */
    public ProdutorasTelaInterna() {
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

        produtorasPainel = new javax.swing.JDesktopPane();
        botaoFecharProdutoras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botaoSupercell = new javax.swing.JButton();
        botaoInnersloth = new javax.swing.JButton();
        botaoEaGames = new javax.swing.JButton();
        botaoKing = new javax.swing.JButton();
        botaoBethesda = new javax.swing.JButton();

        produtorasPainel.setBackground(new java.awt.Color(153, 255, 0));
        produtorasPainel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botaoFecharProdutoras.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoFecharProdutoras.setText("FECHAR");
        botaoFecharProdutoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFecharProdutorasActionPerformed(evt);
            }
        });
        produtorasPainel.add(botaoFecharProdutoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 6, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/play store 128.png"))); // NOI18N
        produtorasPainel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 130, 140));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Saiba mais sobre as Produtoras de Jogos Mobile");
        produtorasPainel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Selecionei 5 sites de Produtoras Mobile, para você saber o que tem de legal para Android:");
        produtorasPainel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        botaoSupercell.setText("SUPERCELL");
        botaoSupercell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSupercellActionPerformed(evt);
            }
        });
        produtorasPainel.add(botaoSupercell, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        botaoInnersloth.setText("INNERSLOTH");
        botaoInnersloth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInnerslothActionPerformed(evt);
            }
        });
        produtorasPainel.add(botaoInnersloth, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        botaoEaGames.setText("EA GAMES");
        botaoEaGames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEaGamesActionPerformed(evt);
            }
        });
        produtorasPainel.add(botaoEaGames, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, -1));

        botaoKing.setText("KING");
        botaoKing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoKingActionPerformed(evt);
            }
        });
        produtorasPainel.add(botaoKing, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, -1, -1));

        botaoBethesda.setText("BETHESDA");
        botaoBethesda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBethesdaActionPerformed(evt);
            }
        });
        produtorasPainel.add(botaoBethesda, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(produtorasPainel, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(produtorasPainel)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoFecharProdutorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFecharProdutorasActionPerformed
        PrincipalTelaInterna principalTela = new PrincipalTelaInterna(); 
        principalTela.setVisible(true); 
        getParent().add(principalTela); 
        this.dispose(); 
    }//GEN-LAST:event_botaoFecharProdutorasActionPerformed

    private void botaoSupercellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSupercellActionPerformed
        String[] args;
        try{
            URI link = new URI("https://store.supercell.com/pt");
            Desktop.getDesktop().browse(link);
        }catch(Exception erro){
            System.out.println(erro);
        }
    }//GEN-LAST:event_botaoSupercellActionPerformed

    private void botaoInnerslothActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInnerslothActionPerformed
        String[] args;
        try{
            URI link = new URI("https://www.innersloth.com/");
            Desktop.getDesktop().browse(link);
        }catch(Exception erro){
            System.out.println(erro);
        }
    }//GEN-LAST:event_botaoInnerslothActionPerformed

    private void botaoEaGamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEaGamesActionPerformed
        String[] args;
        try{
            URI link = new URI("https://www.ea.com/pt-br/games/library/mobile");
            Desktop.getDesktop().browse(link);
        }catch(Exception erro){
            System.out.println(erro);
        }
    }//GEN-LAST:event_botaoEaGamesActionPerformed

    private void botaoKingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoKingActionPerformed
        String[] args;
        try{
            URI link = new URI("https://www.king.com/pt_BR");
            Desktop.getDesktop().browse(link);
        }catch(Exception erro){
            System.out.println(erro);
        }
    }//GEN-LAST:event_botaoKingActionPerformed

    private void botaoBethesdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBethesdaActionPerformed
        String[] args;
        try{
            URI link = new URI("https://bethesda.net/en/games/catalog?page=1&pageSize=12");
            Desktop.getDesktop().browse(link);
        }catch(Exception erro){
            System.out.println(erro);
        }
    }//GEN-LAST:event_botaoBethesdaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton botaoBethesda;
    public static javax.swing.JButton botaoEaGames;
    public static javax.swing.JButton botaoFecharProdutoras;
    public static javax.swing.JButton botaoInnersloth;
    public static javax.swing.JButton botaoKing;
    public static javax.swing.JButton botaoSupercell;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JDesktopPane produtorasPainel;
    // End of variables declaration//GEN-END:variables
}
