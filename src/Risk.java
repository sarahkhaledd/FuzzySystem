import java.util.ArrayList;

public class Risk {
			String name = "Risk";
			String shape = "triangle";
			ArrayList <Double> arr_x = new ArrayList <Double>();
			ArrayList <Double> arr_y = new ArrayList <Double>();
			Boolean flagLow = false;
			Boolean flagNormal = false;
			Boolean flagHigh = false;
			public double risk;
			public Risk(double risk)
			{
				this.risk=risk;
				low();
				normal();
				high();
			}
			
			public void low()
			{
				arr_x.clear();
				arr_y.clear();
				arr_x.add(0.0);
				arr_x.add(25.0);
				arr_x.add(50.0);
				arr_y.add(0.0);
				arr_y.add(1.0);
				arr_y.add(0.0);
				flagLow = riskCalculation(arr_x, arr_y);
			}
			
			public void normal()
			{
				arr_x.clear();
				arr_y.clear();
				arr_x.add(25.0);
				arr_x.add(50.0);
				arr_x.add(75.0);
				arr_y.add(0.0);
				arr_y.add(1.0);
				arr_y.add(0.0);
				flagNormal = riskCalculation(arr_x, arr_y);

			}
			
			public void high()
			{
				arr_x.clear();
				arr_y.clear();
				arr_x.add(50.0);
				arr_x.add(100.0);
				arr_x.add(100.0);
				arr_y.add(0.0);
				arr_y.add(1.0);
				arr_y.add(0.0);
				flagHigh =  riskCalculation(arr_x, arr_y);
			}
			public Boolean riskCalculation(ArrayList <Double> arr_x, ArrayList <Double> arr_y)
			{
				Boolean flag = false;
					if (risk>arr_x.get(0) && risk<arr_x.get(1) || risk>arr_x.get(1) && risk<arr_x.get(2) )
					{
						flag = true;
					}
				return flag;
			}
			public String riskLevel()
			{
				if(flagLow == true)
					return "Low";
				if(flagNormal == true)
					return "Normal";
				return "High";
			}
}
