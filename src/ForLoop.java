public class ForLoop {

    static boolean isTurnOnLight = false;                     //variable bandera (flag, irá cambiando su valor boolean según itere el while bucle)
                                                              // es una variable global

    public static void main(String[] args) {
        turnOnOffLigth();
        for (int i = 1; i <= 10 ; i++) {                     //elegí inicializar i=0; cuando use índices (dentro de arrays, listas, y otras estructuras de datos iniciaré en 0)
           printSOS();
        }

    }


    /**
     * DESCRIPCIÓN: simulación de la la impresión de una señal S.O.S. a través de sus caracteres.
     *
     * */
    public static void printSOS(){                       //void -> no retorna un valor, sino que sólo realiza una acción (en este caso, esa acción es imprimir un mensaje)

        System.out.println("... ___ ...");
    }

    /**
     * DESCRIPCIÓN: verifica el estado de la lámpara (encendida o apagada)-> Lo cambia al estado opuesto y lo retorna.
     * */
    public static boolean turnOnOffLigth(){
        isTurnOnLight =  (isTurnOnLight) ? false : true;                                  //operador TERNARIO (forma resumida de If Statement 😎)
                                                                                          //si está encendida la pone apagada(false. Es la asignación1 del if)
                                                                                          //si está apagada la pone encendida(true. Es la asignación2 del if)
        return isTurnOnLight;
    }

}
