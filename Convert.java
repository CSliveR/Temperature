

public class Convert {

    public static float celsiusToFahrenheit(int temp) {
        return (temp * 9 / 5) + 32;
    }
    
    public static float celsiusToKelvin(float temp) {
        return (float) (temp + 273.15);
    }

    public static float celsiusToCelsius(float temp) {
        return (float) temp;
    }
    
    
    
    public static float fahrenheitToCelsius(float temp) {
        return (temp - 32) * 5 / 9;
    }

    public static float fahrenheitToKelvin(float temp) {
        return (float) (fahrenheitToCelsius(temp) + 273.15);
    }

    public static float fahrenheitToFahrenheit(float temp) {
        return (float) temp;
    }

    public static float kelvinToCelsius(float temp) {
        return -celsiusToKelvin(temp);
    }

    public static float kelvinToFahrenheit(float temp) {
        return (float) (temp - 273.15) * 9/5 + 32;
    }

    public static float kelvinToKelvin(float temp) {
        return (float) temp;
    }


}

