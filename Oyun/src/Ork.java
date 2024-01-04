import java.util.Random;

public class Ork extends Oyuncu {

    public Ork() {
        super("ork");
        this.setCan(150);
        this.setMaxHP(getCan());
        this.setHasar(50);
        this.setOran(20);
        this.setSavunma(80);

    }

    @Override
    public void move() {
        System.out.println("ork haraket ediyor ");
    }

    @Override
    public int atak() {
        int hasar = super.atak();
        //yapılacak eksta özellikler
        return hasar;
    }

    @Override
    public int blok() {
        int blokDegeri= super.blok();
        //işlemler
        return blokDegeri;
    }
}
