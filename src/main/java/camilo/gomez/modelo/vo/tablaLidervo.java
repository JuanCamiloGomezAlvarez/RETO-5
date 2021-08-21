package camilo.gomez.modelo.vo;

public class tablaLidervo {
    //atributos
    public int ID_Lider;
    public String Nombre;
    public String Primer_Apellido;
    public String Segundo_Apellido;
    public int Salario;
    public String Ciudad_Residencia;
    public String Cargo;
    public int Clasificacion;
    public String Documento_Identidad;
    public String Fecha_Nacimiento;

    public tablaLidervo(){
        
    }

    public int getID_Lider() {
        return ID_Lider;
    }
    public void setID_Lider(int iD_Lider) {
        ID_Lider = iD_Lider;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getPrimer_Apellido() {
        return Primer_Apellido;
    }
    public void setPrimer_Apellido(String primer_Apellido) {
        Primer_Apellido = primer_Apellido;
    }
    public String getSegundo_Apellido() {
        return Segundo_Apellido;
    }
    public void setSegundo_Apellido(String segundo_Apellido) {
        Segundo_Apellido = segundo_Apellido;
    }
    public int getSalario() {
        return Salario;
    }
    public void setSalario(int salario) {
        Salario = salario;
    }
    public String getCiudad_Residencia() {
        return Ciudad_Residencia;
    }
    public void setCiudad_Residencia(String ciudad_Residencia) {
        Ciudad_Residencia = ciudad_Residencia;
    }
    public String getCargo() {
        return Cargo;
    }
    public void setCargo(String cargo) {
        Cargo = cargo;
    }
    public int getClasificacion() {
        return Clasificacion;
    }
    public void setClasificacion(int clasificacion) {
        Clasificacion = clasificacion;
    }
    public String getDocumento_Identidad() {
        return Documento_Identidad;
    }
    public void setDocumento_Identidad(String documento_Identidad) {
        Documento_Identidad = documento_Identidad;
    }

    public String getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }
    public void setFecha_Nacimiento(String fecha_Nacimiento) {
        Fecha_Nacimiento = fecha_Nacimiento;
    }


    @Override
    public String toString() {
        return  ID_Lider+ "   " +Nombre+ "   " + Primer_Apellido  + "   "
                +Segundo_Apellido + "   " + Salario + "   "
                + Ciudad_Residencia + "   " + Cargo  + "   " + Clasificacion + "   "
                + Documento_Identidad  + "   " +  Fecha_Nacimiento ;
    }



    
}
