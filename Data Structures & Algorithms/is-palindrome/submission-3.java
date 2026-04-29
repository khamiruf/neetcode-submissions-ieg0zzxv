class Solution {
    public boolean isPalindrome(String s) {
        // use two pointer,
        // normalize it: lower case, skip non-
        int l = 0;
        int r = s.length() - 1;

        while (l <= r) {
            if (!Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            } else if (!Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            } else {
                if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                    return false;
                }
                l += 1;
                r -= 1;
            }
        }
        return true;
    }
}