package Test;

public class e {

        public static void main(String args[]) {

            double e = 1.0;
            for (int i = 100; i > 0; i--) {
                e = (e + 1.0) / i;
                System.out.println(e);
            }
            e++;
            System.out.println(e);
        }
    }

