
public class Difuzzyfication 
{
	double rule1, rule2, rule3, rule4;
	public Difuzzyfication(double rule1, double rule2, double rule3, double rule4)
	{
		this.rule1 = rule1;
		this.rule2 = rule2;
		this.rule3 = rule3;
		this.rule4 = rule4;
	}
	public double Difuzzy()
	{
		double centroidLow = (0+25+50) / 3;
		double centroidNormal = (25+50+75) / 3;
		double centroidHigh = (50+100+100) / 3;
		double rulesTotal = rule1 + rule2 + rule3 + rule4;
		double weightedValue = (centroidLow*rule1) + (centroidNormal*rule2) + (centroidHigh*rule3) + (centroidHigh*rule4);
		double result = weightedValue / rulesTotal;
		return result;
	}
}
