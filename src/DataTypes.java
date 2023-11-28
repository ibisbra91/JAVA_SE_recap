public class DataTypes {
    public static void main(String[] args) {
        int n = 456987;
        long nL = 456987L;

        double nD = 123.456;
        float nF = 123.456F;

        var salary = 1000;

        //pension 3%
        var pension = salary *0.03;
        var totalsalary = salary - pension;

        System.out.println(salary);
        System.out.println(pension);

        System.out.println(totalsalary);
        var employeeName = "Ibis Brito";
        System.out.println("EMPLOYEE: " + employeeName + " |  SALARY: " + totalsalary );

    }
}
