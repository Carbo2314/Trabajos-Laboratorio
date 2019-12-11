public class Persona {

    private int edad;
    private boolean adulto;

    public Persona(int edadx, boolean adultox){

        this.edad = edadx;
        this.adulto = adultox;

    }

    public int getEdad() {
        return edad;
    }

    public boolean isAdulto() {
        return adulto;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAdulto(boolean adulto) {
        this.adulto = adulto;
    }
}
