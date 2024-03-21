package com;

import java.util.Scanner;

public class Principal {
	public static void main (String []args) {
		
		 Scanner sc = new Scanner(System.in); // Se crea un objeto Scanner para leer la entrada del usuario
	        System.out.println("ingrese un numero entero:");
	        int a = sc.nextInt(); // Se lee un entero ingresado por el usuario y se almacena en la variable 'a'
	        System.out.println("ingrese un numero decimal:");
	        double d = sc.nextDouble(); // Se lee un número decimal ingresado por el usuario y se almacena en la variable 'd'
	        sc.nextLine(); // Se limpia el buffer de entrada
	        System.out.println("ingrese un texto:");
	        String s = sc.nextLine(); // Se lee una línea de texto ingresada por el usuario y se almacena en la variable 's'
	        
	        // Se imprime la cadena de texto ingresada por el usuario, junto con un mensaje que indica que es una cadena de texto
	        System.out.println("String: " + s);
	        System.out.println("Double: " + d);
	        System.out.println("Int: " + a);
	        
	}
}
