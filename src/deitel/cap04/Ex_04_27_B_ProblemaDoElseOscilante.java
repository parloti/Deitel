/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deitel.cap04;

/**
 *
 * @author Alex
 */
public class Ex_04_27_B_ProblemaDoElseOscilante {

	public static void main(String[] args) {
		int x = 9, y = 11;
		if (x < 10) {
			if (y > 10) {
				System.out.println("*****");
			}
		} else {
			System.out.println("#####");
			System.out.println("$$$$$");
		}
		System.out.println("----------");
		x = 11;
		y = 9;
		if (x < 10) {
			if (y > 10) {
				System.out.println("*****");
			}
		} else {
			System.out.println("#####");
			System.out.println("$$$$$");
		}
	}
}
