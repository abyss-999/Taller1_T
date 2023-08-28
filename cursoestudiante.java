import java.util.ArrayList;

public class cursoestudiante implements matriculable{
    private ArrayList<Estudiante> estudiantes;

    public cursoestudiante(){
        estudiantes = new ArrayList<>();
    }

    @Override
    public void matricularse(){
    }
    public void matricularse(Estudiante estudiante, curso curso){
        if (estudiantes.contains(estudiante)){
            System.out.println(estudiante.getNombre() + " ya esta matriculado en " + curso.getNombre_del_curso());
            return;
        }
    
        if (curso.getCupoDisponible() <= 0){
            System.out.println("El curso " + curso.getNombre_del_curso() + " no tiene cupo disponible.");
            return;
        }
    
        estudiantes.add(estudiante);
        curso.reducirCupo(); 
    
        System.out.println(estudiante.getNombre() + " ha sido matriculado en " + curso.getNombre_del_curso());
    }

    public void inscribirEstudiante(Estudiante estudiante, curso curso){
        if (estudiantes.contains(estudiante)){
            System.out.println(estudiante.getNombre() + " ya esta inscrito en " + curso.getNombre_del_curso());
            return;
        }
    
        if (curso.getCupoDisponible() <= 0){
            System.out.println("El curso " + curso.getNombre_del_curso() + " no tiene cupo disponible para inscripciones.");
            return;
        }
    
        estudiantes.add(estudiante);
        curso.reducirCupo(); 
    
        System.out.println(estudiante.getNombre() + " ha sido inscrito en " + curso.getNombre_del_curso());
    }

    public void inscribirEstudiante(Estudiante estudiante, curso curso, float calificacion){
        if (estudiantes.contains(estudiante)){
            System.out.println(estudiante.getNombre() + " ya está inscrito en " + curso.getNombre_del_curso());
            return;
        }
    
        if (curso.getCupoDisponible() <= 0){
            System.out.println("El curso " + curso.getNombre_del_curso() + " no tiene cupo disponible para inscripciones.");
            return;
        }
    
        estudiantes.add(estudiante);
        curso.reducirCupo(); 
        estudiante.setCalificacion(calificacion);
    
        System.out.println(estudiante.getNombre() + " ha sido inscrito en " + curso.getNombre_del_curso() +
                " con una calificación de " + calificacion);
    }

}
