import java.util.*;

class time 
{
	int hr;
	int min;


time()
{
	hr=0;
	min=0;
}

time(int h, int m)
{
	hr=h;	
	min=m;
}

void acceptin()
{
	Scanner s= new Scanner(System.in);

	System.out.println("Enter hour and minutes");
	hr = s.nextInt();
	min = s.nextInt();
}


time add(time t)
{
	int h = hr + t.hr + (min+t.min)/60;
	int m = (min+t.min)%60;
	return new time(h,m);
}


void display()
{
	System.out.println(hr + " " + min);
}

public static void main(String args[])
 { 
	time t1 = new time(10,25);
	time t2 = new time();
	t2.acceptin();
	time t3 = t1.add(t2);
	System.out.println("t1 details");
	t1.display();
	System.out.println("t2 details");
	t2.display();
	System.out.println("Sum of t1 and t2:");
	t3.display();
 } 
}
