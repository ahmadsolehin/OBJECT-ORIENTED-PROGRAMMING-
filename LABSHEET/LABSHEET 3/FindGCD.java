
package loops;

public class FindGCD {
    private static int number1;
    private static int number2;
    
    public void setNumber1(int number1) {
        FindGCD.number1 = number1;
    }
    public void setNumber2(int number2) {
        FindGCD.number2 = number2;
    }
    public int getNumber1() {
        return number1;
    }
    public int getNumber2() {
        return number2;
    }
    
    public int totalGCD()
    {
        int gcd = 1;
        
        if(number1>number2)
        {
            for(int i=number2; i>=1; i--)
            {
                if(number1%i == 0 && number2%i == 0)
                {
                    return i;
                }
            }
        }
        else
        {
            for(int j=number1; j>=1; j--)
            {
                if(number1%j == 0 && number2%j == 0)
                {
                    return j;
                }
            }
        }
        return gcd;
    }
    
}
