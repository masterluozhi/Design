package vistor;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
    private List employees=  new ArrayList<Employee>();
    public void add(Employee employee){
        employees.add(employee);
    }
    public void accept(Department department){
        for (Object obj:employees){
            ((Employee)obj).accept(department);
        }
    }
}
