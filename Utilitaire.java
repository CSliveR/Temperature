
import java.util.Scanner;


public class Utilitaire{
    public static void main(String[] args) {
        
        Scanner lecteur = new Scanner(System.in);
        String uniteDeb = Temperature.saisieUnites(lecteur);
        String uniteFin = Temperature.saisieUnites(lecteur);
        int temp = Temperature.saisieTemperature(lecteur);

        if ((uniteDeb.compareToIgnoreCase("Celsius") == 0) && (uniteFin.compareToIgnoreCase("Celsius") == 0)) {
            System.out.println(temp + "°C" + " = " + Convert.celsiusToCelsius(temp) + "°C");
        }
        else if ((uniteDeb.compareToIgnoreCase("Celsius") == 0) && (uniteFin.compareToIgnoreCase("Fahrenheit") == 0)) {
           System.out.println(temp + "°C" + " = " + Convert.celsiusToFahrenheit(temp) + "°F");
        }
        else if((uniteDeb.compareToIgnoreCase("Celsius") == 0) && (uniteFin.compareToIgnoreCase("Kelvin") == 0)) {
            System.out.println(temp + "°C" + " = " + Convert.celsiusToKelvin(temp) + " K");
        }
        
        
        
        else if ((uniteDeb.compareToIgnoreCase("Fahrenheit") == 0) && (uniteFin.compareToIgnoreCase("Celsius") == 0)) {
            System.out.println(temp + "°F" + " = " + Convert.fahrenheitToCelsius(temp) + "°C");
        }
        else if ((uniteDeb.compareToIgnoreCase("Fahrenheit") == 0) && (uniteFin.compareToIgnoreCase("Fahrenheit") == 0)) {
            System.out.println(temp + "°F" + " = " + Convert.fahrenheitToFahrenheit(temp) + "°F");
        }
        else if ((uniteDeb.compareToIgnoreCase("Fahrenheit") == 0) && (uniteFin.compareToIgnoreCase("Kelvin") == 0)) {
            System.out.println(temp + "°F" + " = " + Convert.fahrenheitToKelvin(temp) + " K");
        }

        
        else if ((uniteDeb.compareToIgnoreCase("Kelvin") == 0) && (uniteFin.compareToIgnoreCase("Celsius") == 0)) {
            System.out.println(temp + " K" + " = " + Convert.kelvinToCelsius(temp) + "°C");
        }
        else if ((uniteDeb.compareToIgnoreCase("Kelvin") == 0) && (uniteFin.compareToIgnoreCase("Fahrenheit") == 0)) {
            System.out.println(temp + " K" + " = " + Convert.kelvinToFahrenheit(temp) + "°F");
        }
        else if ((uniteDeb.compareToIgnoreCase("Kelvin") == 0) && (uniteFin.compareToIgnoreCase("Kelvin") == 0)) {
           System.out.println(temp + " K" + " = " + Convert.kelvinToKelvin(temp) + " K");
        }

    }

}
