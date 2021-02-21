# Практична робота "Масиви, вирази, керування виконанням програми"

## Знайти в масиві число, яке повторюється найбільшу кількість разів
---
Вихідний код класу ```Exercise```
```java
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
```
---
Вихідний код класу ```TestResult```
```java
package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5};
        System.out.printf("The number that is repeated the most times: %d",
                Exercise.Calculate(arr));      
    }
}
```
---
### Приклад роботи програми
[![netbeans64-2-Gg-PUb-OWa-D.png](https://i.postimg.cc/nc3wp6Xh/netbeans64-2-Gg-PUb-OWa-D.png)](https://postimg.cc/vc6vv27J)