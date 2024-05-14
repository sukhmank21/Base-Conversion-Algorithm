import java.util.ArrayList;
import java.math.*;
import java.util.*;

class Main
{
    // Iterative base converter
    public static void main(String[] args)
    {
        ArrayList<Integer> digits = new ArrayList<Integer>();
        digits.add(1);
        digits.add(1);
        digits.add(1);
        digits.add(1);
        System.out.println(IterativeBaseConverter(digits, 2));
        System.out.println(RecursiveBaseConverter(digits, 2));
    }

    public static int IterativeBaseConverter(ArrayList<Integer> digits, int base) // O(log(n))
    {
        int newNum = 0;
        for  (int i=0; i < digits.size(); i++) // O(n)
        {
            //get the number from the digits ArrayList, multiplies it with the given base to the power of for that place value 
            //(for exmaple, if a list has 4 items, at position 0 its technically base^3 place so it'll be 4-(0+1) = 3

            newNum += digits.get(i)*Math.pow(base,digits.size()-(i+1)); // O(log(n))
        }

        return newNum;

    }

    // Recursive base converter 
    public static int RecursiveBaseConverter(ArrayList<Integer> digits, int base)
    {
        if (digits.size() == 1)
        {
            return digits.get(0);
        }

        else
        {
            
        }

        return ;
    }
        
    }
