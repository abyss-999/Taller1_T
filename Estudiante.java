public class Estudiante extends Persona implements matriculable{
    private int codigo_estudiante;
    private float calificacion;
    private String carrera;
    
    

    public Estudiante(String nombre, String apellido, String genero, String direccion, int edad, int codigo_estudiante,
            float calificacion, String carrera) {
        super(nombre, apellido, genero, direccion, edad);
        this.codigo_estudiante = codigo_estudiante;
        this.calificacion = calificacion;
        this.carrera = carrera;
    }
    

    public int getCodigo_estudiante() {
        return codigo_estudiante;
    }


    public void setCodigo_estudiante(int codigo_estudiante) {
        this.codigo_estudiante = codigo_estudiante;
    }


    public float getCalificacion() {
        return calificacion;
    }


    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }


    public String getCarrera() {
        return carrera;
    }


    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }


    public void matricularse() {
        System.out.println("El estudiante " + getNombre() + " se ha matriculado en su carrera.");
    }

    @Override
    public String mostrardatos(){
        String datosPersona = super.mostrardatos();
        
        String datosEstudiante = 
                                "\nCodigo del estudiante: " + codigo_estudiante +
                                "\nCalificacion: " + calificacion +
                                "\nCarrera: " + carrera+
                                "\n********************";

        return datosPersona + datosEstudiante;
    }
    
}
