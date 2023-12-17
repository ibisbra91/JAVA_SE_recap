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
    }




//    las funciones 'viven' al nivel de la clase (similar a scope variables)  == fuera del main() y a su nivel
//    'método' es el nombre que recibe la función cuando la manipulo DENTRO de la class.
//    'función' es el nombre que recibe la función cuando la manipulo FUERA de la class.

//    para todos los métodos que 'comparten el método main() de la clase' uso la palabra reservada "static"
//    " métodos que 'comparten el método main() de la clase' "  es un modo muy vago que usa para referirse a que -> ese método se puede invocar/llamar/usar desde fuera de la clase sin necesidad de crear objeto de la clase para invocarlo; es decir, para invocar este método hago: clase.metodo-static directamente (sin crear objeto de la clase previo a esaa invocación)
    public static double circleArea(double radioCirculo) {
        return (Math.PI) * Math.pow(radioCirculo, 2);
    }

    public static double sphereArea(double r){
        return 4 * Math.PI * Math.pow(r,2);
    }

    public static double shpereVolumen(double r){
        return (4/3) * Math.PI * Math.pow(r,3);
    }

    public static double converToDollar(double quantity, String currency){

//        MXN COP
    switch (currency){
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


}
