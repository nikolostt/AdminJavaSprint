/**
 * @apiNote Clase Profesional
 * @author The Darkos: Nicolás Muñoz, Cristian Maturana, Francisco Carreño, Erick Díaz
 * @version 1.0.3
 */

public class Profesional extends Usuario {

   // ****************************** ****************************** ******************************
   /**
    * @apiNote Atributos
    */
   private String titulo;
   private String fechaIngreso;

   // ****************************** ****************************** ******************************
   /**
    * @apiNote Constructores
    */
   public Profesional() {
   }

   public Profesional(String nombre, String fechaNacimiento, int RUN,
                      String titulo, String fechaIngreso) {
      super(nombre, fechaNacimiento, RUN);
      this.titulo = titulo;
      this.fechaIngreso = fechaIngreso;
   }

   // ****************************** ****************************** ******************************
   /**
    * @apiNote Accesores y mutadores
    */
   public String getTitulo() {
      return titulo;
   }

   public void setTitulo(String titulo) {
      this.titulo = titulo;
   }

   public String getFechaIngreso() {
      return fechaIngreso;
   }

   public void setFechaIngreso(String fechaIngreso) {
      this.fechaIngreso = fechaIngreso;
   }

   // ****************************** ****************************** ******************************
   /**
    * @apiNote toString
    */
   @Override
   public String toString() {
      return "Profesional{" +
            "titulo='" + titulo + '\'' +
            ", fechaIngreso='" + fechaIngreso + '\'' +
            '}';
   }

   // ****************************** ****************************** ******************************
   /**
    * @apiNote Métodos personalizados
    */
   @Override
   public void analizarUsuario() {
      super.analizarUsuario();
      System.out.println("Titulo: "+this.titulo);
      System.out.println("Fecha de ingreso: "+this.fechaIngreso);
   }
}
