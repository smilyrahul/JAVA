import java.util.Scanner;
public class takinginput05 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter number 1");
        int a = sc.nextInt();
        System.out.println("Enter Number 2");
        int b= sc.nextInt();
        int sum=a+b;
        System.out.println(sum);
        sc.close();//delete this to know why it written here

    }

    
}
