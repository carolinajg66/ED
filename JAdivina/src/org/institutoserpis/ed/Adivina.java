package org.institutoserpis.ed;

import java.util.Random;
import java.util.Scanner;

public class Adivina {

	public static void main (String []args){
		
		Random random =new Random();
		Scanner scanner = new Scanner (System.in); 
		
		
		int numeroAleatorio = random.nextInt (1000)+1;
		
		System.out.println ("Tengo un numero escondido entre 1 y 1000");
		
		boolean correcto = false;
		int contadorIntentos = 0; 
		do { 
			contadorIntentos++;
			System.out.printf("Introduce un numero (intentos nª %d): " , contadorIntentos );
			
			String line =scanner.nextLine() ; 
			int numero = Integer.parseInt(line); 
			//damos pistas al usuario 
			
			if (numero < numeroAleatorio) 
			System.out.println("El numero es menor");
			
			else if (numero > numeroAleatorio) 
			System.out.println ("El numero es mayor "); 
			correcto = numero ==numeroAleatorio; 
			
			
		}while (correcto == false ) ;
		System.out.printf("Has ganado!!!!!!!.Has acertado (el intento nº %d) . \n ", contadorIntentos );
		
	}
}
	
3


