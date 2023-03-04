package lambda_expression;

public class LambdaEx1 {
    static void def(I i){
        System.out.println(i.abc("Hello"));
    }

    public static void main(String[] args) {
        def(new I() {
            @Override
            public int abc(String s) {
                return s.length();
            }
        });

        def(s -> {return s.length();});

        def(s->s.length()); // короткий способ
    }
}

interface I{
    int abc(String s);
}
