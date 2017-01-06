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
public class Ex_03_11_CradeBookModificada_D {

	private String courseName;
	private String professorName;

	public Ex_03_11_CradeBookModificada_D(String course, String professor) {
		courseName = course;
		professorName = professor;
	}

	public void setCourseName(String course) {
		courseName = course;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setProfessorName(String professor) {
		professorName = professor;
	}

	public String getProfessorName() {
		return professorName;
	}

	public void displayMessage() {
		System.out.printf("Welcome to the GradeBook for%n%s! %n", getCourseName());
		System.out.printf("This course is presented by: %s.", getProfessorName());
	}
}
