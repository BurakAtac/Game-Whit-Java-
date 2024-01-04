import java.util.Random;

public class Oyuncu {
    private  String isim;
    private int oran;
    private  int can;
    private int level;
    private int hasar;
    private  int savunma;

    private  int MaxHP;

    public String getIsim() {
        return isim;
    }

    public int getMaxHP() {
        return MaxHP;
    }

    public void setMaxHP(int maxHP) {
        MaxHP = maxHP;
    }

    public Oyuncu(String isim) {
        this.isim = isim;
        this.level=1;
    }

    public  void move(){

    }

    public int atak(){
        Random r=new Random();
        int vurulanHasar=0;
        if(r.nextInt(100)<this.getOran()){
            System.out.println( this.isim+"Kritik Vurdu!!");
            vurulanHasar=2*(r.nextInt(getHasar()/2,getHasar()));

        }
        else {
            System.out.println(this.isim+ " Vurdu");
            vurulanHasar=r.nextInt(getHasar()/2,getHasar());
        }
        return vurulanHasar;
    }
    public void levelUp(){

    }
    public  int blok(){
        Random r=new Random();
        int blokDegeri=r.nextInt(this.getSavunma()/3,this.getSavunma());
        System.out.println(this.isim+"Blok Yapıyor");
        return blokDegeri;
    }

    public int getOran() {
        return oran;
    }

    public void setOran(int oran) {
        this.oran = oran;
    }

    public int getCan() {
        return can;
    }

    public void setCan(int can) {
        this.can = can;
    }

    public int getLevel() {
        return level;
    }

    public void addLevel() {
        this.level++;
    }

    public int getHasar() {
        return hasar;
    }

    public void setHasar(int hasar) {
        if(hasar>0 && hasar<=100)
            this.hasar = hasar;
        else
            this.hasar=0;
    }

    public int getSavunma() {
        return savunma;
    }

    public void setSavunma(int savunma) {
        this.savunma = savunma;
    }
}
