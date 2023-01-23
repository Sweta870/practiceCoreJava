

// class Main
//  {
// public static void main(String[] args) {

//     // create a hashmap
//     HashMap<String, Integer> languages = new HashMap<>();

//     // add elements to hashmap
//     languages.put("Java", 8);
//     languages.put("JavaScript", 1);
//     languages.put("Python", 3);
//     System.out.println("HashMap: " + languages);
//   }
// } 





// import java.util.*;
// import java.util.HashMap;
// public class test 
// {
//     public static void main(String[] args)
//      { 
//         HashMap<String, String> TelephoneBook = new HashMap<String, String>();
//         TelephoneBook.put("Sweta","998678");
//         TelephoneBook.put("sangam","998678");
//         TelephoneBook.put("Ram","9986787557");
//         TelephoneBook.put("Raja","9986787897");
//         TelephoneBook.put("Salu","9986789097");
//         TelephoneBook.put("Kanta","9986707897");
//         TelephoneBook.put("Shweta","9950787897");
//         TelephoneBook.put("Nidhi","7886787897");
//         TelephoneBook.put("Ritika","9886787897");
//         TelephoneBook.put("Simpy","9086787897");
//         TelephoneBook.put("Sohan","9286787897");

//         Scanner sc =new Scanner(System.in);
//         System.out.print("Enter Name= ");
//         String name=sc.next().toUpperCase();
//         System.out.println(name);

//         if(TelephoneBook.containsKey(name))
//         {
//             System.out.println(name +" = " + TelephoneBook.get(name));

//         }
//         System.out.println(name +" = " +TelephoneBook.get(name));
//      }
// }







import java.util.*;
import java.util.HashMap;
public class test
{
    public static void main(String[] args)
    {
        HashMap<String, String> TelephoneBook = new HashMap<>();
        TelephoneBook.put("Sweta","9986787897");
        TelephoneBook.put("Sangam","9986787887");
        TelephoneBook.put("Ram","9986787557");
        TelephoneBook.put("Raja","9986787897");
        TelephoneBook.put("Salu","9986789097");
        TelephoneBook.put("Kanta","9986707897");
        TelephoneBook.put("Shweta","9950787897");
        TelephoneBook.put("Nidhi","7886787897");
        TelephoneBook.put("Ritika","9886787897");
        TelephoneBook.put("Simpy","9086787897");
        TelephoneBook.put("Sohan","9286787897");

        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Name=");
        String name=sc.next();

        if(TelephoneBook.containsKey(name))
        {
            System.out.println(name +" = " + TelephoneBook.get(name));

        }
        else
            System.out.println("not found");
    }
}
