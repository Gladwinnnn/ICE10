public class ArrayUtility{
    public static String printArray(int[] array){
        String result = "";
        for (int i = 0; i < array.length; i++){
            if (i != array.length-1){
                result += array[i] + ",";
            } else{
                result += array[i];
            }
        }
        return "[" + result + "]";
    }

    public static int sum(int[] numArray){
        if (numArray == null){
            return 0;
        }
        int result = 0;
        for (int i:numArray){
            result += i;
        }
        return result;
    }

    public static int[] twoTimes(int[] original){
        if (original == null){
            return null;
        }
        int[] result = new int[original.length];
        int index = 0;
        for (int i:original){
            result[index] = i * 2;
            index++;
        }
        return result;
    }

    public static void reverse(int[] array){
        int[] placeHolder = new int[array.length];
        int index = 0;
        for (int i = array.length-1; i >= 0; i--){
            placeHolder[index] = array[i];
            index++;
        }
        index = 0;
        for (int i:placeHolder){
            array[index] = i;
            index++;
        }
    }
}