public class TheSecondLargest {
    public static void main(String[] args) {

    int secondLargest[] = {99, 88, 52, 45, 441, 25, 458, 356, 255};
        int doValue = secondLargest[0];
        int maxValue = secondLargest[1];
        System.out.println("Дан массив:");
        for (int i = 2; i < secondLargest.length; i++) {
            System.out.print(secondLargest[i]);
            System.out.print("   ");
            if (secondLargest[i] > maxValue) {
                maxValue = secondLargest[i];
            }
            if (maxValue > doValue) {
                int empty = doValue;
                doValue = maxValue;
                maxValue = empty;
            }
        }
        System.out.println();
        System.out.println("Второе по величине число в массиве: " +maxValue);
    }
}
