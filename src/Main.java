import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        System.out.println(" enter disk size or enter 0 for default size" +
                "(default size is 100)\n");

        Scanner inputDisk = new Scanner(System.in);
        double DSize= inputDisk.nextDouble();

        if(DSize==0)
            DSize=100;

        PrintWriter writer = new PrintWriter("readMe.txt", "UTF-8");
        writer.println("Download System Event Log : ");
        writer.flush();


        DownloadSystem sys = new DownloadSystem(writer, DSize) ;
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
            System.out.println("Enter your choice :" ) ;
            Scanner userInput = new Scanner(System.in);

            while(!userInput.hasNext());

            String input = "";
            if (userInput.hasNext())
                input = userInput.nextLine();
            switch(input) {
                case "1":
                    if (!mainRun.isAlive()){
                        mainRun = new Thread(sys);
                        writer.println("turnOn");
                        mainRun.start();
                    }
                    break;
                case "2":
                    writer.println("turnOff");
                    sys.turnOff();
                    break;
                case "3":
                    writer.println("internetOn");
                    sys.internetOn();
                    break;
                case "4":
                    writer.println("internetOff");
                    sys.internetOff();
                    break;
                case "5":
                    writer.println("fileRequest");
                    System.out.println("enter file size");
                    Scanner inputFile = new Scanner(System.in);
                    double FSize= inputFile.nextDouble();
                    sys.fileRequest(FSize);
                    break;
                case "6":
                    writer.println("downloadAborted");
                    sys.downloadAborted();
                    break;
                case "7":
                    writer.println("downloadError");
                    sys.downloadError();
                    break;
                case "8":
                    writer.println("errorFixed");
                    sys.errorFixed();
                    break;
                case "9":
                    writer.println("movieOn");
                    sys.movieOn();
                    break;
                case "10":
                    writer.println("restartMovie");
                    sys.restartMovie();
                    break;
                case "11":
                    writer.println("holdMovie");
                    sys.holdMovie();
                    break;
                case "12":
                    writer.println("movieOff");
                    sys.movieOff();
                    break;
                case "13":
                    writer.println("resume");
                    sys.resume();
                    break;
                case "14":
                    writer.println("change curr Speed(not permanent)");
                    sys.resume();
                    break;
                case "15":
                    writer.println("change curr free Space ");
                    sys.resume();
                    break;
                case "16":
                    writer.println("change user's points ");
                    sys.resume();
                    break;
            }

            if (!input.equals("")) {
                //main code
            }
            //userInput.close();
            //Thread.sleep(1000);
            writer.flush();
        }
        //writer.close();

    }
}
