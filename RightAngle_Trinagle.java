
import java.util.Scanner;
public class RightAngle_Trinagle {
	
	// find either it is right angle triangle or not 

	public static void main(String[] args) {
		
		Scanner getinput=new Scanner(System.in);
		
		double h,b,p;
		double Sum_of_b_and_p;
		
		System.out.println("Enter the value for hypotenuse ");
		h=getinput.nextDouble();
		
		System.out.println("Enter the value for breadth ");
		b=getinput.nextDouble();

		System.out.println("Enter the value for perpendicular ");
		p=getinput.nextDouble();
		
		h = h*h;	b = b*b;	p = p*p;
		
		 Sum_of_b_and_p = b+p;
		 
		 if(h== Sum_of_b_and_p){
			 System.out.println("Since "+h +" = " +Sum_of_b_and_p +" therefore ");
			 System.out.println("It is right angle triangle ");
		 }
		 else{
			 System.out.println("Since "+h +" != " +Sum_of_b_and_p +" therefore ");
			 System.out.println("It is not right angle triangle ");
		 }
		


	}

}
