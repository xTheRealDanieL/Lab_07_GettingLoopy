public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 30; i++) {
            System.out.print(i+ " ");
        }

        System.out.println("\n");

        for(int i = 30; i >= 0; i--){
            System.out.print(i+ " ");
        }

        System.out.println("\n");

        for(int i = 0; i<=18;i+=3)
        {
            System.out.print(i + " ");
        }

        System.out.println("\n");

        for(int i = 10; i>=0;i-=2)
        {
            System.out.print(i + " ");
        }

        System.out.println("\n");

        for(int i = 0; i<=5; i++)
        {
            for(int a = 0; a<i; a++)
            {
                System.out.print("*");
            }
            System.out.println("\n");
        }

        System.out.println("\n");

        for(int i = 5; i>=0; i--)
        {
            for(int a = 0; a<i; a++)
            {
                System.out.print("*");
            }
            System.out.println("\n");
        }

        System.out.println("\n");

        for(int i = 1; i<=5;i++)
        {
            for(int a = 1; a<=5;a++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println("\n");

        for(int i = 1; i<=3; i++)
        {
            for(int a = 1; a<=18; a++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(int i = 0; i <6; i++)
        {
            for(int s = 8; s >1; s--)
            {
                System.out.print(" ");
            }
            for(int a = 1; a <=3; a++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}