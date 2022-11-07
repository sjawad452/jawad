import java.util.Scanner;
public class labtasktwo{

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.print("Enter any number: ");
    int num = scan.nextInt();
    String evenOrOdd = (num % 2 == 0) ? "even number" : "odd number";

    System.out.println(num + " is an " + evenOrOdd);

  }
}