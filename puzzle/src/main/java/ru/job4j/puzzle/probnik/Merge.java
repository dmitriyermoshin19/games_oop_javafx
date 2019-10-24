package ru.job4j.puzzle.probnik;
import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int caunt = 0;
        int[] rsl = new int[left.length + right.length];
            for (int i = 0; r < left.length + right.length; i++) {
                if (left[i] < right[r]) {
                    rsl[caunt] = left[l];
                    caunt++;
                } else {
                    rsl[caunt] = right[r];
                    caunt++;
                }
            }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}
