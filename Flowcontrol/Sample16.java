import java.util.*;
class Sample16
{
	public static void main(String[] args) 
	{	
		Scanner sc=new Scanner(System.in);
	    int num=sc.nextInt();
	    int sum=0;
		while(num!=0)
		{
			sum=sum*10+num%10;
			num=num/10;
			
		}
		System.out.println(sum);
	}
}
