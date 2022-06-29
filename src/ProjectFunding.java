import java.util.ArrayList;

public class ProjectFunding 
{
	String name = "projectFunding";
	String shape = "trapezoidal";
	ArrayList <Integer> arr_x = new ArrayList <Integer>();
	ArrayList <Integer> arr_y = new ArrayList <Integer>();
	ArrayList <Integer> point1 = new ArrayList <Integer>();
	ArrayList <Integer> point2 = new ArrayList <Integer>();
	public int projectFund;
	public ProjectFunding(int projectFund)
	{
		this.projectFund=projectFund;
	}
	
	public double veryLow()
	{
		arr_x.clear();
		arr_y.clear();
		arr_x.add(0);
		arr_x.add(0);
		arr_x.add(10);
		arr_x.add(30);
		arr_y.add(0);
		arr_y.add(1);
		arr_y.add(1);
		arr_y.add(0);
		double equation = projectFundingCalculation(arr_x,arr_y);
		return equation;
	}
	
	public double low()
	{
		arr_x.clear();
		arr_y.clear();
		arr_x.add(10);
		arr_x.add(30);
		arr_x.add(40);
		arr_x.add(60);
		arr_y.add(0);
		arr_y.add(1);
		arr_y.add(1);
		arr_y.add(0);
		double equation = projectFundingCalculation(arr_x,arr_y);
		return equation;
	}
	
	public double medium()
	{
		arr_x.clear();
		arr_y.clear();
		arr_x.add(40);
		arr_x.add(60);
		arr_x.add(70);
		arr_x.add(90);
		arr_y.add(0);
		arr_y.add(1);
		arr_y.add(1);
		arr_y.add(0);
		double equation = projectFundingCalculation(arr_x,arr_y);
		return equation;
	}
	
	public double high()
	{
		arr_x.clear();
		arr_y.clear();
		arr_x.add(70);
		arr_x.add(90);
		arr_x.add(100);
		arr_x.add(100);
		arr_y.add(0);
		arr_y.add(1);
		arr_y.add(1);
		arr_y.add(0);
		double equation = projectFundingCalculation(arr_x,arr_y);
		return equation;
	}
	public double projectFundingCalculation(ArrayList <Integer> arr_x, ArrayList <Integer> arr_y)
	{
		point1.clear();
		point2.clear();
		for(int i=0; i<arr_x.size(); i++)
		{
			if (projectFund<arr_x.get(0) || (i+1)>=arr_x.size())
			{
				point1.add(0);
				point1.add(0);
				point2.add(0);
				point2.add(0);
				return 0;
			}
			else if ((i+1)<arr_x.size() && projectFund>arr_x.get(i) && projectFund<arr_x.get(i+1))
			{
				point1.add(arr_x.get(i));
				point1.add(arr_y.get(i));
				point2.add(arr_x.get(i+1));
				point2.add(arr_y.get(i+1));
				break;
			}
			else if (projectFund==arr_x.get(i)) //netaked 
			{
				point1.add(arr_x.get(i));
				point1.add(arr_y.get(i));
				if ((i+1)<arr_x.size())
				{
					point2.add(arr_x.get(i+1));
					point2.add(arr_y.get(i+1));
					break;
				}
				else
				{
					point2.add(arr_x.get(i-1));
					point2.add(arr_y.get(i-1));
					break;
				}
			}	
		}
		double equation = equationCalculation();
		return equation;
	}
	public double equationCalculation()
	{
		double y = point2.get(1)-point1.get(1);
		double x = point2.get(0)-point1.get(0);
		double slope = y/x;
		double b = point1.get(1) - (slope*point1.get(0));
		double equation = (slope * projectFund) + b; 
		return equation;
	}
}