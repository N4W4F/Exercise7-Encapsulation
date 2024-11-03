public class Employee {
    private String id;
    private String name;
    private double salary;

    public Employee() {
    }

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void setID(String id) {
        if (id.length() == 10)
            this.id = id;
        else
            System.out.println("ID must be 10 digits");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        if (salary >= 0)
            this.salary = salary;
        else
            System.out.println("Salary must be positive number");
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double getAnnualSalary() {
        return salary * 12;
    }

    public double raisedSalary(double percent) {
        setSalary((salary) * (percent / 100) + salary);
        return salary;
    }

    public String toString() {
        return "Employee ID: " + getID() + "\nEmployee Name: " + getName() + "\nEmployee Salary: " + getSalary()
                + " SAR"
                + "\nEmployee Annual Salary: " + getAnnualSalary() + " SAR";
    }
}