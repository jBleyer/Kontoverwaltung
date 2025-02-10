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
            System.out.println("\nWas moechten Sie machen? 1 - anlegen, 2 - einzahlen, 3 - abheben, 4 - auszug, 5 - aufloesen, q - quit");
            if(konten.size() == 0){
                System.out.println("Es bestehen keine Konten");
            } else {
                System.out.println("Sie haben " + konten.size() + " Konto/Konten");
            }
            char input = scanner.next().charAt(0);
            switch (input) {
                case '1':
                    System.out.println("Welche Art Konto moechten Sie anlegen? 1 - Girokonto, 2 - Sparkonto, 3 - Kreditkonto");
                    char kontoart = scanner.next().charAt(0);
                    if (kontoart == '1') {
                        Girokonto girokonto = new Girokonto();
                        girokonto.anlegen("Inhaber-Girokonto", 19043, "00234569773", 0.0f, 6.0f, 0.0f, "Girokonto");
                        konten.add(girokonto);
                        //konto.anlegen("d", 98, 12, 0.0f, 0.4f, 13.80f, "Konto");

                        //konto.auszug();
                        //konto.einzahlen(konto, 500f);
                        //konto.abheben(konto, 400f);
                        break;
                    } else if (kontoart == '2') {
                        Sparkonto sparkonto = new Sparkonto();
                        sparkonto.anlegen("Inhaber-Sparkonto", 24860, "09877384842", 0.0f, 0.0f, 0.0f, "Sparkonto");
                        konten.add(sparkonto);
                        break;
                    } else if (kontoart == '3') {
                        Kreditkonto kreditkonto = new Kreditkonto();
                        kreditkonto.anlegen("Inhaber-Kreditkonto", 99801, "83492847362", 0.0f, 62.4f, 500f, "Kreditkonto");
                        konten.add(kreditkonto);
                        break;
                    }

                    break;
                case '2':
                    System.out.println("Bitte geben Sie Ihre Kontonummer an, auf welches Sie einzahlen wollen!");
                    String buffer = scanner.nextLine();
                    String kontonummerEinzahlen = scanner.nextLine();
                    System.out.println("Wie viel Geld moechten Sie ueberweisen?");
                    float betragEinzahlen = scanner.nextFloat();

                    for (int i = 0; i < konten.size(); i++) {
                        if(kontonummerEinzahlen.equals(konten.get(i).getKontonummer())){
                            konten.get(i).einzahlen(kontonummerEinzahlen, betragEinzahlen, konten);
                        }
                    }

                    break;
                case '3':
                    System.out.println("Bitte geben Sie Ihre Kontonummer an, wo Sie Ihr Geld abheben wollen!");
                    String buffer2 = scanner.nextLine();
                    String kontonummerAuszahlen = scanner.nextLine();
                    System.out.println("Wie viel Geld moechten Sie abheben?");
                    float betragAuszahlen = scanner.nextFloat();

                    for (int i = 0; i < konten.size(); i++) {
                        if(kontonummerAuszahlen.equals(konten.get(i).getKontonummer()) ){
                            konten.get(i).abheben(betragAuszahlen);
                        }
                    }

                    break;
                case '4':
                    //
                    System.out.println("Bitte geben Sie Ihre Kontonummer ein");
                    String buffer3 = scanner.nextLine();
                    String kontonummerInput = scanner.nextLine();
                    for (int i = 0; i < konten.size(); i++) {
                        if(kontonummerInput.equals(konten.get(i).getKontonummer())){
                            konten.get(i).auszug();
                        } else {
                            System.out.println("Anderes konto");
                        }
                    }
                    break;
                case '5':
                    //auflösen
                    System.out.println("Bitte geben Sie die Kontonummer des Kontos ein, welches Sie aufloesen wollen");
                    String buffer4 = scanner.nextLine();
                    String kontonummerInputAufloesen = scanner.nextLine();
                    for (int i = 0; i < konten.size(); i++) {
                        if(kontonummerInputAufloesen.equals(konten.get(i).getKontonummer())){
                            konten.remove(i); //SUS???? WARUM???
                        } else {
                            System.out.println("Anderes konto");
                        }
                    }
                    break;
                case 'q':
                    //quit
                    running = false;
            }
        }

    }
}