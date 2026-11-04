
class Solution {
    public int missingNum(int[] arr) {
        long n = arr.Length + 1;

        long expectedSum = n * (n + 1) / 2;

        long actualSum = 0;

        foreach (int num in arr) {
            actualSum += num;
        }

        return (int)(expectedSum - actualSum);
    }
}
