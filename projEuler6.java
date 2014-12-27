public class projEuler6{
	public static void main(String args[]){
		int sum_squares = 0;
		for(int k = 0; k<101; k++){
			sum_squares += (k*k);
			}
		int squared_sum = (100*100*101*101)/4;
		int diff = squared_sum - sum_squares;
		System.out.println(diff);
		
	}
}