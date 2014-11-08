 import java.util.Scanner;
  public class Q2
  {
   public static void main(String[] args)
 	{
	 int val1,val2,no=-1;
	 float c;
	 //String d;
	 //char oper;
	 Scanner in=new Scanner(System.in);
	 
	 
	 while(no!=0) {
	 System.out.println("Enter the 2 numbers to perform calculations");
	 val1=in.nextInt();
	 val2=in.nextInt();
 	 System.out.println("Now Press\n '1' for addition\n '2' for subtraction\n '3' for multiplication\n '4' for division\n '5' for remainder division or mod\n '0' for EXIT");
	 no=in.nextInt();
	 //d=in.nextLine();
	 
	  
	 //oper=d.charAt(1);
	 //a=d.substring();
	 //b=d.substring(2);
	
	
	switch(no)
	 {
	 case 1:
	 
	 c=val1+val2;
	 System.out.println(val1+"+"+val2+"="+c);
	 break;
	
	 case 2:
	 c=val1-val2;
	 System.out.println(val1+"-"+val2+"="+c);  
	 break;
 
	 case 3:
	 c=val1*val2;
 	 System.out.println(val1+"*"+val2+"="+c);
	 break;	 
	
	 case 4:
	 if(val2==0){
	 System.out.println("Denominator is ZERO so division is not possible");}
	 else {
	 c=(float)val1/val2;
	 System.out.println(val1+"/"+val2+"="+c);}
	 break;
 
  	 case 5:
	 c=val1%val2;
	 System.out.println(val1+"%"+val2+"="+c);
	 break;
	 case 0:
	 System.out.println("You exit successfully");
	 break;
}
}
	
	}
  }
	 