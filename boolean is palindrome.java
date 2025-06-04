class Main {
    static boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "racecar";
        System.out.println(isPalindrome(s, 0, s.length() - 1)); // Output: true
    }
}
