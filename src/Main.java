import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char input = scanner.next().charAt(0);
        boolean running = true;

        while (running)
        switch (input){
            case '1':
                System.out.println("Welche Art Konto möchten Sie anlegen? 1 - Girokonto, 2 - Sparkonto, 3 - Kreditkonto");
                char kontoart = scanner.next().charAt(0);
                switch (kontoart){
                    case '1':
                        //Giro
                        break;
                    case '2':
                        //Spar
                        break;
                    case '3':
                        //Kredit
                        break;
                }
                //anlegen
                break;
            case '2':
                //einzahlen
                break;
            case '3':
                //abheben
                break;
            case '4':
                //auszug
                break;
            case '5':
                //auflösen
                break;
            case 'q':
                //quit
                running = false;
        }
    }
}
