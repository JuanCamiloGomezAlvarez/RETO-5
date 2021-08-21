package camilo.gomez.modelo.dao;
import java.sql.*;
import java.text.SimpleDateFormat;

import camilo.gomez.util.JDBCutil;
import java.util.ArrayList;
import camilo.gomez.modelo.vo.*;

public class tablaLiderdao {
    SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

    public ArrayList<tablaLidervo> vistaL() throws SQLException{
        
        Connection conex = JDBCutil.getConnection();
        ArrayList<tablaLidervo> lista_lideres = new ArrayList<tablaLidervo>();
        String sql = "SELECT * FROM Lider";
        try (Statement stmt = conex.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                tablaLidervo requerimiento1 = new tablaLidervo();
                requerimiento1.setID_Lider(rs.getInt("ID_Lider"));
                requerimiento1.setNombre(rs.getString("Nombre"));
                requerimiento1.setPrimer_Apellido(rs.getString("Primer_Apellido"));
                requerimiento1.setSegundo_Apellido(rs.getString("Segundo_Apellido"));
                requerimiento1.setSalario(rs.getInt("Salario"));
                requerimiento1.setCiudad_Residencia(rs.getString("Ciudad_Residencia"));
                requerimiento1.setCargo(rs.getString("Cargo"));
                requerimiento1.setClasificacion(rs.getInt("Clasificacion"));
                requerimiento1.setDocumento_Identidad(rs.getString("Documento_Identidad"));
                requerimiento1.setFecha_Nacimiento((rs.getString("fecha_Nacimiento")));


                lista_lideres.add(requerimiento1);
            }
        }
        return lista_lideres;
    }     
}
