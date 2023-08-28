public class Persona{
    protected String nombre,apellido,genero,direccion;
    protected int edad;

    public Persona(String nombre, String apellido, String genero, String direccion, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.direccion = direccion;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String mostrardatos(){
        return  "********************"+
                "\nNombre: "+nombre+
                "\nApellido: "+apellido+
                "\nGenero: "+genero+
                "\nEdad: "+edad+
                "\nDireccion: "+direccion;
                
        
    }


}