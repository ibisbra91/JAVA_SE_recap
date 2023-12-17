public class Functions {
    public static void main(String[] args) {

        // >>>>>>>>>>>>>>>>>>>>>>>>       FUNCTIONS    !!!! yesss!< entrando en materia (modular and reutilizable  and operable code yessss)

        //area de un circulo --> fórmula: pi * r2        donde r = radio del circulo                 //28.27...
        double radio = 3;
/*
        System.out.println((Math.PI) * Math.pow(radio, 2));
        System.out.println((Math.PI) * Math.pow(5, 2));
        System.out.println((Math.PI) * Math.pow(10, 2));
        System.out.println((Math.PI) * Math.pow(1, 2));*/

        double i = circleArea(radio);
        System.out.println(i);

        double eA = sphereArea(4);
        System.out.println(eA);

        double cD = converToDollar(50, "MXN");
        System.out.println("Pesos a pesos Mexicanos: " + cD);


        double sA = sphereArea(3);
        System.out.println("El área de la esfera es: " + sA);
    }

//ahora veo como ejemplo, cómo está docuemntada la clase de java --> Math


//    las funciones 'viven' al nivel de la clase (similar a scope variables)  == fuera del main() y a su nivel
//    'método' es el nombre que recibe la función cuando la manipulo DENTRO de la class.
//    'función' es el nombre que recibe la función cuando la manipulo FUERA de la class.

    //    para todos los métodos que 'comparten el método main() de la clase' uso la palabra reservada "static"
//    " métodos que 'comparten el método main() de la clase' "  es un modo muy vago que usa para referirse a que -> ese método se puede invocar/llamar/usar desde fuera de la clase sin necesidad de crear objeto de la clase para invocarlo; es decir, para invocar este método hago: clase.metodo-static directamente (sin crear objeto de la clase previo a esaa invocación)
    public static double circleArea(double radioCirculo) {
        return (Math.PI) * Math.pow(radioCirculo, 2);
    }

    /**
     * @param r radio de la esfera
     * @return valor del área de la esfera
     * @autor Ibita
     * @see https://developer.android.com/reference/androidx/packages
     * @see https://docs.spring.io/spring-boot/docs/2.2.0.M3/api/
     * */
    public static double sphereArea(double r) {
        return 4 * Math.PI * Math.pow(r, 2);
    }

    public static double shpereVolumen(double r) {
        return (4 / 3) * Math.PI * Math.pow(r, 3);
    }

    /**
     * DESCRipción breve de la function() -> Función que: Especificando su moneda, convierte una cantidad de dinero a dólares.
     * DOCumentar los parámetros y el retorno de la function(): --> usando arroba
     *
     * @param quantity Cantidad de dinero
     * @param currency Tipo de moneda: Sólo acepta MXN o COP
     * @return quantity : Deuuelve la cantidad actaulizada en doláres.
     */
    public static double converToDollar(double quantity, String currency) {

//        MXN COP
        switch (currency) {
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case "COL":
                quantity *= 0.00031;
                break;
            default:
                System.out.println("Entre una cantidad ");
        }
        return quantity;
    }

//    ejemplos de sitios (html) generados usando javadocs (automáticamente con Java)
//    documentación de android: https://developer.android.com/reference/androidx/packages
//    docuemntación de spring-boot: https://docs.spring.io/spring-boot/docs/2.2.0.M3/api/

/*
    EL modo de ver esto en acción?
            * R/ para visualizar la documentación generada con Java Docs, InteliJ IDEA IDE tiene un tooltip 'escondido' que, a medida que estoy escribiendo el nombre de la function(),
             el IDE me sugiere el que más haga match con lo que tengo escrito.
            * Lo ideal sería que el IDE, a la vez que muestra ese nombre y params de la function recomendada,
     * además mostrara alguna descripción breve y clara sobre dicha function().
            * Esto lo configuro en el IDE en:
            *                                  File/Settings/Editor/General/Code Completition
     *                                  opción "Show the documentation popup in 1000 ms (1 seg)"
            *                                  click en botón 'OK'.
            *
            * Configurado lo anterior, cuando paso el cursor por encima del nombre de esa function() documentada,
     * pasado ese 1seg, muestra esa documentación (descripción breve y clara) insertada.
            *
            * voy dentro del main a hacer una llamada de esa function() documentada y veo que pone lo descrito/documentado*/

}
