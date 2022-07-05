/**
 * @apiNote Clase Validar
 * @author The Darkos: Nicolás Muñoz, Cristian Maturana, Francisco Carreño, Erick Díaz
 * @version 1.0.3
 */

public class Validar {

   // ****************************** ****************************** ******************************
   /**
    * @apiNote Métodos personalizados
    */
   public boolean esTextoNoVacio(String registro) {
      if (!registro.matches("[ ]*")) return true;
      else return false;
   }

   public boolean esTextoRangoValido(String registro, int min, int max) {
      if (this.esTextoNoVacio(registro) &&
          registro.length() >= min && registro.length() <= max) return true;
      else return false;
   }

   public boolean esEntero(String registro) {
      int numero;
      try {
         numero = Integer.parseInt(registro);
         return true;
      } catch (NumberFormatException ex) {
         return false;
      }
   }

   public boolean esNumeroRangoValido (String registro, int min, int max) {
      if (this.esEntero(registro) &&
          Integer.parseInt(registro) >= min &&
          Integer.parseInt(registro) <= max) return true;
      else return false;
   }

   public boolean esFechaValida(String registro) {
      if (registro.length() == 10 &&
            registro.substring(0, 2).matches("[0-9]*") &&
            registro.substring(2, 3).matches("[/]*") &&
            registro.substring(3, 5).matches("[0-9]*") &&
            registro.substring(5, 6).matches("[/]*") &&
            registro.substring(6, 10).matches("[0-9]*")) {
         int dia = Integer.parseInt(registro.substring(0, 2));
         int mes = Integer.parseInt(registro.substring(3, 5));
         int anio = Integer.parseInt(registro.substring(6, 10));

         if (((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) &&
               (dia >= 1 && dia <= 31)) ||
               ((mes == 4 || mes == 6 || mes == 9 || mes == 11) &&
                     (dia >= 1 && dia <= 30)) ||
               ((anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)) && (mes == 2) &&
                     (dia >= 1 && dia <= 29)) ||
               (!(anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)) && (mes == 2) &&
                     (dia >= 1 && dia <= 28)))
            return true;
         else return false;
      }
      else return false;
   }

   public boolean esDiaSemanal (String registro) {
      if (registro.equals("lunes") ||
          registro.equals("martes") ||
          registro.equals("miercoles") ||
          registro.equals("jueves") ||
          registro.equals("viernes") ||
          registro.equals("sabado") ||
          registro.equals("domingo")) return true;
      else return false;
   }

   public boolean esHoraValida(String registro) {
      if (registro.length() == 5 &&
            registro.substring(0, 2).matches("[0-9]*") &&
            registro.substring(2, 3).matches("[:]*") &&
            registro.substring(3, 5).matches("[0-9]*")) {
         int hora = Integer.parseInt(registro.substring(0, 2));
         int minuto = Integer.parseInt(registro.substring(3, 5));

         if (hora >= 0 && hora <= 23 && minuto >= 0 && minuto <= 59) return true;
         else return false;
      } else return false;
   }
}
