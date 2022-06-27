import java.util.Scanner;

class Condition{
    public static void main(String[]args){
    	// check num is odd or even from user
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter Number to check odd and even:");
    	int number = sc.nextInt();
    	if(number % 2 == 0) {
    		System.out.println("Even Number");
    	} else {
    		System.out.println("Odd Number");
    	}
    	

}
}