import java.util.Scanner;
import java.util.Random;
public class rockpaperscissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("what will you choose:\nROCK-1\nPAPER-2\nSCISSOR-3\nplease enter a number");
        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            if (num == 1) {
                System.out.println("YOU CHOOSE ROCK!");
            } else if (num == 2) {
                System.out.println("YOU CHOOSE PAPER!");
            } else if (num == 3) {
                System.out.println("YOU CHOOSE SCISSOR!");
            }

            Random rand = new Random();
            int computer = rand.nextInt(3);
            switch (computer) {
                case 0 -> System.out.println("COMPUTER CHOOSE ROCK!");
                case 1 -> System.out.println("COMPUTER CHOOSE PAPER!");
                case 2 -> System.out.println("COMPUTER CHOOSE SCISSOR!");

            }
            if ((num == 1 && computer == 0) || (num == 2 && computer == 1) || (num == 3 && computer == 2)) {
                System.out.println("MATCH TIED");
            } else if ((num == 1 && computer == 2) || (num == 2 && computer == 0) || (num == 3 && computer == 1)) {
                System.out.println("YOU WON!");
            } else if ((num == 1 && computer == 1) || (num == 2 && computer == 2) || (num == 3 && computer == 0)) {
                System.out.println("COMPUTER WON!");
            }
        }
    }
 }
