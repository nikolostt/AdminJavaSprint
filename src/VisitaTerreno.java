/**
 * @apiNote Clase VisitaTerreno
 * @author The Darkos: Nicolás Muñoz, Cristian Maturana, Francisco Carreño, Erick Díaz
 * @version 1.0.3
 */

public class VisitaTerreno {

   // ****************************** ****************************** ******************************
   /**
    * @apiNote Atributos
    */
   private int identificadorVisita;
   private int RUTCliente;
   private String fechaVisita;
   private String hora;
   private String lugar;
   private String comentarios;

   // ****************************** ****************************** ******************************
   /**
    * @apiNote Constructores
    */
   public VisitaTerreno() {
   }

   public VisitaTerreno(int identificadorVisita, int RUTCliente, String fechaVisita, String hora, String lugar, String comentarios) {
      this.identificadorVisita = identificadorVisita;
      this.RUTCliente = RUTCliente;
      this.fechaVisita = fechaVisita;
      this.hora = hora;
      this.lugar = lugar;
      this.comentarios = comentarios;
   }

   // ****************************** ****************************** ******************************
   /**
    * @apiNote Accesores y mutadores
    */
   public int getIdentificadorVisita() {
      return identificadorVisita;
   }

   public void setIdentificadorVisita(int identificadorVisita) {
      this.identificadorVisita = identificadorVisita;
   }

   public int getRUTCliente() {
      return RUTCliente;
   }

   public void setRUTCliente(int RUTCliente) {
      this.RUTCliente = RUTCliente;
   }

   public String getFechaVisita() {
      return fechaVisita;
   }

   public void setFechaVisita(String fechaVisita) {
      this.fechaVisita = fechaVisita;
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

   public String getComentarios() {
      return comentarios;
   }

   public void setComentarios(String comentarios) {
      this.comentarios = comentarios;
   }

   // ****************************** ****************************** ******************************
   /**
    * @apiNote toString
    */
   @Override
   public String toString() {
      return "VisitaTerreno{" +
            "identificadorVisita=" + identificadorVisita +
            ", RUTCliente=" + RUTCliente +
            ", fechaVisita='" + fechaVisita + '\'' +
            ", hora='" + hora + '\'' +
            ", lugar='" + lugar + '\'' +
            ", comentarios='" + comentarios + '\'' +
            '}';
   }
}
