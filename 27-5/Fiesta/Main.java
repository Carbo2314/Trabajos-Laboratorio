public class Main{
    public static void main(String[] args){
       Lista l = new Lista();
       Persona p1 = new Persona("Alberto");
       Persona p2 = new Persona("Javier");
       Persona p3 = new Persona("Ariel");

       l.addInvitado(p1);
       l.addInvitado(p2);
       l.addInvitado(p3);

       System.out.println(l.cantInvitadosA());
    }
}