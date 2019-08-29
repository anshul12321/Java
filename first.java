class overload
{
  int x,y;
  void setdata(int x,int y){
   this.x=x;
   this.y=y;
 }

 void setdata()
 {
  x=100;
  y=200;
 }
 void setdata(int z)
 {
  x=y=z;
 }
 void printdata()
 {
 System.out.println(x+" "+y);
 }
}
class overloadmain
{
  public static void main(String args[])
  {
    overload o1=new overload();
    overload o2=o1;
    o1.setdata();
    o1.printdata();o2.printdata();
    o2.setdata(10,20);
    o1.printdata();o2.printdata();
    o1.setdata(1000);
    o1.printdata();o2.printdata();
  }
}
