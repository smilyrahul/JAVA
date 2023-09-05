 import java.util.Scanner;
class squareing
{
    Scanner sc=new Scanner(System.in);
    int side;
    squareing(int side)
    {
        this.side=side;
        System.out.println("enter the side of the square");
        int s=sc.nextInt();
    }
    public int getarea()
    {
        return side*side;
    }
    public int getperimeter()
    {
        return 4*side;
    }
}
 abstract class cube{
   abstract void add();
    int a;
    cube(int a)
    {
        this.a=a;
    }
    public int getvolume()
    {
      return a*a*a;
    }
    public int gettotalsurafcearea()
    {
        return 6*a*a;
    }

}
class circle
{
    int r;
    circle(int r)
    {
        this.r=r;
    }
    public double getarea()
    {
        return 3.14*r*r;
    }
    public double circumference()
    {
        return 2*3.14*r;
    }
}
public class mk {
    public static void main(String[] args) {
        squareing s=new squareing(4);
        System.out.println(s.getarea());
        System.out.println(s.getperimeter());
        cube c=new cube(5);
        System.out.println(c.getvolume());
         System.out.println(c.gettotalsurafcearea());
         circle v=new circle(4);
          System.out.println(v.getarea());
          System.out.println(v.circumference());

    }
    
}