import java.util.Arrays;

public class ToPower {
    public static void main(String[] args) {
        int[] result = toPower(4, 2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] toPower(int size, int power) {
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = (int) Math.pow(i, power);
        }
        return result;
    }
}