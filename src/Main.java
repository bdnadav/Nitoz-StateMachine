import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DownloadSystem sys = new DownloadSystem(100) ;
        Thread mainRun = new Thread(sys);

        while(true) {
            System.out.println("Tell the system what to do :\n" +
                    "1. turnOn\n"+
                    "2. turnOff\n"+
                    "3. internetOn\n"+
                    "4. internetOff\n"+
                    "5. fileRequest\n"+
                    "6. downloadAborted\n"+
                    "7. downloadError\n"+
                    "8. errorFixed\n"+
                    "9. movieOn\n"+
                    "10. restartMovie\n"+
                    "11. holdMovie\n"+
                    "12. movieOff\n"+
                    "13. resume\n");

            Scanner userInput = new Scanner(System.in);

            while(!userInput.hasNext());

            String input = "";
            if (userInput.hasNext())
                input = userInput.nextLine();

            switch(input) {
                case "1":
                    mainRun.start();
                    break;
                case "2":
                    sys.turnOff();
                    break;
                case "3":
                    sys.internetOn();
                    break;
                case "4":
                    sys.turnOff();
                    break;
                case "5":
                    sys.turnOff();
                    break;
                case "6":
                    sys.turnOff();
                    break;
            }

            if (!input.equals("")) {
                //main code
            }
            userInput.close();
            //Thread.sleep(1000);
        }

    }
}
