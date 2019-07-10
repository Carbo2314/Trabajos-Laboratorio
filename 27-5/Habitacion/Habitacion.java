import java.util.ArrayList;
public class Habitacion{
    ArrayList<Elemento> elementos = new ArrayList<Elemento>();    

    public Habitacion(){
        
    }

    public void addElemento(Elemento e){
        this.elementos.add(e);
    }
    public Elemento getElemento(int x){
        return elementos.get(x);
    }

    
}