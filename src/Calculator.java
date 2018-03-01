import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		/*
		System.out.print("Első szám: ");
		int firstNumber = scan.nextInt();
		
		System.out.print("Operátor: ");
		char operator = scan.next().charAt(0);
		
		System.out.print("Második szám: ");
		int secNumber = scan.nextInt();
		
		System.out.println("Eredmény: "+firstNumber+" "+operator+" "+secNumber+" = "+first_calculator(firstNumber, operator, secNumber));
		*/
		System.out.print("Feladat: ");
		String line = scan.nextLine();
		String[] arr = line.split(" ");//vagy slipt(" ")[i]  <-- adott elemet adja vissza
		
		System.out.println("Eredmény: "+sec_calculator(arr));
		scan.close();
		
	}
	
	public static double first_calculator(int firstNumber, char operator, int secNumber)	{

		switch(operator)
		{
			case '+': 	return(firstNumber+secNumber);
			
			case '-': 	return(firstNumber-secNumber);
			
			case '*': 	return(firstNumber*secNumber);
			
			case '/':
						if(secNumber != 0)
							return(firstNumber/secNumber);
						else 
							System.out.println("0 az osztó!");
		}
		
		System.out.println("Baj van teso");
		return 0;
	}
	
	public static double sec_calculator(String[] arr)	{
		
		return 	( 
				first_calculator( Integer.parseInt(arr[0]), arr[1].charAt(0), Integer.parseInt(arr[2]))
				);
	}
}
