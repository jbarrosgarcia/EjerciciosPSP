/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoracliente;

import javax.swing.JLabel;

/**
 *
 * @author otorradomiguez
 */
public class UI extends javax.swing.JFrame {

    String stringTemp = "";
    String numeros1 = "";
    String numeros2 = "";
    String operador = "";
    String respuesta = "";
    String operacionCompleta = "";
    String mensajeParaServidor = "";

    /*
    estados: 0 primer numero, 1 segundo numero, 2 acabas de escribir el operador
    3 acabamos de darle a =
     */
    int estadoOperacion = 0;

    CalculadoraCliente cliente;

    /**
     * Creates new form UI
     */
    public UI() {
        initComponents();
        cliente = new CalculadoraCliente();
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

        jPanel1 = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(50, 50), new java.awt.Dimension(50, 50), new java.awt.Dimension(50, 50));
        jLabelPantallaTop = new javax.swing.JLabel();
        jLabelPantallaPrincipal = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButtonMultiplica = new javax.swing.JButton();
        jButtonResta = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButtonSuma = new javax.swing.JButton();
        jButtonCE = new javax.swing.JButton();
        jButtonC = new javax.swing.JButton();
        jButtonPunto = new javax.swing.JButton();
        jButtonIgual = new javax.swing.JButton();
        jButtonDivide1 = new javax.swing.JButton();
        raiz = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        filler1.setBackground(new java.awt.Color(255, 255, 255));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        jPanel1.add(filler1, gridBagConstraints);

        jLabelPantallaTop.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelPantallaTop.setMaximumSize(new java.awt.Dimension(500, 50));
        jLabelPantallaTop.setOpaque(true);
        jLabelPantallaTop.setPreferredSize(new java.awt.Dimension(200, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        jPanel1.add(jLabelPantallaTop, gridBagConstraints);

        jLabelPantallaPrincipal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPantallaPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelPantallaPrincipal.setText("0");
        jLabelPantallaPrincipal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelPantallaPrincipal.setMaximumSize(new java.awt.Dimension(500, 50));
        jLabelPantallaPrincipal.setOpaque(true);
        jLabelPantallaPrincipal.setPreferredSize(new java.awt.Dimension(200, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        jPanel1.add(jLabelPantallaPrincipal, gridBagConstraints);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setText("1");
        jButton1.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton1.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton1.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel1.add(jButton1, gridBagConstraints);

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setText("2");
        jButton2.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton2.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton2.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        jPanel1.add(jButton2, gridBagConstraints);

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setText("3");
        jButton3.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton3.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton3.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        jPanel1.add(jButton3, gridBagConstraints);

        jButton7.setBackground(new java.awt.Color(204, 204, 204));
        jButton7.setText("7");
        jButton7.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton7.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton7.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        jPanel1.add(jButton7, gridBagConstraints);

        jButton0.setBackground(new java.awt.Color(204, 204, 204));
        jButton0.setText("0");
        jButton0.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton0.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton0.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        jPanel1.add(jButton0, gridBagConstraints);

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setText("4");
        jButton4.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton4.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton4.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        jPanel1.add(jButton4, gridBagConstraints);

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setText("5");
        jButton5.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton5.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton5.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        jPanel1.add(jButton5, gridBagConstraints);

        jButton6.setBackground(new java.awt.Color(204, 204, 204));
        jButton6.setText("6");
        jButton6.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton6.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton6.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        jPanel1.add(jButton6, gridBagConstraints);

        jButtonMultiplica.setBackground(new java.awt.Color(204, 204, 204));
        jButtonMultiplica.setText("X");
        jButtonMultiplica.setMaximumSize(new java.awt.Dimension(50, 50));
        jButtonMultiplica.setMinimumSize(new java.awt.Dimension(50, 50));
        jButtonMultiplica.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonMultiplica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplicaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        jPanel1.add(jButtonMultiplica, gridBagConstraints);

        jButtonResta.setBackground(new java.awt.Color(204, 204, 204));
        jButtonResta.setText("-");
        jButtonResta.setMaximumSize(new java.awt.Dimension(50, 50));
        jButtonResta.setMinimumSize(new java.awt.Dimension(50, 50));
        jButtonResta.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRestaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        jPanel1.add(jButtonResta, gridBagConstraints);

        jButton8.setBackground(new java.awt.Color(204, 204, 204));
        jButton8.setText("8");
        jButton8.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton8.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton8.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        jPanel1.add(jButton8, gridBagConstraints);

        jButton9.setBackground(new java.awt.Color(204, 204, 204));
        jButton9.setText("9");
        jButton9.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton9.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton9.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        jPanel1.add(jButton9, gridBagConstraints);

        jButtonSuma.setBackground(new java.awt.Color(204, 204, 204));
        jButtonSuma.setText("+");
        jButtonSuma.setMaximumSize(new java.awt.Dimension(50, 50));
        jButtonSuma.setMinimumSize(new java.awt.Dimension(50, 50));
        jButtonSuma.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSumaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        jPanel1.add(jButtonSuma, gridBagConstraints);

        jButtonCE.setBackground(new java.awt.Color(204, 204, 204));
        jButtonCE.setText("CE");
        jButtonCE.setMaximumSize(new java.awt.Dimension(50, 50));
        jButtonCE.setMinimumSize(new java.awt.Dimension(50, 50));
        jButtonCE.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCEActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(jButtonCE, gridBagConstraints);

        jButtonC.setBackground(new java.awt.Color(204, 204, 204));
        jButtonC.setText("C");
        jButtonC.setMaximumSize(new java.awt.Dimension(50, 50));
        jButtonC.setMinimumSize(new java.awt.Dimension(50, 50));
        jButtonC.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(jButtonC, gridBagConstraints);

        jButtonPunto.setBackground(new java.awt.Color(204, 204, 204));
        jButtonPunto.setText(".");
        jButtonPunto.setMaximumSize(new java.awt.Dimension(50, 50));
        jButtonPunto.setMinimumSize(new java.awt.Dimension(50, 50));
        jButtonPunto.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPuntoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        jPanel1.add(jButtonPunto, gridBagConstraints);

        jButtonIgual.setBackground(new java.awt.Color(204, 204, 204));
        jButtonIgual.setText("=");
        jButtonIgual.setMaximumSize(new java.awt.Dimension(50, 50));
        jButtonIgual.setMinimumSize(new java.awt.Dimension(50, 50));
        jButtonIgual.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIgualActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(jButtonIgual, gridBagConstraints);

        jButtonDivide1.setBackground(new java.awt.Color(204, 204, 204));
        jButtonDivide1.setText("/");
        jButtonDivide1.setMaximumSize(new java.awt.Dimension(50, 50));
        jButtonDivide1.setMinimumSize(new java.awt.Dimension(50, 50));
        jButtonDivide1.setPreferredSize(new java.awt.Dimension(50, 50));
        jButtonDivide1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDivide1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        jPanel1.add(jButtonDivide1, gridBagConstraints);

        raiz.setText("sqrt");
        raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raizActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel1.add(raiz, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        escribirNumero(1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        escribirNumero(2);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        escribirNumero(3);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        escribirNumero(4);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        escribirNumero(5);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        escribirNumero(6);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        escribirNumero(7);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        escribirNumero(8);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        escribirNumero(9);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
        escribirNumero(0);
    }//GEN-LAST:event_jButton0ActionPerformed

    private void jButtonSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSumaActionPerformed
        operacion("+");
    }//GEN-LAST:event_jButtonSumaActionPerformed

    private void jButtonRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRestaActionPerformed
        operacion("-");
    }//GEN-LAST:event_jButtonRestaActionPerformed

    private void jButtonMultiplicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiplicaActionPerformed
        operacion("*");
    }//GEN-LAST:event_jButtonMultiplicaActionPerformed

    private void jButtonCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCEActionPerformed
        borrarTodo();
    }//GEN-LAST:event_jButtonCEActionPerformed

    private void jButtonPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPuntoActionPerformed
        escribirPuntoDecimal();
    }//GEN-LAST:event_jButtonPuntoActionPerformed

    private void jButtonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIgualActionPerformed
        resultado();
    }//GEN-LAST:event_jButtonIgualActionPerformed

    private void jButtonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCActionPerformed
        borrarNumeroActual();
    }//GEN-LAST:event_jButtonCActionPerformed

    private void jButtonDivide1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDivide1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDivide1ActionPerformed

    private void raizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raizActionPerformed
       char a = '\u221A';
       operacion(" "+a+" ");
    }//GEN-LAST:event_raizActionPerformed

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
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }
    
    /*
    AQUI ESTAN LOS METODOS QUE CONTROLAN LA CALCULADORA
    */

    public void escribirNumero(int numero) {
        //si lo anterior fue un operador, pasamos a escribir el segundo numero
        if (estadoOperacion == 2) {
            estadoOperacion = 1;            
        }else if(estadoOperacion==3){
            estadoOperacion=0;
            numeros1="";
        }
        //En la string temporal vamos a ir guardando los numeros que se meten seguidos, hasta que le damos a operar o al igual
        stringTemp = stringTemp + numero;
        jLabelPantallaPrincipal.setText(stringTemp);
        if(estadoOperacion==0){
            jLabelPantallaTop.setText(stringTemp);
        }else{
            jLabelPantallaTop.setText(numeros1+operador+stringTemp);
        }
    }

    public void escribirPuntoDecimal() {
        /*
        Si ya hay un punto no hacemos nada
        Si esta vacia ponemos 0.
        Si ya hay numeros añadimos el punto
         */
        if (stringTemp.contains(".")) {
            //no hace nada
        } else if (stringTemp.isEmpty()) {
            stringTemp = "0.";
        } else {
            stringTemp = stringTemp + ".";
        }
        //tras las comprobaciones ponemos el texto en pantalla
        if(estadoOperacion==0){
            jLabelPantallaTop.setText(stringTemp);
            jLabelPantallaPrincipal.setText(stringTemp);
        }else if(estadoOperacion==3){
            
        }
        else{
            jLabelPantallaTop.setText(numeros1+operador+stringTemp);
            jLabelPantallaPrincipal.setText(stringTemp);
        }
    }

    public void operacion(String op) {
        /*
        - Comprobar que hemos escrito algun numero
        - Comprobar si ya hemos operado
         */
        //Antes e nada comprobamos que si hemos puesto el punto decimal lo siga algun numero, y sino lo quitamos
        if (stringTemp.endsWith(".")) {
            stringTemp = stringTemp.substring(0, stringTemp.length());            
        }

        if (estadoOperacion == 0 && !stringTemp.isEmpty()) {
            numeros1 = stringTemp;            
            stringTemp = "";
            estadoOperacion = 2;
            operador = op;
            jLabelPantallaPrincipal.setText(stringTemp);
            jLabelPantallaTop.setText(numeros1+operador);
        } else if (estadoOperacion == 1 && !stringTemp.isEmpty()) {
            resultado();
            operador = op;
            estadoOperacion=2;
        }else if (estadoOperacion == 2 || estadoOperacion==3) {
            operador = op;            
            jLabelPantallaTop.setText(numeros1+operador);
            estadoOperacion=2;
        }

    }

    public void resultado() {
        if (estadoOperacion ==1&&!operador.isEmpty()) {
            numeros2 = stringTemp;            
            mensajeParaServidor = numeros1 + "," + numeros2 + "," + operador;
            System.out.println("Mensaje: "+numeros1+operador+numeros2);
            String mensaje = cliente.ejecutar(mensajeParaServidor);            
            respuesta = mensaje.trim();
            if(respuesta.endsWith(".0")){
                respuesta=respuesta.substring(0, respuesta.length()-2);
            }
            jLabelPantallaTop.setText(numeros1 + operador + numeros2 + "="+respuesta);
            numeros1 = respuesta;
            stringTemp = "";
            numeros2 = "";
            operador = "";
            estadoOperacion = 3;            
            jLabelPantallaPrincipal.setText(respuesta);
        }
    }

    public void borrarTodo() {
        numeros1 = "";
        numeros2 = "";
        operador = "";
        stringTemp = "";
        respuesta = "";
        operacionCompleta = "";
        mensajeParaServidor = "";
        //devolvemos el estado al inicial
        estadoOperacion = 0;
        //borramos las etiquetas de texto
        jLabelPantallaPrincipal.setText("");
        jLabelPantallaTop.setText("");
    }

    public void borrarNumeroActual() {
        stringTemp = "";
        jLabelPantallaPrincipal.setText("");
        //Si estabamos escribiendo el segundo numero, volvemos al estado de operador tras borrar el numero
        if (estadoOperacion == 1) {
            estadoOperacion = 2;
            jLabelPantallaTop.setText(numeros1+operador);
        }else if(estadoOperacion==0){
            jLabelPantallaTop.setText("");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonC;
    private javax.swing.JButton jButtonCE;
    private javax.swing.JButton jButtonDivide1;
    private javax.swing.JButton jButtonIgual;
    private javax.swing.JButton jButtonMultiplica;
    private javax.swing.JButton jButtonPunto;
    private javax.swing.JButton jButtonResta;
    private javax.swing.JButton jButtonSuma;
    private javax.swing.JLabel jLabelPantallaPrincipal;
    private javax.swing.JLabel jLabelPantallaTop;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton raiz;
    // End of variables declaration//GEN-END:variables
}
