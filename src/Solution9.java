public class Solution9 {
    public static boolean isPalindrome(int x) {
        String intToString = Integer.toString(x);
        StringBuilder sb = new StringBuilder(intToString);
        return sb.reverse().toString().equals(intToString);
    }

    public static void main(String[] args) {
        //test case
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
        System.out.println(isPalindrome(1212));
        System.out.println(isPalindrome(110011));
    }
}
