package gaCode;

import java.util.HashMap;
import java.util.Map;

import edu.neu.coe.info6205.life.base.Game;

public class Fitness {
	static Map<Integer, String> selectedmap = new HashMap<>();
	public static void selection(int ge) {
			for (int i=0; i<GenerateIndividual.getPhenomap().size(); i++) {
				if(GenerateIndividual.getPhenomap().get(i)!=null) {
					if (Game.run(0L, GenerateIndividual.getPhenomap().get(i)).generation<ge) {
						GenerateIndividual.getPhenomap().remove(i);
						GenerateIndividual.getGenomap().remove(i);
					}
				}
			}
	}
}
