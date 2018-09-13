
package homework2;


import java.util.Scanner;

/**
 *
 * @author camma
 */
public class Homework2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) 
    {
        Homework2 app = new Homework2();
        app.run();
    }
    
    public void run() 
    {
        int r1, r2, s;
        int[] number= new int[2];
        
        number= GetNumbs();
        r1 = number[0];
        s = number[1];
        
        r2 = maths(r1, s);
        Print(r2);
    }
    
    public int[] GetNumbs(Scanner in) 
    {
        String input = in.nextLine(); 
        String[] numbers = input.split(" ");
        int[] digit = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++)
        {
            digit[i] = Integer.parseInt(numbers[i]);
        }
        return digit;
    }
    
    public int[] GetNumbs()
    {
        Scanner in = new Scanner(System.in);
        return GetNumbs(in);
    }
    
    boolean checkRange(int term) 
    {
        if(term >= -1000 && term <= 1000) {
            return true;
        }
        return false;
    }
    boolean isLess(int r1, int s)
    {
        if(r1 < s)
        {
            return true;
        }
        return false;
    }
    
    public int maths(int r1, int s)
    {
        int r2;
        if(checkRange(r1) && checkRange(s))
        {
            if(isLess(r1, s))
            {
                r2 = s + (s - r1);
                return r2;
            }
            else
            {
                r2 = s - (r1 - s);
                return r2;
            }
        }
        return 0;
    }
    
    public void Print(int Out)
    {
        System.out.println(Out);       
    }
}