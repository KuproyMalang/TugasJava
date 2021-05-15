/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tugasbesarnonpbo;

import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class currency extends javax.swing.JFrame {

    /**
     * Creates new form currencyConverter
     */
    public currency() {
        initComponents();
    }
    
    public void convert(){
        double hasil;
        double jumlah = Double.parseDouble(Amount_Box.getText());
        
        if(Double.parseDouble(Amount_Box.getText())<0){
            error();
        }
        else if(From_Box.getSelectedItem().equals("USD") && To_Box.getSelectedItem().equals("USD")){
            hasil = jumlah * 1;
            String konversi = String.valueOf(hasil);
            JOptionPane.showMessageDialog(null, Amount_Box.getText()+" "+From_Box.getSelectedItem()+" = "+konversi+" "+To_Box.getSelectedItem(), "Conversion", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(From_Box.getSelectedItem().equals("USD") && To_Box.getSelectedItem().equals("EUR")){
            hasil = jumlah * 0.82;
            String konversi = String.valueOf(hasil);
            JOptionPane.showMessageDialog(null, Amount_Box.getText()+" "+From_Box.getSelectedItem()+" = "+konversi+" "+To_Box.getSelectedItem(), "Conversion", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(From_Box.getSelectedItem().equals("USD") && To_Box.getSelectedItem().equals("GBP")){
            hasil = jumlah * 0.72;
            String konversi = String.valueOf(hasil);
            JOptionPane.showMessageDialog(null, Amount_Box.getText()+" "+From_Box.getSelectedItem()+" = "+konversi+" "+To_Box.getSelectedItem(), "Conversion", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(From_Box.getSelectedItem().equals("USD") && To_Box.getSelectedItem().equals("CAD")){
            hasil = jumlah * 1.21;
            String konversi = String.valueOf(hasil);
            JOptionPane.showMessageDialog(null, Amount_Box.getText()+" "+From_Box.getSelectedItem()+" = "+konversi+" "+To_Box.getSelectedItem(), "Conversion", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(From_Box.getSelectedItem().equals("USD") && To_Box.getSelectedItem().equals("CNY")){
            hasil = jumlah * 6.43;
            String konversi = String.valueOf(hasil);
            JOptionPane.showMessageDialog(null, Amount_Box.getText()+" "+From_Box.getSelectedItem()+" = "+konversi+" "+To_Box.getSelectedItem(), "Conversion", JOptionPane.INFORMATION_MESSAGE);
        }
        
        else if(From_Box.getSelectedItem().equals("EUR") && To_Box.getSelectedItem().equals("EUR")){
            hasil = jumlah * 1;
            String konversi = String.valueOf(hasil);
            JOptionPane.showMessageDialog(null, Amount_Box.getText()+" "+From_Box.getSelectedItem()+" = "+konversi+" "+To_Box.getSelectedItem(), "Conversion", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(From_Box.getSelectedItem().equals("EUR") && To_Box.getSelectedItem().equals("USD")){
            hasil = jumlah * 1.22;
            String konversi = String.valueOf(hasil);
            JOptionPane.showMessageDialog(null, Amount_Box.getText()+" "+From_Box.getSelectedItem()+" = "+konversi+" "+To_Box.getSelectedItem(), "Conversion", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(From_Box.getSelectedItem().equals("EUR") && To_Box.getSelectedItem().equals("GBP")){
            hasil = jumlah * 0.87;
            String konversi = String.valueOf(hasil);
            JOptionPane.showMessageDialog(null, Amount_Box.getText()+" "+From_Box.getSelectedItem()+" = "+konversi+" "+To_Box.getSelectedItem(), "Conversion", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(From_Box.getSelectedItem().equals("EUR") && To_Box.getSelectedItem().equals("CAD")){
            hasil = jumlah * 1.48;
            String konversi = String.valueOf(hasil);
            JOptionPane.showMessageDialog(null, Amount_Box.getText()+" "+From_Box.getSelectedItem()+" = "+konversi+" "+To_Box.getSelectedItem(), "Conversion", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(From_Box.getSelectedItem().equals("EUR") && To_Box.getSelectedItem().equals("CNY")){
            hasil = jumlah * 7.82;
            String konversi = String.valueOf(hasil);
            JOptionPane.showMessageDialog(null, Amount_Box.getText()+" "+From_Box.getSelectedItem()+" = "+konversi+" "+To_Box.getSelectedItem(), "Conversion", JOptionPane.INFORMATION_MESSAGE);
        }
        
        else if(From_Box.getSelectedItem().equals("GBP") && To_Box.getSelectedItem().equals("GBP")){
            hasil = jumlah * 1;
            String konversi = String.valueOf(hasil);
            JOptionPane.showMessageDialog(null, Amount_Box.getText()+" "+From_Box.getSelectedItem()+" = "+konversi+" "+To_Box.getSelectedItem(), "Conversion", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(From_Box.getSelectedItem().equals("GBP") && To_Box.getSelectedItem().equals("USD")){
            hasil = jumlah * 1.40;
            String konversi = String.valueOf(hasil);
            JOptionPane.showMessageDialog(null, Amount_Box.getText()+" "+From_Box.getSelectedItem()+" = "+konversi+" "+To_Box.getSelectedItem(), "Conversion", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(From_Box.getSelectedItem().equals("GBP") && To_Box.getSelectedItem().equals("EUR")){
            hasil = jumlah * 1.15;
            String konversi = String.valueOf(hasil);
            JOptionPane.showMessageDialog(null, Amount_Box.getText()+" "+From_Box.getSelectedItem()+" = "+konversi+" "+To_Box.getSelectedItem(), "Conversion", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(From_Box.getSelectedItem().equals("GBP") && To_Box.getSelectedItem().equals("CAD")){
            hasil = jumlah * 1.70;
            String konversi = String.valueOf(hasil);
            JOptionPane.showMessageDialog(null, Amount_Box.getText()+" "+From_Box.getSelectedItem()+" = "+konversi+" "+To_Box.getSelectedItem(), "Conversion", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(From_Box.getSelectedItem().equals("GBP") && To_Box.getSelectedItem().equals("CNY")){
            hasil = jumlah * 8.99;
            String konversi = String.valueOf(hasil);
            JOptionPane.showMessageDialog(null, Amount_Box.getText()+" "+From_Box.getSelectedItem()+" = "+konversi+" "+To_Box.getSelectedItem(), "Conversion", JOptionPane.INFORMATION_MESSAGE);
        }
        
        else if(From_Box.getSelectedItem().equals("CAD") && To_Box.getSelectedItem().equals("CAD")){
            hasil = jumlah * 1;
            String konversi = String.valueOf(hasil);
            JOptionPane.showMessageDialog(null, Amount_Box.getText()+" "+From_Box.getSelectedItem()+" = "+konversi+" "+To_Box.getSelectedItem(), "Conversion", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(From_Box.getSelectedItem().equals("CAD") && To_Box.getSelectedItem().equals("USD")){
            hasil = jumlah * 0.82;
            String konversi = String.valueOf(hasil);
            JOptionPane.showMessageDialog(null, Amount_Box.getText()+" "+From_Box.getSelectedItem()+" = "+konversi+" "+To_Box.getSelectedItem(), "Conversion", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(From_Box.getSelectedItem().equals("CAD") && To_Box.getSelectedItem().equals("EUR")){
            hasil = jumlah * 0.68;
            String konversi = String.valueOf(hasil);
            JOptionPane.showMessageDialog(null, Amount_Box.getText()+" "+From_Box.getSelectedItem()+" = "+konversi+" "+To_Box.getSelectedItem(), "Conversion", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(From_Box.getSelectedItem().equals("CAD") && To_Box.getSelectedItem().equals("GBP")){
            hasil = jumlah * 0.59;
            String konversi = String.valueOf(hasil);
            JOptionPane.showMessageDialog(null, Amount_Box.getText()+" "+From_Box.getSelectedItem()+" = "+konversi+" "+To_Box.getSelectedItem(), "Conversion", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(From_Box.getSelectedItem().equals("CAD") && To_Box.getSelectedItem().equals("CNY")){
            hasil = jumlah * 5.30;
            String konversi = String.valueOf(hasil);
            JOptionPane.showMessageDialog(null, Amount_Box.getText()+" "+From_Box.getSelectedItem()+" = "+konversi+" "+To_Box.getSelectedItem(), "Conversion", JOptionPane.INFORMATION_MESSAGE);
        }
        
        else if(From_Box.getSelectedItem().equals("CNY") && To_Box.getSelectedItem().equals("CNY")){
            hasil = jumlah * 1;
            String konversi = String.valueOf(hasil);
            JOptionPane.showMessageDialog(null, Amount_Box.getText()+" "+From_Box.getSelectedItem()+" = "+konversi+" "+To_Box.getSelectedItem(), "Conversion", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(From_Box.getSelectedItem().equals("CNY") && To_Box.getSelectedItem().equals("USD")){
            hasil = jumlah * 0.16;
            String konversi = String.valueOf(hasil);
            JOptionPane.showMessageDialog(null, Amount_Box.getText()+" "+From_Box.getSelectedItem()+" = "+konversi+" "+To_Box.getSelectedItem(), "Conversion", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(From_Box.getSelectedItem().equals("CNY") && To_Box.getSelectedItem().equals("EUR")){
            hasil = jumlah * 0.13;
            String konversi = String.valueOf(hasil);
            JOptionPane.showMessageDialog(null, Amount_Box.getText()+" "+From_Box.getSelectedItem()+" = "+konversi+" "+To_Box.getSelectedItem(), "Conversion", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(From_Box.getSelectedItem().equals("CNY") && To_Box.getSelectedItem().equals("GBP")){
            hasil = jumlah * 0.11;
            String konversi = String.valueOf(hasil);
            JOptionPane.showMessageDialog(null, Amount_Box.getText()+" "+From_Box.getSelectedItem()+" = "+konversi+" "+To_Box.getSelectedItem(), "Conversion", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(From_Box.getSelectedItem().equals("CNY") && To_Box.getSelectedItem().equals("CAD")){
            hasil = jumlah * 0.19;
            String konversi = String.valueOf(hasil);
            JOptionPane.showMessageDialog(null, Amount_Box.getText()+" "+From_Box.getSelectedItem()+" = "+konversi+" "+To_Box.getSelectedItem(), "Conversion", JOptionPane.INFORMATION_MESSAGE);
        }
    }
     
    public void reset() {
        Amount_Box.setText(null);
        From_Box.setSelectedIndex(0);
        To_Box.setSelectedIndex(0);
    }
    
    public void exit(){
        System.exit(0);
    }
    
    public void error(){
        JOptionPane.showMessageDialog(null, "Please Insert a Positive Amount");
    }
    
    public void error(String errorName){
        JOptionPane.showMessageDialog(null, errorName+" Please Insert an Amount in Numbers");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Full_Panel = new javax.swing.JPanel();
        Amount = new javax.swing.JLabel();
        From = new javax.swing.JLabel();
        To = new javax.swing.JLabel();
        Amount_Box = new javax.swing.JTextField();
        To_Box = new javax.swing.JComboBox<>();
        From_Box = new javax.swing.JComboBox<>();
        Exit = new javax.swing.JButton();
        Convert = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Converter = new javax.swing.JLabel();
        Currency = new javax.swing.JLabel();
        Bottom_Panel = new javax.swing.JPanel();
        Copyright_Logo = new javax.swing.JLabel();
        Copyright = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        Full_Panel.setBackground(new java.awt.Color(255, 255, 255));
        Full_Panel.setName("Currency Converter"); // NOI18N

        Amount.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Amount.setText("Amount");

        From.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        From.setText("From");

        To.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        To.setText("To");

        Amount_Box.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Amount_Box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Amount_BoxActionPerformed(evt);
            }
        });
        Amount_Box.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Amount_BoxKeyTyped(evt);
            }
        });

        To_Box.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        To_Box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "GBP", "EUR", "CNY", "CAD" }));

        From_Box.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        From_Box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "GBP", "EUR", "CNY", "CAD" }));
        From_Box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                From_BoxActionPerformed(evt);
            }
        });

        Exit.setBackground(new java.awt.Color(102, 204, 255));
        Exit.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setText("EXIT");
        Exit.setBorder(null);
        Exit.setBorderPainted(false);
        Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        Convert.setBackground(new java.awt.Color(102, 204, 255));
        Convert.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        Convert.setForeground(new java.awt.Color(255, 255, 255));
        Convert.setText("CONVERT");
        Convert.setBorder(null);
        Convert.setBorderPainted(false);
        Convert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConvertActionPerformed(evt);
            }
        });

        Reset.setBackground(new java.awt.Color(102, 204, 255));
        Reset.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        Reset.setForeground(new java.awt.Color(255, 255, 255));
        Reset.setText("RESET");
        Reset.setBorder(null);
        Reset.setBorderPainted(false);
        Reset.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        Converter.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        Converter.setForeground(new java.awt.Color(255, 255, 255));
        Converter.setText("CONVERTER");

        Currency.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        Currency.setForeground(new java.awt.Color(255, 255, 255));
        Currency.setText("CURRENCY");

        Bottom_Panel.setBackground(new java.awt.Color(204, 204, 204));

        Copyright.setFont(new java.awt.Font("Futura Bk BT", 0, 14)); // NOI18N
        Copyright.setText("Copyright Kel6 2021. All Rights Reserved.");
        Copyright.setToolTipText("");

        javax.swing.GroupLayout Bottom_PanelLayout = new javax.swing.GroupLayout(Bottom_Panel);
        Bottom_Panel.setLayout(Bottom_PanelLayout);
        Bottom_PanelLayout.setHorizontalGroup(
            Bottom_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Bottom_PanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(Copyright_Logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Copyright, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Bottom_PanelLayout.setVerticalGroup(
            Bottom_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Bottom_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Bottom_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Copyright, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Copyright_Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Bottom_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Currency)
                    .addComponent(Converter, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(207, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(152, 152, 152))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(Currency)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Converter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(Bottom_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout Full_PanelLayout = new javax.swing.GroupLayout(Full_Panel);
        Full_Panel.setLayout(Full_PanelLayout);
        Full_PanelLayout.setHorizontalGroup(
            Full_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Full_PanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(Full_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Full_PanelLayout.createSequentialGroup()
                        .addComponent(Convert, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(From_Box, 0, 531, Short.MAX_VALUE)
                    .addGroup(Full_PanelLayout.createSequentialGroup()
                        .addGroup(Full_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(To)
                            .addComponent(Amount)
                            .addComponent(From))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(To_Box, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Amount_Box))
                .addGap(54, 54, 54))
        );
        Full_PanelLayout.setVerticalGroup(
            Full_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Full_PanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(Amount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Amount_Box, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(From)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(From_Box, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(To)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(To_Box, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Full_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Convert, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
            .addGroup(Full_PanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Full_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Full_Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Amount_BoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Amount_BoxActionPerformed
        
    }//GEN-LAST:event_Amount_BoxActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        exit();
    }//GEN-LAST:event_ExitActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        reset();
    }//GEN-LAST:event_ResetActionPerformed

    private void ConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConvertActionPerformed
        convert();
    }//GEN-LAST:event_ConvertActionPerformed

    private void From_BoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_From_BoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_From_BoxActionPerformed

    private void Amount_BoxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Amount_BoxKeyTyped
        
    }//GEN-LAST:event_Amount_BoxKeyTyped

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
            java.util.logging.Logger.getLogger(currency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(currency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(currency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(currency.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new currency().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Amount;
    public javax.swing.JTextField Amount_Box;
    private javax.swing.JPanel Bottom_Panel;
    private javax.swing.JButton Convert;
    private javax.swing.JLabel Converter;
    private javax.swing.JLabel Copyright;
    private javax.swing.JLabel Copyright_Logo;
    private javax.swing.JLabel Currency;
    private javax.swing.JButton Exit;
    private javax.swing.JLabel From;
    public javax.swing.JComboBox<String> From_Box;
    private javax.swing.JPanel Full_Panel;
    private javax.swing.JButton Reset;
    private javax.swing.JLabel To;
    public javax.swing.JComboBox<String> To_Box;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}