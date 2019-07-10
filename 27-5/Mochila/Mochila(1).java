import java.util.ArrayList;

public class Mochila{
    private ArrayList<Util> utiles  = new ArrayList<Util>();
    
    public Mochila(){

    }

    public Util getUtil(int x){
        return this.utiles.get(x);
    }
    public void addUtil(Util e){
        this.utiles.add(e);
    }
}