public class IfStatement {
    public static void main(String[] args) {


       boolean isBluethoothEnabled = false;
        int fileSended = 3;

        if(isBluethoothEnabled){
            //instrucciones que envían el archivo

            fileSended++;
            System.out.println(fileSended);
            System.out.println("archivo enviado");

/*
    int i = 0;  //variable con scope local
    i++;
* */
        } else {
            fileSended--;
            System.out.println("Por favor enciende tu bluetooth, para iniciar la transferencia");
            System.out.println(isBluethoothEnabled);
            System.out.println(fileSended);
        }


//        int j = 5;       //variable con scope semi global
//        j++;

    }

}

