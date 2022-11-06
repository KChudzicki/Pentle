import java.math.BigInteger;

public class Loops {
    public static void main(String[] args) {
//        for (int i=0; i < 10; i++){
//            System.out.printf("%d ", i);
//        }
//
//        System.out.println();
//        //silnia
//        int number = 10;
//        BigInteger factorial = BigInteger.ONE;
//        for (int i=0; i <= number; i++){
//           factorial = factorial.multiply(BigInteger.valueOf(i));
//
//        }
//        System.out.printf("%d! = %s%n", number, factorial);

        out: for (int i = 0; i < 10; i++) {
            for (int j = 0; j <50; j++) {
                System.out.println(i + " " + j);
                break out;

            }
        }

        }


    }
