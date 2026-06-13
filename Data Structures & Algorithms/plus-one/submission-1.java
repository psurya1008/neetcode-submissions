class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse the array from the last digit
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // No carry needed
            }
            digits[i] = 0; // Set current digit to 0 and carry over to the next
        }

        // If all digits were 9, we need an extra digit
        int[] result = new int[n + 1];
        result[0] = 1; // The first digit will be 1, and the rest are 0
        return result;
    }
}
