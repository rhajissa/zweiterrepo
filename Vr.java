public class Vr {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        changeArray(numbers);
        System.out.println(numbers[5]); // يتغير إلى 99
    }
    
    public static void changeArray(int[] array) {
        array[0] = 99;
    }
}
