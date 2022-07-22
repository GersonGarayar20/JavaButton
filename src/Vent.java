
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gerson Garayar
 */
public class Vent {
    
    private JLabel lb1, lb2, lb3;
    private JButton btn1, btn2, btn3;
    private JPanel panel, r1, r2, r3;
    private JFrame frame;
    
    public Vent(){
        
        frame = new JFrame();
        panel = new JPanel();
        frame.add(panel);
        
        //crear botones
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        
        //añadir botones
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        
        //crear label
        lb1 = new JLabel("");
        lb2 = new JLabel();
        lb3 = new JLabel();
        
        //crear rectangulos
        r1 = new JPanel();
        r2 = new JPanel();
        r3 = new JPanel();
        
        //agragando color
        r1.setBackground(Color.red);
        r2.setBackground(Color.green);
        r3.setBackground(Color.blue);
        
        //añadir texto
        r1.add(lb1);
        r2.add(lb2);
        r3.add(lb3);
        
        //anadir rectangulos
        panel.add(r1);
        panel.add(r2);
        panel.add(r3);
        
        //evento click
        btn1.addActionListener(e -> {
            
            String text = lb1.getText();
            
            if(text.isEmpty()){
                lb1.setText("panel 1");
            }else{
                lb1.setText("");
            }
            
        });
        
        btn2.addActionListener(e -> {
            
            String text = lb2.getText();
            
            if(text.isEmpty()){
                lb2.setText("panel 2");
            }else{
                lb2.setText("");
            }
            
        });
        
        btn3.addActionListener(e -> {
            
            String text = lb3.getText();
            
            if(text.isEmpty()){
                lb3.setText("panel 3");
            }else{
                lb3.setText("");
            }
            
        });
        
        
        /* Configuración básica */
        frame.setTitle("Botones en Java");
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    
    
}
