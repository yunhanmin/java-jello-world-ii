// ModifiedHelloWorld.java

public class ModifiedHelloWorld {
 
  // main method
  public static void main ( String[] args ) {
   
//    System.out.print ( "Hello World!\n\"I'm Hanmin." );
//    System.out.print ( " This is my story...\"\n" );
//    System.out.print ( "\tOnce upon a time, a long time ago...\\\n" );
  
    // Concatenation (take one String and add it to another String)
    String text;                        // Declare a String
    text = "APCS is fun!";              // Assign the String a value
    String text2 = "Don't you agree?";   // Declare + Assign a String
    String text3 = new String( "We can do it!~" ); // Stirng constructor
    
    String result = text + "\n" + text2 + "\n" + text3;
    
    System.out.println( result );
    
    int grade = 100;
    
    grade = grade * 3;
    System.out.println( " I want a grade of " + grade + "." );
    
    System.out.println ( grade * 2.125 );
    double grade2 = grade * 2.125;
    System.out.println( grade2 );
    
    boolean lightesOn = true;
    
    /*
     * Challenge (Assignment)
     * Modify this program.
     * Create: 1 boolean, 1 int, 1 double, 1 String with any values
     * Do some kind of math with the int and double and reset values
     * Print the values before and after modification
     * Print the values AGAIN but modify them IN the print statement
     * Print the String with some escape chracters (\n)
     * Print the boolean
     */
    // int
    int num = 7;
    System.out.println( num );
    num = 5 * num;
    System.out.println( num );
    System.out.println( num / 2 ); 
    // value
    double value = num;
    value = 4.5452 * value;
    value = 7.54988978;
    System.out.println( value );
    value = 5.484 * value;
    System.out.println( value );
    System.out.println( value / 2 );
    // boolean
    boolean lightsOn = true;
    System.out.println ( lightsOn );
    
    String newtext = "AP Computer \n\nScience is not easy, right?";
    System.out.println( newtext );
  } // end main method
  
} // end class