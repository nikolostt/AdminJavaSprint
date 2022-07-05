/**
 * @apiNote Clase Accidente
 * @author The Darkos: Nicolás Muñoz, Cristian Maturana, Francisco Carreño, Erick Díaz
 * @version 1.0.3
 */

public class Accidente {

   // ****************************** ****************************** ******************************
   /**
    * @apiNote Atributos
    */
   private int identificadorAccidente;
   private int RUTCliente;
   private String fechaAccidente;
   private String hora;
   private String lugar;
   private String origen;
   private String consecuencias;

   // ****************************** ****************************** ******************************
   /**
    * @apiNote Constructores
    */
   public Accidente() {
   }

   public Accidente(int identificadorAccidente, int RUTCliente, String fechaAccidente,
                    String hora, String lugar, String origen, String consecuencias) {
      this.identificadorAccidente = identificadorAccidente;
      this.RUTCliente = RUTCliente;
      this.fechaAccidente = fechaAccidente;
      this.hora = hora;
      this.lugar = lugar;
      this.origen = origen;
      this.consecuencias = consecuencias;
   }

   // ****************************** ****************************** ******************************
   /**
    * @apiNote Accesores y mutadores
    */
   public int getIdentificadorAccidente() {
      return identificadorAccidente;
   }

   public void setIdentificadorAccidente(int identificadorAccidente) {
      this.identificadorAccidente = identificadorAccidente;
   }

   public int getRUTCliente() {
      return RUTCliente;
   }

   public void setRUTCliente(int RUTCliente) {
      this.RUTCliente = RUTCliente;
   }

   public String getFechaAccidente() {
      return fechaAccidente;
   }

   public void setFechaAccidente(String fechaAccidente) {
      this.fechaAccidente = fechaAccidente;
   }

   public String getHora() {
      return hora;
   }

   public void setHora(String hora) {
      this.hora = hora;
   }

   public String getLugar() {
      return lugar;
   }

   public void setLugar(String lugar) {
      this.lugar = lugar;
   }

   public String getOrigen() {
      return origen;
   }

   public void setOrigen(String origen) {
      this.origen = origen;
   }

   public String getConsecuencias() {
      return consecuencias;
   }

   public void setConsecuencias(String consecuencias) {
      this.consecuencias = consecuencias;
   }

   // ****************************** ****************************** ******************************
   /**
    * @apiNote toString
    */
   @Override
   public String toString() {
      return "Accidente{" +
            "identificadorAccidente=" + identificadorAccidente +
            ", RUTCliente=" + RUTCliente +
            ", fechaAccidente='" + fechaAccidente + '\'' +
            ", hora='" + hora + '\'' +
            ", lugar='" + lugar + '\'' +
            ", origen='" + origen + '\'' +
            ", consecuencias='" + consecuencias + '\'' +
            '}';
   }
}
