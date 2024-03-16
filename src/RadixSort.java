import java.util.*;

public class RadixSort {
    public static void radixSort(String[] arr) {
        final int radix = 26;

        ArrayList<LinkedList<String>> buckets = new ArrayList<>(radix);
        for (int i = 0; i < radix; i++) {
            buckets.add(new LinkedList<>());
        }

        int maxLength = 0;
        for (String s : arr) {
            maxLength = Math.max(maxLength, s.length());
        }

        for (int i = maxLength - 1; i >= 0; i--) {
            for (String s : arr) {
                if (s.length() - 1 >= i) {
                    char c = s.charAt(i);
                    int bucketIndex = Character.toLowerCase(c) - 'a';
                    buckets.get(bucketIndex).add(s);
                } else {
                    buckets.get(0).add(s);
                }
            }

            int index = 0;
            for (LinkedList<String> bucket : buckets) {
                for (String s : bucket) {
                    arr[index++] = s;
                }
                bucket.clear();
            }
        }
    }

    public static void main(String[] args) {
        String[] arr = {"gojo", "google", "jogo", "bill", "pup", "cipher", "watchmen", "knight",
                "it", "stand", "sandman", "hydra", "surtr"};

   // String[] arr = {"GOJO", "GOOGLE", "JOGO", "BILL", "PUP", "CIPHER", "WATCHMEN", "KNIGHT",
           // "IT", "STAND", "SANDMAN", "HYDRA", "SURTR"};
        radixSort(arr);

        for (String s : arr) {
            System.out.print(s + ", ");
        }
    }
}

