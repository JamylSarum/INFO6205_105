package gaCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import edu.neu.coe.info6205.life.base.Game;

public class Main {
	
	public static Map<Integer, String> Phenomap = new HashMap<>();
	
	static long t = System.currentTimeMillis();
	
	public static void main(String[] args) {
		
		GenerateIndividual.geneIndi(t);
		Fitness.selection(100);
		Mutation.mutate();
		Fitness.selection(300);
		Mutation.mutate();
		Fitness.selection(500);
		Mutation.mutate();
		Fitness.selection(700);
		Mutation.mutate();
		System.out.println("The seed is: "+ t);
		System.out.println("The program generate 1000 individuals and do selection and mutation to them ");
		for (int k=0; k<GenerateIndividual.getPhenomap().size(); k++) {			
			if (GenerateIndividual.getPhenomap().get(k)!=null) {
				System.out.println("The result string pattern(Phenomap) which fit the requirement:");
				System.out.println(GenerateIndividual.getPhenomap().get(k));
				System.out.println("The origin string pattern(Phenomap) of the pattern above:");
				System.out.println(GenerateIndividual.getOriginPhenomap(k));
				System.out.println("---------------------------------------------");
			}
			
		}
	}
	
}
