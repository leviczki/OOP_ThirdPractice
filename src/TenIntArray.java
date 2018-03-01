
public class TenIntArray {
	public static void main(String[] args) {
	int[] myArray = new int[10];
	java.util.Random rand = new java.util.Random();
	
	//int random = rand.nextInt(50)+1;
	for(int i = 0; i < myArray.length; i++)
		myArray[i] = rand.nextInt(50)+1;
	
	ArrOut(myArray);
	ArrOutInversely(myArray);
	System.out.println("Legnagyobb páros szám: "+HighestEvenNumber(myArray)+".");
	
	//int random = (int)( Math.random() * 50) + 1;
	for(int i = 0; i < myArray.length; i++)
		myArray[i] = (int)( Math.random() * 50) + 1;
	
	ArrOut(myArray);
	ArrOutInversely(myArray);
	System.out.println("Legnagyobb páros szám: "+HighestEvenNumber(myArray)+".");
	
	}
	
	public static void ArrOut(int[] myArray) {
		for(int x:myArray)
			System.out.println(x);
		
		System.out.println();
	}
	public static void ArrOutInversely(int[] myArray) {
		for(int i = (myArray.length-1); i >= 0; i--)
				System.out.println((i+1)+". "+myArray[i]+". ");
		
		System.out.println();
	}
	public static int HighestEvenNumber(int[] myArray){
		int max = -1;
		for(int x:myArray)
			if(x % 2 == 0 && x > max)
				max = x;
		return max;
	}
}
