package bridgelab;
import java.util.Objects;

public class Employee {
    int id;
    String name;
    String department;
    double slary;

    public Employee(int id, String name, String department, double slary) {
        this.id=id;
        this.name=name;
        this.department=department;
        this.slary=slary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", slary=" + slary +
                '}';
    }
}
