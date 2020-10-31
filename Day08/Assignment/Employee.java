package Day08.Assignment;

public class Employee {
    private String name;
    private int age;
    private double salary;
    private String designation;
    //Methods
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public double getSalary() {
        return this.salary;
    }
    public String getDesignation(){
        return this.designation;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public void setDesignation(String designation){
        this.designation=designation;   
    }

    // public void getDetails(){
    //     System.out.println(this.name);
    //     System.out.println(this.age);
    //     System.out.println(this.salary);
    //     System.out.println(this.designation);
    // }
}
