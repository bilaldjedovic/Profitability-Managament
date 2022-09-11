package FSK2;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        System.out.println("Type message to check:");

        while (true) {
            Scanner scanner = new Scanner(System.in);

            String input = scanner.nextLine();

            if (input.equals("STOP") || input.equals("")) {
                break;
            } else if (
                    input.matches("Your\\snumber\\sis\\sthe\\swinner\\sof\\sthe\\sbig\\sCoca\\sCola\\s(?:20+[1-9]{2})\\scompetition!!\\sPlease\\ssend\\syour\\sname,\\sbirthday,\\saddress\\sand\\sbank\\sdetails\\sto\\s[a-z0-9!#$%&'*+/=?^_`{|}~]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\sto\\sclaim\\syour\\sprize!")
                            || input.matches("(?:[a-zA-Z]+( [a-zA-Z]+)+)\\s(?:20+[1-9]{2})\\scompetition!!\\sPlease\\ssend\\syour\\sname,\\sbirthday,\\saddress\\sand\\sbank\\sdetails\\sto\\s[a-z0-9!#$%&'*+/=?^_`{|}~]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\sto\\sclaim\\syour\\sprize!")){
                System.out.println("Message passed patterns-A2P");
            } else {
                System.out.println("Out of patterns");
            }
        }
    }
}

