package primeros_pasos;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
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
        agregarMenu();
    }
    
    public void conponentes(){
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.RED);
        this.getContentPane().add(panel);
        JLabel etiqueta = new JLabel();
        etiqueta.setText("Hola ya iniciamos nuestro curso de Topicos de Programacion");
        etiqueta.setBounds(100, 100, 400, 300);
        panel.add(etiqueta);
        
    }
    public void agregarMenu() {
        JMenuBar barra= new JMenuBar();
        JMenu archivo= new JMenu("Archivo");
        JMenu ayuda= new JMenu("Ayuda");
        JMenuItem salir= new JMenuItem("Salir");
        JMenuItem abrir= new JMenuItem("Abrir");
        JMenuItem guardar= new JMenuItem("Guardar");
        JMenuItem acercaDe= new JMenuItem("Acerca de");
        barra.add(archivo);
        barra.add(ayuda);
        archivo.add(salir);
        archivo.add(abrir);
        archivo.add(guardar);
        ayuda.add(acercaDe);
        setJMenuBar(barra);
        
        
        
    }
    
}




