package Day08.Assignment;

public class Engineer extends Employee {
    private int projects;
    public int getProjects(){
        return this.projects;
    }
    public void setProjects(int projects){
        this.projects=projects;
    }
    public void getDetails(){
        System.out.println("Name: "+this.getName());
        System.out.println("Age: "+this.getAge());
        System.out.println("Salary: "+this.getSalary());
        System.out.println("Designation: "+this.getDesignation());
        System.out.println("Projects: "+this.projects);
    }
}
