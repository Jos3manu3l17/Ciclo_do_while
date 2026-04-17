import java.util.Scanner;
 
public class index {
  public static void main(String[] args) {
    Scanner jm = new Scanner(System.in);

    // Caso 34: Registro de donaciones en una campaña solidaria: Una campaña solidaria querecolecta alimentos necesita
    // registrar cada donación realizada. El programa solicita el nombre del donante y la cantidad de productos entregados. 
    // Una vez ingresados, valida que la cantidad sea positiva. Si no cumple, se informa y se repite la acción. 
    // Este caso refleja cómo la programación puede apoyar iniciativas sociales, garantizando la transparencia y
    // la confiabilidad en la gestión de recursos. Además, invita a los estudiantes a pensar en cómo los sistemas
    // digitales pueden ser herramientas útiles para promover la solidaridad y la responsabilidad social. 

    System.out.println("\n=================================================");
    System.out.println("       Inicio del registro de dononaciones         ");
    System.out.println("===================================================");


    String nombreDonante;
    String apellidoDonante;
    int cantidad;

    System.out.println("\nIngrese su nombre: ");
    nombreDonante = jm.nextLine();

    System.out.println("Ingrese su apellido: ");
    apellidoDonante = jm.nextLine();

    do { 
        System.out.println("\n=== Registrando donacion ===");

        System.out.println("Ingrese la cantidad de productos donados: ");
        cantidad = jm.nextInt();

        if (cantidad <= 0) {
            System.out.println("Lo siento " + nombreDonante + " deves ingresar una cantidad valida...");
        } else {
            System.out.println("¡Exelente! " + nombreDonante + ", puedes vizualizar tu registro");
        }

    } 
    
    while (cantidad <= 0);
    System.err.println("\n==============================================");
    System.out.println("Registro completado correctamente               ");
    System.out.println("\nNombre del donante: " + nombreDonante            );
    System.out.println("Apellido del donante: " + apellidoDonante          );
    System.out.println("Cantidad donada: " + cantidad                      );
    System.err.println("===============================================");


    System.out.println("\n===============================================");
    System.out.println("        Fin del registro de dononaciones         ");
    System.out.println("=================================================");

    jm.close();
  }
}