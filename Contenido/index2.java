import java.util.Scanner;
 
public class index2 {
  public static void main(String[] args) {
    Scanner jm = new Scanner(System.in); 

// Pide al usuario su edad.
// Si la edad es menor o igual a 0, muestra error y vuelve a pedirla.
// Cuando sea válida, muestra: “Edad registrada correctamente”.

    System.out.println("\n===================================================================");
    System.out.println("               Inicio del sistema de ingreso de edad                 ");
    System.out.println("====================================================================");

    String nombreUsuario;
    int edad;

    System.out.println("\nIngrese su nombre: ");
    nombreUsuario = jm.nextLine();

    do {
        System.out.println("\n=== Procesando edad... ===");

        System.out.println("Por favor ingrese su edad: ");
        edad = jm.nextInt();

        if (edad < 18) {
            System.out.println("Lo sentimos " + nombreUsuario + ", eres menor de edad");
        } else {
            System.out.println("¡Exelente! " + nombreUsuario + ", eres mayor de edad puedes ingresar");
        }
    }
    while (edad < 18);
    System.out.println("\n=== Edad registrada correctamente ===");
    System.out.println("Nombre de ususrio: " + nombreUsuario);
    System.out.println("Edad de usuario: " + edad);

    System.out.println("\n===================================================================");
    System.out.println("                 Fin del sistema de ingreso de edad                  ");
    System.out.println("====================================================================");

    jm.close();
    }
}