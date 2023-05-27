package projectk;

//Java code to illustrate Addition operator
public class Operators{
		public static void main(String[] args)
		{
		// initializing variables
		int num1 = 10, num2 = 20, sum = 0;

		// Displaying num1 and num2
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);

		// adding num1 and num2
		sum = num1 + num2;
		System.out.println("The sum = " + sum);
		
		
		// Java code to illustrate Division operator
			{
				// initializing variables
				int a = 12345, b = 1000, div = 0;

				// Displaying num1 and num2
				System.out.println("num1 = " + a);
				System.out.println("num2 = " + b);

				// Dividing num1 and num2
				div = a / b;
				System.out.println("Division = " + div);
				
			}
			
			// Java code to illustrate Subtraction operator
			{
				// initializing variables
				int c, d ; int result =0;
				try (Scanner in = new Scanner(System.in)) {
					{
					c = in.nextInt();
					d = in.nextInt();
					}
				}
				result = c-d;
				System.out.println(result);
				
			}
	

		}
}