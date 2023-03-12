import java.util.Scanner;
import java.util.InputMismatchException;

public class Temperature {
   
    public static String saisieUnites(Scanner lecteur){
        String unite;
        
        do {
            System.out.println("Unités de température possibles: Celsius / Fahrenheit / Kelvin");
            System.out.println("Entrez une unité de température");

            
            lecteur = new Scanner(System.in);
            unite = lecteur.nextLine();
            
        } while (((unite.compareToIgnoreCase("Celsius") != 0
                || unite.compareToIgnoreCase("Fahrenheit") != 0) || (unite.compareToIgnoreCase("Kelvin") != 0)));
            
            lecteur.close();
        
        return unite;
    }
    
    public static int saisieTemperature(Scanner lecteur) {

        int temp = 0;

        try {
            System.out.println("Entrez une valeur entière");
            lecteur = new Scanner(System.in);
            temp = lecteur.nextInt(); lecteur.close();
            return temp;
        
        } catch (InputMismatchException e) {
            System.out.println("Saisie incorrecte !");
            return saisieTemperature(lecteur);
        }

    }

    



}
