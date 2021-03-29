/*
 * AlgoritmaDasar.java
 * 
 * Created on March 29, 2021, 13:52
 */
package demo.rest.math.model;

/**
 * 
 * @author Irfin
 *
 */
public class AlgoritmaDasar
{
	/**
	 * Mencari jarak antara dua titik dengan rumus pythagoras.
	 * 
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @return
	 */
	public float hitungJarakDuaTitik(int x1, int y1, int x2, int y2)
	{
		float deltaX = x2 - x1;
		deltaX = Math.abs(deltaX);
		
		float deltaY = y2 - y1;
		deltaY = Math.abs(deltaY);
		
		// type-cast
		return (float) Math.sqrt((deltaX * deltaX) + (deltaY * deltaY));
	}
	
	public int cariMaks(int[] bil)
	{
		int max = bil[0];
		
		for (int i = 1; i < bil.length; i++) {
			if (bil[i] > max)
				max = bil[i];
		}
		
		return max;
	}
}

