import java.util.Scanner;
public class pracset04 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter km in digit to convert into miles");
        float km= sc.nextFloat();
        System.out.println("kilometer to miles are =");
        double  miles=km/1.6093444978925633;
        System.out.println(miles);
        sc.close();
    }

    
}
