public class PalindromeMalevik{

  public static void main(String[] args){
    for (int i = 0; i < args.length; i++) {
      String word = args[i];
      System.out.println(word + isPalindrome(word));
    }
  }

  public static String isPalindrome(String word) {
    StringBuffer buffer = new StringBuffer(word);
    buffer.reverse();
    String reversWord = buffer.toString();

      if (word.equals(reversWord)) {
        return " - is palindrome!";
      }
    return " - is not palindrome!";
  }

}
