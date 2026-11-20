package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Konto {

    private String iban;
    private double guthaben;

    public Konto(String iban, double guthaben) {
        this.iban = iban;
        if (guthaben < 0){
            this.guthaben=0.0;
        } else {
            this.guthaben=guthaben;
        }
    }

    public double getGuthaben() {
        return this.guthaben;
    }

    public String getIban() {
        return this.iban;
    }

    void einzahlen (double betrag) {
        this.guthaben += betrag;
    }

    void abheben (double betrag) {
        if(betrag>this.guthaben) {
            System.out.println("Kann nicht abgebucht werden");
        }
            else {
                this.guthaben-=betrag;
        }
    }
}


public class Main {
    static void main() {
        Konto meinKonto = new Konto("AT12523", 1.0);
        meinKonto.einzahlen(50.0);
        meinKonto.abheben(100.0);
            System.out.println(meinKonto.getGuthaben());
            System.out.println("Dein Konto: " + meinKonto.getIban());
        }
    }
