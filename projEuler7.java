public class projEuler7 {
	
	public static int primeNum(int n) {
		int count = 0;
		for(int k = 1; k <= n; k++){
			if(n%k==0){
				count += 1;
			}
		}
		return count;
	}
	
	public static void main(String args[]){
		int count = 0;
		int num = 2;
		while(count!=10001){
			if(primeNum(num) == 2) {
				count += 1;
			}
			num += 1;
		}
		System.out.println(num-1);
	}
}