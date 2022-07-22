
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gerson Garayar
 */
public class Ventana extends JFrame{
    
    public JPanel panel;
    
    public Ventana(){
        
        this.setSize(500,500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Botones Java");
        this.setLocationRelativeTo(null);
        
        iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        panel = new JPanel();
        this.getContentPane().add(panel);
        
        crearBotones();
        
    }
    
    private void crearBotones(){
        JButton boton1 = new JButton("1");
        JButton boton2 = new JButton("2");
        JButton boton3 = new JButton("3");
        
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        
    }
    
    private void crearLabel(){
        JLabel label1 = new JLabel("panel1");
        JLabel label2 = new JLabel("panel2");
        JLabel label3 = new JLabel("panel3");
        
    }
    
    private void crearPaneles(){
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        
        //this.getContentPane().add(panel1);//añadir
        
        //panel1.setBounds(50, 50, 50, 50);
        panel1.setBackground(Color.red);
        
        panel.add(panel1);
    }
}
