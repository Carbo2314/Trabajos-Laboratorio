public class Main{
    public static void main(String[] args) {
        Mochila m = new Mochila();

        Util lapiz = new Util(30, "Faber Castel");

        m.addUtil(lapiz);

        System.out.println(m.getUtil(0).getMarca());
    }
}