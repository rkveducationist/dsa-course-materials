public class FrequencyMapArray {
    public static void main(String[] args) {
        String str = "programming";

        int[] count = new int[26];

        for (char ch: str.toCharArray()) {
            count[ch - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                System.out.println((char)(i + 'a') + " -> " + count[i]);
            }
        }
    }
}