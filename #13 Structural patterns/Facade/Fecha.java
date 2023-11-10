public class Fecha {
    private String fechaInicio;
    private String fechaFin;

    public Fecha(String fechaInicio, String fechaFin) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }


    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }
}
