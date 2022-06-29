import java.util.ArrayList;

public class TeamExperienceLevel
{
		String name = "TeamExperienceLevel";
		String shape = "triangle";
		ArrayList <Integer> arr_x = new ArrayList <Integer>();
		ArrayList <Integer> arr_y = new ArrayList <Integer>();
		ArrayList <Integer> point1 = new ArrayList <Integer>();
		ArrayList <Integer> point2 = new ArrayList <Integer>();
		public int teamExperience;
		public TeamExperienceLevel(int teamExperience)
		{
			this.teamExperience=teamExperience;
		}
		
		public double beginner()
		{
			arr_x.clear();
			arr_y.clear();
			arr_x.add(0);
			arr_x.add(15);
			arr_x.add(30);
			arr_y.add(0);
			arr_y.add(1);
			arr_y.add(0);
			double equation = teamExperienceCalculation(arr_x,arr_y);
			return equation;
		}
		
		public double intermediate()
		{
			arr_x.clear();
			arr_y.clear();
			arr_x.add(15);
			arr_x.add(30);
			arr_x.add(45);
			arr_y.add(0);
			arr_y.add(1);
			arr_y.add(0);
			double equation = teamExperienceCalculation(arr_x,arr_y);
			return equation;
		}
		
		public double expert()
		{
			arr_x.clear();
			arr_y.clear();
			arr_x.add(30);
			arr_x.add(60);
			arr_x.add(60);
			arr_y.add(0);
			arr_y.add(1);
			arr_y.add(0);
			double equation = teamExperienceCalculation(arr_x,arr_y);
			return equation;
		}
		
		public double teamExperienceCalculation(ArrayList <Integer> arr_x, ArrayList <Integer> arr_y)
		{
			point1.clear();
			point2.clear();
			for(int i=0; i<arr_x.size(); i++)
			{
				if (teamExperience<arr_x.get(0) || (i+1)>=arr_x.size())
				{
					point1.add(0);
					point1.add(0);
					point2.add(0);
					point2.add(0);
					return 0;
				}
				else if ((i+1)<arr_x.size() && teamExperience>arr_x.get(i) && teamExperience<arr_x.get(i+1))
				{
					point1.add(arr_x.get(i));
					point1.add(arr_y.get(i));
					point2.add(arr_x.get(i+1));
					point2.add(arr_y.get(i+1));
					break;
				}
				else if (teamExperience==arr_x.get(i)) //netaked 
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
			double equation = (slope * teamExperience) + b;
			double equation2 = Math.round(equation * 100.0) / 100.0;
			return equation2;		
		}
	}