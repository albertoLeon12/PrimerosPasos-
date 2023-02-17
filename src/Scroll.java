
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Scroll {
    private static final long serialVersionUID=1L;
    
    private static void createAndShowUGUI() {
        JFrame frame= new JFrame("Ejemplo de panel de desplazamiento"); 
        
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.getContentPane().setLayout(new FlowLayout());
        
        JTextArea textArea= new JTextArea(20,20);
        JScrollPane scrollableTextArea= new JScrollPane(textArea);
        scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        frame.getContentPane().add(scrollableTextArea);
        
    }
    public static void main(String[] args){
         javax.swing.SwingUtilities.invokeLater(new Runnable(){
             @Override
             public void run() {
                createAndShowUGUI();
             }
         });
        }
}
