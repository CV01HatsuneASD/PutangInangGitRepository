import java.util.Scanner;
public class PutangInaMoJames {
    public static void main(String[]args) {
        Scanner userInput = new Scanner(System.in);
        String[] mamaUwu = new String[2];
        String a, b;

        System.out.print("Mama: ");
        mamaUwu = userInput.nextLine().split(" ");
        a = mamaUwu[0];
        b = mamaUwu[1];
        System.out.println(a + " " + b);
        userInput.close();
    }
}