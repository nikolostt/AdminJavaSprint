/**
 * @apiNote Clase Capacitación
 * @author The Darkos: Nicolás Muñoz, Cristian Maturana, Francisco Carreño, Erick Díaz
 * @version 1.0.3
 */

public class Capacitacion {

   // ****************************** ****************************** ******************************
   /**
    * @apiNote Atributos
    */
   private int identificador;
   private int RUTCliente;
   private String diaSemana;
   private String hora;
   private String lugar;
   private String duracion;
   private int cantidadAsistentes;

   // ****************************** ****************************** ******************************
   /**
    * @apiNote Constructores
    */
   public Capacitacion() {
   }

   public Capacitacion(int identificador, int RUTCliente, String diaSemana, String hora,
                       String lugar, String duracion, int cantidadAsistentes) {
      this.identificador = identificador;
      this.RUTCliente = RUTCliente;
      this.diaSemana = diaSemana;
      this.hora = hora;
      this.lugar = lugar;
      this.duracion = duracion;
      this.cantidadAsistentes = cantidadAsistentes;
   }

   // ****************************** ****************************** ******************************
   /**
    * @apiNote Accesores y mutadores
    */
   public int getIdentificador() {
      return identificador;
   }

   public void setIdentificador(int identificador) {
      this.identificador = identificador;
   }

   public int getRUTCliente() {
      return RUTCliente;
   }

   public void setRUTCliente(int RUTCliente) {
      this.RUTCliente = RUTCliente;
   }

   public String getDiaSemana() {
      return diaSemana;
   }

   public void setDiaSemana(String diaSemana) {
      this.diaSemana = diaSemana;
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

   public String getDuracion() {
      return duracion;
   }

   public void setDuracion(String duracion) {
      this.duracion = duracion;
   }

   public int getCantidadAsistentes() {
      return cantidadAsistentes;
   }

   public void setCantidadAsistentes(int cantidadAsistentes) {
      this.cantidadAsistentes = cantidadAsistentes;
   }

   // ****************************** ****************************** ******************************
   /**
    * @apiNote toString
    */
   @Override
   public String toString() {
      return "Capacitacion{" +
            "identificador=" + identificador +
            ", RUTCliente=" + RUTCliente +
            ", diaSemana='" + diaSemana + '\'' +
            ", hora='" + hora + '\'' +
            ", lugar='" + lugar + '\'' +
            ", duracion='" + duracion + '\'' +
            ", cantidadAsistentes=" + cantidadAsistentes +
            '}';
   }

   // ****************************** ****************************** ******************************
   /**
    * @apiNote Métodos personalizados
    */
   public void mostrarDetalle() {
      System.out.println("La capacitacion sera en "+this.lugar+" a las "+this.hora+
            " del dia "+this.diaSemana+" y durara "+this.duracion+".");
   }

   public void datosCapacitacion () {
      System.out.println("Identificador: "+this.identificador);
      System.out.println("------------------------------ ------------------------------");
      System.out.println("RUT del cliente: "+this.RUTCliente);
      System.out.println("Dia: "+this.diaSemana);
      System.out.println("Hora: "+this.hora);
      System.out.println("Lugar: "+this.lugar);
      System.out.println("Duracion: "+this.duracion);
      System.out.println("Cantidad de asistentes: "+this.cantidadAsistentes);
   }
}
