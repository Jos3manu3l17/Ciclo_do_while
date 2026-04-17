import java.util.Scanner;

public class index5 {
    public static void main(String[] args) {
        Scanner jm = new Scanner(System.in);

//         Registro de productos

// Pide el nombre de un producto.
// Si está vacío, repetir.
// Luego pregunta si desea registrar otro producto (si/no).
// Si responde “si”, repetir todo.

        System.out.println("\n===================================================================");
        System.out.println("              Inicio del sistema de registro de productos            ");
        System.out.println("=====================================================================");

        String nombreUsuario;
        String nombreProducto;
        String respuesta;

        System.out.print("\nIngrese su nombre: ");
        nombreUsuario = jm.nextLine();

        do {

            do {
                System.out.println("\n=== Procesando producto ===");
                System.out.print("Ingrese el nombre del producto: ");
                nombreProducto = jm.nextLine();

                if (nombreProducto.isBlank()) {
                    System.out.println("Lo siento, " + nombreUsuario + ", el input está vacío. Inténtalo nuevamente.");
                } else {
                    System.out.println("¡Perfecto! " + nombreUsuario + ", producto capturado.");
                }
            } while (nombreProducto.isBlank());

            System.out.println("\n=== Resultado de datos ingresados ===");
            System.out.println("Nombre de usuario: " + nombreUsuario);
            System.out.println("Producto elegido: " + nombreProducto);

            System.out.println("\n===================================================================");
            System.out.println("                 Fin del sistema de registro de productos            ");
            System.out.println("=====================================================================");

            System.out.print("\n¿Desea registrar otro producto? (si/no): ");
            respuesta = jm.nextLine().toLowerCase();

        } while (respuesta.equals("si")); 

        System.out.println("\nGracias por usar el sistema, " + nombreUsuario + ". ¡Hasta luego!");
        jm.close();
    }
}