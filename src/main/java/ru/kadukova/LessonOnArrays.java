package ru.kadukova;

import java.util.Arrays;

public class LessonOnArrays {
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static int getNumberLength(int number) {
        return String.valueOf(Math.abs(number)).length();
    }


    public static void main(String[] args) {
        int arrLength = 30;
        int[] numArray = new int[arrLength];
        for (int i = 0; i < 30; i++) {
            numArray[i] = getRandomNumber(-999, 999);
        }
        numArray = new int[]{-43, 494, -612, 671, 127, -764, 96, -233, 156, -995, -171, 257, -78, -411, 954, -917, 6, 508, 941, -232, 207, 733, 107, 212, -71, -775, 506, 30, 783, -382};
        System.out.println(Arrays.toString(numArray));

        for (int j : numArray) {
            if (j > 0 && getNumberLength(j) == 1) {
                System.out.println(j);
            }
        }
    }
}
