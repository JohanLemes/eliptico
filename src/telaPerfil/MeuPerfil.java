package telaPerfil;

import jTextFieldPersonalizadas.JTextFieldSemEspaco;
import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import telaErro.TelaInfo;

public class MeuPerfil extends javax.swing.JFrame {
    
    private static String arqU;
    private static String usuarioU, senhaU;
    protected static String nomeU, emailU, cpfU, sexoU, idadeU, alturaU, pesoU;
    
    public MeuPerfil(String arq) {
        initComponents();
        
        nome.setEnabled(false); email.setEnabled(false); cpf.setEnabled(false); sexo.setEnabled(false);
        idade.setEnabled(false); peso.setEnabled(false); altura.setEnabled(false);
        
        this.setFocusable(rootPaneCheckingEnabled);
        
        //textos pre-definidos nas JTextFields
        senha.setText("Sua senha");
        senha.setForeground(Color.gray);
        
        arqU = arq;
        abrir();

        nome.setText(nomeU.replace("Nome: ", ""));
        email.setText(emailU.replace("E-mail: ", ""));
        cpf.setText(cpfU.replace("CPF: ", ""));
        sexo.setSelectedItem(sexoU.replace("Sexo: ", ""));
        idade.setText(idadeU.replace("Nascimento: ", ""));
        altura.setText(alturaU.replace("Altura: ", ""));
        peso.setText(pesoU.replace("Peso: ", ""));
    }
    
    public void abrir(){
        try{
            //abre e le o arquivo com dados do usuario
            Scanner input = new Scanner (new File(arqU));
            while(input.hasNext())
            {
                input.skip("Usuário: "); //pula a string "Usuário: "
                usuarioU = input.next();
                senhaU = input.next();
                input.nextLine(); //termina de ler o resto da primeira linha
                nomeU = input.nextLine();
                emailU = input.nextLine();
                cpfU = input.nextLine();
                sexoU = input.nextLine();
                idadeU = input.nextLine();
                alturaU = input.nextLine();
                pesoU = input.nextLine();
            }
            input.close();
        }catch (Exception e){
        }
    }
    
    public void editar(){
        try{
        //salva os dados do usuário no seu arquivo .dat
            BufferedWriter arqW = new BufferedWriter(new FileWriter(arqU)); //para escrever
            arqW.write("Usuário: " + usuarioU + " " + senhaU); arqW.newLine();
            arqW.write("Nome: " + nome.getText()); arqW.newLine();
            arqW.write("E-mail: " + email.getText()); arqW.newLine();
            arqW.write("CPF: " + cpf.getText()); arqW.newLine();
            arqW.write("Sexo: " + sexo.getSelectedItem()); arqW.newLine();
            arqW.write("Nascimento: " + idade.getText()); arqW.newLine();
            arqW.write("Altura: " + altura.getText()); arqW.newLine();
            arqW.write("Peso: " + peso.getText());
            arqW.flush();
            arqW.close();
        }catch(IOException e){
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        salvar = new javax.swing.JButton();
        cancela = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        senha = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        nome = new javax.swing.JTextField();
        nomeL = new javax.swing.JLabel();
        cpfL = new javax.swing.JLabel();
        cpf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        sexoL = new javax.swing.JLabel();
        sexo = new javax.swing.JComboBox<>();
        idade = new javax.swing.JTextField();
        dataL = new javax.swing.JLabel();
        peso = new javax.swing.JTextField();
        pesoL = new javax.swing.JLabel();
        alturaL = new javax.swing.JLabel();
        altura = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        editar = new javax.swing.JButton();

        setTitle("Editãr perfill");
        setAlwaysOnTop(true);
        setType(java.awt.Window.Type.UTILITY);

        jPanel4.setLayout(new java.awt.GridBagLayout());

        salvar.setText("Salvar");
        salvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salvar.setMaximumSize(new java.awt.Dimension(95, 30));
        salvar.setMinimumSize(new java.awt.Dimension(95, 30));
        salvar.setPreferredSize(new java.awt.Dimension(95, 30));
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        cancela.setText("Cancelar");
        cancela.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancela.setMaximumSize(new java.awt.Dimension(95, 30));
        cancela.setMinimumSize(new java.awt.Dimension(95, 30));
        cancela.setPreferredSize(new java.awt.Dimension(95, 30));
        cancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelaActionPerformed(evt);
            }
        });

        jLabel3.setText("<html>Informe sua senha para <br>confirmar as alterações</html>");

        senha.setToolTipText("Informe sua senha.");
        senha.setEchoChar('\u0000');
        senha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                senhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                senhaFocusLost(evt);
            }
        });
        senha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                senhaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(salvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        jPanel4.add(jPanel2, gridBagConstraints);

        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });

        nomeL.setText("Nome");

        cpfL.setText("CPF");

        cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfActionPerformed(evt);
            }
        });

        jLabel1.setText("E-mail");

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        sexoL.setText("Sexo");

        sexo.setMaximumRowCount(3);
        sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar...", "Feminino", "Masculino" }));

        idade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idadeActionPerformed(evt);
            }
        });

        dataL.setText("Data de nascimento");

        peso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesoActionPerformed(evt);
            }
        });

        pesoL.setText("Peso");

        alturaL.setText("Altura");

        altura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nomeL)
                    .addComponent(jLabel1)
                    .addComponent(email)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cpfL)
                            .addComponent(cpf, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(dataL)
                            .addComponent(idade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pesoL)
                                    .addComponent(peso, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(alturaL)
                                    .addComponent(altura, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(sexoL)
                            .addComponent(sexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(nome))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nomeL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sexoL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cpfL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pesoL)
                            .addComponent(alturaL))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dataL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        jPanel4.add(jPanel1, gridBagConstraints);

        editar.setText("Habilitar edição");
        editar.setMaximumSize(new java.awt.Dimension(105, 30));
        editar.setMinimumSize(new java.awt.Dimension(105, 30));
        editar.setPreferredSize(new java.awt.Dimension(105, 30));
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(editar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel4.add(jPanel5, gridBagConstraints);

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void pesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesoActionPerformed

    }//GEN-LAST:event_pesoActionPerformed

    private void idadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idadeActionPerformed

    }//GEN-LAST:event_idadeActionPerformed

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed

    }//GEN-LAST:event_nomeActionPerformed

    private void cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfActionPerformed

    }//GEN-LAST:event_cpfActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed

    }//GEN-LAST:event_emailActionPerformed

    private void alturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alturaActionPerformed

    }//GEN-LAST:event_alturaActionPerformed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        if(senhaU.equals(senha.getText()))
        {
            editar();
            this.dispose();
        }
        else
            new TelaInfo("Erro", "Senhas incorreta.<br>Por favor, digite-a novamente.").setVisible(true);
    }//GEN-LAST:event_salvarActionPerformed

    private void cancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelaActionPerformed
        this.toBack();
    }//GEN-LAST:event_cancelaActionPerformed

    private void senhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_senhaFocusGained
        //apagar texto pre-definido da jtextfield pro usuario digitar
        if(senha.getText().equals("Sua senha"))
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
            senha.setText("Sua senha");
            senha.setForeground(Color.gray);
            senha.setEchoChar('\u0000');
        }
    }//GEN-LAST:event_senhaFocusLost

    private void senhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_senhaKeyPressed

    }//GEN-LAST:event_senhaKeyPressed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        nome.setEnabled(true); email.setEnabled(true); cpf.setEnabled(true); sexo.setEnabled(true);
        idade.setEnabled(true); peso.setEnabled(true); altura.setEnabled(true);
        
        editar.setText("Edição habilitada");
        
    }//GEN-LAST:event_editarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MeuPerfil(arqU).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField altura;
    private javax.swing.JLabel alturaL;
    private javax.swing.JButton cancela;
    private javax.swing.JTextField cpf;
    private javax.swing.JLabel cpfL;
    private javax.swing.JLabel dataL;
    private javax.swing.JButton editar;
    private javax.swing.JTextField email;
    private javax.swing.JTextField idade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField nome;
    private javax.swing.JLabel nomeL;
    private javax.swing.JTextField peso;
    private javax.swing.JLabel pesoL;
    private javax.swing.JButton salvar;
    private javax.swing.JPasswordField senha;
    private javax.swing.JComboBox<String> sexo;
    private javax.swing.JLabel sexoL;
    // End of variables declaration//GEN-END:variables
}
