package org.institutoserpis.ed;

import java.util.Random;
import java.util.Scanner;

public class Adivina {

	public static void main (String []args){
		
		Random random =new Random();
		Scanner scanner = new Scanner (System.in); 
		
		
		int numeroAleatorio = random.nextInt (1000)+1;
		int numero; 
		System.out.println ("Tengo un numero escondido entre 1 y 1000");
		System.out.println("numeroAleatorio =" + numeroAleatorio);
		
		do { 
			System.out.println("Introduce un numero");
			String line =scanner.nextLine() ; 
			numero = Integer.parseInt(line); 
			//damos pistas al usuario 
			
			if (numero < numeroAleatorio) {
			System.out.println("El numero es menor");
			}
			else if (numero > numeroAleatorio) {
			System.out.println ("El numero es mayor "); 
			}
			
		}while (numero != numeroAleatorio) ;
		System.out.println("Has ganado " );
		}
	}



