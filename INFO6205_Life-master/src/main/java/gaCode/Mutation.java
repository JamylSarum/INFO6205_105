package gaCode;

import java.util.Map;

public class Mutation {
	public static void mutate() {
		for (int k=0; k<GenerateIndividual.getGenomap().size(); k++) {
			if (GenerateIndividual.getGenomap().get(k)!=null) {
				StringBuilder temp = new StringBuilder((GenerateIndividual.getGenomap().get(k)));
				for (int n=0; n<GenerateIndividual.getGenomap().get(k).length(); n++) {
					int p = (int) (Math.random()*(10-1)+1);
					if (p<2) {
						int tempBit = 1-Integer.parseInt(String.valueOf(GenerateIndividual.getGenomap().get(k).charAt(n)));
						temp.setCharAt(n, (char) (tempBit+'0'));
					}
				}
				GenerateIndividual.putGeno(k, temp.toString());
				String intCoordinate = "";
				for (int m=0; m<temp.toString().length(); m=m+6) {
					int tempX = (int) ((int)Integer.parseInt(String.valueOf(GenerateIndividual.getGenomap().get(k).charAt(m)))*Math.pow(2, 2)+(int)Integer.parseInt(String.valueOf(GenerateIndividual.getGenomap().get(k).charAt(m+1)))*Math.pow(2, 1)+(int)Integer.parseInt(String.valueOf(GenerateIndividual.getGenomap().get(k).charAt(m+2)))*Math.pow(2, 0));
					int tempY = (int) ((int)Integer.parseInt(String.valueOf(GenerateIndividual.getGenomap().get(k).charAt(m+3)))*Math.pow(2, 2)+(int)Integer.parseInt(String.valueOf(GenerateIndividual.getGenomap().get(k).charAt(m+4)))*Math.pow(2, 1)+(int)Integer.parseInt(String.valueOf(GenerateIndividual.getGenomap().get(k).charAt(m+5)))*Math.pow(2, 0));
					intCoordinate = intCoordinate + String.valueOf(tempX) + " " + String.valueOf(tempY) + ", ";
				}
				intCoordinate = intCoordinate.substring(0, intCoordinate.length()-2);
				GenerateIndividual.putPheno(k, intCoordinate);
			}
		}
	}
}
