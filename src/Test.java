public class Test {
    public static int[] array = {6, 4, 2, 3, 0, 1,64, 231};
    public static void insertionSort(int[] array){
        int arrayLength = array.length;
        int temp, j;
        for (int i = 1; i < arrayLength; i++){
            temp =  array[i];
            j = i - 1;
            while (j >= 0 && array[j] > temp){
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        System.out.println("Before: ");
        for (int elments : array){
            System.out.println(elments + " ");
        }
        System.out.println("\nAfter: ");
        insertionSort(array);
        for (int elments : array){
            System.out.println(elments + " ");
        }
    }
}
