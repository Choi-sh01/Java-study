package task4;
import java.util.*;

public class TestArray4 {
	public static final int ARRAY_MAX = 30;
	public static void main(String[] args) {
		int[] array1 = new int[ARRAY_MAX];
		int input,total = 0, size = 0;
		Scanner sc = new Scanner(System.in);
		
		for (size = 0; size<ARRAY_MAX; size++) {
			input = sc.nextInt();
			
			
			if (input<0) {
				break;
				
			}
			array1[size] = input;
			total += array1[size];
		}
		sc.close();
		
		Arrays.sort(array1);
		
		System.out.println(Arrays.toString(array1));
		System.out.println("Avg : "+(double)total/size);
		
		
	}

}
