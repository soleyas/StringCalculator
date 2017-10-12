package is.ru.stringcalculator;

public class Calculator{
	
	public static int add(String text)
	{
		if(text.equals(""))
		{
			return 0;
		}
		else if(text.contains(","))
		{
			String [] numbers;
			numbers = text.split(",");

			return sumUp(numbers);
			
		}
		else return 1;
		
	}

	private static int toInt(String number)
	{
		return Integer.parseInt(number);
	}

	private static int sumUp(String[] numbers)
	{
		int sum = 0;
		for(String number : numbers)
		{
			sum += toInt(number);
		}
		return sum;
	}
}