public class Main {
    public static void findMaxSum(int[] array) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        int start = 0, end = 0, tempStart = 0;

        for (int i = 0; i < array.length; i++) {
            currentSum += array[i];

            if (currentSum < array[i]) {
                tempStart = i;
                currentSum = array[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }

        String message = String.format("Max sum interval: (%s, %s)", start, end);
        System.out.println(message);
    }

    public static void main(String[] args) {
        int[] array = {-1, -2, 1, 2, 1, 0, -3};
        findMaxSum(array);
    }
}