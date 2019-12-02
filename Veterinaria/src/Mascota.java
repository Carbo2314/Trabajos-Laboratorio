import java.util.ArrayList;

public class Mascota {

 private String nombre;
 private String dueno;
 private String fecha_nacimiento;
 private ArrayList<String> fechas_visita;
 private String tipo;

 public Mascota (String nombrex, String duenox, String fecha_nacimientox){

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

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public ArrayList<String> getFechas_visita() {
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

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public void setFechas_visita(ArrayList<String> fechas_visita) {
        this.fechas_visita = fechas_visita;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    boolean cumplio_visitas(){

        int cantidad;
        if(tipo == "perro"){cantidad = 4;}
        else if(tipo == "gato"){cantidad = 2;}
        else(tipo == "tortuga"){cantidad = 1;}

        if(this.fechas_visita.size() >= cantidad){return true;}
        else{return false;}

    }
}
