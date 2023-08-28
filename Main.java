public class Main{

    public static void main(String[] args){
        
        Estudiante estudiante1 = new Estudiante("Santiago", "Veira", "Masculino", "Calle 58 sur #78a", 19, 12345, 5.0f, "Diseño de software");
        Estudiante estudiante2 = new Estudiante("Joan", "Puentes", "Masculino", "Calle 80 #50a", 18, 67890, 3.0f, "Diseño de software");

        curso curso1 = new curso("Tecnologias para aplicaciones moviles", "Daniel David Leal Lara", "Aula 201 del buitrago", 101, 30);
        curso curso2 = new curso("Tecnologia para aplicaciones moviles", "Daniel David Leal Lara", "Aula 201 del buitrago", 102, 25);

        cursoestudiante cursoEstudiante = new cursoestudiante();

        cursoEstudiante.matricularse(estudiante1, curso1);
        cursoEstudiante.matricularse(estudiante2, curso2);

        cursoEstudiante.inscribirEstudiante(estudiante1, curso1, 5.0f);
        cursoEstudiante.inscribirEstudiante(estudiante2, curso2, 3.0f );

        System.out.println(estudiante1.mostrardatos());
        System.out.println(estudiante2.mostrardatos());

        System.out.println(curso1.mostrarDatos());
        System.out.println(curso2.mostrarDatos());
    }
}
