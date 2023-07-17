import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiEg {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("abc", "","abc", "bc", "efg", "abcd","", "jkl");
        List<String> strings2 = Arrays.asList("strings2","strings3");
        List<String> strings3 = Arrays.asList("strings3");

        //strings.stream().filter(i->!i.isEmpty()).forEach(System.out::println);

        List<String> filtered =strings.stream().filter(i->!i.isEmpty()).collect(Collectors.toList());
        //System.out.println(filtered);

        List<List<String>> abc= Arrays.asList(filtered,strings2,strings3);
        List<String> def = abc.stream().flatMap(i->i.stream()).toList();
       // System.out.println(def);
        abc.stream().flatMap(i -> i.stream()).peek(System.out::println).collect(Collectors.toList());


    }

}
