package notas_programa;

public class Tarea {
    String fechaFinal;
    String Tarea;

    public Tarea(String tarea_mensaje, String fecha_tarea) {
        this.Tarea = tarea_mensaje;
        this.fechaFinal = fecha_tarea;

    }

    public void mostrarTareas() {
        System.out.println("Tareas pendientes");
        System.out.println("fecha final: " + fechaFinal);
        System.out.println("Tarea: " + Tarea);
    }
}
