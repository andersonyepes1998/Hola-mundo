public class updaptingvariable {

    public static void main(String[] args) {
        int salary = 1000;
        //bono $200
        salary = salary + 200;
        System.out.println(salary);

        //Pension: $50 descuento
        salary = salary - 50;
        System.out.println(salary);

        //2 horas extras $30 c/u
        //comida: $45

        salary = salary + (30*2) - 45;
        System.out.println(salary);

        //actualizando cadenas de textos

        //AQUI SE CONCATENAN TEXTOS DE MODO STRING
        String employeename = "Anderson";
        employeename = employeename + " yepes bedoya";
        System.out.println(employeename);

        employeename = "jorge " + employeename;
        System.out.println("Tu nombre es: " + employeename);

    }

}
