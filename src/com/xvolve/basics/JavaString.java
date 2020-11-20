package com.xvolve.basics;

public class JavaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java is cool!";
		System.out.println(str.length());       // return int 13
		System.out.println(str.charAt(2));      // return char 'v'
		System.out.println(str.charAt(5));      // return char 'i'
		 
		// Comparing two Strings
		String anotherStr = "Java is COOL!";
		System.out.println(str.equals(anotherStr));           // return boolean false
		System.out.println(str.equalsIgnoreCase(anotherStr)); // return boolean true
		System.out.println(anotherStr.equals(str));           // return boolean false
		System.out.println(anotherStr.equalsIgnoreCase(str)); // return boolean true
		// (str == anotherStr) to compare two Strings is WRONG!!!
		
		System.out.println(str.length());            // return int 13
		System.out.println(str.charAt(2));           // return char 'v'
		System.out.println(str.substring(0, 4));     // return String "Java"
		System.out.println(str.indexOf('a'));        // return int 1
		System.out.println(str.lastIndexOf('a'));    // return int 3
		System.out.println(str.endsWith("cool!"));   // return boolean true
		System.out.println(str.toUpperCase());       // return a new String "JAVA IS COOL!"
		System.out.println(str.toLowerCase());       // return a new String "java is cool!"
		
		// Converting String to Primitive
		String inStr = "5566";
		int number = Integer.parseInt(inStr);   // number <- 5566
		// Input to Integer.parseInt() must be a valid integer literal
		//number = Integer.parseInt("abc");     // Runtime Error: NumberFormatException
		
		/**
		 * String to double/float
		 * You could use Double.parseDouble(aDoubleStr) or Float.parseFloat(aFloatStr) to convert a String (containing a floating-point literal) into a double or float, e.g.
		 */
		String numberStr = "55.66";
		float aFloat = Float.parseFloat(numberStr);         // aFloat <- 55.66f
		double aDouble = Double.parseDouble("1.2345");  // aDouble <- 1.2345
		aDouble = Double.parseDouble("1.2e-3");         // aDouble <- 0.0012
		// Input to Integer.parseInt() must be a valid double literal
		//aDouble = Double.parseDouble("abc");          // Runtime Error: NumberFormatException
		
		/**
		 * String to char
		 * You can use aStr.charAt(index) to extract individual character from a String, where index begins at 0 and up to aStr.length()-1, e.g.,
		 */
		// Extract each char
		String msg = "Hello, world";
		char msgChar;
		for (int idx = 0; idx < msg.length(); ++idx) {
		   msgChar = msg.charAt(idx);
		   System.out.println(msgChar);
		}
		
		/**
		 * String to boolean
		 * You can use method Boolean.parseBoolean(aBooleanStr) to convert string of "true" or "false" to boolean true or false, e.g.,
		 */
		String boolStr = "true";
		boolean done = Boolean.parseBoolean(boolStr);   // done <- true
		boolean valid = Boolean.parseBoolean("false");  // valid <- false
		
		/**
		 * Converting Primitive to String
		 */
		/**
		 * To convert a primitive to a String, you can:

			Use the '+' operator to concatenate the primitive with an empty String "".
			Use the JDK built-in methods String.valueOf(aPrimitve), which is applicable to all primitives.
			Use the toString() methods of the respective wrapper class, such as Integer.toString(anInt), Double.toString(aDouble), Character.toString(aChar), Boolean.toString(aBoolean), etc.
		 */
		// Using String concatenation operator '+' with an empty String (applicable to ALL primitive types)
		String str1 = 123 + "";    // int 123 -> String "123"
		String str2 = 12.34 + "";  // double 12.34 -> String "12.34"
		String str3 = 'c' + "";    // char 'c' -> String "c"
		String str4 = true + "";   // boolean true -> String "true"
		 
		// Using String.valueOf(aPrimitive) (applicable to ALL primitive types)
		String str5 = String.valueOf(12345);   // int 12345 -> String "12345"
		String str6 = String.valueOf(true);    // boolean true -> String "true"
		String str7 = String.valueOf(55.66);   // double 55.66 -> String "55.66"
		 
		// Using toString() for each primitive type
		String str8 = Integer.toString(1234);   // int 1234 -> String "1234"
		String str9 = Double.toString(1.23);    // double 1.23 -> String "1.23"
		String str10 = Character.toString('z'); // char 'z' -> String "z"
		
		/**
		 * Formatting Strings - String.format()
		 * String.format() has the same form as printf()
		 */
		// Recall that you can use printf() to create a formatted string and send it to the display console, e.g.,
		System.out.printf("Hi, %d, %.1f%n", 11, 22.22);   // Send the formatted String to console
		
		//There is a similar function called String.format() which returns the formatted string, instead of sending to the console, e.g.,
		String myNewString = String.format("%.1f", 1.234);   // Returns a String "1.2" (for further operations)
		System.out.println(myNewString);
	}

}
