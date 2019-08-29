class emp
{
 private int empid;
 private double empbasicsal;
 private double emphra,empda,empit;
  
 emp(){
  empid=0;empbasicsal=0;emphra=-0;empda=0;empit=0;
  }
 emp(int id,double bsal,double hra,double da,double it)
 {
  empid=id;
  empbasicsal=empbasicsal;
  emphra=hra;
  empda=da;
  empit=empit;
 }
 double calculate(){
  double gross;
  gross=empbasicsal+empbasicsal*emphra+empbasicsal*empda-empbasicsal*empit;
  return gross;
 }
 void setdata (int id,double bsal,double hra,double da,double it)
  {
   empid=id;
   empbasicsal=bsal;
   emphra=hra;
   empda=empda;
   empit=it;
  }
}
class empmain
{
  public static void main(String args[])
   {
    emp e1=new emp();
    emp e2=new emp(11,2010.50,0.90,1.20,0.30);
    double g=e2.calculate();
    System.out.println("Gross salary of employee 2:"+g);
    e1.setdata(10,39216.06,0.80,0.90,0.20);
    double g1=e1.calculate();
    System.out.println("Gross salary of employee 1:"+g1);
   }
}
