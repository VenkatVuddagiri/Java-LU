package Day04.Assignment;
import java.util.Scanner;
public class avenger {
    private String name;
    private int age;
    private String power;
    private String weapon;  
    private String planet;
    public static void main(String[] args){
       avenger a[] = new avenger[5];
       Scanner s = new Scanner(System.in);
       for(int i=0;i<5;i++){
           a[i] = new avenger();
       }

       for(int i=0;i<5;i++){
           a[i].setDetails(s);
       }
       for(int i=0;i<5;i++){
           a[i].displayDetails();
       }
       s.close();
    }
    public void  setDetails(Scanner s){ 
        System.out.println("Enter the name of the avenger");
        this.name=s.next();
        System.out.println("Enter the age of "+this.name);
        this.age=s.nextInt();
        System.out.println("Enter the power of "+this.name);
        this.power=s.next();
        System.out.println("Enter the weapon of "+this.name);
        this.weapon=s.next();
        System.out.println("Enter the planet of "+this.name);
        this.planet=s.next();
        System.out.println("Avenger "+this.name+" details received successfully");
    }
    public void displayDetails(){
        System.out.println("The name of the avenger is "+this.name);
        System.out.println("The age of "+this.name+" is "+this.age);
        System.out.println("The power of "+this.name+" is "+this.power);
        System.out.println("The weapon of "+this.name+" is "+this.weapon);
        System.out.println(this.name+" lives on "+this.planet);
    }
}