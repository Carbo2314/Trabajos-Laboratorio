import java.util.HashSet;
import java.util.HashMap;

public abstract class Noel {

    //private String mensaje;
    public final int precio = 5;

    public Noel(String mensajex){

        //this.mensaje = mensajex;

    }

    //public String getMensaje() {
        //return mensaje;
    //}

    public int getPrecio() {
        return precio;
    }

    //public void setMensaje(String mensaje) {
        //this.mensaje = mensaje;
    //}


    public abstract void Saludar();
}
