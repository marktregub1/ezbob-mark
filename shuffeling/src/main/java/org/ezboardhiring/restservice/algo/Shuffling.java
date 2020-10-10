package org.ezboardhiring.restservice.algo;

import java.util.Arrays;
import java.util.List;

public class Shuffling {
    public static List<Integer> shuffleNumbers(int limit) {
        Integer[] nums = new Integer[limit];
        for(int i=0; i<limit; i++) nums[i] = i+1;

        for(int i=0; i<limit-1; i++) {
            int randomPosition = i + (int) (Math.random() * (limit - i));

            int temp = nums[i];
            nums[i] = nums[randomPosition];
            nums[randomPosition] = temp;
        }
        return Arrays.asList(nums);
    }
}
