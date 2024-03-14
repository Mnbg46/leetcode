package RomanToInt;

import java.util.Scanner;
import java.lang.Math;

public class RomanToInt 
{
 
    int NumValue(char rom)
    {
        if (rom == 'I') {
            return 1;
        }
        if (rom == 'V') {
            return 5;
        }
        if (rom == 'X') {
            return 10;
        }
        if (rom == 'L') {
            return 50;
        }
        if (rom == 'C') {
            return 100;
        }
        if (rom == 'D') {
            return 500;
        }
        if (rom == 'M') {
            return 1000;
        }
        return -1;


    }
    int romanToInt(String str) 
    {
        int total = 0; //variable to store total sum

        //loop over string
        for (int i = 0; i < str.length(); i++) 
        {   //get value from s1[i]
            int s1 = NumValue(str.charAt(i));  

            if (i+1 < str.length())  //get value from s2[i +1]
            {
                int s2 = NumValue(str.charAt(i+1));

                 
                if (s1 >= s2) //if current >= value to right, add current char to total variable
                { 
                    total = total + s1;  
                }
                else //if current <= value to right, subtract current char from total variable
                {
                    total = total - s1;
                }
               
            }
            else 
            {
                total = total + s1;
            }

            }
            return total;
        
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            RomanToInt obj = new RomanToInt();
            System.out.println("Enter roman numeral in all caps");
            String inputRom = scanner.nextLine();
            System.out.println("Value of roman numeral is:" + +obj.romanToInt(inputRom));
        
            }
        }
    /* 
     * Symbol       Value
        I             1
        V             5
        X             10
        L             50
        C             100
        D             500
        M             1000
        iterate over array
        compare current w char on the right
        if current >= value to right, add current char to total variable
        if current <= value to right, subtract current char from total variable
    */


 
    

