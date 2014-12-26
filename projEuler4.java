public class projEuler4 {

	public static void main(String args[]){
		
		int max = 0;
		for(int k = 999; k>100; k--){
			for(int j = 999; j>100; j--){
				int dig1 = j*k;
				if(dig1>=max) {
				int dig2 = Integer.parseInt(new	StringBuffer(Integer.valueOf(dig1).toString()).reverse().toString());
				if(dig1==dig2){
					System.out.println(dig1);
					System.out.println(k);
					System.out.println(j);
					max = dig1;
					}
				}
			}
		}
	}
}