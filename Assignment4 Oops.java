
1)WAP to define a class Student with attributes rollno, name , 
	marks accept data for 2 objects and display them.

class Student
{
	int rollno;
	String name;
	int marks;
	void display()
	{
		System.out.println("RollNo:"+rollno);
		System.out.println("Name:"+name);
		System.out.println("Marks:"+marks);
	}
	public static void main(String args[])
	{	
		
		Student stud1 = new Student();
		stud1.name="Viraj";
		stud1.rollno=1;
		stud1.marks=89;
		stud1.display();
		Student stud2 = new Student();
		stud2.name = "Raju";
		stud2.rollno = 2;
		stud2.marks=99;
		stud2.display();
	}
}
		













2)WAP to define a class Book with attributes id, name , 
	price accept data for 5 objects display book with highest price.*/





import java.util.Scanner;

class Book{
    Scanner input = new Scanner(System.in);
    int bookid,price;
    String name;
        void getdata()
        {
            System.out.println("Enter the Name of book");
            name=input.nextLine();
            System.out.println("Enter the Book Id");
            bookid=input.nextInt();
            System.out.println("Enter the Price");
            price=input.nextInt();
        }

}
public class BookDemo{

    void compare(Book b1,Book b2,Book b3)
    {
        if (b1.price>b2.price && b1.price>b3.price)
        {
            System.out.println("Book with highest price: "+b1.name);

        }else if(b2.price>b3.price)
        {
            System.out.println("Book with highest price: "+b2.name);
        }else
        {
            System.out.println("Book with highest price: "+b3.name);
        }

    }

    public static void main(String[] args) {
        Book b1= new Book();
        b1.getdata();
        Book b2=new Book();
        b2.getdata();
        Book b3 = new Book();
        b3.getdata();

        BookDemo demo=new BookDemo();

        demo.compare(b1,b2,b3);

    }

}


3)WAP to define a class Bank accept customerid, name, balance write method  
	to perform deposit, checkbal, withdraw keep min balance 1000.



import java.util.Scanner;

class Manupulation
{
    static int min_balance=500;

    void balance_enquiry()
    {
        int Balance= min_balance;
        System.out.println("Your account balance is "+Balance);
    }

    void withdraw(int amount)
    {
        if (min_balance-amount>=500)
        {
            min_balance = min_balance-amount;

            System.out.println("Your account balance is "+ min_balance);
        }else
        {
            System.out.println("Your account balance too low "+ min_balance);

        }
    }

    void Credit(int amount)
    {
        min_balance= min_balance+amount;

        System.out.println("Your account balance is "+ min_balance);

    }


}
class Banking
{
    public static void main(String[] args)
    {

        Manupulation M1=new Manupulation();
        Scanner input = new Scanner(System.in);

        String ch;
        int option;


        char y;
        do {
            System.out.println("Choose operation you want to perform...enter 0 to exit");
            System.out.println("1.balance enquiry");
            System.out.println("2.withdraw");
            System.out.println("3.credit");
            option = input.nextInt();


        if(1<=option && option<=3)
        {
            switch( option)

            {
                case 1:
                    M1.balance_enquiry();
                    break;

                case 2:
                    System.out.println("Enter withdraw amount.");
                    int amount = input.nextInt();
                    M1.withdraw(amount);
                    break;

                case 3:
                    System.out.println("Enter Credit amount.");
                    int amount1 =input.nextInt();
                    M1.Credit(amount1);
                    break;
            }
        }else
        {
            System.out.println("Please enter valid input");
        }


        System.out.println("you want to continue ");
        System.out.println("press Yes for yes or any key for No ");

        ch=input.next();
        


        }while(ch.equals("Y") );

                                                                       `

    }

}



4)WAP to define a class Employee with attributes id, name ,designation  accept data for 
	5 objects and display employee details whose designation is Manager.






import java.util.Scanner;
class Employee 
{
	
	int id;
	String name;
	String designation;

	Employee()
	{
	}
	
	Employee(int id, String name, String designation)
	{
		this.id = id;
		this.name = name;
		this.designation = designation;
	}


	void display()
	{
		System.out.println("Id:"+this.id);
		System.out.println("Name:"+this.name);
		System.out.println("Designation:"+this.designation);
	}

	Employee search(Employee[] emp, String person)
	{
		 for(int i=0;i<emp.length;i++)
		{
			String comp=emp[i].designation;
			if(comp.equals(person)){
			return emp[i];
		}

	}
	return null;

}
	
}
public class EmployeeDemo
{
 
	public static void main(String args[])
	{
		Employee emp1 = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of employees");
		int n = sc.nextInt();
		Employee[] emp = new Employee[n];
		for(int i = 0;i<n;i++)
		{
			System.out.println("Enter"+(i+1)+"Employee Id:");
			int id = sc.nextInt();
			System.out.println("Enter"+(i+1)+"Employee Name:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Enter"+(i+1)+"Employee Designation");
			//sc.nextLine();
			String designation = sc.next();
			emp[i]= new Employee(id,name,designation);
		}
		for(int i=0;i<emp.length;i++)
		{
 			System.out.println("Id:= "+emp[i].id);
 			System.out.println("Name := "+emp[i].name);
 			System.out.println("Designation := "+emp[i].designation);
		}

		
		System.out.println("Search for employee whose designation is manager");
		sc.nextLine();
		String person=sc.nextLine();
		Employee empDetails=emp1.search(emp,person);
		System.out.println("\n\n\n");
 		System.out.println("details ID := "+empDetails.id);
 		System.out.println("details NAME := "+empDetails.name);
 		System.out.println("details Designation := "+empDetails.designation);
	}  
}

5)WAP to define Class Simpleinterest with attributes principalamount, 
	 rate of interest static ,number of years calculate SI and display it. 



class Simpleinterest
{
	
		int principalAmount;
		static double rateOfInterest;
		int numberOfYears;
		double interest=0;

		void Interest()
		{	
			this.interest = (this.principalAmount * rateOfInterest * this.numberOfYears)/100;
			System.out.println("Interest is:"+this.interest);
		}
}

class SimpleInterestDemo
{
	public static void main(String args[])
	{
		Simpleinterest si = new Simpleinterest();
		si.principalAmount=100;
		Simpleinterest.rateOfInterest=5.2;
		si.numberOfyears=3;
		si.Interest();
	}
}
		

}
		



6)Write a program Complex number to add the real and imaginary part for 2 complex numbers



public class ComplexNumber{
  
   double real, img;
	
  
   ComplexNumber(double r, double i){
	this.real = r;
	this.img = i;
   }
	
   public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2)
   {
	
        ComplexNumber temp = new ComplexNumber(0, 0);

        temp.real = c1.real + c2.real;
        temp.img = c1.img + c2.img;
        
        //returning the output complex number
        return temp;
    }
    public static void main(String args[]) {
	ComplexNumber c1 = new ComplexNumber(5.5, 4);
	ComplexNumber c2 = new ComplexNumber(1.2, 3.5);
        ComplexNumber temp = sum(c1, c2);
        System.out.printf("Sum is: "+ temp.real+" + "+ temp.img +"i");
    }
}


