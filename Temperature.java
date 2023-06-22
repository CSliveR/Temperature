import java.util.Scanner;
import java.util.InputMismatchException;

public class Temperature{
   
    public static String saisieUnites(Scanner lecteur) {
        System.out.println("Unités de température possibles: Celsius / Fahrenheit / Kelvin");
        System.out.println("Entrez une unité de température");
        String unite = lecteur.nextLine();

        while (unite.compareToIgnoreCase("Celsius") == 0 || unite.compareToIgnoreCase("Fahrenheit") == 0
                || unite.compareToIgnoreCase("Kelvin") == 0) {
            return unite;
        }

        return saisieUnites(lecteur);

    }
   
    public static int saisieTemperature(Scanner lecteur) throws InputMismatchException {
        int temp = 0;
        try {
            System.out.println("Entrez une valeur entière");
            temp = lecteur.nextInt();
            return temp;
        
        } catch (InputMismatchException e) {
            System.err.println("Saisie incorrecte !");
            lecteur = new Scanner(System.in);
            return saisieTemperature(lecteur);
        }

    }

    



}
