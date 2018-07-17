package Codigo;

import javax.swing.JFrame;

/**
 *
 * @author acxel
 */
public class Main {
    
    public static void main(String[] args) {
        
        Ventana o = new Ventana();
        
        o.setVisible(true);
        o.setResizable(false);
        o.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        o.setSize(700, 400);
        o.setTitle("Ejercicio 2");
        o.setLocationRelativeTo(null);
    }
}
