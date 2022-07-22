
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
    
    //llamar componentes
    private JLabel lb1, lb2, lb3;
    private JButton btn1, btn2, btn3;
    private JPanel panel, r1, r2, r3;
    private JFrame frame;
    
    public Vent(){
        
        //instanciar componentes
        frame = new JFrame();
        
        //panel principal
        panel = new JPanel();
        frame.add(panel);
        
        //lamando metodos
        crearBotones();
        
        crearPaneles();
        
        //eventos click
        btn1.addActionListener(e -> {
            //nombre de la funcion(label a imprimir texto, que texto quieres mostrar)
            mostrarPanel(lb1, "panel 1 desde la funcion");
        });
        
        btn2.addActionListener(e -> {
            mostrarPanel(lb2, "panel 2 desde la funcion");
        });
        
        btn3.addActionListener(e -> {
            mostrarPanel(lb3, "panel 3 desde la funcion");
        });
        
        /* Configuración básica */
        frame.setTitle("Botones en Java");
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    public void crearBotones(){
        //crear botones
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        
        //añadir botones
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
    }
    
    public void crearLabel(){
        //crear label
        lb1 = new JLabel();
        lb2 = new JLabel();
        lb3 = new JLabel();

    }
    
    public void crearPaneles(){
        //llama a la funcion
        crearLabel();
        
        //crear rectangulos
        r1 = new JPanel();
        r2 = new JPanel();
        r3 = new JPanel();
        
        //agragando color
        
        r1.setBackground(new Color(220,220,220));
        r2.setBackground(new Color(220,220,220));
        r3.setBackground(new Color(220,220,220));
        
        //añadir label
        r1.add(lb1);
        r2.add(lb2);
        r3.add(lb3);
        
        //anadir rectangulos
        panel.add(r1);
        panel.add(r2);
        panel.add(r3);
    }
    
    public void mostrarPanel(JLabel label, String mensaje){
        
        String text = label.getText();
            
        if(text.isEmpty()){
            label.setText(mensaje);
        }else{
            label.setText("");
        }
            
    }
    
}
