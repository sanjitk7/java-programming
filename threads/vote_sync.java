class syncVotes {
    public int dmkCount = 0;
    public int AidmkCount = 0;
    public int BJPcount = 0;

    synchronized void dmkaddVote() {
        dmkCount++;
    }

    synchronized void aidmkaddVote() {
        AidmkCount++;
    }

    synchronized void bjpaddVote() {
        BJPcount++;
    }
}

class DMK extends Thread {

    syncVotes s;

    DMK(syncVotes s) {
        this.s = s;
    }

    public void run() {
        super.run();
        s.dmkaddVote();

    }
}

class AIDMK extends Thread {

    syncVotes s;

    AIDMK(syncVotes s) {
        this.s = s;
    }

    public void run() {
        super.run();
        s.aidmkaddVote();

    }
}

class BJP extends Thread {

    syncVotes s;

    BJP(syncVotes s) {
        this.s = s;
    }

    public void run() {
        super.run();
        s.bjpaddVote();

    }

}

public class vote_sync {

    public static void main(String[] args) {
        // write your code here

        int upperBound = 1;
        int lowerBound = 9999;
        syncVotes s = new syncVotes();
        DMK a = new DMK(s);
        AIDMK b = new AIDMK(s);
        BJP c = new BJP(s);
        for (int i = 0; i < 270; i++) {
            int number = lowerBound + (int) (Math.random() * ((upperBound - lowerBound) + 1));
            if (sumOfDigits(number) >= 0 && sumOfDigits(number) <= 3) {
                a.run();
            } else if (sumOfDigits(number) >= 4 && sumOfDigits(number) <= 7) {
                b.run();
            } else if (sumOfDigits(number) >= 8 && sumOfDigits(number) <= 9) {
                c.run();
            }
        }
        int w1 = s.dmkCount;
        int w2 = s.AidmkCount;
        int w3 = s.BJPcount;
        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w3);
        if (w1 >= w2 && w1 >= w3) {
            System.out.println("The winner is DMK");
        } else if (w2 >= w1 && w2 >= w3) {
            System.out.println("The winner is AIDMK");
        } else {
            System.out.println("The winner is BJP");
        }

    }

    public static int sumOfDigits(int m) {
        int n, sum = 0;
        while (m > 0) {
            n = m % 10;
            sum = sum + n;
            m = m / 10;
        }
        if (sum > 10) {
            return sumOfDigits(sum);
        } else {
            return sum;
        }

    }

}