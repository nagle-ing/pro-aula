package notas_programa;


public class Materias {
     String nombre;
     String profesor;
    String aula;


    public  Materias(String nombre, String profesor, String aula){
        this.nombre=nombre;
        this.profesor=profesor;
        this.aula=aula;


    }

    public void mostrarMaterias(){
        System.out.println("Materias agregadas.");
        System.out.println("---------------------");
        System.out.println("* "+nombre+"                        ");
        System.out.println("____________________");
        System.out.println("| Nombre del docente: "+ profesor+" ");
        System.out.println("| Aula: "+aula+"                    ");
        System.out.println("--------------------");


    }

}
