package lists;

public class Test {

    public class T1 {
        public Integer x;
    }

    public class T2 {
        public Integer x;

        @Override
        public String toString() {
            return x.toString();
        }
    }

    public void run() {
        T1 t1 = new T1();
        t1.x = 5;
        System.out.println(t1);

        T2 t2 = new T2();
        t2.x = 5;
        System.out.println(t2);

    }

    public static void main(String[] args) {        
        new Test().run();
    }
}
