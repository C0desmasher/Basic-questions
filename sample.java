import java.util.*;

public class sample {

    void checkSum(int num, int check){
        if (num>check) {
            if (num % check == 0) {
                System.out.println(num + " isn't a prime number");
            }
            else{
                check = check+1;
                checkSum(num, check);
            }
        }
        else{
            System.out.println(num + " is a prime number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int check = 2;
        sample s = new sample();
        s.checkSum(num, check);
    }    
}