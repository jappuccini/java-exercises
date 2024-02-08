package demo.controlflow;

public class Loops {
    public static void main(String[] args) {

        // while Schleife
        int whileNumber = 0;
        while (whileNumber < 5) {
            System.out.println(whileNumber);
            whileNumber = whileNumber + 1; // number++
        }

        // do-while Schleife
        int doWhileNumber = 0;
        do {
            System.out.println(doWhileNumber);
            doWhileNumber = doWhileNumber + 1;
        } while (doWhileNumber < 5);

        // for Schleife
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        //for-each Schleife
        int[] forEachNumbers = { 0, 1, 2, 3, 4 };
        for (int number : forEachNumbers) {
            System.out.println(number);
        }


        //for-each Schleife gerade Zahlen continue
        int[] forEachEvenNumbers = { 0, 1, 2, 3, 4 };
        for (int number : forEachEvenNumbers) {
            if (number % 2 != 0) {
                continue;
            }
            System.out.println(number);
        }


        //while Schleife ungerade Zahlen break
        int whileOddNumbers = 0;
        while (true) {
            whileOddNumbers = whileOddNumbers + 1; // number++
            if (whileOddNumbers % 2 == 0) {
                break;
            }
            System.out.println(whileOddNumbers);
        }
    }
}
