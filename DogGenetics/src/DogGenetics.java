import java.util.Random;
import java.util.Scanner;

public class DogGenetics {

    enum breeds  {Labrador, Poodle, Akita, Bulldog, Husky}
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    public  void dogGenetics()
    {



        System.out.println("What is your dogs name?");
        String name = scan.nextLine();
        System.out.println("Well then, I have this highly reliable report on " + name + " prestigious background right here.");
        System.out.println(name + " is:");

        //array to hold random % values
        int[] percentage = new int[5];
        //generate 4 random numbers that sum to < 100
        for (int i = 0; i < 4; i++)
            percentage[i] = rand.nextInt(1, 21);
        //get fifth number
        percentage[4] = 100 - (percentage[0] + percentage[1] + percentage[2] + percentage[3]);

        //display
        for (int i = 0; i< percentage.length; i++)
            System.out.println(percentage[i] + "% " + breeds.values()[i]);

    }
}
