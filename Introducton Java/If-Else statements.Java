import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         Scanner int = new Scanner(System.in);
         int n = in.nextInt();
         String ans;
         if(n % 2 != 0) {
             ans = "Weird";
         } else if (n >= 2 && n <= 5) {
             ans = "Not Weird";
         } else if (n >= 6 && n <= 20) {
             ans = "Weird";
         } else {
             ans = "Not Weird";
         }
         
        System.out.println(ans);
         
   }
}
