public class MathematicOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        // métodos que me atraen de la clase Math en java (en este punto)

        System.out.println(Math.PI);   //constantes en java en mayuscula
        System.out.println(Math.E);

        //ceil(x) redondea por exceso un número y devuelve el entero resultante del redondeo
        System.out.println(Math.ceil(x));       //3

        //floor(x) redondea por defecto un númeroy devuelve el entero resultante del redondeo
        System.out.println(Math.floor(x));      //2

        x = 2;
        y = 3;

        //pow(x,y) devuelve el resultado de elevar un número base(el 1ero) a un número exponente/potencia (el 2do)
        System.out.println(Math.pow(x,y));     //8

        //max(x,y) devuelve el mayor
        System.out.println(Math.max(x,y));     //3

        //max(x,y) devuelve el menor
        System.out.println(Math.min(x,y));     //2

        int z = 16;

        //sqrt(x) devuelve la raiz cuadrada   //4
        System.out.println(Math.sqrt(z));

        //area de un circulo --> fórmula: pi * r2        donde r = radio del circulo                 //28.27...
        double radio = 3;
        System.out.println( (Math.PI) *  Math.pow(radio, 2));

        //area de una esfera --> fórmula: 4 * PI * r2
        System.out.println( 4 * Math.PI * Math.pow(radio, 2));                                      //113.09...

        //volumen de una esfera --> fórmula: (4/3) * PI * r3
        System.out.println( (4/3) * Math.PI * (Math.pow(radio,3)) );                                //84.82..



    }
}
