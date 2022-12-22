package calculadora;


public class CalculadoraJava extends javax.swing.JFrame {
    int num1=0;
    int num2=0;
    String sinal = "";
    
   
    public CalculadoraJava() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        limpar = new javax.swing.JButton();
        soma = new javax.swing.JButton();
        total = new javax.swing.JButton();
        div = new javax.swing.JButton();
        mult = new javax.swing.JButton();
        Tela = new javax.swing.JFormattedTextField();
        sub1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        btn1.setBackground(new java.awt.Color(255, 172, 172));
        btn1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1);
        btn1.setBounds(70, 230, 50, 40);

        btn2.setBackground(new java.awt.Color(255, 172, 172));
        btn2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2);
        btn2.setBounds(120, 190, 50, 40);

        btn4.setBackground(new java.awt.Color(255, 172, 172));
        btn4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn4);
        btn4.setBounds(70, 270, 50, 40);

        btn5.setBackground(new java.awt.Color(255, 172, 172));
        btn5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel1.add(btn5);
        btn5.setBounds(120, 230, 50, 40);

        btn7.setBackground(new java.awt.Color(255, 172, 172));
        btn7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn7.setForeground(new java.awt.Color(255, 255, 255));
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel1.add(btn7);
        btn7.setBounds(70, 310, 50, 40);

        btn8.setBackground(new java.awt.Color(255, 172, 172));
        btn8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel1.add(btn8);
        btn8.setBounds(120, 270, 50, 40);

        btn0.setBackground(new java.awt.Color(255, 172, 172));
        btn0.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn0.setForeground(new java.awt.Color(255, 255, 255));
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        jPanel1.add(btn0);
        btn0.setBounds(120, 310, 50, 40);

        btn9.setBackground(new java.awt.Color(255, 172, 172));
        btn9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel1.add(btn9);
        btn9.setBounds(170, 310, 50, 40);

        btn3.setBackground(new java.awt.Color(255, 172, 172));
        btn3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn3);
        btn3.setBounds(170, 230, 50, 40);

        btn6.setBackground(new java.awt.Color(255, 172, 172));
        btn6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel1.add(btn6);
        btn6.setBounds(170, 270, 50, 40);

        limpar.setBackground(new java.awt.Color(255, 204, 204));
        limpar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        limpar.setForeground(new java.awt.Color(255, 255, 255));
        limpar.setText("C");
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });
        jPanel1.add(limpar);
        limpar.setBounds(70, 190, 50, 40);

        soma.setBackground(new java.awt.Color(204, 204, 255));
        soma.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        soma.setForeground(new java.awt.Color(255, 255, 255));
        soma.setText("+");
        soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                somaActionPerformed(evt);
            }
        });
        jPanel1.add(soma);
        soma.setBounds(220, 190, 50, 40);

        total.setBackground(new java.awt.Color(255, 204, 204));
        total.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        total.setForeground(new java.awt.Color(255, 255, 255));
        total.setText("=");
        total.setActionCommand("");
        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });
        jPanel1.add(total);
        total.setBounds(170, 190, 50, 40);

        div.setBackground(new java.awt.Color(204, 204, 255));
        div.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        div.setForeground(new java.awt.Color(255, 255, 255));
        div.setText("/");
        div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divActionPerformed(evt);
            }
        });
        jPanel1.add(div);
        div.setBounds(220, 310, 50, 40);

        mult.setBackground(new java.awt.Color(204, 204, 255));
        mult.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mult.setForeground(new java.awt.Color(255, 255, 255));
        mult.setText("*");
        mult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multActionPerformed(evt);
            }
        });
        jPanel1.add(mult);
        mult.setBounds(220, 270, 50, 40);

        Tela.setEditable(false);
        Tela.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(Tela);
        Tela.setBounds(70, 130, 200, 61);

        sub1.setBackground(new java.awt.Color(204, 204, 255));
        sub1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sub1.setForeground(new java.awt.Color(255, 255, 255));
        sub1.setText("-");
        sub1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub1ActionPerformed(evt);
            }
        });
        jPanel1.add(sub1);
        sub1.setBounds(220, 230, 50, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cat3.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(100, 50, 160, 80);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        Tela.setText(Tela.getText()+"1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        Tela.setText(Tela.getText()+"2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        Tela.setText(Tela.getText()+"4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        Tela.setText(Tela.getText()+"5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        Tela.setText(Tela.getText()+"7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        Tela.setText(Tela.getText()+"8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        Tela.setText(Tela.getText()+"0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        Tela.setText(Tela.getText()+"9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        Tela.setText(Tela.getText()+"3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        Tela.setText(Tela.getText()+"6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
        Tela.setText("");
    }//GEN-LAST:event_limparActionPerformed

    private void somaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_somaActionPerformed
        num1 = Integer.parseInt(Tela.getText());
        Tela.setText("");
        sinal = "+";

    }//GEN-LAST:event_somaActionPerformed

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed
        num2 = Integer.parseInt(Tela.getText());

        if (sinal.equals("+")) {
            int soma= num1 + num2;
            Tela.setText(String.valueOf(soma));

        }else if (sinal.equals("-")) {
            int sub= num1 - num2;
            Tela.setText(String.valueOf(sub));
        }else if (sinal.equals("*")) {
            int mult= num1 * num2;
            Tela.setText(String.valueOf(mult));
        }else if (sinal.equals("/")) {
            int div= num1 / num2;
            Tela.setText(String.valueOf(div));
        }
    }//GEN-LAST:event_totalActionPerformed

    private void divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divActionPerformed
        num1 = Integer.parseInt(Tela.getText());
        Tela.setText("");
        sinal = "/";
    }//GEN-LAST:event_divActionPerformed

    private void multActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multActionPerformed
        num1 = Integer.parseInt(Tela.getText());
        Tela.setText("");
        sinal = "*";
    }//GEN-LAST:event_multActionPerformed

    private void sub1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub1ActionPerformed
        num1 = Integer.parseInt(Tela.getText());
        Tela.setText("");
        sinal = "-";
    }//GEN-LAST:event_sub1ActionPerformed

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
            java.util.logging.Logger.getLogger(CalculadoraJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraJava().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField Tela;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton div;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limpar;
    private javax.swing.JButton mult;
    private javax.swing.JButton soma;
    private javax.swing.JButton sub1;
    private javax.swing.JButton total;
    // End of variables declaration//GEN-END:variables
}
