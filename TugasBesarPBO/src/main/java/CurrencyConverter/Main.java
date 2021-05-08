/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CurrencyConverter;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        
        currency frame = new currency();
        frame.setUsdusd(1);
        frame.setUsdeur(0.82);
        frame.setUsdgbp(0.72);
        frame.setUsdcad(1.21);
        frame.setUsdcny(6.43);
        
        frame.setEureur(1);
        frame.setEurusd(1.22);
        frame.setEurgbp(0.87);
        frame.setEurcad(1.48);
        frame.setEurcny(7.82);
        
        frame.setGbpgbp(1);
        frame.setGbpusd(1.40);
        frame.setGbpeur(1.15);
        frame.setGbpcad(1.70);
        frame.setGbpcny(8.99);
        
        frame.setCadcad(1);
        frame.setCadusd(0.82);
        frame.setCadeur(0.68);
        frame.setCadgbp(0.59);
        frame.setCadcny(5.30);
        
        frame.setCnycny(1);
        frame.setCnyusd(0.16);
        frame.setCnyeur(0.13);
        frame.setCnygbp(0.11);
        frame.setCnycad(0.19);
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(currency.EXIT_ON_CLOSE);
    }
    
}
