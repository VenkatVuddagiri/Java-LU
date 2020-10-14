package Day04.Assignment;

import java.util.Scanner;

public class sumOfArray {
    public static void main(String[] args){
        int[] array = new int[5];
        int sum= 0 ;
        Scanner s = new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("Enter array element");
            array[i] = s.nextInt();
        }
        for(int i=0;i<5;i++){
            sum+=array[i];
        } 
        System.out.println("The sum of the array is: "+sum);
        s.close();
        }
    }
