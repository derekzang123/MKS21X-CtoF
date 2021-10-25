/*
What should the functions have as parameter(s)?
- celsiusToFahrenheit should have a parameter "C" for "celsius"
- fahrenheitToCelsius should have a parameter "F" for "fahrenheit"

What type should they be?
- Should be a float

What should the functions return?
- Should return floats
*/

public class CtoFTester {

  public static float celsiusToFahrenheit(float C) {
    return (9/5) * C + 32;
  }

  public static float fahrenheitToCelsius(float F) {
    return ((F - 32)*5)/9;
  }

  public static void main (String[] args) {

    // Tests for celsiusToFahrenheit
    System.out.println(celsiusToFahrenheit(0));
    System.out.println(celsiusToFahrenheit(5));
    System.out.println(celsiusToFahrenheit(-5));

    // Tests for fahrenheitToCelsius
    System.out.println(fahrenheitToCelsius(32));
    System.out.println(fahrenheitToCelsius(0));
    System.out.println(fahrenheitToCelsius(41));
  }



}
