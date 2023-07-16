import java.util.Scanner;
public class pracset03 {
    public static void main(String[] args) {
        System.out.println("what is your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
         System.out.println("Hello " + name + " Have a good day");
         sc.close();
    }


}
