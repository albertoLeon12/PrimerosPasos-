import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame{
    private JPanel panel;
    public Ventana() {
        setSize(500,500);
        setTitle("TecNM Celaya");
        setLocation(100,200);
        setBounds(100,200,500,500);
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(200,200));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        conponentes();
        
    }
    public void conponentes(){
        colocarPanel();
        botones();
    }
    private void colocarPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.red);
        this.getContentPane().add(panel);
         
    }
    private void botones() {
        JButton boton =new JButton();
        boton.setText("Cambiar");
        boton.setBounds(200, 200, 100, 50);
        boton.setEnabled(true);//habilitar interaccion
        ActionListener accion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                panel.setBackground(Color.MAGENTA);
            }
        };
        panel.add(boton);
        boton.addActionListener(accion);
        
    }
}




