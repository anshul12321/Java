import java.util.*;
abstract class shape
{
int d1;
int d2;
int d3;
 shape(int x,int y)
{
  d1=x;
  d2=y;
 }
 shape(int c)
{
 d3=c;
 }
 abstract double printarea();
}

 class rectangle extends shape
{
  rectangle(int x,int y)
 {
   super(x,y);
 }
 double printarea()
 {
   System.out.println("\nArea of rectangle:");
   return (d1*d2);
 }
}
 
 class triangle extends shape
{
  triangle(int a,int b)
 {
   super(a,b);
 }
 double printarea()
 {
  System.out.println("Area of Triangle:");
   return (0.5*d1*d2);
}
 } 
class circle extends shape
{
 circle(int r)
 { 
  super(r);
}
  double printarea()
 {
  System.out.println("\nArea of circle:");
  return (3.14*d3*d3);
 }
 }
class areademo
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  int a,b,c,d,e;
  double area;
  int option=0;
  shape z=null;
 while(option!=4)
{
  System.out.println("\n1.Rectangle");
  System.out.println("\n2.Triangle");
  System.out.println("\n3.Circle");
  System.out.println("\n4.Exit");
  System.out.println("\nEnter Option:");
  option=s.nextInt();
  switch(option)
 {
  case 1:System.out.println("\nEnter length and breadth of rectangle:");
         a=s.nextInt();
         b=s.nextInt();
         rectangle R=new rectangle(a,b);
         z=R;
         break;
 case 2:System.out.println("\nEnter base and height of triangle:");
         c=s.nextInt();
         d=s.nextInt();
         triangle T=new triangle(c,d);
         z=T;
         break;
 case 3:System.out.println("\nEnter radius of circle:");
         e=s.nextInt();
         circle C=new circle(e);
         z=C;
         break;
 case 4:break;
 default:System.out.println("\nInvalid Option");
 }

 area=z.printarea();
         System.out.println(area);
}

}
}


