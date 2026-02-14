package collectionlearn;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamLearning {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 2, 7, 8, 4, 9);
        System.err.println(list);
        List<Integer> newList = list.stream().filter(n -> n % 2 == 0).
                sorted().distinct()
                .collect(Collectors.toList());
        System.err.println(newList);
          Stream<String> stream
            = Stream.of("CSE", "C++", "Java", "DS");
        boolean answer
            = stream.noneMatch(str -> (str.length() < 5));
        System.out.println(answer);
    }

}
