public class Pasajero {
    private String nombre;
    private String apellido;
    private boolean necesitaAsistenciaEspecial;

    public Pasajero(String nombre, String apellido, boolean necesitaAsistenciaEspecial) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.necesitaAsistenciaEspecial = necesitaAsistenciaEspecial;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public boolean isNecesitaAsistenciaEspecial() {
        return necesitaAsistenciaEspecial;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNecesitaAsistenciaEspecial(boolean necesitaAsistenciaEspecial) {
        this.necesitaAsistenciaEspecial = necesitaAsistenciaEspecial;
    }


}
