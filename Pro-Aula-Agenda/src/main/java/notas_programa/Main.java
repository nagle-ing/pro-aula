package notas_programa;


import java.util.ArrayList;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Lista para almacenar todas las tareas
        ArrayList<Tarea> listaDeTareas = new ArrayList<>();
        ArrayList<Materias> listaDeMaterias= new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int bucle = 0;

        while (bucle == 0) {

            System.out.println("""
                    ------------------
                    Gestor De Tareas
                    ------------------
                    ¿Que desea hacer?
                    1. Agregar tarea
                    2. Ver tareas
                    3. Agregar materias
                    4. ver materias
                    0. Salir
                    """);
            int opcion = sc.nextInt();
            sc.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("¿Cuántas tareas deseas anotar?: ");
                    int numareas = sc.nextInt();
                    sc.nextLine();  // Limpiar el buffer x2 :v


                    for (int i = 0; i < numareas; i++) {
                        System.out.println("Introduce los datos de la tarea número " + (i + 1) + ":");
                        System.out.print("Tarea: ");
                        String tarea_ = sc.nextLine();
                        System.out.print("Fecha final: ");
                        String fecha_ = sc.nextLine();

                        // Crear una nueva tarea y agregarla a la lista
                        Tarea nuevaTarea = new Tarea(tarea_, fecha_);
                        listaDeTareas.add(nuevaTarea);
                    }

                    System.out.println("\nTareas agregadas correctamente.");
                    break;

                case 2:
                    if (listaDeTareas.isEmpty()) {
                        System.out.println("\nNo hay tareas pendientes.");
                    } else {
                        System.out.println("\nTareas pendientes:");
                        // Mostra los detalles de todas las tareas almacenadas en la lista
                        for (Tarea tarea : listaDeTareas) {
                            tarea.mostrarTareas();
                        }
                    }
                    break;

                case 3:
                    System.out.println("¿cuantas materias desea agregar?");
                    int numaterias= sc.nextInt();
                    sc.nextLine();// se limpia el buffer x3 xd



                    for (int i =0; i< numaterias; i++){
                        System.out.println("ingrese los datos de su materia"+ (i + 1) + ":");
                        System.out.println("nombre de la materia: ");
                        String nombre=sc.nextLine();
                        System.out.println("nombre del profer que dicta la materia: ");
                        String profesor= sc.nextLine();
                        System.out.println("aula donde se da la clase:");
                        String aula= sc.nextLine();

                        // se crea aqui una nueva materia con sus vainas
                        Materias nuevamateria = new Materias(nombre, profesor, aula);
                        listaDeMaterias.add(nuevamateria);





                    }
                    System.out.println("materias agregadas correctamente");
                    break;

                case 4:
                    if (listaDeMaterias.isEmpty()){
                        System.out.println("no hay matrias agregadas :(");
                    }else {
                        System.out.println("matrias agregadas: ");
                        for (Materias materias: listaDeMaterias){
                            materias.mostrarMaterias();

                        }
                    }
                    break;

                case 0:
                    System.out.println("Adiós chavito");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }
    }
