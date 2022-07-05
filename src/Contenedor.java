/**
 * @apiNote Clase Contenedor
 * @author The Darkos: Nicolás Muñoz, Cristian Maturana, Francisco Carreño, Erick Díaz
 * @version 1.0.3
 */

import java.util.ArrayList;
import java.util.List;

public class Contenedor {

   // ****************************** ****************************** ******************************
   /**
    * @apiNote Atributos
    */
   public List<Asesoria> usuarios = new ArrayList<Asesoria>();
   public List<Capacitacion> capacitaciones = new ArrayList<Capacitacion>();

   // ****************************** ****************************** ******************************
   /**
    * @apiNote Métodos personalizados
    */
   public void almacenarCliente(Asesoria cliente) {
      this.usuarios.add(cliente);
   }

   public void almacenarProfesional(Asesoria profesional) {
      this.usuarios.add(profesional);
   }

   public void almacenarAdministrativo(Asesoria administrativo) {
      this.usuarios.add(administrativo);
   }

   public void almacenarCapacitacion(Capacitacion capacitacion) {
      this.capacitaciones.add(capacitacion);
   }

   public boolean esRUNregistrado(int RUN) {
      boolean esRUNregistrado = false;
      for (int i = 0; i < this.usuarios.size(); i++) {
         if (RUN == this.usuarios.get(i).getRUN()) esRUNregistrado = true;
      }
      return esRUNregistrado;
   }

   public boolean existeTipoUsuario(String tipoUsuario) {
      boolean existeTipoUsuario = false;
      for (int i = 0; i < this.usuarios.size(); i++) {
         if (this.usuarios.get(i).tipoUsuario().equals(tipoUsuario)) existeTipoUsuario = true;
      }
      return existeTipoUsuario;
   }

   public String clasificacionUsuario(int RUN) {
      String clasificacionUsuario = "";
      for (int i = 0; i < this.usuarios.size(); i++) {
         if (RUN == this.usuarios.get(i).getRUN())
            clasificacionUsuario = this.usuarios.get(i).tipoUsuario();
      }
      return clasificacionUsuario;
   }

   public void eliminarUsuario(int RUN) {
      int i = 0;
      do {
         if (RUN == this.usuarios.get(i).getRUN()) this.usuarios.remove(i);
         else i++;
      } while (i < this.usuarios.size());
   }

   public void listarUsuarios() {
      System.out.println("LISTADO COMPLETO DE USUARIOS");
      for (int i = 0; i < this.usuarios.size(); i++) {
         System.out.println("======================================== ========================================");
         this.usuarios.get(i).datosUsuario();
      }
   }

   public void listarUsuariosPorTipo(String tipoUsuario) {
      System.out.println("LISTADO DE USUARIOS TIPO "+tipoUsuario.toUpperCase());
      for (int i = 0; i < this.usuarios.size(); i++) {
         if (tipoUsuario.equals(this.usuarios.get(i).tipoUsuario())) {
            System.out.println("======================================== ========================================");
            this.usuarios.get(i).analizarUsuario();
         }
      }
   }

   public void listarCapacitaciones() {
      System.out.println("LISTADO DE CAPACITACIONES Y SUS CLIENTES");
      for (int i = 0; i < this.capacitaciones.size(); i++) {
         System.out.println("======================================== ========================================");
         this.capacitaciones.get(i).datosCapacitacion();
         datosPorRUN(this.capacitaciones.get(i).getRUTCliente());
      }
   }

   public void datosPorRUN(int RUN) {
      for (int i = 0; i < this.usuarios.size(); i++) {
         if (RUN == this.usuarios.get(i).getRUN()) this.usuarios.get(i).analizarUsuario();
      }
   }
}
