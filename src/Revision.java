/**
 * @apiNote Clase Revision
 * @author The Darkos: Nicolás Muñoz, Cristian Maturana, Francisco Carreño, Erick Díaz
 * @version 1.0.3
 */

public class Revision {

   // ****************************** ****************************** ******************************
   /**
    * @apiNote Atributos
    */
   private int identificadorRevision;
   private int identificadorVisita;
   private String nombreRevision;
   private String detalle;
   private int estado;

   // ****************************** ****************************** ******************************
   /**
    * @apiNote Constructores
    */
   public Revision() {
   }

   public Revision(int identificadorRevision, int identificadorVisita,
                   String nombreRevision, String detalle, int estado) {
      this.identificadorRevision = identificadorRevision;
      this.identificadorVisita = identificadorVisita;
      this.nombreRevision = nombreRevision;
      this.detalle = detalle;
      this.estado = estado;
   }

   // ****************************** ****************************** ******************************
   /**
    * @apiNote Accesores y mutadores
    */
   public int getIdentificadorRevision() {
      return identificadorRevision;
   }

   public void setIdentificadorRevision(int identificadorRevision) {
      this.identificadorRevision = identificadorRevision;
   }

   public int getIdentificadorVisita() {
      return identificadorVisita;
   }

   public void setIdentificadorVisita(int identificadorVisita) {
      this.identificadorVisita = identificadorVisita;
   }

   public String getNombreRevision() {
      return nombreRevision;
   }

   public void setNombreRevision(String nombreRevision) {
      this.nombreRevision = nombreRevision;
   }

   public String getDetalle() {
      return detalle;
   }

   public void setDetalle(String detalle) {
      this.detalle = detalle;
   }

   public int getEstado() {
      return estado;
   }

   public void setEstado(int estado) {
      this.estado = estado;
   }

   // ****************************** ****************************** ******************************
   /**
    * @apiNote toString
    */
   @Override
   public String toString() {
      return "Revision{" +
            "identificadorRevision=" + identificadorRevision +
            ", identificadorVisita=" + identificadorVisita +
            ", nombreRevision='" + nombreRevision + '\'' +
            ", detalle='" + detalle + '\'' +
            ", estado=" + estado +
            '}';
   }
}
