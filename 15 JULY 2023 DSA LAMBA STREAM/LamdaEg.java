import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LamdaEg {
    public static void main(String[] args) {
//        int [] arr = {1,2,3,4,5,6,7,8,9,10};
//        List<Integer> list = new ArrayList<>();
//        for (int num : arr) {
//            list.add(num);
//        }
 //        list = Arrays.asList(arr);
        List <Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//        List <Integer> list1 = list.stream().filter( i -> i%2==0 && i>5).map(l->l+10).collect(Collectors.toList());
//        System.out.println(list1);
        list.stream().filter( i -> i%2==0).forEach(j-> {System.out.println(j);});

        List <String> abc= Arrays.asList("ba","asd","asdasg","dhhdg");
        List <String> def  = abc.stream().sorted().collect(Collectors.toList());
        System.out.println(def);


    }
}
