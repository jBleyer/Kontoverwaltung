import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        ArrayList<Konto> konten = new ArrayList<Konto>();
        Random random = new Random();

        while (running) {
            System.out.println("Was möchten Sie machen? 1 - anlegen, 2 - einzahlen, 3 - abheben, 4 - auszug, 5 - auflösen, q - quit");
            char input = scanner.next().charAt(0);
            switch (input) {
                case '1':
                    System.out.println("Welche Art Konto möchten Sie anlegen? 1 - Girokonto, 2 - Sparkonto, 3 - Kreditkonto");
                    char kontoart = scanner.next().charAt(0);
                    if (kontoart == '1') {
                        Girokonto girokonto = new Girokonto();
                        girokonto.anlegen("d", 98, 12, 0.0f, 0.4f, 13.80f, "Girokonto");
                        konten.add(girokonto);
                        //konto.anlegen("d", 98, 12, 0.0f, 0.4f, 13.80f, "Konto");

                        //konto.auszug();
                        //konto.einzahlen(konto, 500f);
                        //konto.abheben(konto, 400f);
                        break;
                    } else if (kontoart == '2') {
                        Sparkonto sparkonto = new Sparkonto();
                        sparkonto.anlegen("d", random.nextInt(1000), random.nextInt(1000), 0.0f, 62.4f, 13.80f, "Sparkonto");
                        konten.add(sparkonto);
                        break;
                    } else if (kontoart == '3') {
                        Kreditkonto kreditkonto = new Kreditkonto();
                        kreditkonto.anlegen("", random.nextInt(1000), random.nextInt(1000), 0.0f, 62.4f, 13.80f, "Kreditkonto");
                        konten.add(kreditkonto);
                        break;
                    }

                    break;
                case '2':
                    System.out.println("Auf welches Konto möchten Sie Ihr Geld überweisen?");
                    int kontonummer = scanner.nextInt();
                    System.out.println("Wie viel Geld möchten Sie überweisen?");
                    float betrag = scanner.nextFloat();

                    for (int i = 0; i < konten.size(); i++) {
                        if(kontonummer == konten.get(i).getKontonummer()){
                            konten.get(i).einzahlen(betrag);
                        }
                    }

                    break;
                case '3':
                    //abheben
                    break;
                case '4':
                    System.out.println("Bitte geben Sie Ihre Kontonummer ein");
                    int kontonummerInput = scanner.nextInt();
                    for (int i = 0; i < konten.size(); i++) {
                        if(kontonummerInput == konten.get(i).getKontonummer()){
                            konten.get(i).auszug();
                        } else {
                            System.out.println("Anderes konto");
                        }
                    }
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