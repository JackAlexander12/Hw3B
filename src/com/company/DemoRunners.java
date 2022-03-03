//Jack Alexander
//3/2/2022
//Program#1
/**This program uses an interface named runner to allow for dynamic programming which allows for different types of run
 methods to be defined
 */
package com.company;

public class DemoRunners {

    public static void main(String[] args) {

        Machine runner1 = new Machine();
        Athlete runner2 = new Athlete();
        PoliticalCandidate runner3 = new PoliticalCandidate();

        runner1.run();
        runner2.run();
        runner3.run();

    }

}