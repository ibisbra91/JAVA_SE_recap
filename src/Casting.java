public class Casting {
    public static void main(String[] args) {

        /*

        //en 1 año di hogares distintos a 30 animales.
        //Cuántos fueron en promedio por mes?

        double monthlyAnimals = 30.0/12.0;
        System.out.println(monthlyAnimals);


        //ESTIMACION  --> trunca la parte decimal y se queda con el resto -> la parte entera por casteo de double a int
        int estimatedMonthlyAnimals = (int) monthlyAnimals;
        System.out.println(estimatedMonthlyAnimals);


         */
        //EXACTITUD
        int a = 30;
        int b = 12;

        //   System.out.println(a/b);                            //2      como lo manejo con datos declarados como int, en coherencia devuelve como resultado un int

        //si quiero obtener el resultado EXACTO:
        System.out.println( (double) a/b);                      //2.5     casteo y da el resultado en double

        //incluso puedo regresarlo con doble casteo
        System.out.println( (int) (double) a/b);                 //2     casteo doble: castea el resultado a double y luego ese, lo castea a int, para devolver el resultado en int



        double c = a/b;
        System.out.println(c);                                  //2.0

        double c2 = (double) a/b;
        System.out.println(c2);                                 //2.5

        double c3 = (int) a/b;                                  //2.0         ñe :|
        System.out.println(c3);



        char n = '1';
        int nI = n;

        System.out.println(nI);                                 // 49   muestra 49 (y no 1) porque el char '1' EQUIVALE al INT 49 en la tabla ASCII       ( '1' != 1 )  para el jdk (java)
                                                                // el casting se ejecuta automáticamente (no es preciso castearlo 'intencionalmente')
                                                                // "casteo automático"



        //short nS = n;                                         //error pq el char es más grande que el short (el dato de tipo char no cabe dentro de la variable de tipo short)

        short nS = (short) n;                                   //49   (mismo resultado que int)                           cast explícito
        System.out.println(nS);                                 // "casteo explícito"




    }
}
