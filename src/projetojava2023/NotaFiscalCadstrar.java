/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetojava2023;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author 910640
 */
public class NotaFiscalCadstrar extends javax.swing.JFrame {

    /**
     * Creates new form NotaFiscal
     */
    public NotaFiscalCadstrar() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        voltar = new javax.swing.JButton();
        cadastrar = new javax.swing.JButton();
        data = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter tele = new javax.swing.text.MaskFormatter("##/##/####");
            data = new javax.swing.JFormattedTextField(tele);
        }
        catch (Exception e){
        }
        qtdRetirada = new javax.swing.JTextField();
        preco = new javax.swing.JTextField();
        cliente = new javax.swing.JTextField();
        funcionario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        codProduto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);
        getContentPane().setLayout(null);

        voltar.setBackground(new java.awt.Color(255, 51, 51));
        voltar.setText("VOLTAR");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        getContentPane().add(voltar);
        voltar.setBounds(620, 10, 80, 30);

        cadastrar.setBackground(new java.awt.Color(51, 204, 0));
        cadastrar.setText("CADASTRAR");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(cadastrar);
        cadastrar.setBounds(520, 120, 100, 40);

        data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataActionPerformed(evt);
            }
        });
        getContentPane().add(data);
        data.setBounds(180, 50, 150, 30);
        getContentPane().add(qtdRetirada);
        qtdRetirada.setBounds(180, 90, 150, 30);
        getContentPane().add(preco);
        preco.setBounds(180, 130, 150, 30);

        cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteActionPerformed(evt);
            }
        });
        getContentPane().add(cliente);
        cliente.setBounds(180, 250, 150, 30);
        getContentPane().add(funcionario);
        funcionario.setBounds(180, 210, 150, 30);

        jLabel2.setText("DATA DO CADASTRO");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 60, 130, 16);

        jLabel3.setText("Quantidade Retirada");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 100, 120, 16);

        jLabel4.setText("PREÇO");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(120, 140, 90, 16);

        jLabel5.setText("FUNCIONÁRIO");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 220, 140, 16);

        jLabel6.setText("CLIENTE");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(110, 260, 86, 16);

        jLabel13.setText("CODIGO DO PRODUTO");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(40, 180, 180, 16);

        codProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(codProduto);
        codProduto.setBounds(180, 170, 150, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background_far.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 980, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed

        this.dispose();
    }//GEN-LAST:event_voltarActionPerformed

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetojava2023","root","");
            java.sql.Statement st = conn.createStatement();
            st.executeUpdate("INSERT INTO notafiscal(`data`,`qtdRetirada`,`preco`,`codProduto`,`funcionario`,`cliente`) VALUES ('"

                + this.data.getText() +"','"
                + this.qtdRetirada.getText() + "','"
                + this.preco.getText() + "','"
                + this.codProduto.getText() + "','"
                + this.funcionario.getText() + "','"
                + this.cliente.getText() + "')");
                

            JOptionPane.showMessageDialog(rootPane,"Nota Fiscal cadastrada com sucesso");

            data.setText(null);
            qtdRetirada.setText(null);
            preco.setText(null);
            codProduto.setText(null);
            funcionario.setText(null);
            cliente.setText(null);
            

        }catch (SQLException | ClassNotFoundException e){
            JOptionPane.showMessageDialog(rootPane, e);
        };
    }//GEN-LAST:event_cadastrarActionPerformed

    private void dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataActionPerformed

    private void clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clienteActionPerformed

    private void codProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codProdutoActionPerformed

    }//GEN-LAST:event_codProdutoActionPerformed

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
            java.util.logging.Logger.getLogger(NotaFiscalCadstrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NotaFiscalCadstrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NotaFiscalCadstrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NotaFiscalCadstrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NotaFiscalCadstrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrar;
    private javax.swing.JTextField cliente;
    private javax.swing.JTextField codProduto;
    private javax.swing.JTextField data;
    private javax.swing.JTextField funcionario;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField preco;
    private javax.swing.JTextField qtdRetirada;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
