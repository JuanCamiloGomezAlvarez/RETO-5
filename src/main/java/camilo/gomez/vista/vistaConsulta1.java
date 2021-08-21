package camilo.gomez.vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.*;

import camilo.gomez.controlador.*;
import camilo.gomez.modelo.vo.consulta1vo;


public class vistaConsulta1 extends JFrame implements ActionListener {
    private JButton volver;
    private JLabel consulta;
    private JScrollPane scroll;
    private JTextArea textarea;
    static controlador controlador = new controlador();
    
    public vistaConsulta1(){

        setSize(400, 400);
		setTitle("VISTA CONSULTA UNO");
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
        
        //label
        consulta = new JLabel("Consulta 1");
        consulta.setBounds(160,10,100,10);
        add(consulta);   
        
        //area de texto
        textarea = new JTextArea();
        scroll = new JScrollPane(textarea);
        scroll.setBounds(10,50,370,200);
        add(scroll);
        textarea.setText(null); //Limpia area texto
        try {
            textarea.append("Listado de los lideres cuyo salario es superior al minimo del \nsalario de los lideres y cuya ciudad de residencia \nes Barranquilla\n \n");
            textarea.append("Me retorna Id_Lider, Salario y Ciudad_Residencia respectivamente \n \n");
            for(consulta1vo lider: controlador.resultado1()) {
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
        if(e.getSource() == volver){
            controlador.mostrarVentanaPrincipal();
            this.dispose();
            
        }

    }
}
