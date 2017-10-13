package is.ru.stringcalculator;
import static java.lang.System.out;
public class Calculator{
	
	public static int add(String text)
	{
		if(text.equals(""))
		{
			return 0;
		}
		else if(text.contains("-"))
		{
			String negative = negativeNumbers(text);
			throw new IllegalArgumentException("Negavives not allowed: " + negative);

		}
		else if(text.contains(",") || text.contains("\n"))
		{
			String[] numbers = text.split(",|\n");
			return sumUp(numbers);
		}
		
		else return toInt(text);	
		
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

	private static String negativeNumbers(String text)
	{
		String emptyString = "";
		String[] numbers = text.split(",|\n");
		for(String number : numbers)
		{
			if(number.contains("-"))
			{
				emptyString += number + ",";
			}
		}
		if(emptyString.endsWith(","))
		{
			emptyString = emptyString.substring(0, emptyString.length() -1);
		}
		System.out.println(emptyString);
		return emptyString;
	}

}