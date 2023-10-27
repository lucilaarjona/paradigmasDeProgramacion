public class Camion {

        /*Atributos*/
        public final String marca;
        private int carga;
        private String propietario;

        /*Métodos o comportamientos*/

        /*Constructor*/
        public Camion(String marca, int carga, String propietario) {
            this.marca = marca;
            this.carga = carga;
            this.propietario = propietario;
        }

        public void setCarga(int kg) {
            if (kg > 0)
                this.carga = kg;
        }

        public int getCarga() {
            return carga;
        }

        public String getPropietario() {
            return propietario;
        }

        public void setPropietario(String propietario) {
            if (propietario != "") {
                this.propietario = propietario;
            }
        }

        public String arrancar() {
            System.out.printf("arrancar camion" + marca);
            return null;
        }

        public void parar() {
            System.out.printf("detiene camion");
        }

        public void cargarCombustible() {
            System.out.printf("cargar combustible");
        }

        public void registrarPropietario(String propietario) {
            propietario = propietario;
            System.out.println("registrar propietario" + propietario);
        }
    }




