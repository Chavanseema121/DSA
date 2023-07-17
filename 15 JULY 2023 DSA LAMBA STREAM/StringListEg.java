import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringListEg {

    public static void main(String[] args) {
        List<String> newList = Arrays.asList("aa","bb","cc","aa","bbb","aa","aaa");

        List<String> newList2= newList.stream().distinct().collect(Collectors.toList());

        System.out.println(newList2);


    }
}
