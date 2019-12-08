package edu.neu.coe.info6205.life.library;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import io.jenetics.BitChromosome;
import io.jenetics.BitGene;
import io.jenetics.Genotype;
import io.jenetics.Mutator;
import io.jenetics.engine.Engine;
import io.jenetics.engine.EvolutionResult;
import io.jenetics.util.Factory;
import io.jenetics.util.RandomRegistry;


public class Test {
	// 2.) Definition of the fitness function.
    private static int eval(Genotype<BitGene> gt) {
        return gt.getChromosome().as(BitChromosome.class).bitCount();
    }
    
    private static int testeval(Genotype<BitGene> gt) {
    	return gt.getChromosome().as(BitChromosome.class).bitCount()*2;
    }
 
    public static void main(String[] args) {
        // 1.) Define the genotype (factory) suitable
        //     for the problem.
        Factory<Genotype<BitGene>> gtf = Genotype.of(BitChromosome.of(10, 0.5));
        Genotype<BitGene> test1 = Genotype.of(BitChromosome.of(8, 0.5), 10);
        System.out.println(test1);
 
        // 3.) Create the execution environment.
        Engine<BitGene, Integer> engine = Engine.builder(Test::eval, gtf).build();
        Engine<BitGene, Integer> testengine = Engine.builder(Test::testeval, test1).build();
 
        // 4.) Start the execution (evolution) and
        //     collect the result.
        Genotype<BitGene> result = engine.stream().limit(100).collect(EvolutionResult.toBestGenotype());
        Genotype<BitGene> testresult = testengine.stream().limit(100).collect(EvolutionResult.toBestGenotype());
 
        System.out.println("Hello World:\n" + result);
        
        
        Map<Integer, Integer> OriginPhenomap = new HashMap<>();
        OriginPhenomap.put(1, 1);
        OriginPhenomap.put(2, 2);
        OriginPhenomap.put(3, 3);
        OriginPhenomap.remove(1);
        OriginPhenomap.remove(1);
    }
}
