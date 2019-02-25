import java.util.Scanner; //Initilises Scanner

public class PalindromesOriginal //Main Class
   {
   public static void main(String[] args) //Main Method
      {
         Scanner input = new Scanner(System.in);//Creates Scanner
         
         System.out.println("Enter a string: ");//Main Prompt for Input in Method
         String s = input.nextLine();//Captures input
         
         int low = 0;// The index of the first character in the string
         int high = s.length() - 1;// The index of the last character in the string
         
         boolean isPalindrome = true;
         while(low < high)
         {
            if(s.charAt(low) != s.charAt(high))
            {
               isPalindrome = false;
               break;
            }
            low++;
            high--;
         }        
         if(isPalindrome)
         {
            System.out.println(s + " is a palindrome");
         }
         else
         {
            System.out.println(s + " is not a palindrome");
         }
     }
}