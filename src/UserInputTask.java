import java.util.Scanner;

public class UserInputTask {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        int pages = scanner.nextInt();

        System.out.println(title);
        System.out.println(pages + 1);

    }
}
