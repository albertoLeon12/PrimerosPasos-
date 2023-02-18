package primeros_pasos;

import java.awt.FlowLayout;
import java.awt.TextField;
import javax.swing.*;

public class PruebaInternalFrame {
    public static void main(String[] args) {
        new PruebaInternalFrame();
    }

    public PruebaInternalFrame() {
        JFrame jframe= new JFrame("Esto es un JFrame");
        JDesktopPane jDesktopPane= new JDesktopPane();
        jDesktopPane.setToolTipText("Esto es un JDesktopPane");
        jframe.getContentPane().add(jDesktopPane);
        
        JPanel jPanel= new JPanel();
        jPanel.setToolTipText("Este es un panel");
        jPanel.setLayout(new FlowLayout());
        jPanel.add(new JLabel("Esto es una etiqueta"));
        jPanel.add(new TextField(10));
        
        JInternalFrame jinternalFrame= new JInternalFrame("Esto es un JInternalFrame");
        jinternalFrame.add(jPanel);
        jinternalFrame.pack();
        jinternalFrame.setResizable(true);
        jinternalFrame.setClosable(true);
        jDesktopPane.add(jinternalFrame);
        
        jframe.setSize(500, 500);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jinternalFrame.setVisible(true);
    }
    
}











