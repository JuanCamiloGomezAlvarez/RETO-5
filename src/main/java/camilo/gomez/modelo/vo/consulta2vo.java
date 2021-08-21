package camilo.gomez.modelo.vo;

public class consulta2vo {
    //atributos
    public Integer ID_Proyecto;
    public String Nombre_Material;
    public String Importado;
    //gets and sets
    
    public Integer getID_Proyecto() {
        return ID_Proyecto;
    }
    public void setID_Proyecto(Integer iD_Proyecto) {
        ID_Proyecto = iD_Proyecto;
    }
    public String getNombre_Material() {
        return Nombre_Material;
    }
    public void setNombre_Material(String nombre_Material) {
        Nombre_Material = nombre_Material;
    }
    public String getImportado() {
        return Importado;
    }
    public void setImportado(String importado) {
        Importado = importado;
    }
    @Override
    public String toString() {
        
        return ID_Proyecto + "     " + Nombre_Material + "     " + Importado;
    }
    

}
