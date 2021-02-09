import javax.print.attribute.standard.RequestingUserName;

public class NumberUtils {
    int num;

    public boolean isPair() {
        return num % 2 == 0;
    }

    public boolean isOdd() {
        return ! isPair();
        // if (num % 2 == 0) {
        //     return true;
        // } else {
        //     return false;
        // }
    }

    public boolean isPrime() {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void printCount() {
        for (int i = 0; i <= num; i++) {
            System.out.print(i+" ");
        };
    }

    // Correção
    String printCount() {
        int i = 0;
        String s = "";
        while (i < n) {
            s = s + i + " ";
            i++;
        }
    }

    // Correção
    String printReverseCount() {
        int i = n;
        String s = "";
        while (i >=0) {
            s = s + i + " ";
            i--;
        }

    }

    public void printReverseCount() {
        for (int i = num; i >=0; i--) {
            System.out.print(i+" ");
        }
    }

}
