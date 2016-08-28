/*
Name: Long, Levi
Date: 26/08/2015
 */
package metriclength;

public class MetricLength
{
    public static void main(String[] args) 
    {
        final double CM_PER_INCH = 2.54;
        double inches = 10.3;
        double centimeters = (inches * CM_PER_INCH);
        
        System.out.println(inches + " inches is equivalent to " + centimeters + " centimeters");
    }
    
}
