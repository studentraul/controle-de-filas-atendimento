/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.engsoft.main;

import br.com.engsoft.controll.ControleDeFila;
import br.com.engsoft.controll.ControleDeTelas;
import br.com.engsoft.utils.AlteraImagens;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Raul
 */
public class GuicheA extends javax.swing.JFrame {

    ControleDeFila controleFila = new ControleDeFila();
    ControleDeTelas controleTela = new ControleDeTelas();

    /**
     * Creates new form GuicheA
     */
    public GuicheA() {
        initComponents();
        configuracaoTela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        gbtnGerar = new javax.swing.ButtonGroup();
        lblIcone = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        lblNomeAtendente = new javax.swing.JLabel();
        lblAtendente = new javax.swing.JLabel();
        btnGerarSenha = new javax.swing.JButton();
        tbtnPausarContinuar = new javax.swing.JToggleButton();
        tbtnPausarContinuar.setToolTipText("Pausar/Continuar Atendimento");
        rbtnSenhaNormal = new javax.swing.JRadioButton();
        rbtnSenhaPreferencial = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/engsoft/img/queen8 .png"))); // NOI18N
        getContentPane().add(lblIcone, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));
        getContentPane().add(lblNomeAtendente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 70, 14));

        lblAtendente.setText("Atendente:");
        getContentPane().add(lblAtendente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        btnGerarSenha.setText("Gerar Senha");
        btnGerarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(btnGerarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 100, 33));

        tbtnPausarContinuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/engsoft/img/pause.png"))); // NOI18N
        tbtnPausarContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtnPausarContinuarActionPerformed(evt);
            }
        });
        getContentPane().add(tbtnPausarContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 60, -1));

        gbtnGerar.add(rbtnSenhaNormal);
        rbtnSenhaNormal.setText("Normal");
        getContentPane().add(rbtnSenhaNormal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        gbtnGerar.add(rbtnSenhaPreferencial);
        rbtnSenhaPreferencial.setText("Preferencial");
        rbtnSenhaPreferencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnSenhaPreferencialActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnSenhaPreferencial, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        
        controleTela.abrirSelecionaOperacao(this, TelaLogin.usuarioM);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void rbtnSenhaPreferencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnSenhaPreferencialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnSenhaPreferencialActionPerformed

    private void tbtnPausarContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtnPausarContinuarActionPerformed

        if (tbtnPausarContinuar.isSelected() == false) {

            tbtnPausarContinuar.setIcon(new AlteraImagens().pauseIcon());

        } else if (tbtnPausarContinuar.isSelected() == true) {
            tbtnPausarContinuar.setIcon(new AlteraImagens().continueIcon());

        }
    }//GEN-LAST:event_tbtnPausarContinuarActionPerformed

    private void btnGerarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarSenhaActionPerformed

        if (tbtnPausarContinuar.isSelected() == false) {
            if (rbtnSenhaNormal.isSelected()) {
                JOptionPane.showMessageDialog(null, "Senha gerada: " + controleFila.gerarSenhaNormal());

            } else if (rbtnSenhaPreferencial.isSelected()) {
                JOptionPane.showMessageDialog(null, "Senha gerada: " + controleFila.gerarSenhaPreferencial());
            } else {
                JOptionPane.showMessageDialog(null, "Selecione o tipo de senha!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Você não pode gerar senhas, pois está em momento de pausa.");
        }

    }//GEN-LAST:event_btnGerarSenhaActionPerformed

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
            java.util.logging.Logger.getLogger(GuicheA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuicheA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuicheA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuicheA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuicheA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGerarSenha;
    private javax.swing.JButton btnVoltar;
    private javax.swing.ButtonGroup gbtnGerar;
    private javax.swing.JLabel lblAtendente;
    private javax.swing.JLabel lblIcone;
    public javax.swing.JLabel lblNomeAtendente;
    private javax.swing.JRadioButton rbtnSenhaNormal;
    private javax.swing.JRadioButton rbtnSenhaPreferencial;
    private javax.swing.JToggleButton tbtnPausarContinuar;
    // End of variables declaration//GEN-END:variables

    private void configuracaoTela() {
        //Bloqueia o redimensionamento
        this.setResizable(false);
        //Coloca o jframe no centro
        this.setLocationRelativeTo(null);
        //Fechar toda a Aplicação ao clicar no botão Fechar
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
