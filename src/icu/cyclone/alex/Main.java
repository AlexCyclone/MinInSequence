package icu.cyclone.alex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input line: ");
        System.out.println("Repeated line is: \"" + findRepeatSequence(sc.nextLine()) + "\"");
    }

    private static String findRepeatSequence(String line) {
        StringBuilder sb = new StringBuilder(line);
        for (int i = sb.length(); i > 0; i--) {
            int size = sb.length() / i;
            if (sb.length() % size != 0) {
                continue;
            }
            for (int j = 0; j < sb.length(); j += size) {
                if (sb.indexOf(sb.substring(0, size), j) != j) {
                    break;
                } else if (sb.length() == j + size) {
                    return sb.substring(0, size);
                }
            }
        }
        return sb.toString();
    }
}
