/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pedrapapeltesoura.newpackage;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author ALUNO
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public int PontuacaoJogador = 0;
    public int PontuacaoPC= 0;
    public NewJFrame() {
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

        lblPapelPC = new javax.swing.JLabel();
        lblPedraPC = new javax.swing.JLabel();
        lblTesouraPC = new javax.swing.JLabel();
        lbltesoura = new javax.swing.JLabel();
        lblpapel = new javax.swing.JLabel();
        lblpedra = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        NovoJogo = new javax.swing.JButton();
        PontosPc = new javax.swing.JLabel();
        PontosJogador = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblPapelPC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pedrapapeltesoura/newpackage/papel.png"))); // NOI18N
        lblPapelPC.setEnabled(false);

        lblPedraPC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pedrapapeltesoura/newpackage/pedra.png"))); // NOI18N
        lblPedraPC.setEnabled(false);

        lblTesouraPC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pedrapapeltesoura/newpackage/tesoura.png"))); // NOI18N
        lblTesouraPC.setEnabled(false);

        lbltesoura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pedrapapeltesoura/newpackage/tesoura.png"))); // NOI18N
        lbltesoura.setToolTipText("tesoura");
        lbltesoura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbltesouraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbltesouraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbltesouraMouseExited(evt);
            }
        });

        lblpapel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pedrapapeltesoura/newpackage/papel.png"))); // NOI18N
        lblpapel.setToolTipText("papel");
        lblpapel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblpapelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblpapelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblpapelMouseExited(evt);
            }
        });

        lblpedra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pedrapapeltesoura/newpackage/pedra.png"))); // NOI18N
        lblpedra.setToolTipText("pedra");
        lblpedra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblpedraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblpedraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblpedraMouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel7.setText("X");

        NovoJogo.setVisible(false);
        NovoJogo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NovoJogo.setText("Novo Jogo");
        NovoJogo.setEnabled(false);
        NovoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoJogoActionPerformed(evt);
            }
        });

        PontosPc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PontosPc.setText("  000");
        PontosPc.setEnabled(false);

        PontosJogador.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PontosJogador.setText("000");

        lblResultado.setVisible(false);
        lblResultado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblResultado.setText("resultado");
        lblResultado.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(PontosPc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPedraPC)
                                    .addComponent(lblpedra))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(lblResultado))
                                    .addComponent(lblPapelPC)
                                    .addComponent(lblpapel, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(NovoJogo))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTesouraPC)
                    .addComponent(lbltesoura))
                .addGap(207, 207, 207))
            .addGroup(layout.createSequentialGroup()
                .addGap(344, 344, 344)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PontosJogador)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PontosPc)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPapelPC)
                            .addComponent(lblPedraPC)))
                    .addComponent(lblTesouraPC))
                .addGap(6, 6, 6)
                .addComponent(lblResultado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NovoJogo)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblpedra))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbltesoura)
                            .addComponent(lblpapel))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PontosJogador)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblpedraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblpedraMouseEntered
        // TODO add your handling code here:
        lblpedra.setIcon(new ImageIcon(getClass().getResource("pedra_azul.png")));
    }//GEN-LAST:event_lblpedraMouseEntered

    private void lblpedraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblpedraMouseExited
       lblpedra.setIcon(new ImageIcon(getClass().getResource("pedra.png")));
    }//GEN-LAST:event_lblpedraMouseExited

    private void lblpedraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblpedraMouseClicked
        jogar(lblpedra);
        NovoJogo.setVisible(true);
        NovoJogo.setEnabled(true);
        lblResultado.setVisible(true);
       lblResultado.setEnabled(true);
    }//GEN-LAST:event_lblpedraMouseClicked

    private void lblpapelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblpapelMouseEntered
        lblpapel.setIcon(new ImageIcon(getClass().getResource("papel_azul.png")));
    }//GEN-LAST:event_lblpapelMouseEntered

    private void lblpapelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblpapelMouseExited
        // TODO add your handling code here:
         lblpapel.setIcon(new ImageIcon(getClass().getResource("papel.png")));
    }//GEN-LAST:event_lblpapelMouseExited

    private void lblpapelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblpapelMouseClicked
        jogar(lblpapel);
        NovoJogo.setVisible(true);
        NovoJogo.setEnabled(true);
        lblResultado.setVisible(true);
      lblResultado.setEnabled(true);
    }//GEN-LAST:event_lblpapelMouseClicked

    private void lbltesouraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbltesouraMouseEntered
         lbltesoura.setIcon(new ImageIcon(getClass().getResource("tesoura_azul.png")));
    }//GEN-LAST:event_lbltesouraMouseEntered

    private void lbltesouraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbltesouraMouseExited
        lbltesoura.setIcon(new ImageIcon(getClass().getResource("tesoura.png")));
    }//GEN-LAST:event_lbltesouraMouseExited

    private void lbltesouraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbltesouraMouseClicked

        jogar(lbltesoura);
       NovoJogo.setVisible(true);
       NovoJogo.setEnabled(true);
       lblResultado.setVisible(true);
        lblResultado.setEnabled(true);
        
       
    }//GEN-LAST:event_lbltesouraMouseClicked

    private void NovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoJogoActionPerformed
        NovoJogo.setVisible(false);
        NovoJogo.setEnabled(false);
        lblResultado.setVisible(false);
        lblResultado.setEnabled(false);
    }//GEN-LAST:event_NovoJogoActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NovoJogo;
    private javax.swing.JLabel PontosJogador;
    private javax.swing.JLabel PontosPc;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblPapelPC;
    private javax.swing.JLabel lblPedraPC;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblTesouraPC;
    private javax.swing.JLabel lblpapel;
    private javax.swing.JLabel lblpedra;
    private javax.swing.JLabel lbltesoura;
    // End of variables declaration//GEN-END:variables

    
    
 private void jogar(JLabel lbl) {
        int pc = (int)(Math.random()*3);
       
        if(pc == 0 && lbl.getToolTipText().equals("papel")
                || pc == 1 && lbl.getToolTipText().equals("tesoura")
                || pc == 2 && lbl.getToolTipText().equals("pedra")){
            
       lblResultado.setText("ganhou!"); 
       PontuacaoJogador++;
       PontosJogador.setText(""+PontuacaoJogador);
    
    }
         if(pc == 0 && lbl.getToolTipText().equals("pedra")
                || pc == 1 && lbl.getToolTipText().equals("papel")
                || pc == 2 && lbl.getToolTipText().equals("tesoura")){
            
       lblResultado.setText("empate!");    
 }   
        
        if(pc == 0 && lbl.getToolTipText().equals("tesoura")
                || pc == 1 && lbl.getToolTipText().equals("pedra")
                || pc == 2 && lbl.getToolTipText().equals("papel")){
            
       lblResultado.setText("perdeu!");
       PontuacaoPC++;
       PontosPc.setText(""+PontuacaoPC);
 }   
        
 }
 
}
