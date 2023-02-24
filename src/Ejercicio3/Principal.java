package Ejercicio3;

public class Principal {
	public static void main(String args[]) {
		int clave=0;
		int aciertos = 0;
		String nombre="";
		Countries pais;
		boolean bandera = false;
		
		String archivo = "Countries.txt";
		
		GestionarArchivo gestionararchivo = new GestionarArchivo();
		
		gestionararchivo.leerArchivo(archivo);
		
		nombre=gestionararchivo.leerNombre();
		
		for (int i=1;i<=10;i++) {
			
			System.out.println("Intento No." + i);
			int resultado = gestionararchivo.jugar();
			aciertos = aciertos + resultado;
			if (resultado == 1)
				System.out.println("Felicidades ha acertado, gano un punto");
			else
				System.out.println("No acerto, fallo el intento");
		}
		
		System.out.println();
		if (aciertos>0)
			System.out.println("Tuvo una puntuación de : " + aciertos);
		else
			System.out.println("Lo sentimos, no acertó ningún intento");
		
		gestionararchivo.escribirArchivo("classificacio.txt",nombre,aciertos);
		
		System.out.println("El resultado se guardo en el archivo classificacio.txt");
		
		System.out.println();
		System.out.println("Fin del programa");
		
	}

}
