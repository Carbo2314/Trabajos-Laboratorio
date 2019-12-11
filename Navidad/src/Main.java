import java.util.HashSet;
import java.util.HashMap;
import java.util.Scanner;

class SistemaPapaNoel {

    private static HashMap<String, Integer> personas = new HashMap<>();
    public static HashSet<String> horas = new HashSet<>();
    public static final int precio = 5;


    public static void main(String[] args) {

        //Noel robot = new NoelNinios();
        //Noel robot2 = new NoelAdultos();


        boolean pagobien = false;

        while (pagobien == false) {

            System.out.println("Porfavor ingrese 5 monedas de 1 peso");

            //System.out.println("Porfavor diga su nombre y su edad");

            Scanner escaner = new Scanner(System.in);
            int ingresomonedas = escaner.nextInt();

            //IngresoCantCorrecta(ingresomonedas, pagobien);

            if (IngresoCantCorrecta(ingresomonedas, pagobien) == true) {

                pagobien = true;

            } else {

                pagobien = false;

            }

        }

        //robot.IngresoCantCorrecta(ingresomonedas);

        //System.out.println(robot.getMensaje());

        System.out.println("Porfavor diga su nombre y su edad");

        Scanner escaner2 = new Scanner(System.in);
        String nombreP = escaner2.nextLine();

        Scanner escaner3 = new Scanner(System.in);
        int edadP = escaner3.nextInt();

        GuardarPersona(nombreP, edadP);

        System.out.println(personas);

        if (edadP < 18) {

            String hora = "";

            Noel robot1 = new NoelNinios("asd");

            robot1.Saludar();

            //System.out.println("Antes de irte, podrias decirme la hora");

            preguntarhora();

            System.out.println(horas);

            System.out.println("Gracias! Nos vemos");

        } else {

            Noel robot2 = new NoelAdultos("asd");

            robot2.Saludar();

            preguntarhora();

            System.out.println(horas);

            System.out.println("Gracias! Nos vemos");

        }
    }

    public static void GuardarPersona(String nombree, int edadd) {

        personas.put(nombree, edadd);

    }

    public static boolean IngresoCantCorrecta(int monedaspersona, boolean pagobienx) {


        //while (pagobienx == false) {

            int vuelto = monedaspersona - precio;
            int falta = precio - monedaspersona;

            if (monedaspersona >= precio) {

                System.out.println("Genial!, su vuelto es " + vuelto);
                pagobienx = true;

            } else {

                System.out.println("Le faltan " + falta);
                pagobienx = false;

            }

        //}

    return pagobienx;

    }

        public static void preguntarhora () {

            System.out.println("Antes de irte, ¿podrias decirme la hora?");

            Scanner escaner3 = new Scanner(System.in);
            String hora = escaner3.nextLine();

            horas.add(hora);

        }

    }

