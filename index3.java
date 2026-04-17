import java.util.Scanner;
 
public class index3 {
  public static void main(String[] args) {
    Scanner jm = new Scanner(System.in); 

    // Contraseña correcta

    // El usuario debe ingresar la contraseña 1234.
    // Mientras sea incorrecta, el programa debe seguir pidiéndola.
    // Cuando la escriba bien, mostrar: “Acceso concedido”.

    System.out.println("\n===================================================================");
    System.out.println("            Inicio del sistema de validacion de contraseña           ");
    System.out.println("=====================================================================");


    String contraseña = "1234";
    String nombreUsuario;
    String intento;

    System.out.println("\nIngrese su nombre: ");
    nombreUsuario = jm.nextLine();

    do { 
        System.out.println("\n=== Validando contraseña ===");

        System.out.println("Ingrese su contraseña: ");
        intento = jm.nextLine();

        if (!intento.equals(contraseña)) {
            System.out.println("Contraseña incorrecta. Intentalo nuevamente");
        } else {
            System.out.println("Acceso concedido");
        }
    } while (!intento.equals(contraseña));
    System.out.println("\n=== Acceso concedido correctamente ===");
    System.out.println("Nombre de usuario: " + nombreUsuario);
    System.out.println("Contraseña: " + contraseña);

    System.out.println("\n===================================================================");
    System.out.println("             Fin del sistema de validacion de contraseña             ");
    System.out.println("=====================================================================");

    jm.close();
  }
}
