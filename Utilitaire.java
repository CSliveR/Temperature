
import java.util.Scanner;


public class Utilitaire{
    public static void main(String[] args){

        Scanner lecteur = new Scanner(System.in);
        
        int temp = Temperature.saisieTemperature(lecteur);
        String uniteDeb = Temperature.saisieUnites(lecteur);
        String uniteFin = Temperature.saisieUnites(lecteur);

        if ((uniteDeb.compareToIgnoreCase("Celsius") == 0) && (uniteFin.compareToIgnoreCase("Celsius") == 0)) {
            Convert.celsiusToCelsius(temp);
        }
        else if ((uniteDeb.compareToIgnoreCase("Celsius") == 0) && (uniteFin.compareToIgnoreCase("Fahrenheit") == 0)) {
            Convert.celsiusToFahrenheit(temp);
        }
        else if((uniteDeb.compareToIgnoreCase("Celsius") == 0) && (uniteFin.compareToIgnoreCase("Kelvin") == 0)) {
            Convert.celsiusToKelvin(temp);
        }
        
        
        
        else if ((uniteDeb.compareToIgnoreCase("Fahrenheit") == 0) && (uniteFin.compareToIgnoreCase("Celsius") == 0)) {
            Convert.fahrenheitToCelsius(temp);
        }
        else if ((uniteDeb.compareToIgnoreCase("Fahrenheit") == 0) && (uniteFin.compareToIgnoreCase("Fahrenheit") == 0)) {
            Convert.fahrenheitToFahrenheit(temp);
        }
        else if ((uniteDeb.compareToIgnoreCase("Fahrenheit") == 0) && (uniteFin.compareToIgnoreCase("Kelvin") == 0)) {
            Convert.fahrenheitToKelvin(temp);
        }

        
        else if ((uniteDeb.compareToIgnoreCase("Kelvin") == 0) && (uniteFin.compareToIgnoreCase("Celsius") == 0)) {
            Convert.kelvinToCelsius(temp);
        }
        else if ((uniteDeb.compareToIgnoreCase("Kelvin") == 0) && (uniteFin.compareToIgnoreCase("Fahrenheit") == 0)) {
            Convert.kelvinToFahrenheit(temp);
        }
        else if ((uniteDeb.compareToIgnoreCase("Kelvin") == 0) && (uniteFin.compareToIgnoreCase("Kelvin") == 0)) {
            Convert.kelvinToKelvin(temp);
        }









    }

}
