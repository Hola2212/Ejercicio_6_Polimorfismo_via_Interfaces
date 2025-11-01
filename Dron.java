public class Dron extends Equipos{
    public Dron(String nombre, String ID, boolean permisoMedible, boolean permisoAccionable, boolean permisoRegistrable) {
        super(nombre, ID, permisoMedible, permisoAccionable, permisoRegistrable);
    }
    @Override
    public void volar(){
        if (getPermisoAccionable()){
            setMensajeResultadoAccion("Volando");
            addResultado("Volando");
        }
        else{
            setMensajeResultadoAccion("No Aplicable");
        }
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
    public void obtenerAltura(){
        if (getPermisoMedible()){
            setMensajeResultadoAccion("Altura obtenida");
            addResultado("Altura obtenida");
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
