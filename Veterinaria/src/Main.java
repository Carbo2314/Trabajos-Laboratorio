import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Fecha f1 = new Fecha(11,12,2019);
        Fecha f2 = new Fecha(23,4,2015);
        Fecha f3 = new Fecha(5,7,2017);
        Fecha f4 = new Fecha(9,1,2018);

        Mascota m1 = new Perro( "Pitbull","Crook","Carbobo", f1 );
        Mascota m2 = new Gato("Egipcio","Shifu","Rourrible",f2);
        Mascota m3 = new Perro("Rotwailer","Micho","Gambasura",f3);
        Mascota m4 = new Tortuga("Marta","Malingote",f4);

        Veterinaira veterinaria = new Veterinaira();

        veterinaria.agregarMascotas(m1,m2,m3,m4);

        Scanner escanerString = new Scanner(System.in);

        boolean noesmascota = true;

        System.out.println("Hola!");
        System.out.println("");
        System.out.println("Antes que nada ¿Que mascota tiene?");
        System.out.println("");

        while(noesmascota) {

            Scanner escaner = new Scanner(System.in);
            String tipomascota = escaner.nextLine();

            if (!tipomascota.equals("perro")) {
                if (!tipomascota.equals("gato")) {
                    if (!tipomascota.equals("tortuga")) {

                        System.out.println("Lo lamentamos, no atendemos es tipo de mascotas, se debe haber equivocado de vaterinaria :)");

                    }

                }
            }

            else{

                System.out.println("Genial!");
                noesmascota = false;

            }

        }
        System.out.println("");
        System.out.println("¿En que puedo ayudarle?");
        System.out.println("");
        System.out.println("1--Quiero saber si cumplo con las visitas obligatorias");
        System.out.println("");

        Scanner escaner = new Scanner(System.in);
        int opcion = escaner.nextInt();

        if(opcion == 1){

            System.out.println("¿Como se llama su mascota?");
            String nombreM = escanerString.nextLine();



            if (veterinaria.mascotas.contains(nombreM)){

                veterinaria.cumplio_visitas(nombreM);

            }



            //else if()

        }


    }

}
