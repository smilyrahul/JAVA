
import java.util.Scanner;
public class arrr {
    
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
 
        int array[] = new int [5];
        System.out.println("Enter the element");
        for(int i=0;i<5;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Given element are --> ");
        for(int i=0;i<5;i++){
           System.out.println(array[i]);
        }
        System.out.println("Decending order of element");
        for(int i=4;i>=0;i--){
            System.out.println(array[i]);
            sc.close();
        }
    }
}
