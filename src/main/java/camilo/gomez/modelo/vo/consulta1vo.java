package camilo.gomez.modelo.vo;
    
public class consulta1vo {
   // atributos
   public Integer ID_Lider;
   public Integer Salario;
   public String Ciudad_Residencia;

   //constructores 
   public consulta1vo(){
      
   }

   
   public consulta1vo(Integer iD_Lider, Integer salario, String ciudad_Residencia) {
      ID_Lider = iD_Lider;
      Salario = salario;
      Ciudad_Residencia = ciudad_Residencia;
   }


   //gets and sets
   public Integer getID_Lider() {
      return ID_Lider;
   }

   public void setID_Lider(Integer iD_Lider) {
      ID_Lider = iD_Lider;
   }

   public Integer getSalario() {
      return Salario;
   }

   public void setSalario(Integer salario) {
      Salario = salario;
   }

   public String getCiudad_Residencia() {
      return Ciudad_Residencia;
   }

   public void setCiudad_Residencia(String ciudad_Residencia) {
      Ciudad_Residencia = ciudad_Residencia;
   }
   @Override
   public String toString() {
       
       return ID_Lider + "     " + Salario + "     " + Ciudad_Residencia;
   }
       
   
   


}
    
