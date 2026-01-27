package Exercises.Loops.ForLoops;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) throws InterruptedException {
        
        // countdown simulator
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the seconds to countdown: ");
        int start = scanner.nextInt();

        for (int i = start; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
            /* 
            Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds, 
            subject to the precision and accuracy of system timers and schedulers. The thread does not lose ownership of any monitors.
            */
        }

        System.out.println("Happy New Year! 🎉🎉🎊🎊");
        
        scanner.close();

    }
}
