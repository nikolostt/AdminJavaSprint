/**
 * @apiNote Clase Usuario
 * @author The Darkos: Nicolás Muñoz, Cristian Maturana, Francisco Carreño, Erick Díaz
 * @version 1.0.3
 */

import java.time.LocalDate;
import java.time.Period;

public class Usuario implements Asesoria {

   // ****************************** ****************************** ******************************
   /**
    * @apiNote Atributos
    */
   private String nombre;
   private String fechaNacimiento;
   private int RUN;

   // ****************************** ****************************** ******************************
   /**
    * @apiNote Constructores
    */
   public Usuario() {
   }

   public Usuario(String nombre, String fechaNacimiento, int RUN) {
      this.nombre = nombre;
      this.fechaNacimiento = fechaNacimiento;
      this.RUN = RUN;
   }

   // ****************************** ****************************** ******************************
   /**
    * @apiNote Accesores y mutadores
    */
   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public String getFechaNacimiento() {
      return fechaNacimiento;
   }

   public void setFechaNacimiento(String fechaNacimiento) {
      this.fechaNacimiento = fechaNacimiento;
   }

   public int getRUN() {
      return RUN;
   }

   public void setRUN(int RUN) {
      this.RUN = RUN;
   }

   // ****************************** ****************************** ******************************
   /**
    * @apiNote toString
    */
   @Override
   public String toString() {
      return "Usuario{" +
            "nombre='" + nombre + '\'' +
            ", fechaNacimiento='" + fechaNacimiento + '\'' +
            ", RUN=" + RUN +
            '}';
   }

   // ****************************** ****************************** ******************************
   /**
    * @apiNote Métodos personalizados
    */
   public int edad(String fechaNacimiento) {
      int dia = Integer.parseInt(fechaNacimiento.substring(0, 2));
      int mes = Integer.parseInt(fechaNacimiento.substring(3, 5));
      int anio = Integer.parseInt(fechaNacimiento.substring(6, 10));
      Period edad = Period.between(LocalDate.of(anio, mes, dia), LocalDate.now());
      return edad.getYears();
   }

   public void  mostrarEdad() {
      System.out.println("El usuario tiene "+this.edad(this.fechaNacimiento));
   }

   @Override
   public void analizarUsuario() {
      System.out.println("Tipo de usuario: "+this.getClass().getName());
      System.out.println("---------------------------------------- ----------------------------------------");
      System.out.println("Nombre de usuario: "+this.nombre);
      System.out.println("RUN: "+this.RUN);
      System.out.println("Fecha de nacimiento: "+this.fechaNacimiento);
   }

   @Override
   public String tipoUsuario() {
      return this.getClass().getName();
   }

   @Override
   public void datosUsuario() {
      System.out.println("Tipo de usuario: "+this.getClass().getName());
      System.out.println("---------------------------------------- ----------------------------------------");
      System.out.println("Nombre de usuario: "+this.nombre);
      System.out.println("RUN: "+this.RUN);
      System.out.println("Fecha de nacimiento: "+this.fechaNacimiento);
   }
}
