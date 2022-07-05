/**
 * @apiNote Clase Cliente
 * @author The Darkos: Nicolás Muñoz, Cristian Maturana, Francisco Carreño, Erick Díaz
 * @version 1.0.3
 */

public class Cliente extends Usuario {

   // ****************************** ****************************** ******************************
   /**
    * @apiNote Atributos
    */
   private int RUT;
   private String nombres;
   private String apellidos;
   private int telefono;
   private String AFP;
   private int sistemaSalud;
   private String direccion;
   private String comuna;
   private int edad;

   // ****************************** ****************************** ******************************
   /**
    * @apiNote Constructores
    */
   public Cliente() {
   }

   public Cliente(String nombre, String fechaNacimiento, int RUN, int RUT, String nombres,
                  String apellidos, int telefono, String AFP, int sistemaSalud,
                  String direccion, String comuna, int edad) {
      super(nombre, fechaNacimiento, RUN);
      this.RUT = RUT;
      this.nombres = nombres;
      this.apellidos = apellidos;
      this.telefono = telefono;
      this.AFP = AFP;
      this.sistemaSalud = sistemaSalud;
      this.direccion = direccion;
      this.comuna = comuna;
      this.edad = edad;
   }

   // ****************************** ****************************** ******************************
   /**
    * @apiNote Accesores y mutadores
    */
   public int getRUT() {
      return RUT;
   }

   public void setRUT(int RUT) {
      this.RUT = RUT;
   }

   public String getNombres() {
      return nombres;
   }

   public void setNombres(String nombres) {
      this.nombres = nombres;
   }

   public String getApellidos() {
      return apellidos;
   }

   public void setApellidos(String apellidos) {
      this.apellidos = apellidos;
   }

   public int getTelefono() {
      return telefono;
   }

   public void setTelefono(int telefono) {
      this.telefono = telefono;
   }

   public String getAFP() {
      return AFP;
   }

   public void setAFP(String AFP) {
      this.AFP = AFP;
   }

   public int getSistemaSalud() {
      return sistemaSalud;
   }

   public void setSistemaSalud(int sistemaSalud) {
      this.sistemaSalud = sistemaSalud;
   }

   public String getDireccion() {
      return direccion;
   }

   public void setDireccion(String direccion) {
      this.direccion = direccion;
   }

   public String getComuna() {
      return comuna;
   }

   public void setComuna(String comuna) {
      this.comuna = comuna;
   }

   public int getEdad() {
      return edad;
   }

   public void setEdad(int edad) {
      this.edad = edad;
   }

   // ****************************** ****************************** ******************************
   /**
    * @apiNote toString
    */
   @Override
   public String toString() {
      return "Cliente{" +
            "RUT=" + RUT +
            ", nombres='" + nombres + '\'' +
            ", apellidos='" + apellidos + '\'' +
            ", telefono=" + telefono +
            ", AFP='" + AFP + '\'' +
            ", sistemaSalud=" + sistemaSalud +
            ", direccion='" + direccion + '\'' +
            ", comuna='" + comuna + '\'' +
            ", edad=" + edad +
            '}';
   }

   // ****************************** ****************************** ******************************
   /**
    * @apiNote Métodos personalizados
    */
   public String obtenerNombre() {
      return this.nombres+" "+this.apellidos;
   }

   public void obtenerSistemaSalud() {
      if      (this.sistemaSalud == 1) System.out.println("Sistema de salud: Fonasa");
      else if (this.sistemaSalud == 2) System.out.println("Sistema de salud: Isapre");
   }

   @Override
   public void analizarUsuario() {
      super.analizarUsuario();
      System.out.println("Direccion: "+this.direccion);
      System.out.println("Comuna: "+this.comuna);
   }
}
