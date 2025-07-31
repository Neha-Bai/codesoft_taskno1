import java.util.Random;
import java.util.Scanner;
public class random_Num {
    public static void main(String[] args) {
    Random rand = new Random();
    Scanner Sc = new Scanner(System.in);

    int randomNumber = rand.nextInt(100) + 1;
    int count = 9;
    int Limit;
        int user_Num;
        System.out.println("Enter the chances for guessing number :");
        Limit = Sc.nextInt();
        System.out.println("Guess the number :");
    for(int i=1;i<=Limit;i++) {
         user_Num = Sc.nextInt();
        if (user_Num > randomNumber) {
            System.out.println("Smaller than this :");
            count++;
        } else if (user_Num < randomNumber) {
            System.out.println("NUmber is bigger than this :");
            count++;
        }
        else if (user_Num == randomNumber) {
                System.out.println("Correct guess :");
                break;
            }


    }
        if(count == Limit){
            System.out.println(" YOU LOST IT : :");
        }
        System.out.println("Number od wrong guesses :" + count);
        System.out.println("Random num is :" + randomNumber);

    }
}
