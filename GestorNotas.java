import java.util.ArrayList;
import java.util.List;

public class GestorNotas {

    private List<Nota> notas;

    public GestorNotas() {
        this.notas = new ArrayList<>();
    }

    // TODO: implementar alta de notas
    public void crearNota(String titulo, String contenido, boolean importante) {
        int id = notas.size() + 1;
        notas.add(new Nota(id, titulo, contenido, importante));
        System.out.println("Nota creada con id " + id);
    }

    // TODO: implementar listado
    public void listarNotas() {
        if (notas.isEmpty()) {
            System.out.println("No hay notas registradas.");
            return;
        }
        for (Nota nota : notas) {
            System.out.println("ID: " + nota.getId());
            System.out.println("Título: " + nota.getTitulo());
            System.out.println("Contenido: " + nota.getContenido());
            System.out.println("Importante: " + (nota.isImportante() ? "Sí" : "No"));
            System.out.println("---");
        }
    }

    // TODO: implementar filtro
    public void listarImportantes() {
        // implementar en la fase correspondiente
    }
}