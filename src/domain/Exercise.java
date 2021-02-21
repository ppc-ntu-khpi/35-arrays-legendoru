package domain;

import java.util.HashMap;
import java.util.Map;

/**
 * A class that represent the exercise
 * @author legendoru
 */
public class Exercise {
    
    /**
     * Searching the number that is repeated the most times
     * @param arr input array
     * @return number that is repeated the most times
     */
    public static int Calculate(int[] arr) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int x:arr) {
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
                continue;
            }
            map.put(x, 1);
        }
        
        int maximalCount;
        int resultElement = maximalCount = 0;
        
        for (Map.Entry<Integer, Integer> currentEntry : map.entrySet()) {
            if (currentEntry.getValue() > maximalCount) {
                maximalCount = currentEntry.getValue();
                resultElement = currentEntry.getKey();
            }
        }
        
        return resultElement;
}
    
}

