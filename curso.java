public class curso{
    private String nombre_del_curso,profesor,aula;
    private int codigo_del_curso,cupoDisponible;

    

    public curso(String nombre_del_curso, String profesor, String aula, int codigo_del_curso, int cupoDisponible) {
        this.nombre_del_curso = nombre_del_curso;
        this.profesor = profesor;
        this.aula = aula;
        this.codigo_del_curso = codigo_del_curso;
        this.cupoDisponible = cupoDisponible;
    }

    public String getNombre_del_curso(){
        return nombre_del_curso;
    }

    public void setNombre_del_curso(String nombre_del_curso){
        this.nombre_del_curso = nombre_del_curso;
    }

    public String getProfesor(){
        return profesor;
    }

    public void setProfesor(String profesor){
        this.profesor = profesor;
    }

    public String getAula(){
        return aula;
    }

    public void setAula(String aula){
        this.aula = aula;
    }

    public int getCodigo_del_curso(){
        return codigo_del_curso;
    }
    public int getCupoDisponible(){
        return cupoDisponible;
    }
    public void reducirCupo(){
        cupoDisponible--;
    }

    public void setCodigo_del_curso(int codigo_del_curso){
        this.codigo_del_curso = codigo_del_curso;
    }

    public String mostrarDatos(){
        return "********************"+
                "\nNombre del Curso: " + nombre_del_curso +
                "\nProfesor: " + profesor +
                "\nAula: " + aula +
                "\nCódigo del Curso: " + codigo_del_curso+
                "\n********************";
    }
    
    
    
}
