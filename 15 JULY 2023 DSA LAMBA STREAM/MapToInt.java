import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapToInt {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1, 2, 3, 4);
//        num.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
//
//        long count = num.stream().filter(i -> i % 2 == 0).count();
//
//        System.out.println("Count of even numbers : " + count);
//
        int sum = num.stream().filter(i -> i % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println("The sum of even numbers: " + sum);

  //      int sum1 = num.stream().filter(i -> i % 2 == 0).map((k, i) -> { k + i}).collect(Collectors.toList());
    }
}
