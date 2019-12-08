package gaCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import edu.neu.coe.info6205.life.base.Game;
import io.jenetics.BitChromosome;
import io.jenetics.BitGene;
import io.jenetics.Genotype;
import io.jenetics.util.RandomRegistry;

public class GenerateIndividual {
	public static Map<Integer, String> Genomap = new HashMap<>();
	public static Map<Integer, String> OriginGenomap = new HashMap<>();
	public static Map<Integer, String> Phenomap = new HashMap<>();
	public static Map<Integer, String> OriginPhenomap = new HashMap<>();
	
	
	
	public static String getGeno(int key) {
		return Genomap.get(key);
	}
	public static String putGeno(Integer key, String value) {
		return Genomap.put(key, value);
	}
	
	public static Map<Integer, String> getGenomap() {
		return Genomap;
	}
	
	public static String getPheno(int key) {
		return Phenomap.get(key);
	}
	public static String putPheno(Integer key, String value) {
		return Phenomap.put(key, value);
	}
	
	public static Map<Integer, String> getPhenomap() {
		return Phenomap;
	}
	
	public static String getOriginGenomap(int key) {
		return OriginGenomap.get(key);
	}
	
	public static String getOriginPhenomap(int key) {
		return OriginPhenomap.get(key);
	}
	
	public static void geneIndi(long t) {
		Random random = new Random(t);
		
		for (int i=0; i<1000; i++) {
			int pointNum = random.nextInt(30)+1;
			String coordinate="";
			String intCoordinate = "";
			for(int j=0; j<pointNum; j++) {
				int tempX = 0;
				int tempY = 0;
				for(int k=0; k<3; k++) {
					String tempBit=String.valueOf(random.nextInt(2));
					tempX = tempX + (int) (Integer.parseInt(tempBit)*Math.pow(2, (2-k)));
					coordinate = coordinate + tempBit;
				}
				for(int k=3; k<6; k++) {
					String tempBit=String.valueOf(random.nextInt(2));
					tempY = tempY + (int) (Integer.parseInt(tempBit)*Math.pow(2, (5-k)));
					coordinate = coordinate + tempBit;
				}
				intCoordinate = intCoordinate + String.valueOf(tempX) + " " + String.valueOf(tempY) + ", ";
			}
			intCoordinate = intCoordinate.substring(0, intCoordinate.length()-2);			
			Genomap.put(i, coordinate);
			OriginGenomap.put(i, coordinate);
			Phenomap.put(i, intCoordinate);
			OriginPhenomap.put(i, intCoordinate);
		}	
	}
}
