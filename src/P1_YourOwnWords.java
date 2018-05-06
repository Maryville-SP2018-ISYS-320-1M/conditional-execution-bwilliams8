import java.util.Scanner;

/*
	ISYS 320
	Name(s): Brian Williams
	Date: 
*/

/*  EXAMPLE
-- Your conditional expression
x < y

-- Your test values for x, y, z and do you expect true or false?
1, 2, 0 -> TRUE
2, 1, 0 -> FALSE
*/

/* 1. 
-- Your conditional expression

y > 0

-- Your test values for x, y, z and do you expect true or false?
0, 1, -3 -> TRUE
3, -5, 2 -> FALSE
*/

/* 2. 
-- Your conditional expression

x != 0

-- Your test values for x, y, z and do you expect true or false?
0, 3, 6 -> FALSE
1, 0, 0 -> TRUE
*/

/* 3.  
-- Your conditional expression
(y*z) % 2 != 0

-- Your test values for x, y, z and do you expect true or false?
0, 5, 1 -> TRUE
0, 6, 2 -> FALSE
*/

/* 4.  
-- Your conditional expression
y >= (z+x)

-- Your test values for x, y, z and do you expect true or false?
1, 5, 2 -> TRUE
3, 3, 3 -> FALSE
*/

public class P1_YourOwnWords {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		
		System.out.println( "Enter test values for x, y, and z, separated by spaces: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		double z = input.nextDouble();
		
		// Replace the conditional test, x < y below with your conditional expression to verify it is correct
		// using your test values
		if( y >= (z+x) ) {
			System.out.println("The test was TRUE");
		} else {
			System.out.println("The test was FALSE");
		}

	}

}
