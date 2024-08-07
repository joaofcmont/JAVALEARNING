public class Employee {

        public  int id;
        public  String name;
        public  double salary;


    public Employee(int id, String name, double salary) {
        super();
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  id + ", " +
                 name + ", " +
                  salary ;
    }
}
