package shpargalki_algoritmov;

/*Реализуй метод, который возвращает объект класса Pair.
        В поле x этого объекта должно содержаться минимальное число,
        а в поле y - максимальное число из массива inputArray.*/

public class MinMaxArrayResult {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair result = getMinimumMaximumPair(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    public static Pair getMinimumMaximumPair(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return new Pair(null, null);
        }

        int minimum = inputArray[0];
        int maximum = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < minimum)
                minimum = inputArray[i];

            if (inputArray[i] > maximum)
                maximum = inputArray[i];
        }

        return new Pair(minimum, maximum);
    }

    public static class Pair {
        public Integer x;
        public Integer y;

        public Pair(Integer x, Integer y) {
            this.x = x;
            this.y = y;
        }
    }
}