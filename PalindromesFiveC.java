import java.util.Scanner; //Initilises Scanner

public class PalindromesFiveC //Main Class
   {
   public static void main(String[] args) //Main Method
      {
         Scanner input = new Scanner(System.in);//Creates Scanner
         
         while(true)//Test if it should loop or not
         {
         
            System.out.println("Enter a string: ");//Main Prompt for Input in Method
            String s = input.nextLine().toLowerCase();//Captures input and converts it to lowercase
            
            if(s.length()==0)//exits when user input is detected as non-existant
            {
               break;//Exits all loops
            }
         
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
         System.out.println("---End Program---");
     }
}