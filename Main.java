import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        GestorNotas gestor = new GestorNotas();
        boolean salir = false;

        while (!salir) {

            System.out.println("\n=== GESTOR DE NOTAS ===");
            System.out.println("1. Crear nota");
            System.out.println("2. Listar notas");
            System.out.println("3. Listar importantes");
            System.out.println("0. Salir");

            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    String titulo      = pedirTextoObligatorio("Título");
                    String contenido   = pedirTextoObligatorio("Contenido");
                    boolean importante = pedirSiONo("¿Es importante? (s/n)");
                    gestor.crearNota(titulo, contenido, importante);
                    break;
                case "2":
                    gestor.listarNotas();
                    break;
                case "3":
                    // TODO: implementar
                    break;
                case "0":
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }

        scanner.close();
    }

    private static String pedirTextoObligatorio(String etiqueta) {
        String valor = "";
        while (valor.isEmpty()) {
            System.out.print(etiqueta + ": ");
            valor = scanner.nextLine().trim();
            if (valor.isEmpty()) {
                System.out.println("El campo '" + etiqueta + "' no puede estar vacío.");
            }
        }
        return valor;
    }

    private static boolean pedirSiONo(String pregunta) {
        String respuesta = "";
        while (!respuesta.equals("s") && !respuesta.equals("n")) {
            System.out.print(pregunta + ": ");
            //trim() para eliminar espacios al inicio y al final, toLowerCase() para convertir a minúsculas
            respuesta = scanner.nextLine().trim().toLowerCase();
            if (!respuesta.equals("s") && !respuesta.equals("n")) {
                System.out.println("Respuesta no válida. Introduce 's' o 'n'.");
            }
        }
        return respuesta.equals("s");
    }
}