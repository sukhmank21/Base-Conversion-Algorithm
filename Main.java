import java.util.ArrayList;
import java.math.*;
import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        public static int IterativeBaseConverter(ArrayList<Integer> digits, int base)
        {
            int newNum = 0;
            for  (int i=0, i < digits.size(), i++)
            {
                newNum = digits[i]*Math.pow(base,);
            }
        }
         
        public static int RecursiveBaseConverter(ArrayList<Integer> digits, int base)
        {
            for  (int i = 0, i< digits.size(), i++)
            {
                
            }
        }
        ArrayList<Integer> digits = new ArrayList<Integer>();
        digits.add(1);
        digits.add(2);
        digits.add(0);
        digits.add(5);
        System.out.println(IterativeBaseConverter(digits, 9));
        System.out.println(RecursiveBaseConverter(digits, 9));

    }
}