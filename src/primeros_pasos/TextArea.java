package primeros_pasos;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class TextArea {
    public static void main(String[] args){
        JFrame f= new JFrame();
        JTextArea area= new JTextArea("Welcomw to javatpoint");
        area.setBounds(10, 30, 200, 200);
        f.add(area);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
    }
}
