public class WhileLoop {

    //situación: está en china, no sabe hablar mandarín, sólo tiene a mano su mobile, sólo puede usar la lintera. Sabe transmitir msg en morse code. Va a transmitir S.O.S. auxiliándose de eso.
    //@see https://es.wikipedia.org/wiki/SOS
    //S.O.S. = es la sucesión de tres pulsos cortos, tres largos y otros tres cortos --> ...___...

//    flujo:
//    1ero, el usuario enciende la lámpara del mobile
//    2do, se imprime la señal S.O.S. en bucle
//    así, HASTA que el usuario recibe la ayuda (que es el momento en el que decide apagar la lámpara)

//    es necesario, verificar también en cada iteración, el estado de la lámpara (encendida o apagada)

    static boolean isTurnOnLight = false;                     //variable bandera (flag, irá cambiando su valor según itere el while bucle)
                                                              // es una variable global


    public static void main(String[] args) {

        //enciende o apaga la luz
        turnOnOffLigth();                                     //inicia en false y pasa a true

        //verifica si la luz está encendida, estará imprimiendo S.O.S. HASTA que se ejecute la condición de parada (sin ella, este sería un bucle infinito)

        int controlVar = 1;                                     //variable de control, contador
        while (isTurnOnLight && controlVar <= 5){
            printSOS();                                        //iteración 1, está en true, entra al if (ahora reemplazado por el WHILE)
            controlVar ++;
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
        isTurnOnLight =  (isTurnOnLight) ? false : true;                                 //operador TERNARIO (forma resumida de If Statement 😎)
                                                                                          //si está encendida la pone apagada(false. Es la asignación1 del if)
                                                                                          //si está apagada la pone encendida(true. Es la asignación2 del if)
        return isTurnOnLight;
    }




}
