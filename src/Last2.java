import java.util.Scanner;

public class Last2 {
	public static void main(String[] args) {
		
		System.out.println("어디까지? : ");
        Scanner sc = new Scanner(System.in);

        String inputValue = sc.nextLine();
        String[] splitedValue = inputValue.split(",");
        int first = Integer.parseInt(splitedValue[0]);
        int second = Integer.parseInt(splitedValue[1]);
        
        int[] result = new int[30];
        
        for (int j = 2; j <=first; j++) {
        	for (int i = 0; i < second ; i++) {
        		result[i] = j * (i+1);
        		System.out.println(j + "*" + (i+1) + "=" + result[i]);
        	}
        }
	}
}