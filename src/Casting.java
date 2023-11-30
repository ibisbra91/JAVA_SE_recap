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




    }
}
