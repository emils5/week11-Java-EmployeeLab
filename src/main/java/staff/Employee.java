package staff;

public abstract class Employee {
    private String name;
    private String nin;
    private double salary;

    public Employee(String name, String nin, double salary) {
        this.name = name;
        this.nin = nin;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNin() {
        return nin;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double increase) {
        this.salary += increase;
    }

    public double payBonus(){
        return getSalary()*0.01;
    }

    public void setName(String newName) {
        this.name = newName;
    }
}


