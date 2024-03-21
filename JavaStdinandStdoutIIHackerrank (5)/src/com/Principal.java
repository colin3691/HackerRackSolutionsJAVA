package com;

import java.util.Scanner;

public class Principal {
	static int B, H;
    static boolean flag;
    
    static {
        Scanner scan = new Scanner(System.in);
        
        B = scan.nextInt();
        H = scan.nextInt();
        
        if(B <= 0 || H <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        } else {
            flag = true;
        }
        scan.close(); 
    }
    
	public static void main (String []args) {
		
		 if(flag) {
	            int area = B * H;
	            System.out.println(area);
	        }
		    
		   
 } 
}		    
		
		


