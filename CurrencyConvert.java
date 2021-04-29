package Tugas;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class CurrencyConvert {
    public static void main(String []args)
    {
        JFrame frame = new JFrame();
        frame.setTitle("Convert Currency ");
        frame.setBounds(0,0,10000,10000);
        JLabel label = new JLabel("Convert Currency");
        label.setBounds(650,10,100,100);
        frame.add(label);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
