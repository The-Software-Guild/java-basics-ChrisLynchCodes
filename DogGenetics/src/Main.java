import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        DogGenetics dogGenetics = new DogGenetics();
        HealthyHearts healthyHearts = new HealthyHearts();
        //dogGenetics.dogGenetics();
       //healthyHearts.healthyHearts();

        int[] numsOne = {1, 90, -33, -55, 67, -16, 28, -55, 15};
        int[] numsTwo = {999, -60, -77, 14, 160, 301};
        int[] numsThree = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130,
                140, 150, 160, 170, 180, 190, 200, -99};
        System.out.println(SummativeSums.summativeSums(numsOne));
        System.out.println(SummativeSums.summativeSums(numsTwo));
        System.out.println(SummativeSums.summativeSums(numsThree));


    }


}