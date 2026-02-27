import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        Set<Integer> set = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(scanner.nextInt());
        }

        int count = 0;
        int size = set.size();

        for (int num : set) {
            System.out.print(num);
            count++;
            if (count < size) {
                System.out.print(" ");
            }
        }

        scanner.close();
    }
}