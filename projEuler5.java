public class projEuler5{
	
	public static void main(String args[]){
		for(int k = 2520; k < 1000000000; k++){
			if(k%1==0 & k%2==0 & k%3==0 & k%4==0 & k%5==0
				& k%6==0 & k%7==0 & k%8==0 & k%9==0 & k%10==0
				& k%11==0 & k%12==0 & k%13==0 & k%14==0 & k%15==0
				& k%16==0 & k%17==0 & k%18==0 & k%19==0 & k%10==0) {
					System.out.println(k);
			}
		}
	}
}