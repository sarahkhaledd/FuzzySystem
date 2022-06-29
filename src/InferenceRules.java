import java.util.ArrayList;

/*
	    1. If project_funding is high or team_experience_level is expert then risk is low.
		2. If project_funding is medium and team_experience_level is intermediate or team_experience_level is beginner then risk is normal.
		3. If project_funding is very low then risk is high.
		4. If project_funding is low and team_experience_level is beginner then risk is high.
*/
public class InferenceRules 
{
	ArrayList <Double> rules = new ArrayList <Double>();
	double veryLow, low, medium, high, beginner, intermediate, expert;
	public InferenceRules(double veryLow, double low, double medium, double high, double beginner, double intermediate, double expert)
	{
		this.veryLow = veryLow;
		this.low = low;
		this.medium = medium;
		this.high = high;
		this.beginner = beginner;
		this.intermediate = intermediate;
		this.expert = expert;
	}
	public ArrayList <Double> rules()
	{
		double rule1;
		if(high>expert)
		{
			rule1 = high;
		}
		else 
		{
			rule1 = expert;
		}
		
		double rule2;
		if(medium>intermediate)
		{
			rule2 = intermediate;
			if(rule2<beginner)
			{
				rule2 = beginner;
			}
		}
		else
		{
			rule2 = medium;
			if(rule2<beginner)
			{
				rule2 = beginner;
			}
		}
		
		double rule3 = veryLow;
		
		double rule4;
		if(low<beginner)
		{
			rule4 = low;
		}
		else 
		{
			rule4 = beginner;
		}
		rules.add(rule1);
		rules.add(rule2);
		rules.add(rule3);
		rules.add(rule4);
		return rules;
	}
}