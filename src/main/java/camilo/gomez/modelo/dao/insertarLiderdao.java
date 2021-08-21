package camilo.gomez.modelo.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import camilo.gomez.modelo.vo.insertarLidervo;
import camilo.gomez.util.JDBCutil;

public class insertarLiderdao {

    public insertarLidervo InsertarLider(int ID_Lider, String Nombre,String Primer_Apellido, String Segundo_Apellido,int Salario, String Ciudad_Residencia, String Cargo, int Clasificacion, String Documento_Identidad, java.sql.Date date) throws SQLException{

        int id_lider = ID_Lider;
        String nombre = Nombre;
        String primer_apellido = Primer_Apellido;
        String Segundo_apellido = Segundo_Apellido;
        int salario = Salario;
        String ciudad_residencia = Ciudad_Residencia;
        String cargo = Cargo;
        int clasificacion = Clasificacion;
        String documento_identidad = Documento_Identidad;
        Date fecha_nacimiento =  date;
    
        try {
            Connection conex = JDBCutil.getConnection();
            String sql = "INSERT into Lider (ID_Lider, Nombre, Primer_Apellido, Segundo_Apellido, Salario, Ciudad_Residencia, Cargo, Clasificacion, Documento_Identidad, Fecha_Nacimiento) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conex.prepareStatement(sql);
            pstmt.setInt(1, id_lider);
            pstmt.setString(2, nombre);
            pstmt.setString(3, primer_apellido);
            pstmt.setString(4, Segundo_apellido);
            pstmt.setInt(5, salario);
            pstmt.setString(6, ciudad_residencia);
            pstmt.setString(7, cargo);
            pstmt.setInt(8,clasificacion);
            pstmt.setString(9, documento_identidad);
            pstmt.setDate(10, fecha_nacimiento);

            int rows = pstmt.executeUpdate();
            if (rows > 0){
                JOptionPane.showMessageDialog(null,"lider insertado con exito");
            }

            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null; 
    }


       
}
