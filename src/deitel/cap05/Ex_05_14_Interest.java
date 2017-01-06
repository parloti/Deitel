package deitel.cap05;

// Fig. 5.6: Interest.java
// Compound-interest calculations with for.
public class Ex_05_14_Interest {

	public static void main(String args[]) {
		double amount; // amount on deposit at end of each year
		double principal = 1000.0; // initial amount before interest

		// display headers
		for (double rate = 5; rate <= 10; rate++) {
			System.out.printf("%s%20.0f%s%n", "Tax:", rate,"%");
			System.out.printf("%s%20s%n", "Year", "Amount on deposit");

			// calculate amount on deposit for each of ten years
			for (int year = 1; year <= 10; year++) {
				// calculate new amount for specified year
				amount = principal * Math.pow(1.0 + rate/100, year);

				// display the year and the amount
				System.out.printf("%4d%,20.2f%n", year, amount);
			}
			System.out.println();
		}
	} // end main
} // end class Interest

/**
 * ************************************************************************
 * (C) Copyright 1992-2010 by Deitel & Associates, Inc. and * Pearson Education,
 * Inc. All Rights Reserved. * * DISCLAIMER: The authors and publisher of this
 * book have used their * best efforts in preparing the book. These efforts
 * include the * development, research, and testing of the theories and programs
 * * to determine their effectiveness. The authors and publisher make * no
 * warranty of any kind, expressed or implied, with regard to these * programs
 * or to the documentation contained in these books. The authors * and publisher
 * shall not be liable in any event for incidental or * consequential damages in
 * connection with, or arising out of, the * furnishing, performance, or use of
 * these programs. *
 * ***********************************************************************
 */
