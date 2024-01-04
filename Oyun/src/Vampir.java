public class Vampir extends Oyuncu{
    public Vampir() {
        super("Vampir");
        this.setCan(100);
        this.setMaxHP(getCan());
        this.setHasar(70);
        this.setOran(30);
        this.setSavunma(40);
    }

    @Override
    public void move() {
        System.out.println("vampir karanlıktan önüne atladı");
    }

    @Override
    public int atak() {
        int hasar= super.atak();
        double canYenileme=hasar * 0.1;
        int canMiktari=getCan()+(int)canYenileme;
        if(canMiktari>100) canYenileme=100;
        setCan(canMiktari);
        return hasar;
    }
}
