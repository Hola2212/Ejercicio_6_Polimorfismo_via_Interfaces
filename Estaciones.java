public class Estaciones extends Equipos{
    public Estaciones(String nombre, String ID, boolean permisoMedible, boolean permisoAccionable, boolean permisoRegistrable) {
        super(nombre, ID, permisoMedible, permisoAccionable, permisoRegistrable);
    }
    @Override
    public void tomarFoto(){
        if (getPermisoAccionable()){
            setMensajeResultadoAccion("Fotografiando");
            addResultado("Fotografiando");
        }
        else{
            setMensajeResultadoAccion("No Aplicable");
        }
    }
    @Override
    public void obtenerTemperatura(){
        if (getPermisoMedible()){
            setMensajeResultadoAccion("Temperatura obtenida");
            addResultado("Temperatura obtenida");
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
