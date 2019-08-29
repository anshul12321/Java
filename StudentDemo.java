import java.util.*;
class student
{
   String usn,name;
   int subs;
   int marks[];
   int credits[];
   float sgpa;
 student(){
   Scanner s=new Scanner(System.in);
   System.out.println("Enter usn name and no. of subjects");
   usn=s.next();
   name=s.next();
   subs=s.nextInt();
   marks=new int[subs];
   credits=new int[subs];
   System.out.println("Enter corresponding marks and credits");
   for(int i=0;i<subs;i++){
     marks[i]=s.nextInt();
     credits[i]=s.nextInt();
    }
   }
 student(String usn,String name,int subs){
   Scanner s=new Scanner(System.in);
   this.usn=usn;
   this.name=name;
   this.subs=subs;
   marks=new int[subs];
   System.out.println("enter corresponding marks and credits");
   for(int i=0;i<subs;i++){
     marks[i]=s.nextInt();
     credits[i]=s.nextInt();
    }
   }
 void calculate(){
   float sop=0,totalcredits=0;int grade;
   for(int i=0;i<subs;i++){
     if(marks[i]>=90)
      grade=10;
     if(marks[i]>=75 && marks[i]<90)
       grade=9;
     if(marks[i]>=60 && marks[i]<75)
       grade=8;
     if(marks[i]>=50 && marks[i]<60)
       grade=7;
     if(marks[i]<=40 && marks[i]<50)
       grade=6;
     else grade=0;
     
     sop+=grade*credits[i];
     totalcredits+=credits[i];
    }
    sgpa=sop/totalcredits;
  }
 void print(){
    System.out.println("USN:"+usn);
    System.out.println("Name:"+name);
    System.out.println("Number of subjects:"+subs); 
    System.out.println("Marks:");
    for(int i=0;i<subs;i++){
     System.out.println(marks[i]);}
   System.out.println("SGPA:"+sgpa);
   }
 }
class studentdemo{
  public static void main(String args[]){
   student s1=new student();
   s1.calculate();
   s1.print();

   student s2=new student("1BM18CS129","Anshul",5);
   s2.calculate();
   s2.print();
  }
}
