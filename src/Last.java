import java.util.Scanner;


public class Last {
	public static void main(String[] args) {
		
		System.out.println("어디까지? : ");
        Scanner sc = new Scanner(System.in);
        
        int number = sc.nextInt();
        
        int[] result = new int[9];
        
        for (int j = 2; j <=number; j++) {
        	for (int i = 0; i < number ; i++) {
        		result[i] = j * (i+1);
        		System.out.println(j + "*" + (i+1) + "=" + result[i]);
        	}
        }
	}
}
