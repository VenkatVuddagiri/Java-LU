package Day08.Assignment;

public class Pilot extends Employee {
    private int flights;
    public int getFlights(){
        return this.flights;
    }
    public void setFlights(int flights){
        this.flights=flights;
    }   
    public void getDetails(){
        System.out.println("Name: "+this.getName());
        System.out.println("Age: "+this.getAge());
        System.out.println("Salary: "+this.getSalary());
        System.out.println("Designation: "+this.getDesignation());
        System.out.println("Flights: "+this.flights);
    }
}
