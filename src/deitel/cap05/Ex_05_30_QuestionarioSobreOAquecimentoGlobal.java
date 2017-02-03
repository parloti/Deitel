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

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Ex_05_30_QuestionarioSobreOAquecimentoGlobal {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int resp, acertos = 0;

		System.out.println("1 - Quantos países estão discutindo ações para reduzir de emissões poluentes na Cúpula do Clima em Copenhague?");
		System.out.println("1) 45");
		System.out.println("2) 52");
		System.out.println("3) 192");
		System.out.println("4) 205");
		resp = input.nextInt();
		System.out.println();
		if (resp == 3) {
			acertos++;
		}

		System.out.println("2 - O que é o protocolo de Kyoto?");
		System.out.println("1) É um acordo internacional que estabelece metas de redução de gases poluentes para os países industrializados");
		System.out.println("2) É um acordo internacional onde os países se comprometiam a estabelecer metas de redução de gases poluentes  na Cúpula de Copenhague");
		System.out.println("3) É um documento publicado em 1992  apresentando os princípios do Tratado da ONU sobre Mudanças Climáticas");
		System.out.println("4) É um compromisso de redução de emissões poluentes firmado por países asiáticos");
		resp = input.nextInt();
		System.out.println();
		if (resp == 1) {
			acertos++;
		}

		System.out.println("3 - Qual a potencial perda de espécies de árvores no Brasil com o aumento da temperatura da Terra em 4° C?");
		System.out.println("1) 25% das espécies do centro do País desaparecem");
		System.out.println("2) 25% das espécies do centro e 45% das espécies amazônicas desaparecem");
		System.out.println("3) 50% das espécies do centro e 60% das espécies amazônicas desaparecem");
		System.out.println("4) 80% de todas as espécies desaparecem");
		resp = input.nextInt();
		System.out.println();
		if (resp == 2) {
			acertos++;
		}

		System.out.println("4 - Qual foi o ano mais quente da última década no mundo?");
		System.out.println("1) 2003, com aumento de temperatura anômalo de 0,815 °C");
		System.out.println("2) 2009, com aumento de temperatura anômalo de 0,634 °C");
		System.out.println("3) 2008, com aumento de temperatura anômalo de 0,976 °C");
		System.out.println("4) 2005, com aumento de temperatura anômalo de 0,615 °C");
		resp = input.nextInt();
		System.out.println();
		if (resp == 4) {
			acertos++;
		}

		System.out.println("5 - Se todo o gelo da Terra desaparecesse, o nível do mar subiria aproximadamente:");
		System.out.println("1) 1 metro");
		System.out.println("2) 37 metros");
		System.out.println("3) 50 metros");
		System.out.println("4) 65 metros");
		resp = input.nextInt();
		System.out.println();
		if (resp == 4) {
			acertos++;
		}

		switch (acertos) {
			case 0:
			case 1:
			case 2:
			case 3:
				System.out.println("É o momento de aprimorar seu conhecimento sobre o aquecimento global");
				System.out.println("https://noticias.terra.com.br/ciencia/10-perguntas-sobre-aquecimento-global");
				System.out.println("https://pt.wikipedia.org/wiki/Aquecimento_global");
				break;
			case 4:
				System.out.printf("Muito Bom");
				break;
			case 5:
				System.out.printf("Excelente");
				break;
		}
		System.out.println();
	}
}
