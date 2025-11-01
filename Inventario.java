import java.util.ArrayList;
public class Inventario{
    private ArrayList<Persona> personal = new ArrayList<>();
    private ArrayList<Equipos> equipos = new ArrayList<>();
    private boolean permisosActuales;
    private Consola consolita = new Consola();
    private int ID_cambiante = 1000;
    public Inventario(){
        personal.add(new Trabajador("Juan", "Trabajador1", "Trabajo123"));
        personal.add(new Trabajador("Luis", "Trabajador2", "Trabajo234"));
        personal.add(new Trabajador("Jose", "Trabajador3", "Trabajo345"));
        personal.add(new Trabajador("Mariana", "Trabajador5", "Trabajo456"));
        personal.add(new Trabajador("Sara", "Trabajador5", "Trabajo567"));
        personal.add(new Trabajador("Alejandro", "Trabajador6", "Trabajo678"));
        personal.add(new Jefe("Kira", "Jefe1", "Jefecito10"));
        personal.add(new Jefe("Edgar", "Jefe2", "Jefezote11"));
        equipos.add(new Dron("Dron_Prov_A", (String.format("ADR%d", ID_cambiante)), true, true, false));
        ID_cambiante += 1;
        equipos.add(new Sensores("Sensor_Prov_A", (String.format("ADR%d", ID_cambiante)), false, false, true));
        ID_cambiante += 1;
        equipos.add(new Estaciones("Estacion_Prov_A", (String.format("ADR%d", ID_cambiante)), true, true, true));
        ID_cambiante += 1;
        equipos.add(new Sensores("Sensor_Prov_B", (String.format("ADR%d", ID_cambiante)), false, true, true));
        ID_cambiante += 1;
        equipos.add(new Estaciones("Estacion_Prov_B", (String.format("ADR%d", ID_cambiante)), false, true, false));
        ID_cambiante += 1;
        equipos.add(new Dron("Dron_Prov_B", (String.format("ADR%d", ID_cambiante)), false, true, true));
        ID_cambiante += 1;
        equipos.add(new Sensores("Sensor_Prov_C", (String.format("ADR%d", ID_cambiante)), false, true, false));
        ID_cambiante += 1;
        equipos.add(new Dron("Dron_Prov_C", (String.format("ADR%d", ID_cambiante)), true, true, true));
        ID_cambiante += 1;
        equipos.add(new Estaciones("Estacion_Prov_C", (String.format("ADR%d", ID_cambiante)), false, true, true));
        ID_cambiante += 1;
        equipos.add(new Dron("Dron_Prov_D", (String.format("ADR%d", ID_cambiante)), true, false, true));
        ID_cambiante += 1;
    }
}