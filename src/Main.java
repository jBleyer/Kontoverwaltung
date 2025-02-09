import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        ArrayList<Konto> konten = new ArrayList<Konto>();

        while (running) {
            System.out.println("Was möchten Sie machen? 1 - anlegen, 2 - einzahlen, 3 - abheben, 4 - auszug, 5 - auflösen, q - quit");
            char input = scanner.next().charAt(0);
            switch (input) {
                case '1':
                    System.out.println("Welche Art Konto möchten Sie anlegen? 1 - Girokonto, 2 - Sparkonto, 3 - Kreditkonto");
                    char kontoart = scanner.next().charAt(0);
                    if (kontoart == '1') {
                        //
                        Konto konto = new Konto();
                        konto.anlegen("d", 98, 12, 0.0f, 0.4f, 13.80f, "Konto");
                        //konten.add(konto);
                        konto.auszug();
                        konto.einzahlen(konto, 500f);
                        konto.abheben(konto, 400f);
                        break;
                    } else if (kontoart == '2') {
                        //Spar
                        break;
                    } else if (kontoart == '3') {
                        //Kredit
                        break;
                    }

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
}