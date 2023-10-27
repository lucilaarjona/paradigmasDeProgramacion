public class Camion {
    /* Atributos */
    public final String marca;
    private int carga;
    private String propietario;
    /* Métodos o comportamientos */
    /* Constructor */
    public Camion(String marca, int carga, String propietario){
        this.marca = marca;
        this.carga = carga;
        this.propietario = propietario;
    }
    public void setCarga(int kg){
        if(kg>0)
            this.carga = kg;
    }
    public int getCarga(){
        return carga;
    }
    public void setPropietario(String propietario){
        this.propietario=propietario;
    }

    public void arrancar(){
        System.out.println("arranca camion"+ marca);
    }
    public void parar(){
        System.out.println("detiene camion");
    }
    public void cargarCombustible(){
        System.out.println("carga combustible");
    }
    public void registrarPropietario(String propietario){
        System.out.println("registra propietario" + propietario);
    }

}
