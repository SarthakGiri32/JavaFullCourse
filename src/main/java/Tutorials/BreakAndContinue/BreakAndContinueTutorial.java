package Tutorials.BreakAndContinue;

public class BreakAndContinueTutorial {
    public static void main(String[] args) {
        
        // 1. break: to stop the execution of a loop and to start executing the next statement after the loop
        
        // for (int i = 1; i <= 10; i++) {

        //     if (i == 5) {
        //         break;
        //     } // breaks out of the loop ans stops execution when 'i == 5' is true

        //     System.out.print(i + " ");
        // }

        // 2. continue: skip the execution of any statements in the loop after the 'continue' statement, and go to the next iteration of the loop

        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                continue;
            } // skips the following code for the current iteration of the loop and moves on to the next iteration, when 'i == 5' is true
            
            System.out.print(i + " ");
        }

    }
}
