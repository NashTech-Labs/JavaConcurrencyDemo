package Concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumberWithConcurrencyThreadStates {
    public static void main(String[] args) {
        List<Thread> threadList = new ArrayList<>();

        Runnable status = () -> {
            try{
                while(true){
                    Thread.sleep(5000);
                    printThreads(threadList);
                }
            }
            catch (InterruptedException e){
                System.out.println("Exception occurred");
            }
        };

        Thread printThreadStatus = new Thread(status);
        printThreadStatus.setDaemon(true);
        printThreadStatus.start();

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("I can tell you the nth prime number. Enter n: ");
            int n = sc.nextInt();
            if (n == 0) break;
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    int number = PrimeNumberUtil.calculatePrime(n);
                    System.out.println("Result: ");
                    System.out.println("\n Value of " + n + "th prime: " + number);
                }
            };
            Thread thread = new Thread(runnable);
            threadList.add(thread);
            thread.start();
        }
    }

    private static void printThreads(List<Thread> threadList) {
        System. out. print("\n Threads status: ");
        threadList.forEach(thread -> {
            System. out.print(thread.getState() + " " );
        });
        System. out.println("");

    }
}
