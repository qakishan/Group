package function;

public class FunctionMath {
	public static void main(String[] args)
	{
		int a =4000;
		int b= 420;
		int c=306;
		int d =401;
		int larfrmabc =(a>b) ? ((a>c)?a:c) : ((b>c)?b:c);
		
		int f= (larfrmabc>d)? larfrmabc : d;
		System.out.println(f);
		
		double e=Math.cbrt(a);
		System.out.println(e);
		
		
	}

}
