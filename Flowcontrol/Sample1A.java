import java.util.Scanner;

public class Sample1A
	{
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	if(n>0)
	{
		System.out.println("positive");
	}
	if(n<0)
	{
		System.out.println("Negative");
	}
	if(n==0)
	{
		System.out.println("0");
	}

	}

}
