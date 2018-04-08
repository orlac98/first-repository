import java.util.Scanner;

public class Convert{
 public static void main(String[] args){
	Scanner input = new Scanner( System.in );

	  int Selection;

 {

 System.out.println( "Main Menu" );
 System.out.println( "Enter 0 for Fahrenheit to Celsius equivalent " );
 System.out.println( "Enter 1 for Celsius to Fahrenheit equivalent" );
 System.out.println( "2 to Exit " );
 System.out.print( "Selection: " );
 Selection = input.nextInt();

  if ( Selection != 2 )

   {

  System.out.print( "Enter temperature: " );
  int oldTemperature = input.nextInt();



  {
   case 1:
     System.out.printf( "%d Fahrenheit is %d Celsius\n",
       oldTemperature, celsius( oldTemperature ) );
      break;

   case 2:
     System.out.printf( "%d Celsius is %d Fahrenheit\n",
       oldTemperature, fahrenheit( oldTemperature ) );
      break;




	   }

    }

}


while ( choice != 3 );

}


 public static int celsius( int fahrenheitTemperature )
   {
     return ( (int) ( 5.0 / 9.0 * ( fahrenheitTemperature - 32 ) ) );
}

 public static int fahrenheit( int celsiusTemperature )
   {
      return ( (int) ( 9.0 / 5.0 * celsiusTemperature + 32 ) );

  }
}


