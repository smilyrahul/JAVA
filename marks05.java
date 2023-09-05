import java.util.Scanner;
public class marks05 {
public static void  main(String[] args)
{ 
Scanner sc= new Scanner(System.in);
System.out.println("Enter marks of Statics  subject");
float dbms =sc.nextFloat();
System.out.println("Enter marks of Math subject");
float java =sc.nextFloat();
System.out.println("Enter marks of CT subject");
float ca =sc.nextFloat();
System.out.println("Enter marks of ENGLISH subject");
float english =sc.nextFloat();
System.out.println("Total marks=");
float sum=dbms+java+ca+english;
System.out.println(sum);
System.out.println("Percentage are =");
float percentage=sum/4;
System.out.println(percentage);
if(Statics >=40 && Math>=40 && CT >=40 && ENGLISH >=40 && Percentage >=50)
         {
            System.out.println("pass with a percentage of"+Percentage);
         }
         else
         {
            System.out.println("fail");
         }
sc.close();

}    
}
