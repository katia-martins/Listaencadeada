package view;

import controller.listaencadeada;
import br.edu.fateczl.katia.listaInt.*;

public class Principal {

	public static void main(String[] args) {
		listaencadeada controller = new listaencadeada();
		
		Lista lista1 = new Lista();
		Lista lista2 = new Lista();
		
		for (int i = 0; i < 5; i++) {
			int num1 = (int) ((Math.random() * 200) + 1);
			lista1.insereInicio(new No(num1));
			
			int num2 = (int) ((Math.random() * 200) + 1);
			lista2.insereInicio(new No(num2));
		}

		System.out.println(lista2.toString());
		
		
		controller.ascSort(lista2);
	}

}
