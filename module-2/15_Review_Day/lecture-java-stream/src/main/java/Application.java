import model.Employee;
import model.EmployeeJob;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application {


    private static Employee[] arrayOfEmps = {
            new Employee(1, "Jeff Bezos", 100000.0),
            new Employee(2, "Bill Gates", 200000.0),
            new Employee(3, "Mark Zuckerberg", 300000.0)
    };

    private static Map<Integer, String> jobsMap = new HashMap<Integer, String>()
    {
        {
            put(1, "Billionaire 1");
            put(2, "Billionaire 2");
            put(3, "Billionaire 3");
        }
    };

    public static void main(String[] args) {

    }
}
