public class LogicOperations {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;

/*
*         //operadores de asignación
        System.out.println("a es igual a b? -> " + (a == b));
        System.out.println("a es distinto a b? -> " + (a != b));

        //operadores relacionales
        System.out.println("a es mayor a b? -> " + (a > b));
        System.out.println("a es menor a b? -> " + (a < b));
        System.out.println("a es mayor o igual a b? -> " + (a >= b));
        System.out.println("a es menor o igual a b? -> " + (a <= b));


       if (a == b) {                                                        //ctrol + d                  duplico code lines
            System.out.println("a es igual a b");                            //ctrol + alt + L            idento las code lines
        } else if (a != b) {                                                 //ctrol + mayusc + F10       corro el programa
            System.out.println("a es distinto a b");
        } else if (a > b) {                                                  //ctrol + mayusc + /         sintaxis comentar code block:
        System.out.println("a es mayor a b");                            //ctrol + /                  sintaxis comentar code line: "//"
    } else if (a < b) {
        System.out.println("a es menor a b");
    } else if (a >= b) {
        System.out.println("a es mayor o igual a b");
    } else if (a <= b) {
        System.out.println("a es menor o igual a b");
    }
    */

//        se cumplen 2 de las condiciones anteriores; pero el if(){}  retorna sólo la primera que se cumpla.
//        en caso de querer verificar más de una condición, uso dentro de la misma condición, varias unidas/comparadas por los operadores: lógicos, relacionales y expresiones booleanas.

//        sería por ejemplo, así:

        if (a == b) {                                                        //ctrol + d                  duplico code lines
            System.out.println("a es igual a b");                            //ctrol + alt + L            idento las code lines
        } else if ((a != b) && (a > b)) {                                    //ctrol + mayusc + F10       corro el programa
            System.out.println("a es distinto a b");
        } else if (a > b) {                                                  //ctrol + mayusc + /         sintaxis comentar code block: "/**/"
            System.out.println("a es mayor a b");                            //ctrol + /                  sintaxis comentar code line: "//"
        } else if (a < b) {
            System.out.println("a es menor a b");
        } else if (a >= b) {
            System.out.println("a es mayor o igual a b");
        } else if (a <= b) {
            System.out.println("a es menor o igual a b");
        }


    }
}
