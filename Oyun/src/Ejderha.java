public class Ejderha extends Oyuncu{
    public Ejderha() {
        super("BOSS EJDERHA ");
        this.setCan(350);
        this.setMaxHP(getCan());
        this.setHasar(60);
        this.setOran(30);
        this.setSavunma(50);
    }

    @Override
    public void move() {
        System.out.println("!!!!! Ejderha dumanalrını üfleyerek Karşına çıktı !!!!!!");
    }

    @Override
    public int atak() {
        int vurulanHasar=super.atak();

        if(getCan()<150&&getCan()>100){
            vurulanHasar=vurulanHasar+(int)(vurulanHasar*0.5);
        } else if (getCan()<100) {
            vurulanHasar=vurulanHasar+(int)(vurulanHasar*0.7);
        }


        return vurulanHasar;
    }
}
