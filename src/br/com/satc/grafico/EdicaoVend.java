/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.grafico;

import br.com.satc.pessoa.Vendedor;
import br.com.satc.singleton.BancoVendedor;
import javax.swing.JOptionPane;

/**
 *
 * @author Edutec
 */
public class EdicaoVend extends javax.swing.JInternalFrame {

    /**
     * Creates new form EdicaoVend
     */
    public EdicaoVend() {
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

        TCargo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TEspecialidade = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TSalario = new javax.swing.JTextField();
        TSetor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        BtnEditar = new javax.swing.JButton();
        TCpf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        BtnSair = new javax.swing.JButton();
        TRg = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TCodigo = new javax.swing.JTextField();
        BtnPesquisar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        TComissao = new javax.swing.JTextField();

        jLabel10.setText("Cargo:");

        jLabel8.setText("Salario:");

        jLabel7.setText("Especialidade:");

        jLabel2.setText("Nome:");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Cadastro Edição");

        BtnEditar.setText("Editar");
        BtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarActionPerformed(evt);
            }
        });

        jLabel5.setText("RG:");

        BtnSair.setText("Sair");
        BtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSairActionPerformed(evt);
            }
        });

        TRg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TRgActionPerformed(evt);
            }
        });

        jLabel6.setText("Setor:");

        jLabel4.setText("CPF:");

        jLabel3.setText("Codigo:");

        TCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TCodigoActionPerformed(evt);
            }
        });

        BtnPesquisar.setText("Pesquisar");
        BtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPesquisarActionPerformed(evt);
            }
        });

        jLabel9.setText("Comissão:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(212, 212, 212))
                            .addComponent(TNome)
                            .addComponent(jLabel7)
                            .addComponent(TEspecialidade)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(TSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(TSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(BtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnPesquisar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel10))
                            .addComponent(jLabel3)
                            .addComponent(TCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TComissao))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(TCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TRg, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(21, 21, 21))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TComissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnEditar)
                    .addComponent(BtnSair)
                    .addComponent(BtnPesquisar))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarActionPerformed
        // TODO add your handling code here:
        if (TNome.getText().trim().equals("") || TRg.getText().trim().equals("") || TCpf.getText().trim().equals("")
                || TEspecialidade.getText().trim().equals("") || TSalario.getText().trim().equals("")
                    || TSetor.getText().trim().equals("") || TCargo.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Não deixe os espaços em branco.");
    }else{
        Float salario=Float.parseFloat(TSalario.getText());   
        Float comissao=Float.parseFloat(TComissao.getText());
        BancoVendedor.getInstance().vendedores.get(Integer.parseInt(TCodigo.getText())).setNome(TNome.getText());
        BancoVendedor.getInstance().vendedores.get(Integer.parseInt(TCodigo.getText())).setRg(TRg.getText());
        BancoVendedor.getInstance().vendedores.get(Integer.parseInt(TCodigo.getText())).setCpf(TCpf.getText());
        BancoVendedor.getInstance().vendedores.get(Integer.parseInt(TCodigo.getText())).setEspecialidade(TEspecialidade.getText());
        BancoVendedor.getInstance().vendedores.get(Integer.parseInt(TCodigo.getText())).setSalario(salario);
        BancoVendedor.getInstance().vendedores.get(Integer.parseInt(TCodigo.getText())).setComissao(comissao);        
        BancoVendedor.getInstance().vendedores.get(Integer.parseInt(TCodigo.getText())).setSetor(TSetor.getText());
        BancoVendedor.getInstance().vendedores.get(Integer.parseInt(TCodigo.getText())).setCargo(TCargo.getText());
        
        TNome.setText("");
        TRg.setText("");
        TCpf.setText("");
        TEspecialidade.setText("");
        TSalario.setText("");
        TSetor.setText("");
        TCargo.setText("");
        JOptionPane.showMessageDialog(null,"Alterações salvas.");
        }
        
    }//GEN-LAST:event_BtnEditarActionPerformed

    private void TCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TCodigoActionPerformed

    private void BtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSairActionPerformed
        dispose();
    }//GEN-LAST:event_BtnSairActionPerformed

    private void BtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPesquisarActionPerformed
        // TODO add your handling code here:
                try {
            Integer Codigo = Integer.parseInt(TCodigo.getText());
            TNome.setText(BancoVendedor.getInstance().vendedores.get(Codigo).getNome());
            TRg.setText(BancoVendedor.getInstance().vendedores.get(Codigo).getRg());
            TEspecialidade.setText(BancoVendedor.getInstance().vendedores.get(Codigo).getEspecialidade());
            TCpf.setText(BancoVendedor.getInstance().vendedores.get(Codigo).getCpf());
            TSetor.setText(BancoVendedor.getInstance().vendedores.get(Codigo).getSetor());
            TCargo.setText(BancoVendedor.getInstance().vendedores.get(Codigo).getCargo());
            TSalario.setText(Float.toString(BancoVendedor.getInstance().vendedores.get(Codigo).getSalario()));
        } catch (NumberFormatException err) {
            JOptionPane.showMessageDialog(null, "Coloque apenas um ID.");
        } catch (IndexOutOfBoundsException ero) {
            JOptionPane.showMessageDialog(null, "ID inexistente.");
        }
    }//GEN-LAST:event_BtnPesquisarActionPerformed

    private void TRgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TRgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TRgActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEditar;
    private javax.swing.JButton BtnPesquisar;
    private javax.swing.JButton BtnSair;
    private javax.swing.JTextField TCargo;
    private javax.swing.JTextField TCodigo;
    private javax.swing.JTextField TComissao;
    private javax.swing.JTextField TCpf;
    private javax.swing.JTextField TEspecialidade;
    private javax.swing.JTextField TNome;
    private javax.swing.JTextField TRg;
    private javax.swing.JTextField TSalario;
    private javax.swing.JTextField TSetor;
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
    // End of variables declaration//GEN-END:variables
}
