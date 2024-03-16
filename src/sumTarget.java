// Extra Credit
// Time: 0(n)
// Space: O(1)

public class sumTarget {
        public static int[] sumTarget(int[] A, int k) {
            int[] result = new int[]{-1, -1};
            if (A == null || A.length == 0)
                return result;

            int left = 0;
            int right = 0;
            int sum = 0;

            while (right < A.length) {
                sum += A[right];

                while (sum > k && left <= right) {
                    sum -= A[left];
                    left++;
                }

                if (sum == k) {
                    result[0] = left;
                    result[1] = right;
                    return result;
                }

                right++;
            }

            return result;
        }

        public static void main(String[] args) {
            int[] arr1 = {1, 2, 3, 7, 5};
            int K1 = 12;
            int[] result1 = sumTarget(arr1, K1);
            System.out.println("Example 1: " + result1[0] + ", " + result1[1]);

            int[] arr2 = {1, 2, 3, 7, 5};
            int K2 = 5;
            int[] result2 = sumTarget(arr2, K2);
            System.out.println("Example 2: " + result2[0] + ", " + result2[1]);

            int[] arr3 = {1, 2, 3, 7, 5};
            int K3 = 7;
            int[] result3 = sumTarget(arr3, K3);
            System.out.println("Example 3: " + result3[0] + ", " + result3[1]);

            int[] arr4 = {1, 2, 3, 7, 5};
            int K4 = 11;
            int[] result4 = sumTarget(arr4, K4);
            System.out.println("Example 4: " + result4[0] + ", " + result4[1]);
        }
    }

