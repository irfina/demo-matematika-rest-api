/*
 * MathController.java
 * 
 * Created on March 29, 2021, 13:59
 */
package demo.rest.math.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import demo.rest.math.api.dto.AngkaFloatDto;
import demo.rest.math.api.dto.AngkaIntDto;
import demo.rest.math.model.AlgoritmaDasar;
import demo.rest.math.model.Statistika;

/**
 * 
 * @author Irfin
 */
@RestController
@RequestMapping("/demo-math-api")
public class MathController 
{
	@GetMapping("/rerata")
	public double hitungRerata(@RequestBody AngkaFloatDto dto)
	{
		Statistika stat = new Statistika();
		
		List<Float> listBil = dto.getListBil();
		float[] arrBil = new float[listBil.size()];
		for (int i = 0; i < arrBil.length; i++) {
			arrBil[i] = listBil.get(i);
		}
		
		return stat.hitungRerata(arrBil);
	}
	
	@GetMapping("/jaraktitik")
	public float hitungJarakTitik(@RequestParam(name = "x1") int x1, 
								  @RequestParam(name = "y1") int y1, 
								  @RequestParam(name = "x2") int x2, 
								  @RequestParam(name = "y2") int y2)
	{
		AlgoritmaDasar algo = new AlgoritmaDasar();
		
		return algo.hitungJarakDuaTitik(x1, y1, x2, y2);
	}
	
	@PostMapping("max")
	public int cariNilaiMaks(@RequestBody AngkaIntDto dto)
	{
		AlgoritmaDasar algo = new AlgoritmaDasar();
		
		int[] arrBil = new int[dto.getListBil().size()];
		
		int idx = 0;
		for (int i : dto.getListBil()) {
			arrBil[idx++] = i;
		}
		
		return algo.cariMaks(arrBil);
	}
}
