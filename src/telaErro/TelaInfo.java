package telaErro;

public class TelaInfo extends javax.swing.JFrame {

    //parametro "tipo" define o icone que aparecerá: "Erro" (!), "Info" (i) ou "Ok" (check)
    //parametro "info" define a mensagem que sera exibida
    
    public TelaInfo(String tipo, String info) {
        initComponents();
        
        this.setAlwaysOnTop(true);
        
        //icone da janela
        iconeInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/" + tipo + ".png")));
    
        //mensagem da janela
        lblInfo.setText("<html>" + info);
        //titulo da janela
        if("Erro".equals(tipo))
            this.setTitle("Atenção!");
        if("Info".equals(tipo))
            this.setTitle("Dica!");
        if("Ok".equals(tipo))
            this.setTitle("Parabéns!");
    }

    private TelaInfo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        btOk = new javax.swing.JButton();
        iconeInfo = new javax.swing.JLabel();
        lblInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        btOk.setText("OK");
        btOk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btOk.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOkActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 33;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.insets = new java.awt.Insets(11, 0, 10, 0);
        jPanel1.add(btOk, gridBagConstraints);

        iconeInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Erro.png"))); // NOI18N
        jPanel1.add(iconeInfo, new java.awt.GridBagConstraints());

        lblInfo.setText("<html>\nMensagem Mensagem Mensagem <br>\nMensagem Mensagem Mensagem ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        jPanel1.add(lblInfo, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(275, 140));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOkActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btOkActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btOk;
    private javax.swing.JLabel iconeInfo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblInfo;
    // End of variables declaration//GEN-END:variables
}
