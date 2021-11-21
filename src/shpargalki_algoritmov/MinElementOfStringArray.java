package shpargalki_algoritmov;

public class MinElementOfStringArray {

    public static void main(String[] args) {

        String[] array = {"one", "two", "three", "four", "five"};
        String s1 = array[0];
        for (int i = 1; i < array.length; i++) {
            if ( array[i].compareTo(s1) < 0);
            s1 = array[i];
        }
        System.out.println(s1);
    }
}

