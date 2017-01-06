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

import java.time.LocalDateTime;

/**
 *
 * @author Alex
 */
public class Ex_03_16_HeartRates {

	String nome;
	String sobrenome;
	Ex_03_15_Date dateOfBirth;

	public Ex_03_16_HeartRates(
			String nome, String sobrenome, Ex_03_15_Date dateOfBirth) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dateOfBirth = dateOfBirth;
	}

	public int getAge() {
		int age;
		LocalDateTime now = LocalDateTime.now();
		age = now.getYear() - this.dateOfBirth.ano;
		if (now.getMonthValue() < this.dateOfBirth.mes) {
			age--;
		} else if (now.getMonthValue() == this.dateOfBirth.mes) {
			if (now.getDayOfMonth() < this.dateOfBirth.dia) {
				age--;
			}
		}
		return age;
	}

	public int frequenciaCardiacaMaxima() {
		return 220 - this.getAge();
	}

	public String frequenciaCardiacaAlvo() {
		return frequenciaCardiacaMaxima() * 0.5 + "-" + frequenciaCardiacaMaxima() * 0.85;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getSobrenome() {
		return this.sobrenome;
	}

	public void setDateOfBirth(Ex_03_15_Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Ex_03_15_Date getDateOfBirth() {
		return this.dateOfBirth;
	}
}
