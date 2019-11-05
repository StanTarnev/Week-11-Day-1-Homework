public class Printer {
    private int sheetsLeft;
    private int toner;

    public Printer(int sheetsLeft, int toner) {
        this.sheetsLeft = sheetsLeft;
        this.toner = toner;
    }

    public int getSheetsLeft() {
        return this.sheetsLeft;
    }

    public int getToner(){
        return this.toner;
    }

    public int printDocument(int documentPages, int documentCopies) {
        if (this.sheetsLeft >= documentPages * documentCopies) {
            this.sheetsLeft -= documentPages * documentCopies;
            this.toner -= documentPages * documentCopies;
        }
        return this.sheetsLeft;
    }
}
