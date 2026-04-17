import java.util.Scanner;
 
public class index4 {
  public static void main(String[] args) {
    Scanner jm = new Scanner(System.in); 

    // Número dentro de un rango

    // Pide un número entre 1 y 10.
    // Si está fuera del rango, mostrar error y repetir.

    System.out.println("\n===================================================================");
    System.out.println("              Inicio del sistema de validacion de numero             ");
    System.out.println("=====================================================================");

    String nombre;
    int numero;

    System.out.println("\nIngrese su nombre: ");
    nombre = jm.nextLine();

    do {
        System.out.println("\n=== Validando numero ===");

        System.out.println("Ingrese un numero del 1 - 10: ");
        numero = jm.nextInt();

        if (numero < 1 || numero > 10) {
            System.out.println(nombre + " tu numero esta fuera de rango. Intentalo nuevamente");
        } else {
            System.out.println("Numero correcto puedes acceder");
        }
    }

    while (numero <= 0 || numero > 10);
    System.out.println("\n=== Resultado del numero validado ===");
    System.out.println("Nombre: " + nombre);
    System.out.println("Numero ingresado y valido: " + numero);

    System.out.println("\n===================================================================");
    System.out.println("               Fin del sistema de validacion de numero               ");
    System.out.println("=====================================================================");

    jm.close();
  }
}
