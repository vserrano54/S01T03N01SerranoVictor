package Ejercicio1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Principal {
	
	public static void main(String args[]) {
		
		
		//Delaracion del ArrayList de Tipo Month
		ArrayList<Month> listaMes = new ArrayList<Month>();
		
		//Llenamos el ArrayList con los meses del año a excepcion de Agosto
		System.out.println("Llenamos el ArrayList con los meses del año a excepcion de Agosto");
		listaMes.add(new Month("Enero"));
		listaMes.add(new Month("Febrero"));
		listaMes.add(new Month("Marzo"));
		listaMes.add(new Month("Abril"));
		listaMes.add(new Month("Mayo"));
		listaMes.add(new Month("Junio"));
		listaMes.add(new Month("Julio"));
		listaMes.add(new Month("Septiembre"));
		listaMes.add(new Month("Octubre"));
		listaMes.add(new Month("Noviembre"));
		listaMes.add(new Month("Diciembre"));
		
		//Impresion de los Meses del año con excepcion del mes de agosto
		System.out.println("Impresion de los Meses del año con excepcion del mes de agosto");
		for (Month mes : listaMes) {
			System.out.println(mes.getNombre());
			
		}
		System.out.println();
		//Agregamos al ArrayList el mes de agosto en su pocision correcta, utilizando el metodo add(indice,elemento)
		System.out.println("Agregamos al Array List el mes de agosto en su pocision correcta, utilizando el metodo add(indice,elemento)");
		
		listaMes.add(7, new Month("Agosto"));
		
		System.out.println();
		//Impresion de todos los meses del año
		System.out.println("Imprimimos todos los meses del año");
		for (Month mes : listaMes) {
			System.out.println(mes.getNombre());
					
		}
		
		//Convierte ArrayList del ejercicio anterior en un HashSet y asegúrate de que no permite duplicados
		//Este metodo no permite duplicados, pero presenta los elementos en un orden diferente al que se ingresan
		System.out.println();
		System.out.println("Convierte ArrayList del ejercicio anterior en un HashSet y asegúrate de que no permite duplicados");
		System.out.println("Este metodo no permite duplicados, pero presenta los elementos en un orden diferente al que se ingresan");
		Set<Month> listaMesHashSet = new HashSet();
		
		listaMesHashSet.add(new Month("Enero"));
		listaMesHashSet.add(new Month("Febrero"));
		listaMesHashSet.add(new Month("Marzo"));
		listaMesHashSet.add(new Month("Abril"));
		listaMesHashSet.add(new Month("Mayo"));
		listaMesHashSet.add(new Month("Junio"));
		listaMesHashSet.add(new Month("Julio"));
		listaMesHashSet.add(new Month("Agosto"));
		listaMesHashSet.add(new Month("Septiembre"));
		listaMesHashSet.add(new Month("Octubre"));
		listaMesHashSet.add(new Month("Noviembre"));
		listaMesHashSet.add(new Month("Diciembre"));
		listaMesHashSet.add(new Month("Diciembre"));
		
		for (Month meses : listaMesHashSet) {
			
			System.out.println(meses.getNombre());
			
		}
		
		System.out.println();
		
		System.out.println("Uso del metodo LinkedHashSet");
		System.out.println("Este metdo guarda y muestra los elementos en el orden en que se ingresa y no muestra o elimina duplicados.");
		System.out.println();
		Set<Month> listaMesLinkedHashSet = new LinkedHashSet();
		
		listaMesLinkedHashSet.add(new Month("Enero"));
		listaMesLinkedHashSet.add(new Month("Febrero"));
		listaMesLinkedHashSet.add(new Month("Marzo"));
		listaMesLinkedHashSet.add(new Month("Abril"));
		listaMesLinkedHashSet.add(new Month("Mayo"));
		listaMesLinkedHashSet.add(new Month("Junio"));
		listaMesLinkedHashSet.add(new Month("Julio"));
		listaMesLinkedHashSet.add(new Month("Agosto"));
		listaMesLinkedHashSet.add(new Month("Septiembre"));
		listaMesLinkedHashSet.add(new Month("Octubre"));
		listaMesLinkedHashSet.add(new Month("Noviembre"));
		listaMesLinkedHashSet.add(new Month("Diciembre"));
		listaMesLinkedHashSet.add(new Month("Diciembre"));
		
		for (Month mesLinked : listaMesLinkedHashSet) {
			
			System.out.println(mesLinked.getNombre());
			
		}
		
	
	}
}
