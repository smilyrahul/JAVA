import java.util.Scanner;
public class takinginput05 {
    public static void main(String [] args)
    {
        System.out.println("Taking input from use");
        Scanner sc = new Scanner (System.in);
        System.out.println("enter number 1");
        //int a = sc.nextInt();
        float a=sc.nextFloat();
        System.out.println("Enter Number 2");
        //int b= sc.nextInt();
        float b=sc.nextFloat();
        //int sum=a+b;
        float sum= a+b;
        System.out.println(sum);
        sc.close();//delete this to know why it written here

    }

    
}

/*import java.util.Scanner;

public class takinginput05 {
    public static void main(String[] args) {
        System.out.println("Taking input from use");
        Scanner sc = new Scanner(System.in);
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
        sc.close();
    }
}*/