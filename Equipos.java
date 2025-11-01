import java.util.ArrayList;
public abstract class Equipos implements Registrable, Medible, Accionable, Comparable<Equipos>{
    public ArrayList<String> resultados = new ArrayList<>();
    public String mensajeResultadoAccion = "Ninguna";
    public String nombre;
    public String ID;
    public boolean permisoMedible;
    public boolean permisoAccionable;
    public boolean permisoRegistrable;
    public Consola consolita = new Consola();
    public Equipos(String nombre, String ID, boolean permisoMedible, boolean permisoAccionable, boolean permisoRegistrable) {
        this.nombre = nombre;
        this.ID = ID;
        this.permisoMedible = permisoMedible;
        this.permisoAccionable = permisoAccionable;
        this.permisoRegistrable = permisoRegistrable;
    }
    public String getMensajeResultadoAccion(){
        return mensajeResultadoAccion;
    }
    public String getNombre(){
        return nombre;
    }
    public String getID(){
        return ID;
    }
    public String getResultado(int pos){
        return (pos < resultados.size() && pos >= 0) ? (resultados.get(pos)) : "Fuera de rango";
    }
    public boolean getPermisoMedible(){
        return permisoMedible;
    }
    public boolean getPermisoAccionable(){
        return permisoAccionable;
    }
    public boolean getPermisoRegistrable(){
        return permisoRegistrable;
    }
    public void setMensajeResultadoAccion(String mensaje){
        this.mensajeResultadoAccion = mensaje;
    }
    public void setID(String ID){
        this.ID = ID;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    public void addResultado(String resultados){
        this.resultados.add(resultados);
    }
    public void setPermisoMedible(boolean permisoMedible){
        this.permisoMedible = permisoMedible;
    }
    public void setPermisoAccionable(boolean permisoAccionable){
        this.permisoAccionable = permisoAccionable;
    }
    public void setPermisoRegistrable(boolean permisoRegistrable){
        this.permisoRegistrable = permisoRegistrable;
    }
    @Override
    public void volar(){
        this.mensajeResultadoAccion = "No Aplicable";
    }
    @Override
    public void tomarFoto(){
        this.mensajeResultadoAccion = "No Aplicable";
    }
    @Override
    public void activarAlarma(){
        this.mensajeResultadoAccion = "No Aplicable";
    }
    @Override
    public void obtenerAltura(){
        this.mensajeResultadoAccion = "No Aplicable";
    }
    @Override
    public void obtenerHumedad(){
        this.mensajeResultadoAccion = "No Aplicable";
    }
    @Override
    public void obtenerTemperatura(){
        this.mensajeResultadoAccion = "No Aplicable";
    }
    @Override
    public void guardarDatos(){
        this.mensajeResultadoAccion = "No Aplicable";
    }
    @Override
    public String toString(){
        String mensaje = nombre + "\n";
        for (String resultado : resultados) {
            mensaje = mensaje + resultado + "\n";
        }
        return mensaje;
    }
    public boolean compareToName(String nom) {
		return (this.nombre.equals(nom));
	}
    public boolean compareToID(String ID) {
		return (this.ID.equals(ID));
	}
}