public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 10000;

        //bono $200
        salary += 200;
        System.out.println(salary);

        //descuento $50
        salary = salary - 50;
        System.out.println(salary);

        // 2 horas extra $30 c/u
        //cupon comida usado: $45
        salary = salary + (30 * 2) - 45;

        //actualizando strings
        String employeeName = "Ibis Brito";
        employeeName = employeeName + " Amaya y del Sol";
        System.out.println(employeeName);

        employeeName = "Hija de la Luz " + employeeName;
        System.out.println("Tu nombre es: " + employeeName);

    }
}
