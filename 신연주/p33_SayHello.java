package 신연주;

import java.util.Scanner;

public class p33_SayHello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("이름 입력 >> ");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		sc.close();
		
		String helloMessage="안녕하세요. "+name+"님, 자바 세계에 오신 것을 축하드립니다.";
		System.out.println(helloMessage);
	}

}
