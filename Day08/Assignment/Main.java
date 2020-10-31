package Day08.Assignment;
public class Main{
    public static void main(String[] args) {

        // Creating the array of objects of each child class
        Engineer e[] = new Engineer[3];
        for(int i=0;i<3;i++){
            e[i] = new Engineer();
        }
        Doctor d[] = new Doctor[3];
        for(int i=0;i<3;i++){
            d[i]=new Doctor();
        }
        Pilot p[]=new Pilot[3];
        for(int i=0;i<3;i++){
            p[i]=new Pilot();
        }

        //Getting the details of each object, before setting any values
        for(int i=0;i<3;i++){
            System.out.println((i+1)+" Engineer");
            e[i].getDetails();
        }
        for(int i=0;i<3;i++){
            System.out.println((i+1)+" Doctor");
            d[i].getDetails();
        }
        for(int i=0;i<3;i++){
            System.out.println((i+1)+" Pilot");
            p[i].getDetails();
        }


        //Setting some attributes randomly
        e[0].setName("Venkat");
        d[1].setAge(10);
        p[2].setSalary(1000000.0);

        // Getting the details again for verification
        System.out.println("After some modifications");
        for(int i=0;i<3;i++){
            System.out.println((i+1)+" Engineer");
            e[i].getDetails();
        }
        for(int i=0;i<3;i++){
            System.out.println((i+1)+" Doctor");
            d[i].getDetails();
        }
        for(int i=0;i<3;i++){
            System.out.println((i+1)+" Pilot");
            p[i].getDetails();
        }
    }
}