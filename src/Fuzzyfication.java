import java.util.ArrayList;

public class Fuzzyfication 
{
	ArrayList <Double> fuzzy = new ArrayList <Double>();
	public ArrayList<Double> Fuzzy()
	{
		ProjectFunding projectFunding = new ProjectFunding(50);
		double veryLow = projectFunding.veryLow();
		double low = projectFunding.low();
		double medium = projectFunding.medium();
		double high = projectFunding.high();
		fuzzy.add(veryLow);
		fuzzy.add(low);
		fuzzy.add(medium);
		fuzzy.add(high);

		TeamExperienceLevel teamExperience = new TeamExperienceLevel(40);
		double beginner = teamExperience.beginner();
		double intermediate = teamExperience.intermediate();
		double expert = teamExperience.expert();
		fuzzy.add(beginner);
		fuzzy.add(intermediate);
		fuzzy.add(expert);
		return fuzzy;
	}
}
