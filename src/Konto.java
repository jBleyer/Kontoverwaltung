public class Konto {
    private String kontoinhaber;
    private int bankleitzahl;
    private int kontonummer;
    private float ueberziehungsrahmen;
    private float kontofuerunsgebuehren;
    private float kontostand;
    private String kontoart;

    //contructor
    public Konto() {

    }

    public Konto(String kontoinhaber,
                 int bankleitzahl,
                 int kontonummer,
                 float ueberziehungsrahmen,
                 float kontofuerunsgebuehren,
                 float kontostand,
                 String kontoart) {
        this.kontoinhaber = kontoinhaber;
        this.bankleitzahl = bankleitzahl;
        this.kontonummer = kontonummer;
        this.ueberziehungsrahmen = ueberziehungsrahmen;
        this.kontofuerunsgebuehren = kontofuerunsgebuehren;
        this.kontostand = kontostand;
        this.kontoart = kontoart;
    }

    //Methoden
    public Konto anlegen(String kontoinhaber,
                         int bankleitzahl,
                         int kontonummer,
                         float ueberziehungsrahmen,
                         float kontofuerunsgebuehren,
                         float kontostand,
                         String kontoart)
    {
        Konto konto = new Konto(kontoinhaber,
                bankleitzahl,
                kontonummer,
                ueberziehungsrahmen,
                kontofuerunsgebuehren,
                kontostand,
                kontoart);
        System.out.println(kontoart + " wurde erfolgreich erstellt");

        return konto;
    }

    public void aufloesen(Konto konto) {
        //has 2 be overwritten 4 überweisung as you have to delete the object from the array
        // gc, take care of it!
        konto = null;
    }

    public void einzahlen(Konto konto, float geld) {
       konto.setKontostand(konto.getKontostand() + geld);
    }

    public void abheben() {

    }

    public void auszug() {

    }

    //überweisen() als Zusatz

    //getter + setter
    public void setKontoinhaber(String kontoinhaber) {
        this.kontoinhaber = kontoinhaber;
    }

    public void setBankleitzahl(int bankleitzahl) {
        this.bankleitzahl = bankleitzahl;
    }

    public void setKontonummer(int kontonummer) {
        this.kontonummer = kontonummer;
    }

    public void setUeberziehungsrahmen(float ueberziehungsrahmen) {
        this.ueberziehungsrahmen = ueberziehungsrahmen;
    }

    public void setKontofuerunsgebuehren(float kontofuerunsgebuehren) {
        this.kontofuerunsgebuehren = kontofuerunsgebuehren;
    }

    public void setKontostand(float kontostand) {
        this.kontostand = kontostand;
    }

    public void setKontoart(String kontoart) {
        this.kontoart = kontoart;
    }


    public String getKontoinhaber() {
        return kontoinhaber;
    }

    public int getBankleitzahl() {
        return bankleitzahl;
    }

    public int getKontonummer() {
        return kontonummer;
    }

    public float getUeberziehungsrahmen() {
        return ueberziehungsrahmen;
    }

    public float getKontofuerunsgebuehren() {
        return kontofuerunsgebuehren;
    }

    public float getKontostand() {
        return kontostand;
    }

    public String getKontoart() {
        return kontoart;
    }


}
