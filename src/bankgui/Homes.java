/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankgui;

/**
 *
 * @author Mokleters
 */
public class Homes extends javax.swing.JFrame {

    /**
     * Creates new form Homes
     */
    public static int saldo = 50000;
    public Homes() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(360, 200, 20, 20);

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(360, 234, 20, 20);

        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(360, 270, 20, 20);

        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 200, 40, 20);

        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6);
        jLabel6.setBounds(80, 230, 40, 30);

        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8);
        jLabel8.setBounds(80, 270, 0, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bankgui/home_1.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 455, 470);

        setBounds(0, 0, 470, 508);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        int z;
        
        javax.swing.JOptionPane.showMessageDialog(null, "Saldo Anda saat ini "
                        + "sebesar : " + saldo);
        z=javax.swing.JOptionPane.showConfirmDialog(null,"Melanjutkan transaksi lain?","ATM EXPOST BANK", 
                javax.swing.JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain 
                if (z==0) { 
                    new Homes().setVisible(true);
                } else {
                javax.swing.JOptionPane.showMessageDialog(null,"Terimakasih telah menggunakan ATM EXPOST BANK,"
                        + " ambil kartu ATM Anda."); 
                this.dispose();
                }
                this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        String str;
        int s,z;
        
        str = javax.swing.JOptionPane.showInputDialog(null,"Masukkan jumlah penyetoran : " ); //menabung 
        s = Integer.parseInt(str); setor hasil = new setor(); 
        hasil.menabung(saldo, s); 
        saldo =hasil.getsaldo();
        javax.swing.JOptionPane.showMessageDialog(null, "Saldo Anda saat ini : " + saldo);
        z = javax.swing.JOptionPane.showConfirmDialog(null,"Melanjutkan transaksi lain?","ATM EXPOST BANK", 
                javax.swing.JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain 
                if (z==0) { 
                    new Homes().setVisible(true);
                } else {
                javax.swing.JOptionPane.showMessageDialog(null,"Terimakasih telah menggunakan ATM EXPOST BANK,"
                        + " ambil kartu ATM Anda."); 
                this.dispose();
                }
                this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        String trk;
        int t,z;
        
        trk = javax.swing.JOptionPane.showInputDialog(null,"Masukkan jumlah penarikan : " ); //menabung 
        t = Integer.parseInt(trk); 
        tarik mengambil = new tarik(); 
        mengambil.ambil(saldo,t); 
        saldo = mengambil.getsaldo();
        javax.swing.JOptionPane.showMessageDialog(null, "Saldo Anda saat ini : " + saldo);
        z=javax.swing.JOptionPane.showConfirmDialog(null,"Melanjutkan transaksi lain?","ATM EXPOST BANK", 
                javax.swing.JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain 
                if (z==0) { 
                    new Homes().setVisible(true);
                } else {
                javax.swing.JOptionPane.showMessageDialog(null,"Terimakasih telah menggunakan ATM EXPOST BANK,"
                        + " ambil kartu ATM Anda."); 
                this.dispose();
                }
                this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        int z;
        
        javax.swing.JOptionPane.showMessageDialog(null,"Cara Penggunaan Aplikasi\n[1] Masukkan PIN dengan benar\n[2]"
                            + " Bertransaksilah dengan benar sesuai pilihan\n[3] Gunakan Uang sesuai kebutuhan"
                            + " dan rajinlah menabung jangan hanya meminta\n ","INFO",1);
        z=javax.swing.JOptionPane.showConfirmDialog(null,"Melanjutkan transaksi lain?","ATM EXPOST BANK", 
                javax.swing.JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain 
                if (z==0) { 
                    new Homes().setVisible(true);
                } else {
                javax.swing.JOptionPane.showMessageDialog(null,"Terimakasih telah menggunakan ATM EXPOST BANK,"
                        + " ambil kartu ATM Anda."); 
                this.dispose();
                }
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        String tf;
        int t,z;

        tf = javax.swing.JOptionPane.showInputDialog(null,"Masukkan jumlah transfer : " );
        t = Integer.parseInt(tf);
        tarik mengambil = new tarik();
        mengambil.ambil(saldo,t);
        saldo = mengambil.getsaldo();
        javax.swing.JOptionPane.showMessageDialog(null, "Saldo Anda saat ini : " + saldo);
        z=javax.swing.JOptionPane.showConfirmDialog(null,"Melanjutkan transaksi lain?","ATM EXPOST BANK",
            javax.swing.JOptionPane.YES_NO_OPTION, 3); //konfirmasi transaksi lain
        if (z==0) {
            new Homes().setVisible(true);
        } else {
            javax.swing.JOptionPane.showMessageDialog(null,"Terimakasih telah menggunakan ATM EXPOST BANK,"
                + " ambil kartu ATM Anda.");
            this.dispose();
        }
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
         this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

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
            java.util.logging.Logger.getLogger(Homes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Homes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
