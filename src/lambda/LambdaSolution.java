package lambda;

public class LambdaSolution {
    static void def(I i) {
        System.out.println(i.abc("Student"));
    }

    public static void main(String[] args) {
        def(s -> "100" );
        }
    }

        interface I {
            String abc(String x);
        }


