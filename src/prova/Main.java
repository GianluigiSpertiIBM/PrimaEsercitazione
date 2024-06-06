package prova;

public class Main {

	public static void main(String[] args) {
//		#1
		int a = 0;
		double b = 1.2;
		char c = 'c';
		boolean bool = true;
		String string = "Ciao";
		
//		#2
		int[] arr = new int[10];
		for (int i=0; i<arr.length; i++) {
			arr[i] = i;
			System.out.println(arr[i]);
		}
		
//		#3
		int[] arr2 = new int[10];
		for (int i=0; i<arr2.length; i++) {
			arr2[i] = i;
			if (arr2[i]<5)
				System.out.println("Il numero è minore di 5");
			else
				System.out.println("Il numero è maggiore di 5");
		}
	}

}
