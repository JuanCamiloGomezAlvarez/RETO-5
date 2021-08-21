package camilo.gomez.vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.SQLException;
import javax.swing.*;
import camilo.gomez.controlador.*;
import camilo.gomez.modelo.dao.insertarLiderdao;



public class vistaInsertar extends JFrame implements ActionListener {
    private JLabel lidlider, lnombre, lprimerapellido,lsegundoapellido,lsalario,lciudadresidencia, lcargo, lclasificacion, ldocumentoidentidad,lfechanacimiento;
    private JTextField tidlider, tnombre, tprimerapellido,tsegundoapellido,tsalario,tciudadresidencia, tcargo, tclasificacion, tdocumentoidentidad,tfechanacimiento;
    private JButton volver, insertar;
    static controlador controlador = new controlador();
    static insertarLiderdao insertarliderdao = new insertarLiderdao();
    

    public vistaInsertar(){

        setSize(300, 450);
		setTitle("VISTA INSERTAR");
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //labels
        lidlider = new JLabel("ID_Lider");
        lidlider.setBounds(30,30,100,30);
        add(lidlider);

        lnombre = new JLabel("Nombre");
        lnombre.setBounds(30,60,100,30);
        add(lnombre); 
        
        lprimerapellido = new JLabel("Primer Apellido");
        lprimerapellido.setBounds(30,90,100,30);
        add(lprimerapellido);

        lsegundoapellido = new JLabel("Segundo Apellido");
        lsegundoapellido.setBounds(30,120,100,30);
        add(lsegundoapellido);

        lsalario = new JLabel("Salario");
        lsalario.setBounds(30,150,100,30);
        add(lsalario);   

        lciudadresidencia = new JLabel("Residencia");
        lciudadresidencia.setBounds(30,180,100,30);
        add(lciudadresidencia);
        
        lcargo = new JLabel("Cargo");
        lcargo.setBounds(30,210,100,30);
        add(lcargo);

        lclasificacion = new JLabel("Clasificación");
        lclasificacion.setBounds(30,240,100,30);
        add(lclasificacion);

        ldocumentoidentidad = new JLabel("Doc identidad");
        ldocumentoidentidad.setBounds(30,270,100,30);
        add(ldocumentoidentidad);

        lfechanacimiento = new JLabel("Fecha nacimiento");
        lfechanacimiento.setBounds(30,300,100,30);
        add(lfechanacimiento);

        // textField
        tidlider = new JTextField("");
        tidlider.setBounds(140,30,100,30);
        add(tidlider);

        tnombre = new JTextField("");
        tnombre.setBounds(140,60,100,30);
        add(tnombre); 
        
        tprimerapellido = new JTextField("");
        tprimerapellido.setBounds(140,90,100,30);
        add(tprimerapellido);

        tsegundoapellido = new JTextField("");
        tsegundoapellido.setBounds(140,120,100,30);
        add(tsegundoapellido);

        tsalario = new JTextField("");
        tsalario.setBounds(140,150,100,30);
        add(tsalario);   

        tciudadresidencia = new JTextField("");
        tciudadresidencia.setBounds(140,180,100,30);
        add(tciudadresidencia);
        
        tcargo = new JTextField("");
        tcargo.setBounds(140,210,100,30);
        add(tcargo);

        tclasificacion = new JTextField("");
        tclasificacion.setBounds(140,240,100,30);
        add(tclasificacion);

        tdocumentoidentidad = new JTextField("");
        tdocumentoidentidad.setBounds(140,270,100,30);
        add(tdocumentoidentidad);

        tfechanacimiento = new JTextField("");
        tfechanacimiento.setBounds(140,300,100,30);
        add(tfechanacimiento);
        

        //botones

        volver = new JButton("Volver");
        volver.setBounds(30,340,100,30);
        add(volver);
        volver.addActionListener(this);

        insertar = new JButton("Insertar");
        insertar.setBounds(140,340,100,30);
        add(insertar);
        insertar.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == volver){
            controlador.mostrarVentanaPrincipal();
            this.dispose();
        }
        else if(e.getSource() == insertar){
            
                try {
                    insertarliderdao.InsertarLider(Integer.parseInt(tidlider.getText()),tnombre.getText(),tprimerapellido.getText(),tsegundoapellido.getText(),Integer.parseInt(tsalario.getText()),tciudadresidencia.getText(),tcargo.getText(),Integer.parseInt(tclasificacion.getText()),tdocumentoidentidad.getText(),Date.valueOf(tfechanacimiento.getText()));
                } catch (NumberFormatException | SQLException  e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }

        }

    }
}
