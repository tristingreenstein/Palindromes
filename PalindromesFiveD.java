import java.util.Scanner; //Initilises Scanner

public class PalindromesFiveD //Main Class
   {
   public static void main(String[] args) //Main Method
      {
         Scanner input = new Scanner(System.in);//Creates Scanner
         
         while(true)//Forever Loop with Placeholder
         {
            System.out.println("Enter a string: ");//Main Prompt for Input in Method
            String s = input.nextLine();//Captures input
         
            if (s.length() == 0)//Allows users to run program multiple times till empty input detected
            {
               System.out.println("\n---End Program---");
               break;//Ends Program
            }
            System.out.println(palindromeTest(baseChars(s)));//Calls Method 'palindromeTest' and feeds input. Input is feeded into baseChar which cleans the input up. When value returns it will print to console
         }
   }
   
   public static String baseChars(String s)//Cleaner Method To Clean Up Input
   {
      String newVar = "";//Initilizes Variable to hold Sorted Input
         
      for(int i = 0; i<s.length(); i++)//Loops through the length of user input
      {
         if(Character.isLetterOrDigit(s.charAt(i)))//Checks User Input for values not in Alphabet or Numeric System
         {
               newVar += s.charAt(i);//Sets Sorted Values in New Variable
         }
      }
      return newVar.toLowerCase();//returns value lowercase and spaces removed            
   }
   
   public static String palindromeTest(String s)//Method to do the Math for Palindromes
   {
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
         
         String output = "";//Initilaizes Variable to Store Return Value
         
         if(isPalindrome)
         {
            output = (s + " is a palindrome");//Stores Answer to Math in Variable
         }
         else
         {
            output = (s + " is not a palindrome"); //Stores Answer to Math in Variable
         }
         return output;//Returns Output to Main Method for Evaluation
    }
}