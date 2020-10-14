public class ArrayNumMinMaxEven {

private static final    int[] array1 = new int[20];

    public static void main(String[] args) {
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 101);
        }
    }
    public static int findMinOfArray (){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <array1.length ; i++) {
            if (array1[i]<min){
                min = array1[i];
            }
        }return min;
    }
}
