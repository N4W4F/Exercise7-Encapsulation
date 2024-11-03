public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee("1234567890", "Faisal", 5000);
        System.out.println(emp1.toString());

        System.out.println("-------------------------------------------------------------------");

        System.out.println(emp2.toString());

        System.out.println("-------------------------------------------------------------------");

        emp1.setID("1020304050");
        emp1.setName("Nawaf");
        emp1.setSalary(12000);
        System.out.println(emp1.toString());

        System.out.println("-------------------------------------------------------------------");

        System.out.println("Raised Salary of Employee 1 with 25%: " + emp1.raisedSalary(25));

        System.out.println("-------------------------------------------------------------------");

        System.out.println(emp1.toString());

        System.out.println("-------------------------------------------------------------------");

        System.out.println("Raised Salary of Employee 2 with 50%: " + emp2.raisedSalary(50));

        System.out.println("-------------------------------------------------------------------");

        System.out.println("Trying some exceptions:");
        emp1.setSalary(-500);
        System.out.println(emp1.getSalary());
        System.out.println(emp1.toString());
        System.out.println(emp1.raisedSalary(50));
    }

}
