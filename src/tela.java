

import javax.swing.JOptionPane;

public class tela extends javax.swing.JFrame {

    public tela() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        vtsenha = new javax.swing.JPasswordField();
        rmusua = new javax.swing.JTextField();
        btacessar = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(490, 580));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        vtsenha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        vtsenha.setMaximumSize(new java.awt.Dimension(300, 75));
        vtsenha.setMinimumSize(new java.awt.Dimension(300, 75));
        vtsenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vtsenhaActionPerformed(evt);
            }
        });
        getContentPane().add(vtsenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 180, 40));

        rmusua.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        rmusua.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rmusua.setMaximumSize(new java.awt.Dimension(300, 75));
        rmusua.setMinimumSize(new java.awt.Dimension(300, 75));
        rmusua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rmusuaActionPerformed(evt);
            }
        });
        rmusua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rmusuaKeyReleased(evt);
            }
        });
        getContentPane().add(rmusua, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 180, 40));

        btacessar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btacessar.setText("Acessar");
        btacessar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btacessar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btacessarMouseClicked(evt);
            }
        });
        getContentPane().add(btacessar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 500, -1, 40));

        jComboBox1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALUNO", "ETEC", "PROFESSOR", "RESPONSAVEL", "SUPERVISAO", "MONITORAMENTO" }));
        jComboBox1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 100, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("RM:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 50, 40));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Senha do NSA:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 140, 40));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Codigo da Etec:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, -1, 30));

        jTextField2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, 60, 30));

        jCheckBox1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jCheckBox1.setText("Nao sou um robo");
        jCheckBox1.setBorderPainted(true);
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, -1, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/R.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 480, 360));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void vtsenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vtsenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vtsenhaActionPerformed

    private void btacessarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btacessarMouseClicked

            if(rmusua.getText().equals("ETEC") && vtsenha.getText().equals("etec@147"))
            {
                JOptionPane.showMessageDialog(null, "Acesso liberado");
                menu tela = new  menu();
                tela.setVisible(true);
            }
            if(!rmusua.getText().equals("ETEC") && vtsenha.getText().equals("etec@147"))
            {
                JOptionPane.showMessageDialog(null, "Usuário inválido");
            }
            if(rmusua.getText().equals("ETEC") && !vtsenha.getText().equals("etec@147"))
            {
                JOptionPane.showMessageDialog(null, "Senha inválida");
            }
            
            this.dispose();
    }//GEN-LAST:event_btacessarMouseClicked

    private void rmusuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rmusuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rmusuaActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void rmusuaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rmusuaKeyReleased
       
    }//GEN-LAST:event_rmusuaKeyReleased

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
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btacessar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField rmusua;
    private javax.swing.JPasswordField vtsenha;
    // End of variables declaration//GEN-END:variables
}
