

public class q07 {
	
	public static void main(String[] args) {
		int[] list = {1,2,3,4,5,4,3,2,1};
		int sum=0;
		for(int f =0, r=list.length-1; f<5&&r>=5; f++,r--) {
			sum = sum+list[f]+list[r];
			
		}
		System.out.println(sum);
		
	}
}
