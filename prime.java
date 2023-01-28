import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, count = 0;
        System.out.print("Enter the number:-");
        num = sc.nextInt();
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                count++;
                
                if(count>=2){
                    break;
                }
            }

        }        
        if (count >= 2) {

            System.out.println( "Number is not prime");

        }
        else{

            System.out.println( "Number is  prime");

        }

    }
}