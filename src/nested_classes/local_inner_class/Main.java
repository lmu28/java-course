package nested_classes.local_inner_class;

public class Main {

    public static void getResult(int divisible,int divider){ // еще один пример
        class Divide{

            public int dev(){
                return divisible/divider;
            }

            public int mod(){
                return divisible%divider;
            }
        }

        Divide divide = new Divide();
        System.out.println(divisible);
        System.out.println(divider);
        System.out.println(divide.dev());
        System.out.println(divide.mod());

    }

    public static void main(String[] args) { //class Divide доступен только в этом методе

        class Divide{
            private int divider;
            private int divisible;

            public void setDivider(int divider) {
                this.divider = divider;
            }

            public void setDivisible(int divisible) {
                this.divisible = divisible;
            }

            public int getDivider() {
                return divider;
            }

            public int getDivisible() {
                return divisible;
            }

            public Divide(int divisible,int divider ) {
                this.divider = divider;
                this.divisible = divisible;
            }

            public int dev(){
                return divisible/divider;
            }

            public int mod(){
                return divisible%divider;
            }
        }

        Divide divide = new Divide(21,5);
        System.out.println(divide.divisible);
        System.out.println(divide.divider);
        System.out.println(divide.dev());
        System.out.println(divide.mod());

        getResult(21,5);








    }
}
