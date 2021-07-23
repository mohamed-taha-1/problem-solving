

// An Enum class
enum Day
{
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
	THURSDAY, FRIDAY, SATURDAY;
}

// Driver class that contains an object of "day" and
// main().
public class Test
{
	Day day;

	// Constructor
	public Test(Day day)
	{
		this.day = day;
	}

	// Prints a line about Day using switch
	public void dayIsLike()
	{
		switch (day)
		{
		case MONDAY:
			System.out.println("Mondays are bad.");
			break;
		case FRIDAY:
			System.out.println("Fridays are better.");
			break;
		case SATURDAY:
		case SUNDAY:
			System.out.println("Weekends are best.");
			break;
		default:
			System.out.println("Midweek days are so-so.");
			break;
		}
	}

	// Driver method
	public static void main(String[] args)
	{
		String str = "MONDAY";
		Test t1 = new Test(Day.valueOf(str));
		t1.dayIsLike();
	}
}





/************
 * values(), ordinal() and valueOf() methods :

These methods are present inside java.lang.Enum.
values() method can be used to return all values present inside enum.
Order is important in enums.By using ordinal() method, each enum constant index can be found, just like array index.
valueOf() method returns the enum constant of the specified string value, if exists.

 * 
 * ******/




