public class FunctionalEg {
    public static void main(String[] args) {
        FunctionalOne ref = (i,j)->i+j;
        int result = ref.getSum(10,20);
        System.out.println(result);
    }
}
