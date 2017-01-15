import java.util.Scanner;
//package collins.john;



    // Understand how to get input from user


    public class NameInputScanner {
        Scanner nameInputScanner = new Scanner(System.in);

        public String getUserName(){
          System.out.println("Enter your name.");
          String userName = nameInputScanner.nextLine();
          return userName;
        }

}
