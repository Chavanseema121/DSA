import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListofList {
    public static void main(String[] args) {
        List<Integer> num1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> num2 = Arrays.asList(11, 12, 13, 14);
        List<Integer> num3 = Arrays.asList(21, 22, 23, 24);


        List<List<Integer>> num4 = Arrays.asList();

        List<Integer> num5 = num4.stream().flatMap(li -> li.stream()).toList();

        System.out.println(num5);
        ArrayList<Integer> num6 = new ArrayList<>();

        num6.addAll(num1);
        num6.addAll(num2);
        num6.addAll(num3);

        System.out.println(num6);

        Employee emp1 = new Employee("okokok", 45);
        Employee emp2 = new Employee("nonono", 75);
        Employee emp3 = new Employee("tototo", 35);

        List<Employee> list1 = Arrays.asList(emp1, emp2);
        List<Employee> list2 = Arrays.asList(emp3);

        List<List<Employee>> list3 = Arrays.asList(list1, list2);

        System.out.println(list3);

        ArrayList<Employee> empAr = new ArrayList<>();

        empAr.addAll(list1);
        empAr.addAll(list2);
        System.out.println(empAr);
    }
}
