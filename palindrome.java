import java.util.Scanner;

public class palindrome {
    

    public static void main(String[] args){
        int number, revNO=0, rem=0;

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a number to check wheather its palindrome or not : ");
        number = inp.nextInt();


        for(int i = number; i >0; i/=10){
            rem = i % 10;
            revNO = revNO * 10 + rem;
            // number /= 10;
        }


        if(revNO == number){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
