package Ejercicio3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class GestionarArchivo {
	
	
	HashMap<Integer, Countries> countries = new HashMap<>();
	
	public String leerNombre() {
		
		String nombre="";
		boolean bandera=true;
				
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.print("Ingrese su Nombre: ");	
			nombre = input.nextLine();
		}while(nombre.length()==0);
		
		return nombre;
		
	}
	
	public void leerArchivo(String nombreArchivo) {
		
		Scanner sc = new Scanner(System.in);
		try {
			BufferedReader bf = new BufferedReader(new FileReader(nombreArchivo));
			String linea;
			int i=1;
			while ((linea = bf.readLine())!=null) {
				
				String[] items = linea.split(" ");
				Countries paises=new  Countries(i,items[0],items[1]);
				countries.put(i, paises);
				//System.out.println(i+"   "+linea);
				i++;
			}
			

		} catch (Exception e) {
			System.out.println("Error, no se encuentra el archivo " + nombreArchivo);
		}
		
	}
	
	public void escribirArchivo(String nombreArchivo, String nombre, int puntuacion) {
		String resultado = "Usuario: " + nombre + "   " + "Puntuación: " + puntuacion;
		
		FileWriter archivo = null;
        PrintWriter pw = null;
        try
        {
        	archivo = new FileWriter(nombreArchivo);
            pw = new PrintWriter(archivo);

            pw.println(resultado);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           if (null != archivo)
              archivo.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
		
		
	}
	
	public int calcularClaveAliatorio() {
		
		int numero = (int)(Math.random()*51+1);
		if (numero > 51)
			numero = 51;
		
		return numero;
	}
	
	public Countries obtenerPais(int clave) {
		 
		 Countries pais = countries.get(clave);
		
		return pais;
	}
	
public String preguntarNombreCapital(Countries pais ) {
		
		String nombre="";
		boolean bandera=true;
				
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.print("Diga el nombre del la capital que pertenece a " + pais.getCiudad() + ": ");	
			nombre = input.nextLine();
		}while(nombre.length()==0);
		
		return nombre;
		
	}
	
	public int jugar() {
		String capital="";
		int respuesta=0;
		int clave=0;
			
		clave = calcularClaveAliatorio();
		
		Countries pais = obtenerPais(clave);
		
		capital = preguntarNombreCapital(pais);
		
		if (capital.toString().equalsIgnoreCase(pais.getCapital()))
			respuesta = 1;
		
		return respuesta;
		
	}
	
}
