/*
 * Copyright (C) 2017 Alex
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package deitel.cap05;

/**
 *
 * @author Alex
 */
public class Ex_05_20_CalculandoOValorDePi {
	public static void main(String args[]) {
		double pi=0;
		boolean hasFiveDigitePrecison=false;
		int loopsUntilFiveDigitePrecison=0;
		for(int i=0;i<200000;i++){
			pi+=Math.pow(-1,i)*4/(2*i+1);
			if((int)(pi*100000)==314159&&!hasFiveDigitePrecison){
				hasFiveDigitePrecison=true;
				loopsUntilFiveDigitePrecison=i+1;
			}
		}
		
		System.out.println(pi);
		System.out.printf("Loops until five digite of precision: %d.%n",loopsUntilFiveDigitePrecison);
	}
}
