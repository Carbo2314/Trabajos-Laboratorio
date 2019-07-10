public class Main{
    public static void main(String[] args){
        Zoologico z = new Zoologico();

        Animal a1 = new Animal("carnivoro", "tigre");
        Animal a2 = new Animal("herbivoro","Liebre");
        Animal a3 = new Animal("Herbivoro","conejo");    
    
        z.addAnimal(a1);
        z.addAnimal(a2);
        z.addAnimal(a3);

        z.animalesHerbivoros();
    }
}