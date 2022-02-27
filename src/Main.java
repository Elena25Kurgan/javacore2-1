import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        List<Integer> positiveInt = new ArrayList<>();
        for (int number: intList) {
            if (number > 0) positiveInt.add(number);
        }

        List<Integer> evenInt = new ArrayList<>();
        for (int number: positiveInt) {
            if (number % 2 == 0) evenInt.add(number);
        }

        Collections.sort(evenInt);
        System.out.println(evenInt);

        StreamMain streamMain = new StreamMain(intList);
        streamMain.printSream();
    }
}
