/*
 * Statistika.java
 * 
 * Created on March 29, 2021, 13:45
 */
package demo.rest.math.model;


/**
 * 
 * @author Irfin A
 *
 */
public class Statistika 
{
	public double hitungRerata(float[] bil)
	{
		double mean = 0;
		double sum = 0;
		
		for (int i = 0; i < bil.length; i++)
			sum += bil[i];
		
		mean = sum / bil.length;
		
		return mean;
	}
}
