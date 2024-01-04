public class Saman extends Oyuncu {
    public Saman() {
        super("Şaman");
        this.setCan(120);
        this.setMaxHP(getCan());
        this.setHasar(20);
        this.setOran(20);
        this.setSavunma(60);
    }

    @Override
    public void move() {
        System.out.println("Şaman Vadiden Çıkıp Sizi Yakaladı");
    }

    @Override
    public int blok() {
        int blokDegeri=super.blok();
        int eklencekCan=(int)(getCan()*0.1);
        int newCan=getCan()+eklencekCan;
        if(newCan>120) newCan=120;
        setCan(newCan);
       return blokDegeri;

    }
}
