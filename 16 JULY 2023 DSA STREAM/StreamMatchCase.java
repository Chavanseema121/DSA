import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMatchCase {


        public static void main(String[] args) {

            List<Integer> list1 = Arrays.asList(1,4,5,7,8);
            List<Integer> list2 = Arrays.asList(9,10,5,0,11);
            List<Integer> list3 = Arrays.asList(7,6,5,3,1);

            List<List<Integer>> list = Arrays.asList(list1, list2, list3);

            List<Integer> newList = list.stream().flatMap(li -> li.stream()).collect(Collectors.toList());

            System.out.println();

            if(newList.isEmpty() && (!newList.get(2).equals(null))){

            }

            list1.stream().peek(System.out::println).collect(Collectors.toList());;

            List<Integer> list4 = list1.stream().limit(3).collect(Collectors.toList());

            System.out.println("list4: "+list4);

            Stream<String> stream = Stream.of("Math", "Science", "English");
            boolean result = stream.anyMatch(s->s.contains("Ma"));
            System.out.println("match ex: "+result);

        }


}
