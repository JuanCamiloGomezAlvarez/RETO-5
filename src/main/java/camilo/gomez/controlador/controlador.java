package camilo.gomez.controlador;

import camilo.gomez.modelo.dao.*;
import camilo.gomez.modelo.vo.*;
import java.util.ArrayList;
import java.sql.SQLException;
import camilo.gomez.vista.*;

public class controlador {
    private consulta1dao consulta1;
    private consulta2dao consulta2;
    //private insertarLiderdao insertarlider;
    private tablaLiderdao tablalideres;
    
    //constructor
    public controlador(){
        this.consulta1 = new consulta1dao();
        this.consulta2 = new consulta2dao();
        this.tablalideres = new tablaLiderdao();
        //this.insertarlider = new insertarLiderdao();
    }

    //metodo resultado uno
    public ArrayList<consulta1vo> resultado1() throws SQLException {
        return this.consulta1.consulta1();
    }
    //metodo resultado dos
    public ArrayList<consulta2vo> resultado2() throws SQLException {
        return this.consulta2.consulta2();
    }
    //metodo mostrar tabla lider
    public ArrayList<tablaLidervo> resultado3() throws SQLException {
        return this.tablalideres.vistaL();
    }

    // INTERFACE GRAFICAS
    //Ventana principal
    public void mostrarVentanaPrincipal() {
        vistaPrincipal vPrincipal = new vistaPrincipal();
        vPrincipal.setVisible(true);
    }
    //ventana consulta uno
    public void mostrarVentanaConsulta1() {
        vistaConsulta1 vconsulta1 = new vistaConsulta1();
        vconsulta1.setVisible(true);
    }
    //ventana consulta dos 
    public void mostrarVentanaConsulta2() {
        vistaConsulta2 vconsulta2 = new vistaConsulta2();
        vconsulta2.setVisible(true);
    } 
    //ventana insertar 
    public void mostrarVentanaInsertar() {
        vistaInsertar vinsertar = new vistaInsertar();
        vinsertar.setVisible(true);
    }         
    //ventana lista tablas 
    public void mostrarTablaLideres() {
        vistaTabla vtabla = new vistaTabla();
        vtabla.setVisible(true);
    }      
}
