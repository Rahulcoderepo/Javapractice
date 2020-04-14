package basicPrograms;

public class Palindrom {
	public static void main(String[] args) {
		int num = 123, reminder, originalNumber, reversedNumber = 0;
		originalNumber = num; 
		
		while(num!= 0)
		{
			reminder = num % 10;
			reversedNumber = reversedNumber *10 + reminder;
			num /= 10;
		}
		if(originalNumber == reversedNumber)
			System.out.print(originalNumber + " is palindrom ");
		else {
			System.out.print(originalNumber + " Is not pallindrom");
			}
			
		}
}
