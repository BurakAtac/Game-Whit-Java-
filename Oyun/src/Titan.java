public class Titan extends Oyuncu{
    public Titan() {
        super("Titan");
        this.setCan(200);
        this.setMaxHP(getCan());
        this.setHasar(15);
        this.setOran(20);
        this.setSavunma(50);
    }

    @Override
    public void move() {
        System.out.println("Titan Sulardan çıkıp karşına geldi ");
    }
}
