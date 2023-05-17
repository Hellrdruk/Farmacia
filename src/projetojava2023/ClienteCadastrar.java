/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetojava2023;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
import static jdk.nashorn.internal.runtime.Debug.id;
import static org.omg.CORBA.CompletionStatusHelper.id;

/**
 *
 * @author 910640
 */
public class ClienteCadastrar extends javax.swing.JFrame {

    /**
     * Creates new form ClienteCadastrar
     */
    public ClienteCadastrar() {
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

        id = new javax.swing.JTextField();
        voltar = new javax.swing.JButton();
        cadastrar = new javax.swing.JButton();
        nome = new javax.swing.JTextField();
        dataNasc = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter tele = new javax.swing.text.MaskFormatter("##/##/####");
            dataNasc = new javax.swing.JFormattedTextField(tele);
        }
        catch (Exception e){
        }
        cpf = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter tele = new javax.swing.text.MaskFormatter("###.###.###-##");
            cpf = new javax.swing.JFormattedTextField(tele);
        }
        catch (Exception e){
        }
        rua = new javax.swing.JTextField();
        bairro = new javax.swing.JTextField();
        num = new javax.swing.JTextField();
        cidade = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tel = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter tele = new javax.swing.text.MaskFormatter("(##) # ####-####");
            tel = new javax.swing.JFormattedTextField(tele);
        }
        catch (Exception e){
        }
        jLabel10 = new javax.swing.JLabel();

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(720, 400));
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

        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });
        getContentPane().add(nome);
        nome.setBounds(180, 50, 150, 30);
        getContentPane().add(dataNasc);
        dataNasc.setBounds(180, 90, 150, 30);
        getContentPane().add(cpf);
        cpf.setBounds(180, 130, 150, 30);
        getContentPane().add(rua);
        rua.setBounds(180, 290, 150, 30);

        bairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bairroActionPerformed(evt);
            }
        });
        getContentPane().add(bairro);
        bairro.setBounds(180, 250, 150, 30);
        getContentPane().add(num);
        num.setBounds(180, 330, 150, 30);

        cidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidadeActionPerformed(evt);
            }
        });
        getContentPane().add(cidade);
        cidade.setBounds(180, 370, 150, 30);
        getContentPane().add(email);
        email.setBounds(180, 210, 150, 30);

        jLabel1.setText("ID");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(1160, 490, 21, 16);

        jLabel2.setText("NOME");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 60, 53, 16);

        jLabel3.setText("DATA NASCIMENTO ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 100, 120, 16);

        jLabel4.setText("CPF");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(150, 140, 69, 16);

        jLabel5.setText("EMAIL");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(140, 220, 99, 16);

        jLabel6.setText("BAIRRO");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(130, 260, 86, 16);

        jLabel7.setText("RUA");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(150, 300, 99, 16);

        jLabel8.setText("NÚMERO");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(120, 340, 72, 16);

        jLabel9.setText("CIDADE");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(130, 380, 99, 16);

        jLabel13.setText("TELEFONE");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(120, 180, 60, 16);

        tel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telActionPerformed(evt);
            }
        });
        getContentPane().add(tel);
        tel.setBounds(180, 170, 150, 30);

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
            st.executeUpdate("INSERT INTO cliente(`nome`,`dataNasc`,`cpf`,`tel`,`email`,`bairro`,`rua`,`num`,`cidade`) VALUES ('"
                
                + this.nome.getText() +"','"
                + this.dataNasc.getText() + "','"
                + this.cpf.getText() + "','"
                + this.tel.getText() + "','"
                + this.email.getText() + "','"
                + this.bairro.getText() + "','"
                + this.rua.getText() + "','"
                + this.num.getText() + "','"
                + this.cidade.getText() + "')");

            JOptionPane.showMessageDialog(rootPane,"Cliente inserido com sucesso");

            email.setText(null);
            nome.setText(null);
            dataNasc.setText(null);
            cpf.setText(null);
            tel.setText(null);
            bairro.setText(null);
            rua.setText(null);
            num.setText(null);
            cidade.setText(null);

        }catch (SQLException | ClassNotFoundException e){
            JOptionPane.showMessageDialog(rootPane, e);
        };
    }//GEN-LAST:event_cadastrarActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void cidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidadeActionPerformed

    private void bairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bairroActionPerformed

    private void telActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telActionPerformed
        
    }//GEN-LAST:event_telActionPerformed

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
            java.util.logging.Logger.getLogger(ClienteCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteCadastrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bairro;
    private javax.swing.JButton cadastrar;
    private javax.swing.JTextField cidade;
    private javax.swing.JTextField cpf;
    private javax.swing.JTextField dataNasc;
    private javax.swing.JTextField email;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField num;
    private javax.swing.JTextField rua;
    private javax.swing.JTextField tel;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}