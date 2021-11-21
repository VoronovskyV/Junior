package shpargalki_algoritmov;

public class MinElementOfIntArray {


    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 4, 5, -2};
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if ( array[i] < min) {
                min = array[i];
            }
            System.out.println(min);

        }
    }

}
