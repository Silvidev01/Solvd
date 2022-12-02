package Hospital;

import java.util.ArrayList;
import java.util.List;

public class EmployeeSave {
    List<Employee> employees = new ArrayList<>();

    public void save(Employee Employee){
        employees.add(Employee);
}
public List<Employee> findAll(){
    return employees;
    }
}