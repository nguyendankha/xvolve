package com.xvolve.basics;

public class AssignmentOperators {
	public static void main(String[] args) {
		// create variables
	    int a = 4;
	    int var;

	    // assign value using =
	    var = a;
	    // var = 4
	    System.out.println("var using =: " + var);
	    
	    // assign value using =+
	    var += a; // += ~ var = var + a - 8
	    System.out.println("var using +=: " + var);
	    
	    // assign value using =*
	    var *= a; // var = var * a ~ var = 8 * 4 = 32
	    System.out.println("var using *=: " + var);
	    
	    // assign value using /*
	    var /= a; // var = var / a ~ 32 / 4 = 8
	    System.out.println("var using /=: " + var);
	    
	    // assign value using %*
	    var %= a; // var = var % a = 8 % 4 = 0
	    System.out.println("var using %=: " + var);
	}

}
