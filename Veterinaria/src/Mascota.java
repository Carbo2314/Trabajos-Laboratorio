import java.util.ArrayList;

public abstract class Mascota {

 public String nombre;
 private String dueno;
 private Fecha fecha_nacimiento;
 public ArrayList<Fecha> fechas_visita;
 private String tipo;

 public Mascota (String nombrex, String duenox, Fecha fecha_nacimientox){

     this.nombre = nombrex;
     this.dueno = duenox;
     this.fecha_nacimiento = fecha_nacimientox;
     fechas_visita = new ArrayList<>();

 }

    public String getNombre() {
        return nombre;
    }

    public String getDueno() {
        return dueno;
    }

    public Fecha getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public ArrayList<Fecha> getFechas_visita() {
        return fechas_visita;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public void setFecha_nacimiento(Fecha fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public void setFechas_visita(ArrayList<Fecha> fechas_visita) {
        this.fechas_visita = fechas_visita;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    Fecha F1 = new Fecha(15,11,2019);
    Fecha F2 = new Fecha(23,11,2019);
    Fecha F3 = new Fecha(13,12,2019);
    Fecha F4 = new Fecha(27,12,2019);


    public void agregar_fechas() {



    }

}