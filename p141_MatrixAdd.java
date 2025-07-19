package 신연주;

import java.util.Random;
public class p141_MatrixAdd {
	public static void main(String[] args)
	{
		int [][] m1=new int[3][3], m2=new int [3][3], m3=new int[3][3];
		Returnzero(m1,m2);
		Plusandplus(m1,m2,m3);
		Printnumber(m1);
		System.out.println();
		Printnumber(m2);
		System.out.println("================");
		Printnumber(m3);
	}
	public static void Returnzero(int[][]m1, int[][]m2)
	{
		Random rnd=new Random();
		for(int i=0;i<m1.length;i++)
		{
			for(int j=0;j<m1[i].length;j++)
			{
				m1[i][j]=rnd.nextInt(100);
				m2[i][j]=rnd.nextInt(100);
			}
		}
	}
	public static void Plusandplus(int[][] m1, int[][] m2, int[][] m3)
	{
		for(int i=0;i<m3.length;i++)
		{
			for(int j=0;j<m3[i].length;j++)
			{
				m3[i][j]=m1[i][j]+m2[i][j];
			}
		}
	}
	public static void Printnumber(int[][] m1)
	{
		for(int i=0;i<m1.length;i++)
		{
			for(int j=0;j<m1[i].length;j++)
			{
				System.out.print(m1[i][j]+" ");
			}
			System.out.println();
		}
	}
}
