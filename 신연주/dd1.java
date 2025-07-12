package 신연주;
public class dd1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=15;
		if(x>10&&x<20)
			System.out.println("[1-1]1.");
		
		char ch1='a';
		if(ch1!=' '||ch1!='	')
			System.out.println("[1-1]2.");
		
		char ch2='x';
		if(ch2=='x'||ch2=='X')
			System.out.println("[1-1]3.");
		
		char ch3='9';
		if(ch3>='0'&&ch3<='9')
			System.out.println("[1-1]4.");
		
		char ch4='e';
		if((ch4>='a'&&ch4<='z')||(ch4>='A'&&ch4<='Z'))
			System.out.println("[1-1]5.");
		
		int year=800;
		if(year%400==0||(year%4==0&&year%100!=0))
			System.out.println("[1-1]6.");
		
		boolean powerOn=false;//
		
		String str1="yes";
		String str2="yes";
		
		if(str1.equals(str2))
			System.out.println("[1-1]8.");
			
		int c=0;
		for(int i=1;i<=20;i++)//
		{
			if(i%2!=0&&i%3!=0)
			{
				c=+i;
			}
		}
		System.out.println("[1-2] : "+c);
		
		int c1=0;
		for(int i=1;i<=10;i++)//
		{
			for(int j=1;j<=10-i;j++)
			{
				
			}
		}
		System.out.println("[1-3] : "+c1);
		
		int c2=0;
		int delta = 1;
		for(int i=1;;i++)
		{
			c2+=i*delta;
			delta = -delta;
			if(c2>=100)
			{
				System.out.println("[1-4] : "+i);
				break;
			}
		}
		
		System.out.println("[1-5]");

		int a=5;
		for(int i=1;i<6;i++)
		{
				System.out.println(i+" + "+(6-a)+" = 6");
		}
		
		
		System.out.println("[1-6]");
		System.out.println();
		int y=0;
		while(y<10)
		{
			int x3=0;
			while(x3<=y)
			{
				System.out.print("*");
				x3++;
			}
			System.out.println();
			y++;
		}
		
		System.out.println("[1-7]");
		String str="41389";
		int sum=0;
		int i3=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			i3=ch-'0';
			sum+=i3;
		}
		System.out.println("sum="+sum);
	}
}
