import java.util.function.IntPredicate;

public class palindromeCheck {
    public static void main(String[] args)  {
      int number1 = 1001;
      int number2 = 42;
      int number3 = 666;
 
      
    IntPredicate isPalindrome = n ->  {
        int nDuplicate = n;
      String str = String.valueOf(nDuplicate);
      String reversed = new StringBuilder(str).reverse().toString();
      return str.equals(reversed);
    };
    
    boolean isPalindromeResult1 = isPalindrome.test(number1);
    System.out.println(number1 + " est un nombre palindrome ? " + isPalindromeResult1);

    isPalindromeResult1 = isPalindrome.test(number2);
    System.out.println(number2 + "  est un nombre palindrome ? " + isPalindromeResult1);

    isPalindromeResult1 = isPalindrome.test(number3);
    System.out.println(number3 + " est un nombre palindrome ? " + isPalindromeResult1);
    }
}
