package controller;

import br.edu.fateczl.katia.listaInt.*;

public class listaencadeada {
	
	public listaencadeada() {
		super();
	}
	
	public Lista concat(Lista lista1, Lista lista2) {
		Lista concatLista = new Lista();
		int tam = lista1.getTamanho();
		
		for (int i = 1; i < tam; i++) {
			concatLista.insereInicio(new No(lista1.pegaElemento(i)));
			concatLista.insereInicio(new No(lista2.pegaElemento(i)));
		}
		
		return concatLista;
	}
	
	public Lista clone(Lista lista) { 
		Lista cloneLista = new Lista();
		int tam = lista.getTamanho();
		
		for (int i = 1; i == tam; i++) {
			cloneLista.insereInicio(new No(lista.pegaElemento(i)));
		}
		
		return cloneLista;
	}
	
	public void ascSort(Lista lista) {
		int tam = lista.getTamanho();
		
		for (int i = 0; i < tam - 1; i++) {
			for (int j = i + 1; j < tam; i++) {
				if (lista.search(i) > lista.search(j)) {
					int aux = lista.search(j);
					lista.insereInicio(j, new No(lista.search(i)));
					lista.insereInicio(i, new No(lista.search(aux)));
				}
			}
		}
	}
	
	public void descSort(Lista lista) {
		int tam = lista.getTamanho();
		
		for (int i = 0; i < tam - 1; i++) {
			for (int j = i + 1; j < tam; i++) {
				if (lista.search(i) < lista.search(j)) {
					int aux = lista.search(j);
					lista.insereInicio(j, new No(lista.search(i)));
					lista.insereInicio(i, new No(lista.search(aux)));
				}
			}
		}
	}
	
}

