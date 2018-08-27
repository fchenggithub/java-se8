
public class q22 {

public static void main(String[] args) {
		
		String nums1[] = new String[3];
		String nums2[] = {"1","2","2","2"};
		nums1 = nums2;
		for(String x : nums1) {
			System.out.println(x);
		}
}
}
