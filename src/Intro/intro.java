package Intro;

public class intro {

	
	public static void main(String[] args) {
		//Can't declare a public sclass instance inside the main class(intro) without declaring an intance of the main class first
		 class test{
			int a=5;
			int b=6;
		}
		test a = new test();
		System.out.println(a.a);
		
		
	}
	

}
