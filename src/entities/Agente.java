package entities;

public class Agente extends Entidad {
    private String habilidadEspecial;
    private String misionAsignada;
    private int misionesCompletadas;  // variable que lleva el conteo de misiones completadas
    private int anomalíasNeutralizadas;  //variable que llevar el conteo de anomalías neutralizadas

    public Agente(int id, String nombre, String habilidadEspecial) {
        super(id, nombre);
        this.habilidadEspecial = habilidadEspecial;
        this.misionesCompletadas = 0;  // inicializa el contador de misiones 
        this.anomalíasNeutralizadas = 0;  // inicializa el contador de anomalías
    }
    //este metodo me da el valor de la habilidad especial del agente.
    public String getHabilidadEspecial() {
        return habilidadEspecial;
    }
    //este metodo permite establecer una nueva habilidad especial para el agente.
    public void setHabilidadEspecial(String habilidadEspecial) {
        this.habilidadEspecial = habilidadEspecial;
    }
    //este metodo nos dice la mision asignada al agente.
    public String getMisionAsignada() {
        return misionAsignada;
    }
    //este metodo permite asignar una mision al agente.
    public void asignarMision(String mision) {
        this.misionAsignada = mision;
    }

    //metodo que  incrementar el contador de misiones y anomalías
    public void completarMision() {
        misionesCompletadas++;
    }
    //Este método incrementa el contador de anomalías neutralizadas cada vez que se llama.
    public void neutralizarAnomalia() {
        anomalíasNeutralizadas++;
    }

    // metodo para generar el reporte basico de actividad
    public void generarReporte() {
        System.out.println("Reporte de Actividad del Agente: " + getNombre());
        System.out.println("Misiones Completadas: " + misionesCompletadas);
        System.out.println("Anomalías Neutralizadas: " + anomalíasNeutralizadas);
        System.out.println("Misión Asignada: " + (misionAsignada != null ? misionAsignada : "Ninguna"));
        System.out.println("-------------------------------------");
    }
    // este metodo me permite sobreescribit el metodo tostring
    @Override
    public String toString() {
        return super.toString() + ", Habilidad Especial: " + habilidadEspecial +
                (misionAsignada != null ? ", Misión: " + misionAsignada : "");
    }
}
