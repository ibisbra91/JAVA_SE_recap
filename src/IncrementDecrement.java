public class IncrementDecrement {
    public static void main(String[] args) {

        //postfija
        int lives = 5;
        lives = lives - 1;
        System.out.println(lives);  //4

        lives--;
        System.out.println(lives); //3

        lives++;
        System.out.println(lives); //4

        //prefija - se accede primero al valor de la variable sin importar si está incrementado o no.
        //únicamente se accede al valor de la
        //gana un regalo por ganar 1 vida
        int gift = 100 + lives++;
        System.out.println(gift); //104
    }
}
