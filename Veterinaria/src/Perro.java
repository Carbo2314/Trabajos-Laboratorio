public class Perro extends Mascota {

    private String raza;
    private int cantidad;

    public Perro (String razax, String nombrex, String duenox, String fecha_naimientox){

        super(nombrex, duenox, fecha_naimientox);

        this.raza = razax;

    }

    public String getRaza() {
        return raza;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
