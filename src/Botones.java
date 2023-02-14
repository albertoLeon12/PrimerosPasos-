
import javax.swing.JButton;
import javax.swing.JFrame;

public class Botones {
    public static void main(String[] args){
        JFrame f= new JFrame("Boton Ejemplo");
        JButton b= new JButton("Dale Clic");
        b.setBounds(50, 100, 95, 30);
        f.add(b);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
