/*This Program convert the given binary number to decimal number. 
   Syed Zeshan Ali
   ID 12003065467*/

import java.util.Scanner;
import static java.lang.Math.pow;

public class BinaryNumber {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		String binary;
		try{
		System.out.print("Enter Binary Number:\t");
		binary=read.next();
		int[] arr=new int[binary.length()];
		for(int i=0;i<binary.length();i++){		//Converting characters to integers
			arr[i]=binary.charAt(i)-48;
		}
		print(arr);
		convertDecimal(arr);
		
		//print(arr);
		System.out.println("Decimal Number is :\t"+toString(arr));
		}catch(Exception e){}
	}
	public static void convertDecimal(int arr[]){
		
		for(int i=0 ;i<arr.length;i++){
			arr[i]=arr[i]*(int)pow(2,arr.length-(i+1));	//Computing decimal values of each bit
			//System.out.print(arr[i]+" ");
			
		}
//		int sum=0;
//		for(int i=0;i<arr.length;i++){
//			sum+=arr[i];
//		}
//		return sum;
		//print(arr);
	}
	public static String toString(int arr[]){
		String num;
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];				//computing sum of all converted digits
		}
		num=String.format("%d", sum);
		return num;
	}
	public static void print(int arr[]){
		for(int x:arr){
			System.out.print(x+" ");	//printing Elements using enhanced for-loop
		}
		System.out.println();
	}

}
