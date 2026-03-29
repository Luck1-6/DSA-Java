package Recursion;

public class nbits {
	int[] arrA;
	
	public  nbits(int n) {
		arrA = new int[n];
	}
	
	public void bits(int n) {
		if(n<=0) {
			System.out.println(arrA);	
			return;
		} else {
			arrA[n-1]=0;
			bits(n-1);
			arrA[n-1]=1;
			bits(n-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2;
		nbits i = new nbits(n);
		i.bits(n);

	}

}
	
