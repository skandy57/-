package level4_1차원배열;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        boolean[] selfNumbers = new boolean[10001];

        for (int i = 1; i <= 10000; i++) {
            int dn = i + getDigitSum(i);
            if (dn <= 10000) {
                selfNumbers[dn] = true;
            }
        }

        for (int i = 1; i <= 10000; i++) {
            if (!selfNumbers[i]) {
                System.out.println(i);
            }
        }
    }

    public static int getDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}