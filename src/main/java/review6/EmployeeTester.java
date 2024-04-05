package review6;

public class EmployeeTester {
    public static void main(String[] args) {
        System.out.println(Employee.companyName);

       String name= Employee.getCompanyName();
        System.out.println(name);

       Employee obj1=new Employee("Sergiy",45,85000);
      double result= obj1.getBonus();
        System.out.println(result);
        obj1.printInfo();
    }


}
