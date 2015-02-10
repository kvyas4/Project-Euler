
public class euler_2 {

	
	public static void main(String[] args) {
		int num1 = 1, num2 = 2, num3 = 3, sum = 0;

        while(num3<4000000||num2<4000000|num1<4000000)
        {
            if(num1%2==0)
            {
                sum = sum + num1;
            }
            if (num2 % 2 == 0)
            {
                sum = sum + num2;
            }
            if (num3 % 2 == 0)
            {
                sum = sum + num3;
            }
            num1 = num2 + num3;
            num2 = num1 + num3;
            num3 = num1 + num2;
        }
        System.out.println(sum);
        

	}

}
