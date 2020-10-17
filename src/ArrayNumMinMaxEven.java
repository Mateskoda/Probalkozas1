public class ArrayNumMinMaxEven {

    private static final int[] array1 = new int[20];

    public static void main(String[] args) {
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 101);
        }
        int[] szamok = {1, 2, 634, 64};
        System.out.println(countOddNumbersInArray(szamok));
    }

    public static int findMinOfArray() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < min) {
                min = array1[i];
            }
        }
        return min;
    }

    public static int evenNumCnt() {
        int cnt = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 0) {
                cnt++;
            }
        }
        return cnt;
    }

    public static int findMaxOfArray(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int countOddNumbersInArray(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2!=0){
                counter++;
            }
        }
        return counter;
    }
}
