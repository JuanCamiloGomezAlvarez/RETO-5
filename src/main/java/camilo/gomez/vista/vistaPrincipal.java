package camilo.gomez.vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import camilo.gomez.controlador.controlador;

public class vistaPrincipal extends JFrame implements ActionListener {

    private JButton consulta1;
    private JButton consulta2;
    private JButton agregarLider;
    private JLabel titulo;
    private JLabel aviso;
    private controlador controlador;
    private JButton listalider;

    public vistaPrincipal(){

        //instancia del controlador
        controlador = new controlador();

        //JFrame
        setSize(320, 300);
		setTitle("VISTA PRINCIPAL");
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //informacion sobre la interfaz
        titulo = new JLabel("Presentacion del Reto 5 ");
        titulo.setBounds(80, 20,300,30);
        add(titulo);

        //datos desarrollador
        aviso = new JLabel("Juan Camilo Gómez Álvarez");
        aviso.setBounds(70,40,300,30);
        add(aviso);        

        //boton consulta1
        consulta1 = new JButton("consulta1");
        consulta1.setBounds(95,80,100,30);
        add(consulta1);
        consulta1.addActionListener(this);

        //boton consulta2
        consulta2 = new JButton("consulta2");
        consulta2.setBounds(95,120,100,30);
        add(consulta2);
        consulta2.addActionListener(this);

        //boton insertar lider
        agregarLider = new JButton("Insertar");
        agregarLider.setBounds(95,160,100,30);
        add(agregarLider);
        agregarLider.addActionListener(this);  
     
        //boton lista lideres
        listalider = new JButton("Lideres");
        listalider.setBounds(95,200,100,30);
        add(listalider);
        listalider.addActionListener(this); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== consulta1){
            controlador.mostrarVentanaConsulta1();
            this.dispose();

        }
        else if(e.getSource()== consulta2){
            controlador.mostrarVentanaConsulta2();
            this.dispose();
        }
        else if(e.getSource() == agregarLider){
            controlador.mostrarVentanaInsertar();
            this.dispose();
        }
        else if(e.getSource()== listalider){
            controlador.mostrarTablaLideres();
            this.dispose();
        }
        
    }
    
}
