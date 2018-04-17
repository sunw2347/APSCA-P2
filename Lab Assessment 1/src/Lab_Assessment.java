import static java.lang.System.*;

public class Lab_Assessment{

	public static void main( String args[] ){
		System.out.println(isGoofy(12)); //test
		System.out.println(isGoofy(15));
		System.out.println(isGoofy(17));
		System.out.println(isGoofy(11));
		System.out.println("****************");
		System.out.println(getSomeGoofyNumbers(1));
		System.out.println(getSomeGoofyNumbers(3));
		System.out.println(getSomeGoofyNumbers(5));
		System.out.println(getSomeGoofyNumbers(7));
		
	}

	public static boolean isGoofy(int num){
		int[] n = {num};
		int divisor = 0;
		if(((num/10) * 10) == 0){
			n = new int[1];
		}
		if(((num/10) * 10) == 10){
			n = new int[2];
		}
		if(((num/10) * 10) == 100){
			n = new int[3];
		}
		if(((num/10) * 10) == 1000){
			n = new int[4];
		}
		for(int i = 0; i < n.length; i++){
			divisor += n[i];
		}
		if(divisor % 2 != 0){
			return true;
		}
		
		return false;
	}

	public static int[] getSomeGoofyNumbers(int count){
		int[] goof = new int[count];
		for(int i = 0;i <= count; i++){
			if(i % 2 == 1){
				goof[i] = i;
			}
			else{
				goof[i] = 0;
			}
		}
		return goof;
	}
}