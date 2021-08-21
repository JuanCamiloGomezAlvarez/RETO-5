package camilo.gomez.vista;

import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.*;

import camilo.gomez.controlador.*;
import camilo.gomez.modelo.vo.consulta2vo;

public class vistaConsulta2 extends JFrame implements ActionListener {
    private JButton volver;
    private JLabel consulta;
    private JScrollPane scroll;
    private JTextArea textarea;
    static controlador controlador = new controlador();
   


    

    public vistaConsulta2(){

        setSize(400, 400);
		setTitle("VISTA CONSULTA DOS");
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
        
        //label
        consulta = new JLabel("Consulta 2");
        consulta.setBounds(160,10,100,10);
        add(consulta);   
        
        //area de texto
        textarea = new JTextArea();
        scroll = new JScrollPane(textarea);
        scroll.setBounds(10,50,370,200);
        add(scroll);
        textarea.setText(null); //Limpia area texto
        try {
            textarea.append("listado de materiales utilizados y si son importados, para los \nproyectos con ID 1, 184, 400, ordenados de forma \nascendente por el ID del proyecto \n \n");
            textarea.append("Me retorna ID_Proyecto, Nombre_Material e Importado respectivamente \n \n");
            for(consulta2vo lider: controlador.resultado2()) {
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
