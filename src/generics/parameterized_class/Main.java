package generics.parameterized_class;

public class Main {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("dadasdsa");
        Info<Integer> info2 = new Info<>(1);
        Info<Double> info3 = new Info<>(1.5);

        System.out.println(info1);
        System.out.println(info2);
        System.out.println(info3);
        System.out.println();
    }
}
