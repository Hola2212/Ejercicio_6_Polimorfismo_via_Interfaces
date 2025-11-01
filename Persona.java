public class Persona{
    public String nombre;
    public String usuario;
    public String contrasena;
    public boolean permisos;
    public Persona(String nombre, String usuario, String contrasena, boolean permisos){
        this.nombre = nombre;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.permisos = permisos;
    }
    public String getNombre(){
        return nombre;
    }
    public String getUsuario(){
        return usuario;
    }
    public String getContrasena(){
        return contrasena;
    }
    public boolean getPermisos(){
        return permisos;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
    public void setContrasena(String contrasena){
        this.contrasena = contrasena;
    }
    public void setPermisos(boolean permisos){
        this.permisos = permisos;
    }
}