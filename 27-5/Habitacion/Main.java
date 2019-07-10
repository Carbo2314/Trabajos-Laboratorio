public class Main{
     public static void main(String[] args) {
        Habitacion h1 = new Habitacion();
        
        Elemento silla = new Elemento(12.5, "azul", "plastico");
        Elemento ventana = new Elemento(10, "blanco", "vidrio");
        Elemento sillon = new Elemento(15, "blanco", "cuero");
        Elemento televisor = new Elemento(8, "gris", "plastico");
        Elemento mueble = new Elemento(18, "negro", "madera");
        Elemento puerta = new Elemento(17, "marron", "madera");
        Elemento cama = new Elemento(16, "blanco", "algodon");
        Elemento ropero = new Elemento(20, "marron", "madera");
        Elemento parlante = new Elemento(0.2, "azul", "plastico");
        Elemento mesa = new Elemento(9, "marron", "madera");
        Elemento radio = new Elemento(0.9, "negro", "metal");

        h1.addElemento(silla);
        h1.addElemento(ventana);
        h1.addElemento(sillon);
        h1.addElemento(televisor);
        h1.addElemento(mueble);
        h1.addElemento(puerta);
        h1.addElemento(cama);
        h1.addElemento(ropero);
        h1.addElemento(parlante);
        h1.addElemento(mesa);
        h1.addElemento(radio);
        
        System.out.println(h1.getElemento(0).getColor());
    }
}
