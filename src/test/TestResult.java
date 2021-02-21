package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5};
        System.out.printf("The number that is repeated the most times: %d",
                Exercise.Calculate(arr));      
    }
}
