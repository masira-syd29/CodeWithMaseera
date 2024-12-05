class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is "+id);
        System.out.println("My name is "+name);
    }
    public int getSalary(){
        return salary;
    }
}

public class CWM_CustomClass {
    public static void main(String[] args) {
        System.out.println("This is a Custom Class");
        Employee harry = new Employee();//Instantiating a new Employee object
        Employee john = new Employee();
        //setting properties
        harry.id = 12;
        harry.salary = 34000;
        harry.name = "CodeWithHarry";

        john.id = 13;
        john.salary = 12000;
        john.name = "CodeWithJohn";

        int salary = john.getSalary();
        System.out.println(salary);
//        System.out.println(harry.id);
//        System.out.println(harry.name);
        harry.printDetails();
        john.printDetails();

    }
}
