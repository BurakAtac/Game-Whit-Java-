public class Zombi extends Oyuncu{
    public Zombi() {
        super(" nazi Zombi");
        this.setCan(60);
        this.setMaxHP(getCan());
        this.setHasar(30);
        this.setOran(15);
        this.setSavunma(40);

    }

    @Override
    public void move() {
        System.out.println("Zombi Baskına Geldi ");
    }

}
