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
public class Ex_03_15_Date {

	int dia;
	int mes;
	int ano;

	public Ex_03_15_Date(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public void displayDate() {
		System.out.printf("%d/%d/%d\n", mes, dia, ano);
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getDia() {
		return this.dia;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getMes() {
		return this.mes;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getAno() {
		return this.ano;
	}
}
