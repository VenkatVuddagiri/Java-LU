package Day08.Assignment;

public class Doctor extends Employee {
    private int operations;
    public int getOperations(){
        return this.operations;
    }
    public void setOperations(int operations){
        this.operations=operations;
    }
    public void getDetails(){
        System.out.println("Name: "+this.getName());
        System.out.println("Age: "+this.getAge());
        System.out.println("Salary: "+this.getSalary());
        System.out.println("Designation: "+this.getDesignation());
        System.out.println("Operations: "+this.operations);
    }
}
