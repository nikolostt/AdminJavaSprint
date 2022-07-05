/**
 * @apiNote Clase Administrativo
 * @author The Darkos: Nicolás Muñoz, Cristian Maturana, Francisco Carreño, Erick Díaz
 * @version 1.0.3
 */

public class Administrativo extends Usuario {

   // ****************************** ****************************** ******************************
   /**
    * @apiNote Clase Atributos
    */
   private String area;
   private String experienciaPrevia;

   // ****************************** ****************************** ******************************
   /**
    * @apiNote Clase Constructores
    */
   public Administrativo() {
   }

   public Administrativo(String nombre, String fechaNacimiento, int RUN,
                         String area, String experienciaPrevia) {
      super(nombre, fechaNacimiento, RUN);
      this.area = area;
      this.experienciaPrevia = experienciaPrevia;
   }

   // ****************************** ****************************** ******************************
   /**
    * @apiNote Accesores y mutadores
    */
   public String getArea() {
      return area;
   }

   public void setArea(String area) {
      this.area = area;
   }

   public String getExperienciaPrevia() {
      return experienciaPrevia;
   }

   public void setExperienciaPrevia(String experienciaPrevia) {
      this.experienciaPrevia = experienciaPrevia;
   }

   // ****************************** ****************************** ******************************
   /**
    * @apiNote toString
    */
   @Override
   public String toString() {
      return "Administrativo{" +
            "area='" + area + '\'' +
            ", experienciaPrevia='" + experienciaPrevia + '\'' +
            '}';
   }

   // ****************************** ****************************** ******************************
   /**
    * @apiNote Métodos personalizados
    */
   @Override
   public void analizarUsuario() {
      super.analizarUsuario();
      System.out.println("Area: "+this.area);
      System.out.println("Experiencia previa: "+this.experienciaPrevia);
   }
}
