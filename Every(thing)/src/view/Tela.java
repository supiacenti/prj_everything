package view;

public class Tela extends javax.swing.JFrame {

    public Tela() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        botaotabuada = new javax.swing.JButton();
        botaoimc = new javax.swing.JButton();
        botaonotas = new javax.swing.JButton();
        botaotemp = new javax.swing.JButton();
        botaolistaf = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        botaoad = new javax.swing.JButton();
        botaocalculadora = new javax.swing.JButton();
        botaocaracter = new javax.swing.JButton();
        botaoarea = new javax.swing.JButton();
        botaodias = new javax.swing.JButton();
        botaohipo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Every(thing)");

        botaotabuada.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        botaotabuada.setText("Tabuada");
        botaotabuada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaotabuadaActionPerformed(evt);
            }
        });

        botaoimc.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        botaoimc.setText("IMC");
        botaoimc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoimcActionPerformed(evt);
            }
        });

        botaonotas.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        botaonotas.setText("Nota");
        botaonotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaonotasActionPerformed(evt);
            }
        });

        botaotemp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        botaotemp.setText("Conversão Temperatura");
        botaotemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaotempActionPerformed(evt);
            }
        });

        botaolistaf.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        botaolistaf.setText("Lista de Filmes");
        botaolistaf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaolistafActionPerformed(evt);
            }
        });

        botaoad.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        botaoad.setText("Acréscimo e Desconto");
        botaoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoadActionPerformed(evt);
            }
        });

        botaocalculadora.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        botaocalculadora.setText("Calculadora");
        botaocalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaocalculadoraActionPerformed(evt);
            }
        });

        botaocaracter.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        botaocaracter.setText("Cálculo de Caracteres");
        botaocaracter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaocaracterActionPerformed(evt);
            }
        });

        botaoarea.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        botaoarea.setText("Cálculo de Área");
        botaoarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoareaActionPerformed(evt);
            }
        });

        botaodias.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        botaodias.setText("Dias de Vida");
        botaodias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaodiasActionPerformed(evt);
            }
        });

        botaohipo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        botaohipo.setText("Hipotenusa");
        botaohipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaohipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(368, 368, 368))
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaotabuada)
                        .addGap(18, 18, 18)
                        .addComponent(botaotemp)
                        .addGap(18, 18, 18)
                        .addComponent(botaoad)
                        .addGap(18, 18, 18)
                        .addComponent(botaoarea)
                        .addGap(18, 18, 18)
                        .addComponent(botaohipo))
                    .addComponent(botaodias)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(botaoimc)
                        .addGap(18, 18, 18)
                        .addComponent(botaonotas)
                        .addGap(18, 18, 18)
                        .addComponent(botaolistaf)
                        .addGap(18, 18, 18)
                        .addComponent(botaocalculadora)
                        .addGap(18, 18, 18)
                        .addComponent(botaocaracter)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaotabuada)
                    .addComponent(botaotemp)
                    .addComponent(botaoad)
                    .addComponent(botaoarea)
                    .addComponent(botaohipo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoimc)
                    .addComponent(botaonotas)
                    .addComponent(botaolistaf)
                    .addComponent(botaocalculadora)
                    .addComponent(botaocaracter))
                .addGap(18, 18, 18)
                .addComponent(botaodias)
                .addContainerGap(304, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoimcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoimcActionPerformed
        new Tela_IMC().setVisible(true);
    }//GEN-LAST:event_botaoimcActionPerformed

    private void botaocalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaocalculadoraActionPerformed
        new Tela_calculadora().setVisible(true);
    }//GEN-LAST:event_botaocalculadoraActionPerformed

    private void botaotabuadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaotabuadaActionPerformed
        new Tela_tabuada().setVisible(true);
    }//GEN-LAST:event_botaotabuadaActionPerformed

    private void botaotempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaotempActionPerformed
        new Tela_conversao().setVisible(true);
    }//GEN-LAST:event_botaotempActionPerformed

    private void botaoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoadActionPerformed
        new Tela_acdes().setVisible(true);
    }//GEN-LAST:event_botaoadActionPerformed

    private void botaoareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoareaActionPerformed
        new Tela_area().setVisible(true);
    }//GEN-LAST:event_botaoareaActionPerformed

    private void botaohipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaohipoActionPerformed
        new Tela_hipotenusa().setVisible(true);
    }//GEN-LAST:event_botaohipoActionPerformed

    private void botaonotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaonotasActionPerformed
        new Tela_medianota().setVisible(true);
    }//GEN-LAST:event_botaonotasActionPerformed

    private void botaolistafActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaolistafActionPerformed
        new Tela_filmes().setVisible(true);
    }//GEN-LAST:event_botaolistafActionPerformed

    private void botaocaracterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaocaracterActionPerformed
        new Tela_caracteres().setVisible(true);
    }//GEN-LAST:event_botaocaracterActionPerformed

    private void botaodiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaodiasActionPerformed
        new Tela_diasvida().setVisible(true);
    }//GEN-LAST:event_botaodiasActionPerformed

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoad;
    private javax.swing.JButton botaoarea;
    private javax.swing.JButton botaocalculadora;
    private javax.swing.JButton botaocaracter;
    private javax.swing.JButton botaodias;
    private javax.swing.JButton botaohipo;
    private javax.swing.JButton botaoimc;
    private javax.swing.JButton botaolistaf;
    private javax.swing.JButton botaonotas;
    private javax.swing.JButton botaotabuada;
    private javax.swing.JButton botaotemp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
