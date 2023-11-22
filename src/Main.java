import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int n = input.nextInt();
		int[] num = new int[n];
		for (int i = 0; i < n; i++)
		{
			System.out.println((i +1) + " inci sayıyı giriniz : ");
			num[i] = input.nextInt();
		}
		for (int i = 0; i< n; i++)
		{
			for (int k =0; k< n -i -1; k++){
				
				if(num[k] > num[k+1])
				{
					int temp = num[k];
					num[k] = num[k+1];
					num[k+1] = temp;
				}
			}
		}
		System.out.println("End" + Arrays.toString(num));
	}
}