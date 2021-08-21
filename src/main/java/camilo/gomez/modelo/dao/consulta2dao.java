package camilo.gomez.modelo.dao;

import java.sql.*;
import camilo.gomez.util.JDBCutil;
import java.util.ArrayList;
import camilo.gomez.modelo.vo.*;

public class consulta2dao {
    public ArrayList<consulta2vo> consulta2() throws SQLException{
        Connection conex = JDBCutil.getConnection();
        ArrayList<consulta2vo> listado_registros_rq2 = new ArrayList<consulta2vo>();
        String sql =  "SELECT   ID_Proyecto , mc.Nombre_Material , mc.Importado FROM  Compra c JOIN MaterialConstruccion mc ON(c.ID_MaterialConstruccion= mc.ID_MaterialConstruccion) WHERE   c.ID_Proyecto IN (1,184,400) ORDER BY ID_Proyecto ASC;";
        try (Statement stmt = conex.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                consulta2vo requerimiento2 = new consulta2vo();
                requerimiento2.setID_Proyecto(rs.getInt("ID_Proyecto"));
                requerimiento2.setNombre_Material(rs.getString("Nombre_material"));
                requerimiento2.setImportado(rs.getString("Importado"));
                listado_registros_rq2.add(requerimiento2);
            }
        }
        return listado_registros_rq2;
    }   
}
