 import java.util.*;
public class temp
{
    public static void main(String arg[])
    {
        Scanner sc =new Scanner(System.in);
        int choice;
         int num1, num2, sum, sub, mul, mod, divd, square_num1,square_num2, root ;
            System.out.print("Enter the value of num1 = ");
            num1=sc.nextInt();
            System.out.println("Enter the value of num2 = ");
            num2=sc.nextInt();
            sum=num1+ num2;
            sub=num1-num2;
            mul=num1*num2;
            divd=num1/num2;
            mod=num1%num2;
            square_num1 =num1 *num1;
            square_num2 =num2 *num2;
            System.out.println("sum of num1 and num2: " +sum);
            System.out.println("substract of num1 and num2: " +sub);
            System.out.println("Multiply of num1 and num2: " +mul);
            System.out.println("Divide of num1 and num2: " +divd);
            System.out.println("modulos of num1 and num2: " +mod);
            System.out.println("square of num1 : " +square_num1);
            System.out.print("square of  num2: " +square_num2);

            while(1)
            {
                System.out.print("Enter your choice for the following menu ");
                System.out.println("1.Addition  2.substraction  3.Multiplication. 4.division  5.modulous 6.square of 1st number 7.square of 2nd number.");
                choice =sc.nextInt();
                switch(choice)
                {
                    case 1:

                }
            }

            
    }       
}