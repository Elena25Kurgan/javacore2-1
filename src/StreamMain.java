import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain {
    Stream<Integer> stream;

    public StreamMain(List<Integer> intList) {
        this.stream = intList.stream();
    }

    void printSream() {
        stream
                .filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }
}
