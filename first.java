                       // TABLE
// import java.util.*;
// public class first{
//     public static void main(String arg[])

//     {
//         int t;
//         Scanner sc =new Scanner(System.in);
//         System.out.print("enter the value of n: ");
//         int n=sc.nextInt();
//         int i;
//         for(i=1;i<=10;i++)
//         {
//             t=n*i;
//             System.out.print( "\n "+t );
//         }
//     }
// }

//                          SUM
// import java.util.*;
// public class first
// {
//     public static void main(String arg[])
//     {
//         Scanner sc =new Scanner(System.in);
//          int num1, num2, sum;
//             System.out.println("Enter the value of num1 = ");
//             num1=sc.nextInt();
//             System.out.println("Enter the value of num2 = ");
//             num2=sc.nextInt();
//             sum=num1+ num2;
//             System.out.print("sum of num1 and num2: " +sum);
//     }       
// }

//                                      CALCULATER

// import java.util.*;
// public class first
// {
//     public static void main(String arg[])
//     {
//         Scanner sc =new Scanner(System.in);
//          int num1, num2, sum, sub, mul, mod, divd, square_num1,square_num2, root ;
//             System.out.print("Enter the value of num1 = ");
//             num1=sc.nextInt();
//             System.out.println("Enter the value of num2 = ");
//             num2=sc.nextInt();
//             sum=num1+ num2;
//             sub=num1-num2;
//             mul=num1*num2;
//             divd=num1/num2;
//             mod=num1%num2;
//             square_num1 =num1 *num1;
//             square_num2 =num2 *num2;
//             System.out.println("sum of num1 and num2: " +sum);
//             System.out.println("substract of num1 and num2: " +sub);
//             System.out.println("Multiply of num1 and num2: " +mul);
//             System.out.println("Divide of num1 and num2: " +divd);
//             System.out.println("modulos of num1 and num2: " +mod);
//             System.out.println("square of num1 : " +square_num1);
//             System.out.print("square of  num2: " +square_num2);
            
//     }       
// }
                        //WITH CHOICE

// import java.util.*;
// public class first
// {
//     public static void main(String arg[])
//     {
//         Scanner sc =new Scanner(System.in);
//         int choice;
//          int num1, num2, sum, sub, mul, mod, divd, square_num1,square_num2, root ;
//             System.out.print("Enter the value of num1 = ");
//             num1=sc.nextInt();
//             System.out.println("Enter the value of num2 = ");
//             num2=sc.nextInt();
//             sum=num1+ num2;
//             sub=num1-num2;
//             mul=num1*num2;
//             divd=num1/num2;
//             mod=num1%num2;
//             square_num1 =num1 *num1;
//             square_num2 =num2 *num2;
//             System.out.println("sum of num1 and num2: " +sum);
//             System.out.println("substract of num1 and num2: " +sub);
//             System.out.println("Multiply of num1 and num2: " +mul);
//             System.out.println("Divide of num1 and num2: " +divd);
//             System.out.println("modulos of num1 and num2: " +mod);
//             System.out.println("square of num1 : " +square_num1);
//             System.out.print("square of  num2: " +square_num2);

//             while(1)
//             {
//                 System.out.print("Enter your choice for the following menu ");
//                 System.out.println("1.Addition  2.substraction  3.Multiplication. 4.division  5.modulous 6.square of 1st number 7.square of 2nd number.");
//                 choice =sc.nextInt();
//                 switch(choice)
//                 {
//                     case 1:

//                 }
//             }

            
//     }       
// }

// import java.util.*;
// public class first
// {
//     public static void main(String arg[])
//     {
//         Scanner sc =new Scanner(System.in);
//         int n1=0,n2=1, n3,i,count=10;
//         System.out.print(n1 +" "+n2);
//         for(i=0;i<=count;i++)
//         {
//             n3=n1+n2;
//             System.out.print(" "+n3);
//             n1=n2;
//             n2=n3;
//         }
//     }
// }

import java.util.*;
public class first
{
public static void main(String [] args)
{
  int count=10,n1=0,n2=1,n3;  
System.out.println("Fabonacci series of "+ count + "number:" );
System.out.print(n1+ " "+ n2+ " ");
for(int i=2;i<=count;i++){
   n3=n1+n2;
   n1=n2;
   n2=n3;
  System.out.print(n3 + " ");  
}
}
}
// public class first
// {
// 	public static void main(String[] args) {
// 	 int n=78;
	
// 	 for(int i=2;i<=n;i++)
// 	 {
//  	  if(i%2==0)
//  		{ 
//  		 System.out.println(i);
//  		}
	  
// 	 }
// 	}
// }
// public class first
// {
// 	public static void main(String[] args) {
// 	 int n=78;
	
// 	 for(int i=1;i<=n;i++)
// 	 {
//  	  if(i%2!=0)
//  		{ 
//  		 System.out.println(i);
//  		 }
	  
// 	 }
// 	}
// }
