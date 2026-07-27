
public class TrafficCongestion {
	
	public static void main(String[] args) {
		int [] v = {25, 40 , 15 , 60, 30};
		
		int total = 0;
		int max = v[0];
		int min = v[0];
		
		for(int k = 0; k < v.length ; k++ ){
			
			total = total + v[k];
			
			if(v[k] < min) {
				v[k] = min;
				
			}
			if(v[k]>max) {
				v[k] = max;
				
			}
		}
			double a = total/v.length;
			
			System.out.println("Total:" + total);
			System.out.println("Average:" + a);
			System.out.println("Maximum:" + max);
			System.out.println("Minimum:" + min);
			
			
		}
		
}
	


