import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

/**
 * @apiNote Clase Main
 * @author The Darkos: Nicolás Muñoz, Cristian Maturana, Francisco Carreño, Erick Díaz
 * @version 1.0.3
 */

public class Main {

   public static void main(String[] args) {

      /**
       * @apiNote Variables generales
       */
      Scanner ingreso = new Scanner(System.in);
      String registro;
      Validar validar = new Validar();
      Contenedor contenedor = new Contenedor();
      int numeroMenu;
      int perfilMenu;
      int idCapacitacion = 1000;
      int idVisitaTerreno = 2000;
      int idRevision = 3000;

      /**
       * @apiNote Menu principal
       */
      do {
         System.out.println("**************************************** ****************************************");
         System.out.println("**** A S E S O R I A S    E N    P R E V E N C I O N    D E    R I E S G O S ****");
         System.out.println("**************************************** ****************************************");
         System.out.println("Ingrese el numero de la opcion que desea realizar:");
         System.out.println("(1) Almacenar cliente");
         System.out.println("(2) Almacenar profesional");
         System.out.println("(3) Almacenar administrativo");
         System.out.println("(4) Almacenar capacitacion");
         System.out.println("(5) Eliminar usuario");
         System.out.println("(6) Listar usuarios");
         System.out.println("(7) Listar usuarios por tipo");
         System.out.println("(8) Listar capacitaciones");
         System.out.println("(9) Salir");

         registro = ingreso.nextLine();
         while (!validar.esNumeroRangoValido(registro, 1, 9)) {
            System.out.println("Ingrese correctamente el numero de la opcion:");
            registro = ingreso.nextLine();
         }
         numeroMenu = Integer.parseInt(registro);

         /**
          * @apiNote Opciones del menu
          */
         if (numeroMenu == 1) {

            System.out.println("**************************************** ****************************************");
            Cliente cliente = new Cliente();
            VisitaTerreno visitaTerreno = new VisitaTerreno();
            Revision revision = new Revision();

            System.out.println("Ingrese el nombre de usuario del cliente (minimo 10 y maximo 50 caracteres):");
            registro = ingreso.nextLine();
            while (!validar.esTextoRangoValido(registro, 10, 50)) {
               System.out.println("Ingreso no valido, intente nuevamente:");
               registro = ingreso.nextLine();
            }
            cliente.setNombre(registro);

            System.out.println("Ingrese la fecha de nacimiento del cliente (dd/mm/aaaa):");
            registro = ingreso.nextLine();
            while (!validar.esFechaValida(registro)) {
               System.out.println("Ingreso no valido, intente nuevamente:");
               registro = ingreso.nextLine();
            }
            cliente.setFechaNacimiento(registro);

            System.out.println("Ingrese el RUN del cliente sin puntos, guion, ni digito verificador:");
            registro = ingreso.nextLine();
            while (!validar.esNumeroRangoValido(registro, 1000000, 99999999)) {
               System.out.println("Ingreso no valido, intente nuevamente:");
               registro = ingreso.nextLine();
            }
            cliente.setRUN(Integer.parseInt(registro));

            cliente.setRUT(cliente.getRUN());

            visitaTerreno.setRUTCliente(cliente.getRUN());

            System.out.println("Ingrese los nombres del cliente (minimo 5 y maximo 30 caracteres):");
            registro = ingreso.nextLine();
            while (!validar.esTextoRangoValido(registro, 5, 30)) {
               System.out.println("Ingreso no valido, intente nuevamente:");
               registro = ingreso.nextLine();
            }
            cliente.setNombres(registro);

            System.out.println("Ingrese los apellidos del cliente (minimo 5 y maximo 30 caracteres):");
            registro = ingreso.nextLine();
            while (!validar.esTextoRangoValido(registro, 5, 30)) {
               System.out.println("Ingreso no valido, intente nuevamente:");
               registro = ingreso.nextLine();
            }
            cliente.setApellidos(registro);

            System.out.println("Ingrese el telefono del cliente (9xxxxxxxx):");
            registro = ingreso.nextLine();
            while (!validar.esNumeroRangoValido(registro, 900000000, 999999999)) {
               System.out.println("Ingreso no valido, intente nuevamente:");
               registro = ingreso.nextLine();
            }
            cliente.setTelefono(Integer.parseInt(registro));

            System.out.println("Ingrese la AFP del cliente (minimo 4 y maximo 30 caracteres):");
            registro = ingreso.nextLine();
            while (!validar.esTextoRangoValido(registro, 4, 30)) {
               System.out.println("Ingreso no valido, intente nuevamente:");
               registro = ingreso.nextLine();
            }
            cliente.setAFP(registro);

            System.out.println("Ingrese el sistema de salud del cliente (1: Fonasa) (2: Isapre):");
            registro = ingreso.nextLine();
            while (!validar.esNumeroRangoValido(registro, 1, 2)) {
               System.out.println("Ingreso no valido, intente nuevamente:");
               registro = ingreso.nextLine();
            }
            cliente.setSistemaSalud(Integer.parseInt(registro));

            System.out.println("Ingrese la direccion del cliente (maximo 70 caracteres):");
            registro = ingreso.nextLine();
            while (!validar.esTextoRangoValido(registro, 0, 70)) {
               System.out.println("Ingreso no valido, intente nuevamente:");
               registro = ingreso.nextLine();
            }
            cliente.setDireccion(registro);

            System.out.println("Ingrese la comuna del cliente (maximo 50 caracteres):");
            registro = ingreso.nextLine();
            while (!validar.esTextoRangoValido(registro, 0, 50)) {
               System.out.println("Ingreso no valido, intente nuevamente:");
               registro = ingreso.nextLine();
            }
            cliente.setComuna(registro);

            cliente.setEdad(cliente.edad(cliente.getFechaNacimiento()));

            // Ingreso de datos de la visita a terreno:

            idVisitaTerreno++;
            visitaTerreno.setIdentificadorVisita(idVisitaTerreno);

            revision.setIdentificadorVisita(visitaTerreno.getIdentificadorVisita());

            System.out.println("Ingrese la fecha de la visita a terreno (dd/mm/aaaa):");
            registro = ingreso.nextLine();
            while (!validar.esFechaValida(registro)) {
               System.out.println("Ingreso no valido, intente nuevamente:");
               registro = ingreso.nextLine();
            }
            visitaTerreno.setFechaVisita(registro);

            System.out.println("Ingrese la hora de la visita a terreno (hh:mm):");
            registro = ingreso.nextLine();
            while (!validar.esHoraValida(registro)) {
               System.out.println("Ingreso no valido, intente nuevamente:");
               registro = ingreso.nextLine();
            }
            visitaTerreno.setHora(registro);

            System.out.println("Ingrese el lugar de la visita a terreno (minimo 10 y maximo 50 caracteres):");
            registro = ingreso.nextLine();
            while (!validar.esTextoRangoValido(registro, 10, 50)) {
               System.out.println("Ingreso no valido, intente nuevamente:");
               registro = ingreso.nextLine();
            }
            visitaTerreno.setLugar(registro);

            System.out.println("Ingrese comentarios sobre la visita a terreno (maximo 100 caracteres):");
            registro = ingreso.nextLine();
            while (!validar.esTextoRangoValido(registro, 0, 100)) {
               System.out.println("Ingreso no valido, intente nuevamente:");
               registro = ingreso.nextLine();
            }
            visitaTerreno.setComentarios(registro);

            // Ingreso de datos de la revision:

            idRevision++;
            revision.setIdentificadorRevision(idRevision);

            System.out.println("Ingrese nombre alusivo a la revision (minimo 10 y maximo 50 caracteres):");
            registro = ingreso.nextLine();
            while (!validar.esTextoRangoValido(registro, 10, 50)) {
               System.out.println("Ingreso no valido, intente nuevamente:");
               registro = ingreso.nextLine();
            }
            revision.setNombreRevision(registro);

            System.out.println("Ingrese detalles sobre la revision (maximo 100 caracteres):");
            registro = ingreso.nextLine();
            while (!validar.esTextoRangoValido(registro, 0, 100)) {
               System.out.println("Ingreso no valido, intente nuevamente:");
               registro = ingreso.nextLine();
            }
            revision.setDetalle(registro);

            System.out.println("Ingrese el estado de la revision (1: Sin problemas) (2: Con observaciones) (3: No aprueba):");
            registro = ingreso.nextLine();
            while (!validar.esNumeroRangoValido(registro, 1, 3)) {
               System.out.println("Ingreso no valido, intente nuevamente:");
               registro = ingreso.nextLine();
            }
            revision.setEstado(Integer.parseInt(registro));

            contenedor.almacenarCliente(cliente);
            System.out.println("**** Cliente agregado exitosamente ****");

         } else if (numeroMenu == 2) {

            System.out.println("**************************************** ****************************************");
            Profesional profesional = new Profesional();

            System.out.println("Ingrese el nombre de usuario del profesional (minimo 10 y maximo 50 caracteres):");
            registro = ingreso.nextLine();
            while (!validar.esTextoRangoValido(registro, 10, 50)) {
               System.out.println("Ingreso no valido, intente nuevamente:");
               registro = ingreso.nextLine();
            }
            profesional.setNombre(registro);

            System.out.println("Ingrese la fecha de nacimiento del profesional (dd/mm/aaaa):");
            registro = ingreso.nextLine();
            while (!validar.esFechaValida(registro)) {
               System.out.println("Ingreso no valido, intente nuevamente:");
               registro = ingreso.nextLine();
            }
            profesional.setFechaNacimiento(registro);

            System.out.println("Ingrese el RUN del profesional sin puntos, guion, ni digito verificador:");
            registro = ingreso.nextLine();
            while (!validar.esNumeroRangoValido(registro, 1000000, 99999999)) {
               System.out.println("Ingreso no valido, intente nuevamente:");
               registro = ingreso.nextLine();
            }
            profesional.setRUN(Integer.parseInt(registro));

            System.out.println("Ingrese el titulo del profesional (minimo 10 y maximo 50 caracteres):");
            registro = ingreso.nextLine();
            while (!validar.esTextoRangoValido(registro, 10, 50)) {
               System.out.println("Ingreso no valido, intente nuevamente:");
               registro = ingreso.nextLine();
            }
            profesional.setTitulo(registro);

            System.out.println("Ingrese la fecha de ingreso del profesional (dd/mm/aaaa):");
            registro = ingreso.nextLine();
            while (!validar.esFechaValida(registro)) {
               System.out.println("Ingreso no valido, intente nuevamente:");
               registro = ingreso.nextLine();
            }
            profesional.setFechaIngreso(registro);

            contenedor.almacenarProfesional(profesional);
            System.out.println("*** Profesional agregado exitosamente ***");

         } else if (numeroMenu == 3) {

            System.out.println("**************************************** ****************************************");
            Administrativo administrativo = new Administrativo();

            System.out.println("Ingrese el nombre de usuario del administrativo (minimo 10 y maximo 50 caracteres):");
            registro = ingreso.nextLine();
            while (!validar.esTextoRangoValido(registro, 10, 50)) {
               System.out.println("Ingreso no valido, intente nuevamente:");
               registro = ingreso.nextLine();
            }
            administrativo.setNombre(registro);

            System.out.println("Ingrese la fecha de nacimiento del administrativo (dd/mm/aaaa):");
            registro = ingreso.nextLine();
            while (!validar.esFechaValida(registro)) {
               System.out.println("Ingreso no valido, intente nuevamente:");
               registro = ingreso.nextLine();
            }
            administrativo.setFechaNacimiento(registro);

            System.out.println("Ingrese el RUN del administrativo sin puntos, guion, ni digito verificador:");
            registro = ingreso.nextLine();
            while (!validar.esNumeroRangoValido(registro, 1000000, 99999999)) {
               System.out.println("Ingreso no valido, intente nuevamente:");
               registro = ingreso.nextLine();
            }
            administrativo.setRUN(Integer.parseInt(registro));

            System.out.println("Ingrese el area del administrativo (minimo 5 y maximo 20 caracteres):");
            registro = ingreso.nextLine();
            while (!validar.esTextoRangoValido(registro, 5, 20)) {
               System.out.println("Ingreso no valido, intente nuevamente:");
               registro = ingreso.nextLine();
            }
            administrativo.setArea(registro);

            System.out.println("Ingrese la experiencia previa del administrativo (maximo 100 caracteres):");
            registro = ingreso.nextLine();
            while (!validar.esTextoRangoValido(registro, 0, 100)) {
               System.out.println("Ingreso no valido, intente nuevamente:");
               registro = ingreso.nextLine();
            }
            administrativo.setExperienciaPrevia(registro);

            contenedor.almacenarAdministrativo(administrativo);
            System.out.println("**** Administrativo agregado exitosamente ****");

         } else if (numeroMenu == 4) {

            System.out.println("**************************************** ****************************************");
            if (contenedor.usuarios.size() >= 1 &&
                contenedor.existeTipoUsuario("Cliente")) {

               System.out.println("Ingrese el RUN del cliente sin puntos, guion, ni digito verificador:");
               registro = ingreso.nextLine();
               while (!validar.esNumeroRangoValido(registro, 1000000, 99999999)) {
                  System.out.println("Ingreso no valido, intente nuevamente:");
                  registro = ingreso.nextLine();
               }

               if (contenedor.esRUNregistrado(Integer.parseInt(registro)) &&
                   contenedor.clasificacionUsuario(Integer.parseInt(registro)).equals("Cliente")) {

                  Capacitacion capacitacion = new Capacitacion();

                  capacitacion.setRUTCliente(Integer.parseInt(registro));

                  idCapacitacion++;
                  capacitacion.setIdentificador(idCapacitacion);

                  System.out.println("Ingrese el dia de la capacitacion (nombre del dia de semana con minusculas):");
                  registro = ingreso.nextLine();
                  while (!validar.esDiaSemanal(registro)) {
                     System.out.println("Ingreso no valido, intente nuevamente:");
                     registro = ingreso.nextLine();
                  }
                  capacitacion.setDiaSemana(registro);

                  System.out.println("Ingrese la hora de la capacitacion (hh:mm):");
                  registro = ingreso.nextLine();
                  while (!validar.esHoraValida(registro)) {
                     System.out.println("Ingreso no valido, intente nuevamente:");
                     registro = ingreso.nextLine();
                  }
                  capacitacion.setHora(registro);

                  System.out.println("Ingrese el lugar de la capacitacion (minimo 10 y maximo 50 caracteres):");
                  registro = ingreso.nextLine();
                  while (!validar.esTextoRangoValido(registro, 10, 50)) {
                     System.out.println("Ingreso no valido, intente nuevamente:");
                     registro = ingreso.nextLine();
                  }
                  capacitacion.setLugar(registro);

                  System.out.println("Ingrese la duracion de la capacitacion (maximo 70 caracteres):");
                  registro = ingreso.nextLine();
                  while (!validar.esTextoRangoValido(registro, 0, 70)) {
                     System.out.println("Ingreso no valido, intente nuevamente:");
                     registro = ingreso.nextLine();
                  }
                  capacitacion.setDuracion(registro);

                  System.out.println("Ingrese la cantidad de asistentes (minimo 1 y maximo 1000):");
                  registro = ingreso.nextLine();
                  while (!validar.esNumeroRangoValido(registro, 1, 1000)) {
                     System.out.println("Ingreso no valido, intente nuevamente:");
                     registro = ingreso.nextLine();
                  }
                  capacitacion.setCantidadAsistentes(Integer.parseInt(registro));

                  contenedor.almacenarCapacitacion(capacitacion);
                  System.out.println("**** Capacitacion agregada exitosamente ****");
               }
               else System.out.println("No hay ningun cliente con el RUN ingresado.");
            }
            else System.out.println("No hay ningun cliente registrado para ingresarle capacitacion.");

         } else if (numeroMenu == 5) {

            System.out.println("**************************************** ****************************************");
            if (contenedor.usuarios.size() >= 1) {

               System.out.println("Ingrese el RUN del usuario a eliminar sin puntos, guion, ni digito verificador:");
               registro = ingreso.nextLine();
               while (!validar.esNumeroRangoValido(registro, 1000000, 99999999)) {
                  System.out.println("Ingreso no valido, intente nuevamente:");
                  registro = ingreso.nextLine();
               }

               if (contenedor.esRUNregistrado(Integer.parseInt(registro))) {

                  contenedor.eliminarUsuario(Integer.parseInt(registro));
                  System.out.println("**** Eliminacion realizada exitosamente ****");
               }
               else System.out.println("No hay ningun usuario con el RUN ingresado.");
            }
            else System.out.println("No hay usuarios registrados para eliminar.");

         } else if (numeroMenu == 6) {

            System.out.println("**************************************** ****************************************");
            if (contenedor.usuarios.size() >= 1) contenedor.listarUsuarios();
            else System.out.println("No hay usuarios registrados para mostrar.");

         } else if (numeroMenu == 7) {

            System.out.println("**************************************** ****************************************");
            if (contenedor.usuarios.size() >= 1) {

               System.out.println("Ingrese el numero del perfil que desea listar:");
               System.out.println("(1) Cliente");
               System.out.println("(2) Profesional");
               System.out.println("(3) Administrativo");

               registro = ingreso.nextLine();
               while (!validar.esNumeroRangoValido(registro, 1, 3)) {
                  System.out.println("Ingrese correctamente el numero de la opcion:");
                  registro = ingreso.nextLine();
               }
               perfilMenu = Integer.parseInt(registro);

               System.out.println("**************************************** ****************************************");
               if      (perfilMenu == 1) contenedor.listarUsuariosPorTipo("Cliente");
               else if (perfilMenu == 2) contenedor.listarUsuariosPorTipo("Profesional");
               else if (perfilMenu == 3) contenedor.listarUsuariosPorTipo("Administrativo");
            }
            else System.out.println("No hay usuarios registrados para mostrar.");

         } else if (numeroMenu == 8) {

            System.out.println("**************************************** ****************************************");
            if (contenedor.capacitaciones.size() >= 1) contenedor.listarCapacitaciones();
            else System.out.println("No hay capacitaciones registradas para mostrar.");
         }

      } while (!(numeroMenu == 9));
   }
}
