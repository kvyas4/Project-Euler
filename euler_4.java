
import java.lang.*;
public class euler_4 {

	/**
	 * @param args
	*/ 
	public static int reverseNumber(int number){
		int reverse = 0;
		String aString=Integer.toString(number);
		String reversedString=new StringBuilder(aString).reverse().toString();
		reverse = Integer.parseInt(reversedString);
		return reverse;
	}
	public static void main(String[] args) {
	
		int n=0;
        int rev =0;
        
		for (int b=999; b>=100 ; b--)
		{
		   for (int a = 999; a>=100; a-- ){
			   rev = reverseNumber(a*b);
				if (a*b==rev && a*b>n) {
					n=a*b;
					System.out.println(a*b);  
				}
		   }
			
		
		}
   
		
		System.out.println(n);
	}

}
