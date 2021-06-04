package view;

import javax.swing.JOptionPane;
import model.Pessoas;
import model.Queue;
import model.Usuario;

public class Tela_cadastro extends javax.swing.JFrame {

    public Tela_cadastro() {
        initComponents();
    }
    
    Queue user = new Queue();
    Queue user2 = new Queue();
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfnome = new javax.swing.JTextField();
        botaocadastro = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfsn = new javax.swing.JPasswordField();
        tfidade = new javax.swing.JTextField();
        tfdata = new javax.swing.JTextField();
        tfemail = new javax.swing.JTextField();
        tfnu = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfusuario = new javax.swing.JTextField();
        botaoentrar = new javax.swing.JButton();
        pfsenha = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Nome completo:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Data de Nasc.:");

        tfnome.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        botaocadastro.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        botaocadastro.setText("Cadastrar");
        botaocadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaocadastroActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Idade:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("E-mail:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Nome de usuário:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Senha:");

        tfsn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tfsn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfsnActionPerformed(evt);
            }
        });

        tfidade.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        tfdata.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        tfemail.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        tfnu.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Nome de usuário:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Senha:");

        tfusuario.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        botaoentrar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        botaoentrar.setText("Entrar");
        botaoentrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoentrarActionPerformed(evt);
            }
        });

        pfsenha.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(28, 28, 28)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfnome, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfidade, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfsn)
                                .addComponent(tfdata)
                                .addComponent(tfemail)
                                .addComponent(tfnu, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(botaocadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoentrar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfusuario)
                                .addComponent(pfsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfnu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfsn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botaocadastro)
                .addGap(27, 27, 27)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(pfsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botaoentrar)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaocadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaocadastroActionPerformed
        String nome = tfnome.getText();
        int idade = Integer.parseInt(tfidade.getText());
        String dn = tfdata.getText();
        String em = tfemail.getText();
        String nu = tfnu.getText();
        String sn = tfsn.getText();
        
        user.enqueue(nu);
        user.enqueue(sn);
        
        Usuario a = new Usuario(nu, sn, nome, idade, dn, em);
        a.validar();
    }//GEN-LAST:event_botaocadastroActionPerformed

    private void tfsnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfsnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfsnActionPerformed

    private void botaoentrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoentrarActionPerformed
        String nomeusuario = tfusuario.getText();
        String senha = pfsenha.getText();
        
        user2.enqueue(nomeusuario);
        user2.enqueue(senha);
        
        String a = toString1(user.dequeue());
        String b = toString1(user.dequeue());
        String c = toString1(user2.dequeue());
        String d = toString1(user2.dequeue());
        
        if(c.equals("") || d.equals("")){
            JOptionPane.showMessageDialog(null, "Insira informações válidas!");
        }
        if(a.equals(c) && b.equals(d)){
            new Tela().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Nome de usuário ou senha incorreta!");
        }
        

    }//GEN-LAST:event_botaoentrarActionPerformed

    public String toString1(Object x){
        String a = "";
        a += x;
        return a;
    }
    
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
            java.util.logging.Logger.getLogger(Tela_cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaocadastro;
    private javax.swing.JButton botaoentrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField pfsenha;
    private javax.swing.JTextField tfdata;
    private javax.swing.JTextField tfemail;
    private javax.swing.JTextField tfidade;
    private javax.swing.JTextField tfnome;
    private javax.swing.JTextField tfnu;
    private javax.swing.JPasswordField tfsn;
    private javax.swing.JTextField tfusuario;
    // End of variables declaration//GEN-END:variables
}
