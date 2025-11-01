public class Sensores extends Equipos{
    public Sensores(String nombre, String ID, boolean permisoMedible, boolean permisoAccionable, boolean permisoRegistrable) {
        super(nombre, ID, permisoMedible, permisoAccionable, permisoRegistrable);
    }
    @Override
    public void activarAlarma(){
        if (getPermisoAccionable()){
            setMensajeResultadoAccion("Alarma activada");
            addResultado("Alarma activada");
        }
        else{
            setMensajeResultadoAccion("No Aplicable");
        }
    }
    @Override
    public void obtenerHumedad(){
        if (getPermisoMedible()){
            setMensajeResultadoAccion("Humedad obtenida");
            addResultado("Humedad obtenida");
        }
        else{
            setMensajeResultadoAccion("No Aplicable");
        }
    }
    @Override
    public void guardarDatos(){
        if (getPermisoRegistrable()){
            setMensajeResultadoAccion("Almacenando viaje");
            addResultado("Almacenando viaje");
        }
        else{
            setMensajeResultadoAccion("No Aplicable");
        }
    }
}
