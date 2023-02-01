import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size: ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        for (int i = 0; i < list.length; i++) {
            System.out.println("Enter value element " + (i + 1) + ": ");
            list[i] = scanner.nextInt();
        }
        bubbleSortByStep(list);
    }
    public static void bubbleSortByStep(int[] list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    needNextPass = true;
                }
            }
            System.out.println("List after sort " + k + ": " + display(list));
        }
    }
    public static String display(int[] list) {
        StringBuilder outPut = new StringBuilder();
        for (int i : list) {
            outPut.append(i).append("  ");
        }
        return outPut.toString();
    }
}