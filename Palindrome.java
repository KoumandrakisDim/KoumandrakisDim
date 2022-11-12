import java.util.ArrayList;

public class Palindrome {

    public static void main(String[] args) {

        String str = "pmalolamp";
        System.out.println(isPalindrome(str));

    }

    public static boolean isPalindrome(String word) {
        ArrayList<Character> array1 = new ArrayList<>();
        ArrayList<Character> array2 = new ArrayList<>();

        if(word.length()%2 == 1){
            word = word.substring(0, word.length()/2) + word.substring((word.length()/2)+1);
        }

        for(int i=0; i<word.length() / 2; i++){
            array1.add(word.charAt(i));
        }
        for(int i=word.length()-1; i>=word.length() / 2; i--){
            array2.add(word.charAt(i));
        }
        return array1.equals(array2);
    }

}
