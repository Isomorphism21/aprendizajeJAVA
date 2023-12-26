public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;
        //Bono $200
        int bono = 200;
        salary = salary + bono;
        System.out.println(salary);
        salary = salary - 50;
        System.out.println(salary);

        //2 horas extra $30 c/u
        //Comida: $45
        salary = salary + (30*2) - 45;
        System.out.println(salary);

        //Actualizando cadenas de texto
        String employeeName = "Iso";
        employeeName = employeeName + "Morphism";
        System.out.println(employeeName);
        employeeName = "HOla " + employeeName;
        System.out.println(employeeName);
    }
}
