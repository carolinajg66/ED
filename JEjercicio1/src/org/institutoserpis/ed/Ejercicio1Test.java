package org.institutoserpis.ed;

import static org.junit.Assert.*;

import org.junit.Test;

public class Ejercicio1Test {

	   @Test
	   public void sumaPositivos() {
	      System.out.println("Sumando dos números positivos ");
	       Ejercicio1 a = new Ejercicio1(2,3);
	       assertTrue(a.sumar() == 5);
	   }
	   
	   @Test
	   public void SumaNegativo(){
		   System.out.println("Sumando dos números 	negativos");
		   Ejercicio1 b = new Ejercicio1(-2,-3);
		   assertTrue(b.sumar()==-5);
		   
	   }
	   
	   @Test 
	   public void SumaNegativoPositico(){
		   System.out.println("Sumando un número positivo y otro negativo");
		   Ejercicio1 c =new Ejercicio1(5,-2);
		   assertTrue(c.sumar()==3);
	   }
	   
	   @Test
	   public void restaPositivos() {
	      System.out.println("Restando dos números positivos ");
	       Ejercicio1 d = new Ejercicio1(5,3);
	       assertTrue(d.restar() == 2 );
	   }
	   
	   @Test
	   public void restaNegativo(){
		   System.out.println("Restando dos números negativos");
		   Ejercicio1 e = new Ejercicio1(-2,-3);
		   assertTrue(e.restar()==1);
		   
	   }
	   
	   @Test 
	   public void restaNegativoPositico(){
		   System.out.println("Restando un número positivo y otro negativo");
		   Ejercicio1 f =new Ejercicio1(5,-2);
		   assertTrue(f.restar()==7);
	   }
	   
	   @Test
	   public void multiplicacionPositivos() {
	      System.out.println("Multiplicando dos números positivos ");
	       Ejercicio1 g = new Ejercicio1(2,3);
	       assertTrue(g.multiplicar() == 6 );
	   }
	   
	   @Test
	   public void multiplicacionNegativo(){
		   System.out.println("Multiplicando dos números negativos");
		   Ejercicio1 h = new Ejercicio1(-2,-3);
		   assertTrue(h.multiplicar()==6);
		   
	   }
	   
	   @Test 
	   public void multiplicacionNegativoPositico(){
		   System.out.println("Multiplicando un número positivo y otro negativo");
		   Ejercicio1 i =new Ejercicio1(5,-8);
		   assertTrue(i.multiplicar()==-40);
	   }
	   @Test
	   public void divisionPositivos() {
	      System.out.println("Dividiendo dos números positivos ");
	       Ejercicio1 j = new Ejercicio1(6,2);
	       assertTrue(j.dividir() == 3 );
	   }
	   
	   @Test
	   public void divisionNegativo(){
		   System.out.println("Dividiendo dos números negativos");
		   Ejercicio1 k = new Ejercicio1(-6,-2);
		   assertTrue(k.dividir()==3);
		   
	   }
	   
	   @Test 
	   public void divisionNegativoPositico(){
		   System.out.println("Dividiendo un número positivo y otro negativo");
		   Ejercicio1 l =new Ejercicio1(6,-2);
		   assertTrue(l.dividir() == -3);
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	
}
