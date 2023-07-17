import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapStreamEg {
    public static void main(String[] args) {

        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("1","asd");
        hashMap.put("2","nasdasd");
        hashMap.put("3","bagssd");

        List<String> listofString = hashMap.entrySet().stream().filter(i->i.getKey().startsWith("2")).map(Map.Entry::getValue).collect(Collectors.toList());
       // System.out.println(listofString);

        hashMap.entrySet().stream().filter(i->i.getKey().startsWith("2")).map(Map.Entry::getValue).forEach(System.out::println);
    }
}
