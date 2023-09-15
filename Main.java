import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Adjon meg egy számot: ");
        double weight = sc.nextDouble();

        for (int i=1;i<=weight;i++)
        {
            System.out.println("%%%%");

        }
    }
}

