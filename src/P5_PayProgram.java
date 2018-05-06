import java.util.Scanner;

/*
	ISYS 320
	Name(s):Brian Williams
	Date: 
*/

public class P5_PayProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		
		System.out.println("Enter your hourly rate: ");
		double hourlyRate = input.nextDouble();
		
		System.out.println("Enter the number of hours you worked this week: ");
		int numOfHoursWorked = input.nextInt();
		
		System.out.print(computePay(hourlyRate, numOfHoursWorked));
		
		input.close();

	}
	
	public static double computePay(double hourly, int hours) {
		double moneyEarned = 0;
		double hours8 = hours;
		if(hours8 >= 8) {
			hours8 -= 8;
			moneyEarned += (hourly * 8); //8 hours of normal pay
			moneyEarned += ((hourly * 1.5) * hours8); //overtime
		} else {
			moneyEarned += (hourly * hours8); //less than 8 hours
		}
		
		return moneyEarned;
	}

}
