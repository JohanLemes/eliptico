package telaInicial;

import jTextFieldPersonalizadas.*;
import java.awt.Color;

public class TelaCadastro extends javax.swing.JFrame {

    public TelaCadastro() {
        initComponents();
        
        this.setFocusable(rootPaneCheckingEnabled);
        
        //textos pre-definidos nas JTextFields
        usuario.setText("Escolha seu usuário");
        usuario.setForeground(Color.gray);
        senha.setText("Escolha sua senha");
        senha.setForeground(Color.gray);
        cSenha.setText("Confirme sua senha");
        cSenha.setForeground(Color.gray);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        usuario = new JTextFieldSemEspaco();
        senha = new javax.swing.JPasswordField();
        cSenha = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        btCancelar = new javax.swing.JButton();
        btCadastrar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Cadastro");
        setType(java.awt.Window.Type.UTILITY);

        jPanel3.setLayout(new java.awt.GridBagLayout());

        usuario.setToolTipText("<html>\nEscolha um nome curto e simples.\n<br>Apenas letras e números são permitidos.");
        usuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usuarioFocusLost(evt);
            }
        });

        senha.setEchoChar('\u0000');
        senha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                senhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                senhaFocusLost(evt);
            }
        });

        cSenha.setEchoChar('\u0000');
        cSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cSenhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cSenhaFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(cSenha)
                    .addComponent(senha))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanel3.add(jPanel1, gridBagConstraints);

        btCancelar.setText("Cancelar");
        btCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCancelar.setMaximumSize(new java.awt.Dimension(95, 30));
        btCancelar.setMinimumSize(new java.awt.Dimension(95, 30));
        btCancelar.setPreferredSize(new java.awt.Dimension(95, 30));
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btCadastrar.setText("Cadastrar");
        btCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCadastrar.setMaximumSize(new java.awt.Dimension(95, 30));
        btCadastrar.setMinimumSize(new java.awt.Dimension(95, 30));
        btCadastrar.setPreferredSize(new java.awt.Dimension(95, 30));
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel3.add(jPanel2, gridBagConstraints);

        jLabel1.setText("//algum texto ou imagem sobre o mottus(?)");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jPanel3.add(jPanel4, gridBagConstraints);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(328, 288));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        //set nos campos preenchidos
        Usuario signUp = new Usuario();
        signUp.setUsuario(usuario.getText());
        signUp.setSenha(senha.getText());
        
        //passa o campo do "confirma senha" para verificar se é igual ao campo "senha"
        if(signUp.cadastrar(cSenha.getText()))  //"cadastrar", na classe "Usuario"
            this.setVisible(false); //se retorna verdadeiro, a tela de cadastro fecha e volta para a tela inicial
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.toBack();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void usuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usuarioFocusGained
        //apagar texto pre-definido da jtextfield pro usuario digitar
        if(usuario.getText().equals("Escolha seu usuário"))
        {    
            usuario.setText("");
            usuario.setForeground(Color.black);
        }
    }//GEN-LAST:event_usuarioFocusGained

    private void usuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usuarioFocusLost
        //colocar texto pre-definido na jtextfield caso o usuario nao digite nada
        if(usuario.getText().equals(""))
        {    
            usuario.setText("Escolha seu usuário");
            usuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_usuarioFocusLost

    private void senhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_senhaFocusGained
        //apagar texto pre-definido da jtextfield pro usuario digitar
        if(senha.getText().equals("Escolha sua senha"))
        {    
            senha.setText("");
            senha.setForeground(Color.black);
            senha.setEchoChar('\u25cf');
        }
    }//GEN-LAST:event_senhaFocusGained

    private void senhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_senhaFocusLost
        //colocar texto pre-definido na jtextfield caso o usuario nao digite nada
        if(senha.getText().equals(""))
        {    
            senha.setText("Escolha sua senha");
            senha.setForeground(Color.gray);
            senha.setEchoChar('\u0000');
        }
    }//GEN-LAST:event_senhaFocusLost

    private void cSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cSenhaFocusGained
        //apagar texto pre-definido da jtextfield pro usuario digitar
        if(cSenha.getText().equals("Confirme sua senha"))
        {    
            cSenha.setText("");
            cSenha.setForeground(Color.black);
            cSenha.setEchoChar('\u25cf');
        }
    }//GEN-LAST:event_cSenhaFocusGained

    private void cSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cSenhaFocusLost
        //colocar texto pre-definido na jtextfield caso o usuario nao digite nada
        if(cSenha.getText().equals(""))
        {    
            cSenha.setText("Confirme sua senha");
            cSenha.setForeground(Color.gray);
            cSenha.setEchoChar('\u0000');
        }
    }//GEN-LAST:event_cSenhaFocusLost

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JPasswordField cSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField senha;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}