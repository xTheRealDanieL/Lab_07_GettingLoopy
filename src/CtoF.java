import java.util.Scanner;
public class CtoF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double C = 0;
        double F = 0;
        String trash = " ";
        boolean done = false;

        while(!done)
        {
            System.out.print("Please enter C: ");

            if(in.hasNextDouble())
            {
                C = in.nextDouble();
                in.nextLine();
                F = (C * 1.8) + 32;
                System.out.println(C + " C equals " + F + " F");
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println(trash + " is not a valid input");
            }
        }
    }
}
