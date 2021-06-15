package Q5;
class prime extends Thread {
    public void run() {
        int i = 0;
        int num = 0;
        String primeNumbers = "";

        for (i = 1; i <= 100; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                // Appended the Prime number to the String
                primeNumbers = primeNumbers + i + " ";

            }
        }
        System.out.println(primeNumbers);
    }
}

class perfect extends Thread {
    public void run() {
        int i, sum = 1;
        System.out.print("Perfect nos from 1 to 60 are 1,");
        for (int j = 2; j <= 60; j++) {
            sum = 1;
            for (i = 2; i < j; i++) {
                if (j % i == 0)
                    sum = sum + i;
            }
            if (j == sum)
                System.out.print(j + ",");
        }

    }
}

public class Q5 {
    public static void main(String[] args) {
        prime p = new prime();
        perfect pp = new perfect();
        p.start();
        try {
            p.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        pp.start();
    }
}
