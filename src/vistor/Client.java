package vistor;

public class Client {
    public static void main(String[] args) {
        EmployeeList employeeList = new EmployeeList();
        Employee employee1,employee2,employee3,employee4,employee5;
        employee1=new FulltimeEmployee("张无忌",3200.00,45);
        employee2=new FulltimeEmployee("张无忌1",2200.00,40);
        employee3=new FulltimeEmployee("张无忌2",2400.00,38);
        employee4=new FulltimeEmployee("张无忌3",80.00,20);
        employee5=new FulltimeEmployee("张无忌4",60.00,18);

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        Department department;
        department=new FADepartment();
        employeeList.accept(department);
    }
}
