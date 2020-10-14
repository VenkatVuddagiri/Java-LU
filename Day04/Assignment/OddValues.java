package Day04.Assignment;

import java.util.Scanner;

public class OddValues {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner s = new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("Enter array element");
            array[i] = s.nextInt();
        }
        System.out.println("The odd numbers in the array are: ");
        for(int i=0;i<5;i++){
            if(array[i]%2!=0){
                System.out.println(array[i]);
            }
        } 
        s.close();
    }
}
