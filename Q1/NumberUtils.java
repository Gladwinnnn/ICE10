import java.util.*;

public class NumberUtils{
    public static Map<Integer, Integer> calculateFrequency(int[] arr) throws IllegalArgumentException{
        if (arr == null){
            throw new IllegalArgumentException();
        }
        
        HashMap<Integer, Integer> result = new HashMap<>();

        for (Integer i:arr){
            Integer number = result.get(i);
            if (number == null){
                result.put(i,1);
            } else{
                number++;
                result.put(i,number);
            }
        }
        return result;
    }

    public static int[] createArray(Map<Integer, Integer> freqMap) throws IllegalArgumentException{
        if (freqMap == null){
            throw new IllegalArgumentException();
        }

        int size = 0;
        for (int i:freqMap.keySet()){
            size += freqMap.get(i);
        }
        int[] result = new int[size];

        int index = 0;
        for (int i:freqMap.keySet()){
            int frequency = freqMap.get(i);
            for (int j = 0; j < frequency; j++){
                result[index] = i;
                index++;
            }
        }

        return result;
    }

    public static int max(int[] arr) throws IllegalArgumentException{
        if (arr == null || arr.length== 0){
            throw new IllegalArgumentException();
        }

        Arrays.sort(arr);

        return arr[arr.length-1];
    }

    public static int max(int x, int y, int z) throws IllegalArgumentException{
        int[] arr = new int[3];
        arr[0] = x;
        arr[1] = y;
        arr[2] = z;

        Arrays.sort(arr);

        return arr[arr.length-1];
    }

    public static List<Pair> findPairs(int[] arr, int value){
        List<Pair> result = new ArrayList<>();
        if (arr != null){
            for (int i:arr){
                int toFind = value - i;
                if (contains(arr,toFind)){
                    Pair pair = new Pair(i,toFind);
                    result.add(pair);
                }
            }
            return result;   
        } return result;
    }

    public static boolean contains(int[] arr, int key) {
        return Arrays.stream(arr).anyMatch(i -> i == key);
    }

    public static int findTheMissingNumber(int[] arr, int n) throws IllegalArgumentException{
        if (arr == null){
            throw new IllegalArgumentException();
        }

        Arrays.sort(arr);

        for (int i = 1; i < n; i++){
            if (i != arr[i-1]){
                return i;
            }
        }
        return 1;
    }
}