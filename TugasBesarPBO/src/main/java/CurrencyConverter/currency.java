/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CurrencyConverter;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class currency extends javax.swing.JFrame implements buttonAction {

    /**
     * Creates new form currencyConverter
     */
    public currency() {
        initComponents();
    }
    
    private double usdusd;
    private double usdeur;
    private double usdgbp;
    private double usdcad;
    private double usdcny;
    
    private double eureur;
    private double eurusd;
    private double eurgbp;
    private double eurcad;
    private double eurcny;
    
    private double gbpgbp;
    private double gbpusd;
    private double gbpeur;
    private double gbpcad;
    private double gbpcny;
    
    private double cadcad;
    private double cadusd;
    private double cadeur;
    private double cadgbp;
    private double cadcny;
    
    private double cnycny;
    private double cnyusd;
    private double cnyeur;
    private double cnygbp;
    private double cnycad;
    
    public void setUsdusd(double usdusd){
        this.usdusd = usdusd;
    }
    public double getUsdusd(){
        return usdusd;
    }
    
    public void setUsdeur(double usdeur){
        this.usdeur = usdeur;
    }
    public double getUsdeur(){
        return usdeur;
    }
    
    public void setUsdgbp(double usdgbp){
        this.usdgbp = usdgbp;
    }
    public double getUsdgbp(){
        return usdgbp;
    }
    
    public void setUsdcad(double usdcad){
        this.usdcad = usdcad;
    }
    public double getUsdcad(){
        return usdcad;
    }
    
    public void setUsdcny(double usdcny){
        this.usdcny = usdcny;
    }
    public double getUsdcny(){
        return usdcny;
    }
    
    public void setEureur(double eureur){
        this.eureur = eureur;
    }
    public double getEureur(){
        return eureur;
    }
    
    public void setEurusd(double eurusd){
        this.eurusd = eurusd;
    }
    public double getEurusd(){
        return eurusd;
    }
    
    public void setEurgbp(double eurgbp){
        this.eurgbp = eurgbp;
    }
    public double getEurgbp(){
        return eurgbp;
    }
    
    public void setEurcad(double eurcad){
        this.eurcad = eurcad;
    }
    public double getEurcad(){
        return eurcad;
    }
    
    public void setEurcny(double eurcny){
        this.eurcny = eurcny;
    }
    public double getEurcny(){
        return eurcny;
    }
    
    public void setGbpgbp(double gbpgbp){
        this.gbpgbp = gbpgbp;
    }
    public double getGbpgbp(){
        return gbpgbp;
    }
    
    public void setGbpusd(double gbpusd){
        this.gbpusd = gbpusd;
    }
    public double getGbpusd(){
        return gbpusd;
    }
    
    public void setGbpeur(double gbpeur){
        this.gbpeur = gbpeur;
    }
    public double getGbpeur(){
        return gbpeur;
    }
    
    public void setGbpcad(double gbpcad){
        this.gbpcad = gbpcad;
    }
    public double getGbpcad(){
        return gbpcad;
    }
    
    public void setGbpcny(double gbpcny){
        this.gbpcny = gbpcny;
    }
    public double getGbpcny(){
        return gbpcny;
    }
    
    public void setCadcad(double cadcad){
        this.cadcad = cadcad;
    }
    public double getCadcad(){
        return cadcad;
    }
    
    public void setCadusd(double cadusd){
        this.cadusd = cadusd;
    }
    public double getCadusd(){
        return cadusd;
    }
    
    public void setCadeur(double cadeur){
        this.cadeur = cadeur;
    }
    public double getCadeur(){
        return cadeur;
    }
    
    public void setCadgbp(double cadgbp){
        this.cadgbp = cadgbp;
    }
    public double getCadgbp(){
        return cadgbp;
    }
    
    public void setCadcny(double cadcny){
        this.cadcny = cadcny;
    }
    public double getCadcny(){
        return cadcny;
    }
    
    public void setCnycny(double cnycny){
        this.cnycny = cnycny;
    }
    public double getCnycny(){
        return cnycny;
    }
    
    public void setCnyusd(double cnyusd){
        this.cnyusd = cnyusd;
    }
    public double getCnyusd(){
        return cnyusd;
    }
    
    public void setCnyeur(double cnyeur){
        this.cnyeur = cnyeur;
    }
    public double getCnyeur(){
        return cnyeur;
    }
    
    public void setCnygbp(double cnygbp){
        this.cnygbp = cnygbp;
    }
    public double getCnygbp(){
        return cnygbp;
    }
    
    public void setCnycad(double cnycad){
        this.cnycad = cnycad;
    }
    public double getCnycad(){
        return cnycad;
    }
    
    @Override
    public void convert(){
        double hasil;
        double jumlah = Double.parseDouble(Amount_Box.getText());
        
        if(From_Box.getSelectedItem().equals("USD") && To_Box.getSelectedItem().equals("USD")){
            hasil = jumlah * usdusd;
            String konversi = String.valueOf(hasil);
            JOptionPane.showMessageDialog(null, Amount_Box.getText()+" "+From_Box.getSelectedItem()+" = "+konversi+" "+To_Box.getSelectedItem());
        }
        if(From_Box.getSelectedItem().equals("USD") && To_Box.getSelectedItem().equals("EUR")){
            hasil = jumlah * usdeur;
            String konversi = String.valueOf(hasil);
            JOptionPane.showMessageDialog(null, Amount_Box.getText()+" "+From_Box.getSelectedItem()+" = "+konversi+" "+To_Box.getSelectedItem());
        }
        if(From_Box.getSelectedItem().equals("USD") && To_Box.getSelectedItem().equals("GBP")){
            hasil = jumlah * usdgbp;
            String konversi = String.valueOf(hasil);
            JOptionPane.showMessageDialog(null, Amount_Box.getText()+" "+From_Box.getSelectedItem()+" = "+konversi+" "+To_Box.getSelectedItem());
        }
        if(From_Box.getSelectedItem().equals("USD") && To_Box.getSelectedItem().equals("CAD")){
            hasil = jumlah * usdcad;
            String konversi = String.valueOf(hasil);
            JOptionPane.showMessageDialog(null, Amount_Box.getText()+" "+From_Box.getSelectedItem()+" = "+konversi+" "+To_Box.getSelectedItem());
        }
        if(From_Box.getSelectedItem().equals("USD") && To_Box.getSelectedItem().equals("CNY")){
            hasil = jumlah * usdcny;
            String konversi = String.valueOf(hasil);
            JOptionPane.showMessageDialog(null, Amount_Box.getText()+" "+From_Box.getSelectedItem()+" = "+konversi+" "+To_Box.getSelectedItem());
        }
        
        if(From_Box.getSelectedItem().equals("EUR") && To_Box.getSelectedItem().equals("EUR")){
            hasil = jumlah * eureur;
            String konversi = String.valueOf(hasil);
            JOptionPane.showMessageDialog(null, Amount_Box.getText()+" "+From_Box.getSelectedItem()+" = "+konversi+" "+To_Box.getSelectedItem());
        }
        if(From_Box.getSelectedItem().equals("EUR") && To_Box.getSelectedItem().equals("USD")){
            hasil = jumlah * eurusd;
            String konversi = String.valueOf(hasil);
            JOptionPane.showMessageDialog(null, Amount_Box.getText()+" "+From_Box.getSelectedItem()+" = "+konversi+" "+To_Box.getSelectedItem());
        }
        if(From_Box.getSelectedItem().equals("EUR") && To_Box.getSelectedItem().equals("GBP")){
            hasil = jumlah * eurgbp;
            String konversi = String.valueOf(hasil);
            JOptionPane.showMessageDialog(null, Amount_Box.getText()+" "+From_Box.getSelectedItem()+" = "+konversi+" "+To_Box.getSelectedItem());
        }
        if(From_Box.getSelectedItem().equals("EUR") && To_Box.getSelectedItem().equals("CAD")){
            hasil = jumlah * eurcad;
            String konversi = String.valueOf(hasil);
            JOptionPane.showMessageDialog(null, Amount_Box.getText()+" "+From_Box.getSelectedItem()+" = "+konversi+" "+To_Box.getSelectedItem());
        }
        if(From_Box.getSelectedItem().equals("EUR") && To_Box.getSelectedItem().equals("CNY")){
            hasil = jumlah * eurcny;
            String konversi = String.valueOf(hasil);
            JOptionPane.showMessageDialog(null, Amount_Box.getText()+" "+From_Box.getSelectedItem()+" = "+konversi+" "+To_Box.getSelectedItem());
        }
        
        if(From_Box.getSelectedItem().equals("GBP") && To_Box.getSelectedItem().equals("GBP")){
            hasil = jumlah * gbpgbp;
            String konversi = String.valueOf(hasil);
            JOptionPane.showMessageDialog(null, Amount_Box.getText()+" "+From_Box.getSelectedItem()+" = "+konversi+" "+To_Box.getSelectedItem());
        }
        if(From_Box.getSelectedItem().equals("GBP") && To_Box.getSelectedItem().equals("USD")){
            hasil = jumlah * gbpusd;
            String konversi = String.valueOf(hasil);
            JOptionPane.showMessageDialog(null, Amount_Box.getText()+" "+From_Box.getSelectedItem()+" = "+konversi+" "+To_Box.getSelectedItem());
        }
        if(From_Box.getSelectedItem().equals("GBP") && To_Box.getSelectedItem().equals("EUR")){
            hasil = jumlah * gbpeur;
            String konversi = String.valueOf(hasil);
            JOptionPane.showMessageDialog(null, Amount_Box.getText()+" "+From_Box.getSelectedItem()+" = "+konversi+" "+To_Box.getSelectedItem());
        }
        if(From_Box.getSelectedItem().equals("GBP") && To_Box.getSelectedItem().equals("CAD")){
            hasil = jumlah * gbpcad;
            String konversi = String.valueOf(hasil);
            JOptionPane.showMessageDialog(null, Amount_Box.getText()+" "+From_Box.getSelectedItem()+" = "+konversi+" "+To_Box.getSelectedItem());
        }
        if(From_Box.getSelectedItem().equals("GBP") && To_Box.getSelectedItem().equals("CNY")){
            hasil = jumlah * gbpcny;
            String konversi = String.valueOf(hasil);
            JOptionPane.showMessageDialog(null, Amount_Box.getText()+" "+From_Box.getSelectedItem()+" = "+konversi+" "+To_Box.getSelectedItem());
        }
        
        if(From_Box.getSelectedItem().equals("CAD") && To_Box.getSelectedItem().equals("CAD")){
            hasil = jumlah * cadcad;
            String konversi = String.valueOf(hasil);
            JOptionPane.showMessageDialog(null, Amount_Box.getText()+" "+From_Box.getSelectedItem()+" = "+konversi+" "+To_Box.getSelectedItem());
        }
        if(From_Box.getSelectedItem().equals("CAD") && To_Box.getSelectedItem().equals("USD")){
            hasil = jumlah * cadusd;
            String konversi = String.valueOf(hasil);
            JOptionPane.showMessageDialog(null, Amount_Box.getText()+" "+From_Box.getSelectedItem()+" = "+konversi+" "+To_Box.getSelectedItem());
        }
        if(From_Box.getSelectedItem().equals("CAD") && To_Box.getSelectedItem().equals("EUR")){
            hasil = jumlah * cadeur;
            String konversi = String.valueOf(hasil);
            JOptionPane.showMessageDialog(null, Amount_Box.getText()+" "+From_Box.getSelectedItem()+" = "+konversi+" "+To_Box.getSelectedItem());
        }
        if(From_Box.getSelectedItem().equals("CAD") && To_Box.getSelectedItem().equals("GBP")){
            hasil = jumlah * cadgbp;
            String konversi = String.valueOf(hasil);
            JOptionPane.showMessageDialog(null, Amount_Box.getText()+" "+From_Box.getSelectedItem()+" = "+konversi+" "+To_Box.getSelectedItem());
        }
        if(From_Box.getSelectedItem().equals("CAD") && To_Box.getSelectedItem().equals("CNY")){
            hasil = jumlah * cadcny;
            String konversi = String.valueOf(hasil);
            JOptionPane.showMessageDialog(null, Amount_Box.getText()+" "+From_Box.getSelectedItem()+" = "+konversi+" "+To_Box.getSelectedItem());
        }
        
        if(From_Box.getSelectedItem().equals("CNY") && To_Box.getSelectedItem().equals("CNY")){
            hasil = jumlah * cnycny;
            String konversi = String.valueOf(hasil);
            JOptionPane.showMessageDialog(null, Amount_Box.getText()+" "+From_Box.getSelectedItem()+" = "+konversi+" "+To_Box.getSelectedItem());
        }
        if(From_Box.getSelectedItem().equals("CNY") && To_Box.getSelectedItem().equals("USD")){
            hasil = jumlah * cnyusd;
            String konversi = String.valueOf(hasil);
            JOptionPane.showMessageDialog(null, Amount_Box.getText()+" "+From_Box.getSelectedItem()+" = "+konversi+" "+To_Box.getSelectedItem());
        }
        if(From_Box.getSelectedItem().equals("CNY") && To_Box.getSelectedItem().equals("EUR")){
            hasil = jumlah * cnyeur;
            String konversi = String.valueOf(hasil);
            JOptionPane.showMessageDialog(null, Amount_Box.getText()+" "+From_Box.getSelectedItem()+" = "+konversi+" "+To_Box.getSelectedItem());
        }
        if(From_Box.getSelectedItem().equals("CNY") && To_Box.getSelectedItem().equals("GBP")){
            hasil = jumlah * cnygbp;
            String konversi = String.valueOf(hasil);
            JOptionPane.showMessageDialog(null, Amount_Box.getText()+" "+From_Box.getSelectedItem()+" = "+konversi+" "+To_Box.getSelectedItem());
        }
        if(From_Box.getSelectedItem().equals("CNY") && To_Box.getSelectedItem().equals("CAD")){
            hasil = jumlah * cnycad;
            String konversi = String.valueOf(hasil);
            JOptionPane.showMessageDialog(null, Amount_Box.getText()+" "+From_Box.getSelectedItem()+" = "+konversi+" "+To_Box.getSelectedItem());
        }
    }
    
    @Override
    public void reset() {
        Amount_Box.setText(null);
        From_Box.setSelectedItem(0);
        To_Box.setSelectedItem(0);
    }
    
    @Override
    public void exit(){
        System.exit(0);
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
        Logo = new javax.swing.JLabel();
        Bottom_Panel = new javax.swing.JPanel();
        Copyright_Logo = new javax.swing.JLabel();
        Copyright = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        Full_Panel.setBackground(new java.awt.Color(255, 255, 255));

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

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_dollar_bitcoin_exchange_50px.png"))); // NOI18N

        Bottom_Panel.setBackground(new java.awt.Color(204, 204, 204));

        Copyright_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_copyright_16px_1.png"))); // NOI18N

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
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bottom_Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Currency)
                    .addComponent(Converter, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(207, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Currency)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Converter))
                    .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(152, 152, 152)
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
                    .addComponent(From_Box, 0, 535, Short.MAX_VALUE)
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
        double angka = 0;
        
        try{
            angka = Double.parseDouble(Amount_Box.getText());
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Please Input Amount in Numbers");
        }
        
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new currency().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Amount;
    private javax.swing.JTextField Amount_Box;
    private javax.swing.JPanel Bottom_Panel;
    private javax.swing.JButton Convert;
    private javax.swing.JLabel Converter;
    private javax.swing.JLabel Copyright;
    private javax.swing.JLabel Copyright_Logo;
    private javax.swing.JLabel Currency;
    private javax.swing.JButton Exit;
    private javax.swing.JLabel From;
    private javax.swing.JComboBox<String> From_Box;
    private javax.swing.JPanel Full_Panel;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton Reset;
    private javax.swing.JLabel To;
    private javax.swing.JComboBox<String> To_Box;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
