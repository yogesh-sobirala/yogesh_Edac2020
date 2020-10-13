


// problem--1
/*public class java {
	
	public static void main(String[] args) {
		
		System.out.println("hello world");
	}
}*/










// problem--2
/*import java.util.Scanner;
public class java {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		System.out.println("enter roll no :");
		
		int Rollno =  scan.nextInt();
		

		System.out.println("enterd roll no is :"+Rollno);

	}


}*/






// problem--3a
/*import java.util.Scanner;

public class java {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		 System.out.println("enter a integer value:");
		 float x = scan.nextFloat(),y;
		 //int x = scan.nextInt();
		  y = x*x + 3*x - 7; 
		System.out.println(y);
		
		if(y == (int)y)
		{
			System.out.println("y is of integer/short/byte data type");	
		}
		else
		{
			System.out.println("y is of float/double data type");
		}
	}
}*/






// problem--3b
/*import java.util.Scanner;

public class java {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		 System.out.println("enter a integer value:");
		 float x = scan.nextFloat(),y;
		 //int x = scan.nextInt();
		   y = x++ + ++x; 
		System.out.println(y);
		
		if(y == (int)y)
		{
			System.out.println("y is of integer/short/byte data type");	
		}
		else
		{
			System.out.println("y is of float/double data type");
		}
	}
}*/








// problem--3c
/*import java.util.Scanner;

public class java {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		 System.out.println("enter a integer value:");
		 float x = scan.nextFloat(),z;
		 int y = scan.nextInt();
		 z = x++ - --y - --x  +  x++; 
		System.out.println(z);
		
		if(z == (int)z)
		{
			System.out.println("z is of integer/short/byte data type");	
		}
		else
		{
			System.out.println("z is of float/double data type");
		}
	}
}*/









// problem--3d
/*public class java {
	public static void main(String args[]) {
		boolean x=true,y=true,z=true;
		 z = x && y || !(x || y); 
		System.out.println(z);
		 }
}*/





// problem--4
/*import java.util.Scanner;
public class java {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter two byte values :");
		byte x = scan.nextByte(),z;
		byte y = scan.nextByte();
		z=(byte) (x+y);
		
		System.out.println(z);
		 }
}*/





// problem--5
/*public class java {
	public static void main(String args[]) {
		
	     String s1 = args[0];
	   	 System.out.println("welcome"+args[0]);
	}
}*/




// problem--6
 /* import java.util.Scanner;
public class java {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter radius of circle :");
		Double r = scan.nextDouble(),area,circumference,pi=3.14;
		area = pi*r*r ;
		circumference = 2*pi*r;
		System.out.println(area);
		System.out.println(circumference);
	}
}*/






// problem--7
  /*import java.util.Scanner;
public class java {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter 5 sub marks :");

		int m1 = scan.nextInt();
		int m2 = scan.nextInt();
		int m3 = scan.nextInt();
		int m4 = scan.nextInt();
		int m5 = scan.nextInt();
		double percentage;
		double totalmarks = m1+m2+m3+m4+m5;
		percentage = (totalmarks/500)*100;
		System.out.println("percentage marks"= +percentage+"%");
	}
}*/






   // problem--8
 /* import java.util.Scanner;
public class java {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the principle amount :");
		int p = scan.nextInt();
		System.out.println("enter the no of years :");
		int t = scan.nextInt();
		System.out.println("enter the rate of intreset :");
		double r = scan.nextDouble(),SI;
		SI = (p*t*r)/100;
		System.out.println(SI);
	}
}*/







// problem--9
/* import java.util.Scanner;
public class java {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the no of days :");
		int days = scan.nextInt();
		double months,years;
	   months = days/30;
	   years = days/365;
	   System.out.println(months);
	   System.out.println(years);
	}
}*/






  // problem--10
  /* import java.util.Scanner;
public class java {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the fahrenheit temperature :");
		double f = scan.nextDouble(),celcius;
		celcius = 5*(f-32)/9;
		System.out.println(celcius);
	}
}*/








// problem--11
/*import java.util.Scanner;
 public class java {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a,b values :");

		int a = scan.nextInt();
		int b = scan.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
		
	}
 }*/






  // problem--12
 /*import java.util.Scanner;
 public class java {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter employee basic salary :");

		int basicsal = scan.nextInt(),DA,HRA;
		//int basicsal=9000,DA,HRA;
		double grosssalary;
		   if(basicsal<10000)
		   {
			   
			   DA = (basicsal/100)*10;
			   HRA = (90/100)*basicsal;
			   grosssalary = basicsal + DA + HRA;
			   System.out.println(grosssalary);
			}
		   if(basicsal>=10000)
		   {
			
			   DA = (basicsal/100)*98;
			   HRA = 2000;
			   grosssalary = basicsal + DA + HRA;
			   System.out.println(grosssalary);
		   }
	}
 }*/





 // problem--13
  /*import java.util.Scanner;
public class java {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter 3 values :");

		int tata = scan.nextInt();
		int apple = scan.nextInt();
		int royace = scan.nextInt(),result,temp;
		
		
		if(tata > apple && tata > royace)
		{
			System.out.println("greatest num is tata "+tata);
		}
		else
		{
		if(apple > royace)
		{
			System.out.println("greatest num is apple "+apple);
		}
		else
		{
			System.out.println("greatest num is royace "+royace);
			

		}
	}


           
    //   temp = (tata>apple)?tata:apple;
    //    result = (royace>temp)?royace:temp;
    //     System.out.println("greatest num is  "+result);
     
    //  	   result = royace >(tata>apple?tata:apple)?royace:((tata>apple)?tata:apple);
	//	   System.out.println("greatest num is  "+result);			        
}
}*/





// problem--14
  /*import java.util.Scanner;
public class java {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the year :");

		int year = scan.nextInt(),leapyear;
		if(year%4 == 0)
		{
		System.out.println("leapyear");
	}
		else
		{
			System.out.println("not a leapyear");
		}
   }
 }*/






    // problem--15
   /* import java.util.Scanner;
public class java {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter two characters :");

		String m = scan.next();
		String f = scan.next();
		
		System.out.println("enter age :");
		int age = scan.nextInt();
		if(age>=24)
		{
			System.out.println("both m and f are eligiable for marriage");
		}
		else
		{
			System.out.println("both m and f are not eligiable for marriage");
		}
		}
}*/



		
		

		
		
		
		

		