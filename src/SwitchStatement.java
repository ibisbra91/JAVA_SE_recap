public class SwitchStatement {
    public static void main(String[] args) {

        //simular modos y filtros de pantalla: nocturno, light, azul, etc

        String colorModeSelected = "vhgf";      //fijar valores es mala práctica (hard code), en este caso lo uso para dejar fundamentos Java SE  acá

        switch (colorModeSelected){
            case "Light":
                System.out.println("Seleccionaste Light mode");
                //instrucciones del codigo de configuración que cambia los colores
                break;

            case "Night":      //ambar
                System.out.println("Seleccionaste Night mode");
                break;
            case "Blue Dark":
                System.out.println("Seleccionaste Blue Dark mode");
                break;
            case "Dark":
                System.out.println("Seleccionaste Dark mode");
                break;

            default: //caso particular en el que ninguno de los valores de los cases 'haga match'
                System.out.println("Selecciona una opción válida.");
        }




    }
}
