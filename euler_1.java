public class euler_1 {

	public static void main(String[] args) {
		
	int number1=0;
	int sum1=0;
	int number2=0;
	
	
	//System.out.println(10);
	/*while (number2 < 200);
	{
		number1 = 5*number2;
		sum1=number1+sum1;
		number2 = number2 + 1;

	}*/
	for (int i=1; i<1000 ; i++)
		{
		 if (i%3==0 && i%5!=0){ 
			 sum1 = sum1+i;
		 }
		if (i%5==0 && i%3!=0){
			sum1=sum1+i;
		}
		if (i%3==0 && i%5==0){
			sum1=sum1+i;
		}	
		
		}
		
	
	
	
	
	System.out.println(sum1);
    

	}
}
