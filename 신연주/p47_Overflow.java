package 신연주;

public class p47_Overflow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=Integer.MAX_VALUE;
		int y= Integer.MIN_VALUE;
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		
		int w=x+1;
		int z=y-1;
		
		System.out.println("w = "+w);
		System.out.println("z = "+z);
	}

}
