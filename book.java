import java.util.*;
class book {
  String name,author;
  int pages;
  double price;
	
 book()
 {
  name = null;
  author = null;
  pages = 0;
  price = 0.0;
  }
 void setData() 
 {Scanner in = new Scanner(System.in);
 name = in.next();
 author = in.next();
 pages = in.nextInt();
 price = in.nextFloat();
  }
 public String tostring()
 {
  String str=("NAME:"+name+"\nAUTHOR:"+author+"\nPAGES:"+pages+"\nPRICE:"+price);
  return str;
 }
 void getdata(){
  String str=tostring();
  System.out.println(str);
 }

 public static void main(String args[]){
  Scanner in=new Scanner(System.in);
  System.out.println("Enter number of books:");
  int n=in.nextInt();
  book b[]=new book[n];
  for(int i=0;i<n;i++)
   {
    b[i]=new book();
  }
  for(int i=0;i<n;i++)
  {
   System.out.println("Enter Name,author,pages and price of book:  "+(i+1));
   b[i].setData();
  }
  for(int i=0;i<n;i++)
  {
   System.out.println("Details of book:  "+(i+1));
  b[i].getdata();
  }
 }
}
  

