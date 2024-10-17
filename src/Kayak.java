import java.util.Arrays;

public class Kayak {
    public static void main(String[] args) {
        int[] weights = {50 ,120 ,74 ,60 ,100 ,82};
        int D = 135;
        int result =  Kaykis.minKayaks(weights, D);
        System.out.println("Минимальное количество байдарок: " + result);
    }
    public class Kaykis {

        public static int minKayaks(int[] weights, int D) {
            Arrays.sort(weights);
            int min = 0;
            int max = weights.length - 1;
            int kayaks = 0;

            while (min <= max) {

                if (weights[min] + weights[max] <= D) {
                    min++;
                }
                max--;
                kayaks++;
            }

            return kayaks;
        }


    }
}


