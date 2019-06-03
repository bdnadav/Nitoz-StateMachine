import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while(true) {
            System.out.println("Tell the system what to do :");
            Scanner userInput = new Scanner(System.in);

            while(!userInput.hasNext());

            String input = "";
            if (userInput.hasNext()) input = userInput.nextLine();

            System.out.println("input is '" + input + "'");

            if (!input.equals("")) {
                //main code
            }
            userInput.close();
            //Thread.sleep(1000);
        }

    }
}
