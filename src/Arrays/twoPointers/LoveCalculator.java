package Arrays.twoPointers;

public class LoveCalculator {
    public static int calculateLovePercentage(String name1, String name2) {
        String combined = name1.toLowerCase() + name2.toLowerCase();
        StringBuilder counts = new StringBuilder();
        boolean[] counted = new boolean[26]; // Assuming only lowercase English letters

        // Step 1: Count occurrences for each unique character in the combined string
        for (int i = 0; i < combined.length(); i++) {
            char currentChar = combined.charAt(i);
            if (!counted[currentChar - 'a']) {
                int count = 0;
                for (int j = 0; j < combined.length(); j++) {
                    if (combined.charAt(j) == currentChar) {
                        count++;
                    }
                }
                counts.append(count);
                counted[currentChar - 'a'] = true;
            }
        }

        // Step 2: Calculate the love percentage by summing pairs
        String num = counts.toString();
        while (num.length() > 2) {
            StringBuilder newNum = new StringBuilder();
            for (int i = 0, j = num.length() - 1; i <= j; i++, j--) {
                if (i == j) {
                    newNum.append(num.charAt(i)); // Append middle character if any
                } else {
                    int sum = (num.charAt(i) - '0') + (num.charAt(j) - '0');
                    newNum.append(sum);
                }
            }
            num = newNum.toString();
        }

        return Integer.parseInt(num);
    }

    public static void main(String[] args) {
        String name1 = "neha"; // 113221 = 235 = 73
        String name2 = "ashish";
        int lovePercentage = calculateLovePercentage(name1, name2);
        System.out.println("Love %: " + lovePercentage + "%");
    }
}
