import java.util.Scanner;

public class User extends Oyuncu{

    static Scanner sc= new Scanner(System.in);
    public User(String isim) {
        super("burak");
        this.setCan(100);
        this.setMaxHP(getCan());
        this.setHasar(50);
        this.setOran(25);
        this.setSavunma(40);
    }

    @Override
    public void levelUp() {
        addLevel();
        System.out.println("LEVEL"+getLevel());
        setCan(getMaxHP());
        System.out.println("1-can =>"+getMaxHP()+"-->"+(getMaxHP()+50));
        System.out.println("2-Hasar =>"+getHasar()+"-->"+(getHasar()+20));
        System.out.println("3-K.Oran =>"+getOran()+"-->"+(getOran()+15));
        System.out.println("4-Savunma =>"+getSavunma()+"-->"+(getSavunma()+20));
        System.out.println("BİR SEÇİM YAPINIZ:");
        int secim=sc.nextInt();
        switch (secim){
            case 1:
                int can=getMaxHP()+50;
                setMaxHP(can);
                setCan(getMaxHP());
                break;
               //setCan(getCan()+50);
                //setMaxHP(getCan()+50);
            case 2:
                setHasar(getHasar()+20);
                break;
            case 3:
                setOran(getOran()+15);
                break;
            case 4:
                setSavunma(getSavunma()+20);
                break;
            default:
                System.out.println("Yanlıs Secim Yaptınız Hakkınızı Kaybettiniz");
        }


    }
}
