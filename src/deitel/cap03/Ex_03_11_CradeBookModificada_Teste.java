/*
 * Copyright (C) 2016 Alex
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
package deitel.cap03;

/**
 *
 * @author Alex
 */
public class Ex_03_11_CradeBookModificada_Teste {

	public static void main(String args[]) {
		Ex_03_11_CradeBookModificada_A gradeBook_A
				= new Ex_03_11_CradeBookModificada_A("CS101 Introduction to Java Programming");
		gradeBook_A.displayMessage();
		System.out.println();

		Ex_03_11_CradeBookModificada_B gradeBook_B
				= new Ex_03_11_CradeBookModificada_B("CS102 Data Structures in Java");
		gradeBook_B.setProfessorName("Alex Parloti");
		gradeBook_B.displayMessage();
		System.out.printf("This course is presented by: %s%n", gradeBook_B.getProfessorName());
		System.out.println();

		Ex_03_11_CradeBookModificada_C gradeBook_C
				= new Ex_03_11_CradeBookModificada_C("CS303 Algorithms", "Alex Parloti");
		gradeBook_C.displayMessage();
		System.out.printf("This course is presented by: %s%n", gradeBook_B.getProfessorName());
		System.out.println();

		Ex_03_11_CradeBookModificada_D gradeBook_D
				= new Ex_03_11_CradeBookModificada_D("CS302 Software Engineering", "Alex Parloti");
		gradeBook_D.displayMessage();
	}
}
