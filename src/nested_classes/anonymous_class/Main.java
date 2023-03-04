package nested_classes.anonymous_class;

public class Main {

    public static void main(String[] args) {

        MathEx plus = new MathEx(){
            @Override
            public int doOperation(int a, int b) {
                return (a+b);
            }
        };
        MathEx sub = new MathEx(){
            @Override
            public int doOperation(int a, int b) {
                return (a-b);
            }
        };
        MathEx mlt = new MathEx(){
            @Override
            public int doOperation(int a, int b) {
                return (a*b);
            }
        };
        MathEx div = new MathEx(){
            @Override
            public int doOperation(int a, int b) {
                return (a/b);
            }
        };
//Чтобы не создавать отдельные классы для plus,...,div , мы на ходу создаем нужные нам объекты, переопределяя нужные нам методы
        System.out.println(plus.doOperation(20,5));
        System.out.println(sub.doOperation(20,5));
        System.out.println(mlt.doOperation(20,5));
        System.out.println(div.doOperation(20,5));





    }
}
