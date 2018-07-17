package Codigo;


import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


/**
 *
 * @author acxel
 */
public class Ventana extends JFrame {
    
    private JPanel panel;
    private JRadioButton b1, b2, b3, b4;
    private JLabel l1, imagen;
    
    public Ventana() {
        
        panel();
        rbuttons();
        labels();
    }
    
    private void panel() {
        
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }
    
    private void rbuttons() {
        
        b1 = new JRadioButton("Fútbol");
        b1.setBounds(20, 80, 100, 40);
        b1.setFont(new Font("arial rounded mt bold", 0, 18));
        panel.add(b1);
        
        b2 = new JRadioButton("Baloncesto");
        b2.setBounds(20, 140, 150, 40);
        b2.setFont(new Font("arial rounded mt bold", 0, 18));
        panel.add(b2);
        
        b3 = new JRadioButton("Tenis");
        b3.setBounds(20, 200, 150, 40);
        b3.setFont(new Font("arial rounded mt bold", 0, 18));
        panel.add(b3);
        
        b4 = new JRadioButton("Natación");
        b4.setBounds(20, 260, 130, 40);
        b4.setFont(new Font("arial rounded mt bold", 0, 18));
        panel.add(b4);
        
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(b1);
        grupo.add(b2);
        grupo.add(b3);
        grupo.add(b4);
        
        eventoAccion();
    }
    
    private void labels() {
        
        l1 = new JLabel("Escoja su deporte favorito");
        l1.setBounds(20, 10, 300, 40);
        l1.setFont(new Font("Hack", 0, 18));
        panel.add(l1);
    }

    private void eventoAccion() {
        
        //con esta forma ponemos la imagen para que en el jar no salga ningun error
        final ImageIcon imagenFutbol = new ImageIcon(getClass().getResource("/Files/futbol.jpg"));
        final ImageIcon imagenBasket = new ImageIcon(getClass().getResource("/Files/basketball.jpeg"));
        final ImageIcon imagenTennis = new ImageIcon(getClass().getResource("/Files/tennis.jpeg"));
        final ImageIcon imagenNatacion = new ImageIcon(getClass().getResource("/Files/swimming.jpeg"));
        
        imagen = new JLabel();
        imagen.setBounds(200, 80, 420, 230);
            
        panel.add(imagen);
        
        b1.addActionListener((ActionEvent e) -> {
            
            //agregamos la imagen, y la ponemos a la imagen declarada en el label
            imagen.setIcon(new ImageIcon(imagenFutbol.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
        });
        
        b2.addActionListener((ActionEvent e) -> {
            
            //agregamos la imagen, y la ponemos a la imagen declarada en el label
            imagen.setIcon(new ImageIcon(imagenBasket.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
        });
        
        b3.addActionListener((ActionEvent e) -> {
            
            //agregamos la imagen, y la ponemos a la imagen declarada en el label
            imagen.setIcon(new ImageIcon(imagenTennis.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
        });
        
        b4.addActionListener((ActionEvent e) -> {
            
            //agregamos la imagen, y la ponemos a la imagen declarada en el label
            imagen.setIcon(new ImageIcon(imagenNatacion.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
        });
    }
}
