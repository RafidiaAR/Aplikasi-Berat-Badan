/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.pkg7;

import javax.swing.JOptionPane;

/**
 *
 * @author RafidiaAR
 */
public class Frame1 extends javax.swing.JFrame {
    String temp = "";
    Double ti, bt, h1;
            
    /**
     * Creates new form Frame1
     */
    public Frame1() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        berat = new javax.swing.JTextField();
        bCoba = new javax.swing.JButton();
        bKeluar = new javax.swing.JButton();
        bHitung = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        brtidl = new javax.swing.JTextField();
        TextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        tinggi = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        TextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Cek Ideal Tubuh");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 10, 160, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Jenis Kelamin");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 180, 100, 17);
        getContentPane().add(berat);
        berat.setBounds(100, 130, 70, 30);

        bCoba.setText("Coba Lagi");
        bCoba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCobaActionPerformed(evt);
            }
        });
        getContentPane().add(bCoba);
        bCoba.setBounds(120, 220, 110, 23);

        bKeluar.setText("Keluar");
        bKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bKeluarActionPerformed(evt);
            }
        });
        getContentPane().add(bKeluar);
        bKeluar.setBounds(250, 220, 90, 23);

        bHitung.setText("Hitung");
        bHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHitungActionPerformed(evt);
            }
        });
        getContentPane().add(bHitung);
        bHitung.setBounds(30, 220, 80, 23);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Hasil Diagnosa Kesehatan");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(100, 300, 190, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Kg");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(180, 130, 34, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Kg");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(290, 260, 30, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Berat Badan Ideal Anda Adalah");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 270, 190, 15);
        getContentPane().add(brtidl);
        brtidl.setBounds(220, 260, 70, 30);

        TextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(TextField2);
        TextField2.setBounds(20, 370, 370, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Nama");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 60, 60, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Tinggi");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 100, 60, 17);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Berat Badan");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(10, 140, 90, 17);
        getContentPane().add(nama);
        nama.setBounds(100, 50, 160, 30);
        getContentPane().add(tinggi);
        tinggi.setBounds(100, 90, 70, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Cm");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(180, 90, 34, 30);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Perempuan");
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(130, 180, 93, 23);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Laki - Laki");
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(230, 180, 100, 23);

        TextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(TextField1);
        TextField1.setBounds(20, 330, 370, 30);

        setBounds(0, 0, 416, 481);
    }// </editor-fold>//GEN-END:initComponents

    private void TextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField2ActionPerformed

    private void bCobaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCobaActionPerformed
    nama.setText("");
    tinggi.setText("");
    berat.setText("");
    brtidl.setText("");
    TextField1.setText("");
    TextField2.setText("");
    
    buttonGroup1.clearSelection();
        // TODO add your handling code here:
    }//GEN-LAST:event_bCobaActionPerformed

    private void bHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHitungActionPerformed
        if(tinggi.getText().equals("")||nama.getText().equals("")||berat.getText().equals("")){
                   JOptionPane.showMessageDialog(null, "Kotak isian belum diisi semua");
        }
        else if(jRadioButton1.isSelected()||jRadioButton2.isSelected()){
        
            try{
                Proses();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Inputan ada yang salah");
            }   
        }
        else{
                    JOptionPane.showMessageDialog(null, "Jenis Kelamin silaahkan diisi");
                    }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_bHitungActionPerformed

    private void TextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField1ActionPerformed

    private void bKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bKeluarActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_bKeluarActionPerformed

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
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextField1;
    private javax.swing.JTextField TextField2;
    private javax.swing.JButton bCoba;
    private javax.swing.JButton bHitung;
    private javax.swing.JButton bKeluar;
    private javax.swing.JTextField berat;
    private javax.swing.JTextField brtidl;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField tinggi;
    // End of variables declaration//GEN-END:variables

    private void Proses() {
        ti = Double.valueOf(tinggi.getText());
        bt = Double.valueOf(berat.getText());
        
        if(jRadioButton1.isSelected()){
            h1 = (ti - 100) * 1;
        } else if (jRadioButton2.isSelected()){
            h1 = (ti - 104) * 1;
        }
        temp = Double.toString(h1.intValue());
    
        if(h1 < bt ){
            brtidl.setText(temp);
            TextField1.setText("Maaf "+ nama.getText() + ", Sepertinya anda OverWeight ");
            TextField2.setText("Banyaklah berolahraga dan hindari makanan berkolesterol");
        }else if (h1 > bt){
            brtidl.setText(temp);
            TextField1.setText("Maaf "+ nama.getText() + ", Sepertinya anda UnderWeight ");
            TextField2.setText("Banyaklah berolahraga dan hindari makanan berkolesterol");
        }else{
            brtidl.setText(temp);
            TextField1.setText("Halo "+ nama.getText() + " , Berat badan anda sudah ideal");
            TextField2.setText("Lanjutkan pola makan teratur dan gaya hidup sehat ");
        
        }
    }
}
