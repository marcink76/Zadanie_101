import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        boolean magicStopBoolValue = true;

        do {
            System.out.printf("Wprowadź do tablicy liczbę nr %d: ", count + 1);
            int inputNumber = scanner.nextInt();
            scanner.nextLine();
            if (inputNumber >= 0) {
                arrayList.add(inputNumber);
            } else {
                magicStopBoolValue = false;
            }
            count++;
        } while (magicStopBoolValue);

        for (int i = arrayList.size() - 1; i >= 0; i--) {
            System.out.println(arrayList.get(i));
        }

        StringBuilder stringBuilder = new StringBuilder();

        int sum = 0;

        for (int temp : arrayList) {
            sum += temp;
            stringBuilder.append(Integer.toString(temp) + " + ");
        }

        String result = stringBuilder.substring(0, stringBuilder.lastIndexOf("+"));
        System.out.println(result + "= " + sum);

        int max = 0;

        for (int temp : arrayList) {
            if (temp > max) {
                max = temp;
            }
        }

        int min = max;

        for (int temp : arrayList) {
            if (temp < min) {
                min = temp;
            }
        }
        System.out.println("Największa liczba to: " + max + "\nNajmniejsza liczba to: " + min);
    }
}