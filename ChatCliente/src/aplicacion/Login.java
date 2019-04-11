package aplicacion;

import chatcliente.MetodosChat;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 * Aplicacion de Login
 * @author jose_
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLogin = new javax.swing.JPanel();
        lblSaludo = new javax.swing.JLabel();
        lblIP = new javax.swing.JLabel();
        lblPuerto = new javax.swing.JLabel();
        txtIP = new javax.swing.JTextField();
        txtPuerto = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblUsuario = new javax.swing.JLabel();
        txtNickname = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btnConectar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblSaludo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSaludo.setText("Bienvenido al Chat");

        lblIP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblIP.setText("Introduca la IP del servidor: ");

        lblPuerto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPuerto.setText("Introduzca el PUERTO del servidor:");

        txtIP.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        txtPuerto.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUsuario.setText("Introduzca su NICKNAME:");

        txtNickname.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        btnConectar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnConectar.setText("CONECTAR");
        btnConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(lblSaludo))
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLoginLayout.createSequentialGroup()
                                    .addComponent(lblUsuario)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtNickname))
                                .addGroup(panelLoginLayout.createSequentialGroup()
                                    .addComponent(lblPuerto)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelLoginLayout.createSequentialGroup()
                                    .addComponent(lblIP)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtIP, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(btnConectar)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblSaludo)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIP)
                    .addComponent(txtIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPuerto)
                    .addComponent(txtPuerto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblUsuario)
                    .addComponent(txtNickname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConectar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Al pulsar el boton comprobamos que estan todos los campos cubiertos.
     * Si lo estan llamamos el metodo conexionSocket de la clase MetodosChat
     * que realizara la conexion.
     * @param evt 
     */
    private void btnConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarActionPerformed
        String ip = txtIP.getText();
        String port = txtPuerto.getText();
        String nickname = txtNickname.getText();
        if (ip.equalsIgnoreCase("") | port.equalsIgnoreCase("") | nickname.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(panelLogin, "No se han introducido todos los campos");
        }else{
            try {
                MetodosChat.conexionSocket(ip, port, nickname, this);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(panelLogin, "Se ha producido un error al establecer la conexion");
            }
        }
    }//GEN-LAST:event_btnConectarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConectar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblIP;
    private javax.swing.JLabel lblPuerto;
    private javax.swing.JLabel lblSaludo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JTextField txtIP;
    private javax.swing.JTextField txtNickname;
    private javax.swing.JTextField txtPuerto;
    // End of variables declaration//GEN-END:variables
}