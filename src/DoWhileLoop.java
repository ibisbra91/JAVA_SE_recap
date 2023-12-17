import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {


        //capturo la respuesta que el usuario teclee en una variable, en este caso la quise nombrar 'response'
        int response = 0;

//        se usa por ejemplo, en menúes de opciones
        do {
//            bloque de instrucciones para solicitar respuesta
            System.out.println("Selecciona el número de la opción deseada");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("0. Salir");

//            una vez el usuario ingresó una respuesta, verifica la condición,
//            hago que el programa LEA del teclado la respuesta ingresada --> con clase java 'Scanner'
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());  //aquí capturé la respuesta ingresda por el usuario (en principio: 1 ó 2 ó 0)

//            evalúo esa respuesta ingresda por el usuario
            switch (response) {
                case 1:
                    System.out.println("Movies");
                    break;
                case 2:
                    System.out.println("Series");
                    break;
                case 0:
                    System.out.println("Gracias por visitarnos.");
                    break;
                default:
                    System.out.println("Seleccione una opción válida");
//                    break;
            }
        } while (response != 0);          //condición para iterar sobre el ciclo = para seguirse mostrando el menú de opciones antes creado

        System.out.println("Se terminó el programa");
    }
}
