import java.util.ArrayList;

public class Zoologico{
    private ArrayList<Animal> animales = new ArrayList<Animal>();

    public Zoologico(){

    }

    public void addAnimal(Animal a){
        animales.add(a);
    }

    public void animalesHerbivoros(){
        for(int i = 0; i< animales.size();i++){
            if(animales.get(i).getTipo().equalsIgnoreCase("herbivoro")){
                System.out.println(animales.get(i).getNombre());
            }
        }
    }
}