package Ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Principal {
	
	public static void main(String args[]) {
		
		//Se crea el ArrayList de enteros de la lista Numero 1
		List<Integer> listaDeNumero1;
		listaDeNumero1 = new ArrayList<>();
		
		//Se crea el ArrayList de enteros de la lista Numero 2
		List<Integer> listaDeNumero2;
		listaDeNumero2 = new ArrayList<>();
		
		//Se agregan los elementos en la primera lista del [1 - 10]
		System.out.println("Números agregados en la primera Lista de números");
		listaDeNumero1.add(1);
		listaDeNumero1.add(2);
		listaDeNumero1.add(3);
		listaDeNumero1.add(4);
		listaDeNumero1.add(5);
		listaDeNumero1.add(6);
		listaDeNumero1.add(7);
		listaDeNumero1.add(8);
		listaDeNumero1.add(9);
		listaDeNumero1.add(10);
		
		//Se crea el ListIterator de la primera lista de numeros
		ListIterator<Integer> lista = listaDeNumero1.listIterator();
		
		System.out.println("Se imprime la primera lista utilizando ListIterator");
		//Se imprime la primera lista utilizando ListIterator
		while(lista.hasNext()) {
			int num = lista.next();
			System.out.println(num);
		
		}
		System.out.println();
		System.out.println("Se recorre la primera lista en orden inverso y se almacena los elementos en la segunda lista ustilizando ListIterator");
		//Se recorre la primera lista en orden inverso y se almacena los elementos en la segunda lista ustilizando ListIterator
		while (lista.hasPrevious()) {
			int num = lista.previous();
			listaDeNumero2.add(num);
		}
		
		//Se crea el ListIterator de la segunda lista de numeros
		ListIterator<Integer> lista2 =listaDeNumero2.listIterator();
		
		//Se imprime la primera lista utilizando ListIterator
		System.out.println();
		System.out.println("Se imprime la segunda lista utilizando ListIterator");
		while(lista2.hasNext()) {
			int num = lista2.next();
			System.out.println(num);
		
		}

		
	}
}
