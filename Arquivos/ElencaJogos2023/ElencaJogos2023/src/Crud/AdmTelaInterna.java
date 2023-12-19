/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Crud;

import DAO.Cat;
import DAO.DAO;
import DAO.Jogos;
import Login.TelaLogin;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Bruno Pz
 */
public class AdmTelaInterna extends javax.swing.JInternalFrame {

    /**
     * Creates new form AdmTelaInterna
     */
    public AdmTelaInterna() {
        initComponents();
        this.setResizable(false);
        DefaultTableModel model = (DefaultTableModel) tabelaCRUD.getModel();
        tabelaCRUD.setRowSorter(new TableRowSorter(model));

        readJTable();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jogosPainel = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        botaoSairAdm = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campoNomeJogo = new javax.swing.JTextField();
        campoNotaJogo = new javax.swing.JTextField();
        campoProdutoraJogo = new javax.swing.JTextField();
        campoClassificacaoJogo = new javax.swing.JTextField();
        botaoInserirJogo = new javax.swing.JButton();
        botaoAtualizarJogo = new javax.swing.JButton();
        botaoDeletarJogo = new javax.swing.JButton();
        botaoLimparJogo = new javax.swing.JButton();
        botaoInserirCategoria = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        campoCategoria = new javax.swing.JTextField();
        botaoAtualizarCategoria = new javax.swing.JButton();
        botaoDeletarCategoria = new javax.swing.JButton();
        botaoLimparCategoria = new javax.swing.JButton();
        botaoVoltarLogin = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        campoCategoriaEstrangeira = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCRUD = new javax.swing.JTable();
        botaoResetarTabela = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        campoIdCategoria = new javax.swing.JTextField();
        botaoObservacao = new javax.swing.JButton();

        jogosPainel.setBackground(new java.awt.Color(204, 204, 204));
        jogosPainel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Tela ADM - Jogos CRUD");
        jogosPainel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        botaoSairAdm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoSairAdm.setText("SAIR");
        botaoSairAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairAdmActionPerformed(evt);
            }
        });
        jogosPainel.add(botaoSairAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nome do Jogo: ");
        jogosPainel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Nota do Jogo:");
        jogosPainel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Produtora:");
        jogosPainel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Classificação:");
        jogosPainel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        campoNomeJogo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoNomeJogoKeyTyped(evt);
            }
        });
        jogosPainel.add(campoNomeJogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 220, -1));
        jogosPainel.add(campoNotaJogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 220, -1));
        jogosPainel.add(campoProdutoraJogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 220, -1));
        jogosPainel.add(campoClassificacaoJogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 220, -1));

        botaoInserirJogo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoInserirJogo.setText("INSERIR");
        botaoInserirJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInserirJogoActionPerformed(evt);
            }
        });
        jogosPainel.add(botaoInserirJogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 100, -1));

        botaoAtualizarJogo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoAtualizarJogo.setText("ATUALIZAR");
        botaoAtualizarJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAtualizarJogoActionPerformed(evt);
            }
        });
        jogosPainel.add(botaoAtualizarJogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        botaoDeletarJogo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoDeletarJogo.setText("DELETAR");
        botaoDeletarJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDeletarJogoActionPerformed(evt);
            }
        });
        jogosPainel.add(botaoDeletarJogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 100, -1));

        botaoLimparJogo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoLimparJogo.setText("LIMPAR");
        botaoLimparJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparJogoActionPerformed(evt);
            }
        });
        jogosPainel.add(botaoLimparJogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 110, -1));

        botaoInserirCategoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoInserirCategoria.setText("INSERIR CATEGORIA");
        botaoInserirCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInserirCategoriaActionPerformed(evt);
            }
        });
        jogosPainel.add(botaoInserirCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 310, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Categoria: ");
        jogosPainel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, -1, -1));

        campoCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCategoriaActionPerformed(evt);
            }
        });
        campoCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoCategoriaKeyTyped(evt);
            }
        });
        jogosPainel.add(campoCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 230, -1));

        botaoAtualizarCategoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoAtualizarCategoria.setText("ATUALIZAR");
        botaoAtualizarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAtualizarCategoriaActionPerformed(evt);
            }
        });
        jogosPainel.add(botaoAtualizarCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, -1, -1));

        botaoDeletarCategoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoDeletarCategoria.setText("DELETAR");
        botaoDeletarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDeletarCategoriaActionPerformed(evt);
            }
        });
        jogosPainel.add(botaoDeletarCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, -1, -1));

        botaoLimparCategoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoLimparCategoria.setText("LIMPAR");
        botaoLimparCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparCategoriaActionPerformed(evt);
            }
        });
        jogosPainel.add(botaoLimparCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 90, -1));

        botaoVoltarLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoVoltarLogin.setText("VOLTAR");
        botaoVoltarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarLoginActionPerformed(evt);
            }
        });
        jogosPainel.add(botaoVoltarLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Categoria: ");
        jogosPainel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));
        jogosPainel.add(campoCategoriaEstrangeira, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 220, -1));

        tabelaCRUD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Jogo", "Nota", "Produtora", "Classificação", "Categoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaCRUD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaCRUDMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaCRUD);

        jogosPainel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 750, 260));

        botaoResetarTabela.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoResetarTabela.setText("RESETAR TABELA");
        botaoResetarTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoResetarTabelaActionPerformed(evt);
            }
        });
        jogosPainel.add(botaoResetarTabela, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Observação: a Categoria deve ser vista pelo Postgre");
        jogosPainel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("diferente de Jogo que aparece na Jtable.");
        jogosPainel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("ID:");
        jogosPainel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, -1, -1));

        campoIdCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoIdCategoriaActionPerformed(evt);
            }
        });
        jogosPainel.add(campoIdCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 230, -1));

        botaoObservacao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botaoObservacao.setText("OBSERVAÇÕES");
        botaoObservacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoObservacaoActionPerformed(evt);
            }
        });
        jogosPainel.add(botaoObservacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jogosPainel, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jogosPainel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSairAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairAdmActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botaoSairAdmActionPerformed

    private void botaoInserirJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInserirJogoActionPerformed
        DAO jogo = new DAO();
        
        try {
            String nome = campoNomeJogo.getText();
            double nota = Double.parseDouble(campoNotaJogo.getText());
            String produtora = campoProdutoraJogo.getText();
            String classificacao = campoClassificacaoJogo.getText();
            int categoria_id = Integer.parseInt(campoCategoriaEstrangeira.getText());
            
            jogo.inserirJogo(nome, nota, produtora, classificacao, categoria_id);

            JOptionPane.showMessageDialog(null, "Jogo cadastrado "
                    + "com sucesso!");
            campoNomeJogo.setText("");
            campoNotaJogo.setText("");
            campoProdutoraJogo.setText("");
            campoClassificacaoJogo.setText("");
            campoCategoriaEstrangeira.setText("");
            
            } catch (NumberFormatException e) {
                if (e.getMessage().contains("decimal")) {
                    JOptionPane.showMessageDialog(null, "Por favor, "
                            + "insira um número decimal.");
                } else {
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro. "
                            + "Por favor, tente novamente.");
                }
            }
        
            jogo.close();
    }//GEN-LAST:event_botaoInserirJogoActionPerformed

    private void botaoAtualizarJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAtualizarJogoActionPerformed
            if (tabelaCRUD.getSelectedRow() != -1) {
            Jogos v = new Jogos();
            DAO dao = new DAO();

            v.setJogo(campoNomeJogo.getText());
            v.setNota(Double.parseDouble(campoNotaJogo.getText()));
            v.setProdutora(campoProdutoraJogo.getText());
            v.setClassificacao(campoClassificacaoJogo.getText());
            v.setCategoria_id(Integer.parseInt(campoCategoriaEstrangeira.getText()));
            v.setId((int) tabelaCRUD.getValueAt(tabelaCRUD.getSelectedRow(), 0));

            dao.updateJogos(v);

            campoNomeJogo.setText("");
            campoNotaJogo.setText("");
            campoProdutoraJogo.setText("");
            campoClassificacaoJogo.setText("");
            campoCategoriaEstrangeira.setText("");

            readJTable();
        }

    }//GEN-LAST:event_botaoAtualizarJogoActionPerformed

    private void botaoDeletarJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDeletarJogoActionPerformed
        
        if (tabelaCRUD.getSelectedRow() != -1) {
                                Jogos v = new Jogos();
                                DAO vdao = new DAO();

                                v.setId((int) tabelaCRUD.getValueAt
        (tabelaCRUD.getSelectedRow(), 0));
                                vdao.deletarJogo(v.getId());

                                campoNomeJogo.setText("");
                                campoNotaJogo.setText("");
                                campoProdutoraJogo.setText("");
                                campoClassificacaoJogo.setText("");
                                campoCategoriaEstrangeira.setText("");
                                
                                readJTable();

                           } else {
                               JOptionPane.showMessageDialog(null, "Selecione um produto para excluir.");
                           }
        
    }//GEN-LAST:event_botaoDeletarJogoActionPerformed

    private void botaoLimparJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparJogoActionPerformed
        campoNomeJogo.setText("");
        campoNotaJogo.setText("");
        campoProdutoraJogo.setText("");
        campoClassificacaoJogo.setText("");
        campoCategoriaEstrangeira.setText("");
    }//GEN-LAST:event_botaoLimparJogoActionPerformed

    private void botaoInserirCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInserirCategoriaActionPerformed
        DAO cat = new DAO();
        Cat v = new Cat();
        
        if (campoCategoria.getText().isEmpty() || 
                campoIdCategoria.getText().isEmpty()) {
    JOptionPane.showMessageDialog(null, "Preencha o nome e "
            + "o ID da categoria");
        campoCategoria.requestFocus();
        
        } else {
            
        }
        
        try {
        String categoria = campoCategoria.getText();
        int id = Integer.parseInt(campoIdCategoria.getText());
        
        v.setCategoria(categoria);
        v.setId(id);
        
        cat.inserirCategoria(v);
        
        JOptionPane.showMessageDialog(null, "Categoria cadastrada "
                + "com sucesso!");
        
        campoCategoria.setText("");
        campoIdCategoria.setText("");

        
        } catch (IllegalArgumentException e) {
        JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao "
                    + "cadastrar a categoria. Tente novamente.");
        } finally {
            cat.close();
        }
        
    }//GEN-LAST:event_botaoInserirCategoriaActionPerformed

    private void botaoAtualizarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAtualizarCategoriaActionPerformed
        DAO cat = new DAO();
        Cat v = new Cat();

        if (campoCategoria.getText().isEmpty() || campoIdCategoria.getText().
                isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o nome e "
                    + "o ID da categoria.");
            campoCategoria.requestFocus();
            
        } else {
            
            try {
                
                String categoria = campoCategoria.getText();
                int id = Integer.parseInt(campoIdCategoria.getText());
                
                v.setCategoria(categoria);
                v.setId(id);
                
                cat.updateCategoria(v);
                
                JOptionPane.showMessageDialog(null, 
                        "Categoria atualizada com sucesso!");
                
                campoCategoria.setText("");
                campoIdCategoria.setText("");
                
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Falha "
                        + "ao atualizar a categoria. Tente novamente.");
            } finally {
                cat.close();
            }
        }
    }//GEN-LAST:event_botaoAtualizarCategoriaActionPerformed

    private void botaoDeletarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDeletarCategoriaActionPerformed
        DAO cat = new DAO();
        Cat v = new Cat();

        if (campoIdCategoria.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o ID da categoria");
            campoIdCategoria.requestFocus();
        } else {
            try {
                int id = Integer.parseInt(campoIdCategoria.getText());

                v.setId(id);

                cat.deletarCategoria(v);

                JOptionPane.showMessageDialog(null, "Categoria deletada com sucesso!");

                campoIdCategoria.setText("");
                campoCategoria.setText("");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Falha ao deletar a categoria. Tente novamente.");
            } finally {
                cat.close();
            }
        }
    }//GEN-LAST:event_botaoDeletarCategoriaActionPerformed

    private void botaoLimparCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparCategoriaActionPerformed
        campoCategoria.setText("");
    }//GEN-LAST:event_botaoLimparCategoriaActionPerformed

    private void botaoVoltarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarLoginActionPerformed
        this.hide();
        TelaLogin loginObj = new TelaLogin();
        loginObj.show();
    }//GEN-LAST:event_botaoVoltarLoginActionPerformed

    private void tabelaCRUDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaCRUDMouseClicked
        if (tabelaCRUD.getSelectedRow() != -1) {
            campoNomeJogo.setText(tabelaCRUD.getValueAt(tabelaCRUD.getSelectedRow(), 1).toString());
            double nota = Double.parseDouble(tabelaCRUD.getValueAt(tabelaCRUD.getSelectedRow(), 2).toString());
            campoProdutoraJogo.setText(tabelaCRUD.getValueAt(tabelaCRUD.getSelectedRow(), 3).toString());
            campoClassificacaoJogo.setText(tabelaCRUD.getValueAt(tabelaCRUD.getSelectedRow(), 4).toString());
            int categoria_id = Integer.parseInt(tabelaCRUD.getValueAt(tabelaCRUD.getSelectedRow(), 5).toString());
        }
    }//GEN-LAST:event_tabelaCRUDMouseClicked

    private void botaoResetarTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoResetarTabelaActionPerformed
                        readJTable();
    }//GEN-LAST:event_botaoResetarTabelaActionPerformed

    private void campoNomeJogoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoNomeJogoKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            JOptionPane.showMessageDialog(null, "Por favor, "
                    + "digite apenas letras.");
            evt.consume();
        }
    }//GEN-LAST:event_campoNomeJogoKeyTyped

    private void campoCategoriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoCategoriaKeyTyped
        char d = evt.getKeyChar();
        if (!Character.isLetter(d)) {
            JOptionPane.showMessageDialog(null, "Por favor, "
                    + "digite apenas letras.");
            evt.consume();
        }
    }//GEN-LAST:event_campoCategoriaKeyTyped

    private void campoCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCategoriaActionPerformed

    private void campoIdCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoIdCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoIdCategoriaActionPerformed

    private void botaoObservacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoObservacaoActionPerformed
        String obs = "Informações dos jogos pela JTable. Da categoria, pelo "
                + "Postgre. Para evitar outra tela apenas para o CRUD da "
                + "categoria. Obrigado pela consideração.";
        
        JOptionPane.showMessageDialog(null, obs);
    }//GEN-LAST:event_botaoObservacaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton botaoAtualizarCategoria;
    public static javax.swing.JButton botaoAtualizarJogo;
    public static javax.swing.JButton botaoDeletarCategoria;
    public static javax.swing.JButton botaoDeletarJogo;
    public static javax.swing.JButton botaoInserirCategoria;
    public static javax.swing.JButton botaoInserirJogo;
    public static javax.swing.JButton botaoLimparCategoria;
    public static javax.swing.JButton botaoLimparJogo;
    public static javax.swing.JButton botaoObservacao;
    public static javax.swing.JButton botaoResetarTabela;
    public static javax.swing.JButton botaoSairAdm;
    public static javax.swing.JButton botaoVoltarLogin;
    public static javax.swing.JTextField campoCategoria;
    public static javax.swing.JTextField campoCategoriaEstrangeira;
    public static javax.swing.JTextField campoClassificacaoJogo;
    private static javax.swing.JTextField campoIdCategoria;
    public static javax.swing.JTextField campoNomeJogo;
    public static javax.swing.JTextField campoNotaJogo;
    public static javax.swing.JTextField campoProdutoraJogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JDesktopPane jogosPainel;
    public static javax.swing.JTable tabelaCRUD;
    // End of variables declaration//GEN-END:variables

    private void readJTable() {
        
            DefaultTableModel modelo = (DefaultTableModel) tabelaCRUD.
                    getModel();
            modelo.setNumRows(0);
            DAO vdao = new DAO();

            for (Jogos v : vdao.getJogos()) {

                modelo.addRow(new Object[]{
                    v.getId(),
                    v.getJogo(),
                    v.getNota(),
                    v.getProdutora(),
                    v.getClassificacao(),
                    v.getCategoria_id(),
                });

            }
    }
}
