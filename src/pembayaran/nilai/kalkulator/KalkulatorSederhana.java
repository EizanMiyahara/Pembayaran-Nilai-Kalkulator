/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pembayaran.nilai.kalkulator;

/**
 *
 * @author Hyung
 */
public class KalkulatorSederhana extends javax.swing.JFrame {

    /**
     * Creates new form KalkulatorSederhana
     */
    public KalkulatorSederhana() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bil1 = new javax.swing.JTextField();
        bil2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        result = new javax.swing.JTextArea();
        kali = new javax.swing.JButton();
        bagi = new javax.swing.JButton();
        kurang = new javax.swing.JButton();
        tambah = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Kalkulator Sederhana");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(120, 10, 170, 20);

        jLabel2.setText("Bilangan 1");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 60, 60, 20);

        jLabel3.setText("Bilangan 2");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(80, 100, 60, 20);
        jPanel1.add(bil1);
        bil1.setBounds(150, 50, 150, 30);
        jPanel1.add(bil2);
        bil2.setBounds(150, 90, 150, 30);

        jLabel4.setText("Operators");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(170, 130, 60, 20);

        jLabel5.setText("Hasil");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(180, 180, 30, 20);

        result.setColumns(20);
        result.setRows(5);
        jScrollPane1.setViewportView(result);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(40, 200, 310, 100);

        kali.setText("X");
        kali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaliActionPerformed(evt);
            }
        });
        jPanel1.add(kali);
        kali.setBounds(100, 150, 40, 30);

        bagi.setText(":");
        bagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagiActionPerformed(evt);
            }
        });
        jPanel1.add(bagi);
        bagi.setBounds(150, 150, 37, 30);

        kurang.setText("-");
        kurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kurangActionPerformed(evt);
            }
        });
        jPanel1.add(kurang);
        kurang.setBounds(200, 150, 37, 30);

        tambah.setText("+");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });
        jPanel1.add(tambah);
        tambah.setBounds(250, 150, 41, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 390, 310);

        setSize(new java.awt.Dimension(406, 350));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void kaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaliActionPerformed
        // TODO add your handling code here:
        int Bilangan1 = Integer.parseInt(bil1.getText());
        int Bilangan2 = Integer.parseInt(bil2.getText());
        int kali = Bilangan1*Bilangan2;
        
        result.setText(String.valueOf(kali));
    }//GEN-LAST:event_kaliActionPerformed

    private void bagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagiActionPerformed
        // TODO add your handling code here:
        double Bilangan1 = Integer.parseInt(bil1.getText());
        double Bilangan2 = Integer.parseInt(bil2.getText());
        double bagi = Bilangan1/Bilangan2;
        
        result.setText(String.valueOf(bagi));
    }//GEN-LAST:event_bagiActionPerformed

    private void kurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kurangActionPerformed
        // TODO add your handling code here:
        int Bilangan1 = Integer.parseInt(String.valueOf(bil1.getText()));
        int Bilangan2 = Integer.parseInt(String.valueOf(bil2.getText()));
        int kurang = Bilangan1-Bilangan2;
        
        result.setText(String.valueOf(kurang));
    }//GEN-LAST:event_kurangActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here:
        int Bilangan1 = Integer.parseInt(String.valueOf(bil1.getText()));
        int Bilangan2 = Integer.parseInt(String.valueOf(bil2.getText()));
        int tambah = Bilangan1+Bilangan2;
        
        result.setText(String.valueOf(tambah));
    }//GEN-LAST:event_tambahActionPerformed

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
            java.util.logging.Logger.getLogger(KalkulatorSederhana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KalkulatorSederhana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KalkulatorSederhana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KalkulatorSederhana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KalkulatorSederhana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bagi;
    private javax.swing.JTextField bil1;
    private javax.swing.JTextField bil2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kali;
    private javax.swing.JButton kurang;
    private javax.swing.JTextArea result;
    private javax.swing.JButton tambah;
    // End of variables declaration//GEN-END:variables
}