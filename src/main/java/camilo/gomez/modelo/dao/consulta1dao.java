package camilo.gomez.modelo.dao;

//import javax.swing.JOptionPane;
import java.sql.*;
import camilo.gomez.util.JDBCutil;
import java.util.ArrayList;
import camilo.gomez.modelo.vo.*;

public class consulta1dao {
    public ArrayList<consulta1vo> consulta1() throws SQLException{
        Connection conex = JDBCutil.getConnection();
        ArrayList<consulta1vo> listado_registros_rq1 = new ArrayList<consulta1vo>();
        String sql = "SELECT ID_Lider, Salario ,Ciudad_Residencia FROM Lider l WHERE Salario > (SELECT MIN(Salario) FROM Lider l2 ) AND Ciudad_Residencia = 'Barranquilla'  ORDER BY Salario ASC;";
        try (Statement stmt = conex.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                consulta1vo requerimiento1 = new consulta1vo();
                requerimiento1.setID_Lider(rs.getInt("ID_Lider"));
                requerimiento1.setSalario(rs.getInt("Salario"));
                requerimiento1.setCiudad_Residencia(rs.getString("Ciudad_Residencia"));
                listado_registros_rq1.add(requerimiento1);
            }
        }
        return listado_registros_rq1;
    }     
}
