package bridgelab;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
public class EmployeeListMain {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(12, "Ram", "Testing", 15000d));
        list.add(new Employee(15, "Nitish", "Testingg", 12000d));
        list.add(new Employee(15,"Mohan","Testing",8000d));


        Stream<Employee> filtered_dat = list.stream().filter(E -> E.slary > 10000d);

        filtered_dat.forEach(
                Employee -> System.out.println("Employee id: " + Employee.id + ", Name : " + Employee.name + ", salary:  " + Employee.slary));
    }

}
