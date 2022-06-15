import java.util.Random;
import java.util.Scanner;

public class HealthyHearts {
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();

    public void healthyHearts() {
        System.out.println("What is your age?");
        int age = scan.nextInt();
        int max = 220-age;

        System.out.println("Your maximum heart rate should be " + max + " beats per minute");
        System.out.println("The target heart rate zone is the " + getPercent(50,max) + " - " + getPercent(85,max) + " beats per minute");
    }

    public  int getPercent(double percent, int max){
        double decPercent = percent/100;
        double a = decPercent * max;
        return (int) Math.round(a);
    }

}
