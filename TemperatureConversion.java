/*
Name: Long, Levi
Date: 26/08/2015
*/

package temperatureconversion;

public class TemperatureConversion 
{
    public static void main(String[] args) 
    {
        final double FREEZING_POINT = 32;
        int tempFarenheit = 69;
        double x = 5, y = 9;
        double celsius = ( x / y ) * (tempFarenheit - FREEZING_POINT);
        
        System.out.println(tempFarenheit + " degrees farenheit is equivalent to " + celsius
        + " degrees celsius.\n\n");
        
        double farenheit = (celsius * ( x / y)) + FREEZING_POINT;
        
        System.out.println(celsius + " degrees celsius is equivalent to " + farenheit +
                " degrees farenheit.");
        
        System.exit(0);
    }
    
}
