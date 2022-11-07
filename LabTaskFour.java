import java.util.*;

class LabTaskFour{

public static void main(String[] args) {

Scanner ob= new Scanner(System.in);
			
System.out.println("Entet matriculation  Marks");
			
double a=ob.nextDouble();
			
System.out.println("Enter Intermediate Marks");
		
double b=ob.nextDouble();
			
System.out.println("Enter test Marks");
		
double c=ob.nextDouble();
			
double total=(a/850*100)*0.1+(b/1100*100)*0.3+(c/100*100)*0.6;
			
System.out.println("your total CPN is :");
			
System.out.println(total);
		
	}
}