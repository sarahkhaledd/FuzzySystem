import java.util.ArrayList;

public class main {

	public static void main(String[] args) 
	{
		Fuzzyfication fuzzfyicaiton = new Fuzzyfication();
		ArrayList <Double> fuzzyNew = new ArrayList <Double>();
		fuzzyNew = fuzzfyicaiton.Fuzzy();
		InferenceRules inferenceRules = new InferenceRules(fuzzyNew.get(0), fuzzyNew.get(1), fuzzyNew.get(2), fuzzyNew.get(3),
															fuzzyNew.get(4), fuzzyNew.get(5), fuzzyNew.get(6));
		ArrayList <Double> rules = inferenceRules.rules();
		Difuzzyfication difuzzyfication = new Difuzzyfication(rules.get(0), rules.get(1), rules.get(2), rules.get(3));
		double result = difuzzyfication.Difuzzy();
		Risk risk = new Risk(result);
		String riskLevel = risk.riskLevel();
		System.out.println("Predicted Value (Risk) = "  + result);
		System.out.println("Risk will be: " + riskLevel);
	}
}