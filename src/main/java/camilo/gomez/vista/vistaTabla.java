package camilo.gomez.vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import camilo.gomez.controlador.*;
import camilo.gomez.modelo.vo.tablaLidervo;

public class vistaTabla extends JFrame implements ActionListener{

    private JButton volver;
    private JLabel lista;
    private JScrollPane scroll;
    private JTextArea textarea;
    static controlador controlador = new controlador();

    public vistaTabla(){
        setSize(400, 400);
		setTitle("VISTA TABLA LIDERES");
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE); 

        //label 
        lista = new JLabel("lista lideres");
        lista.setBounds(160,10,100,10);
        add(lista);
     
        //area de texto
        textarea = new JTextArea();
        scroll = new JScrollPane(textarea);
        scroll.setBounds(10,50,370,200);
        add(scroll);
        textarea.setText(null); //Limpia area texto
        try {
            textarea.append("TABLA LIDERES\n \n");
            textarea.append("\n");
            for(tablaLidervo lider: controlador.resultado3()) {
                textarea.append(lider + "\n");
            }
        } catch (SQLException e1) {
            e1.printStackTrace();
        }  
        
        //boton volver
        volver = new JButton("volver");
        volver.setBounds(145,255,100,30);
        add(volver);
        volver.addActionListener(this);

    }




    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== volver){
            controlador.mostrarVentanaPrincipal();
            this.dispose();
        }
    }
    
}
