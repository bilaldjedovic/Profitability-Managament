package FSK2;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
// TASK 4
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

        //TASK 2
        System.out.println("Type message to check:");

        while (true) {
            Scanner scanner = new Scanner(System.in);

            String input = scanner.nextLine();

            if (input.equals("STOP") || input.equals("")) {
                break;
            } else if (
                    input.matches("(?:You have g0t)\\s[1-9]+[0-9]*\\s(?:K\\.y\\+s\\sfrom)\\s\\+[1-9]+[0-9]*\\.\\s(?:Thank u for using International Airtym)\\s(?:Tr\\}s\\[fer\\])\\s(?:brought to u by)\\s(?:Dt\\[a\\]C\\-Thailand and Ooredoo.)\\s(?:\\(Ref\\:[1-9]{6,}\\))")
            ){
                System.out.println("Message passed patterns-A2P");
            } else {
                System.out.println("Out of patterns");
            }
        }
// task 1

        System.out.println("Type message to check:");

        while (true) {
            Scanner scanner = new Scanner(System.in);

            String input = scanner.nextLine();

            if (input.equals("STOP") || input.equals("")) {
                break;
            } else if (input.matches("[A-Z]\\-[0-9]{3,}[\\s\\w]*.")
                    || input.matches("[A-Z]-[0-9]{6}\\s(?:is your verification code\\.)$")
                    || input.matches("G\\-[0-9]{6}\\s(?:is your verification code\\.)$")){
                System.out.println("Message passed patterns-A2P");
            } else {
                System.out.println("Out of patterns");
            }
        }

    }
}

