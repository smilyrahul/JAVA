import java.util.Scanner;
public class marks05 {
public static void  main(String[] args)
{ 
Scanner sc= new Scanner(System.in);
System.out.println("Enter marks of DBMS subject");
float dbms =sc.nextFloat();
System.out.println("Enter marks of JAVA subject");
float java =sc.nextFloat();
System.out.println("Enter marks of CA subject");
float ca =sc.nextFloat();
System.out.println("Enter marks of ENGLISH subject");
float english =sc.nextFloat();
System.out.println("Enter marks of HINDI subject");
float hindi =sc.nextFloat();
System.out.println("Total marks=");
float sum=dbms+java+ca+english+hindi;
System.out.println(sum);
System.out.println("Percentage are =");
float percentage=sum/5;
System.out.println(percentage);
sc.close();

}    
}
