import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Oyun {
    ArrayList<Oyuncu> dusmanListesi=new ArrayList();
    private  int dusmanSayisi=5;

    public Oyun() {
        dusmanListesi.add(new Ork());
        dusmanListesi.add(new Saman());
        dusmanListesi.add(new Vampir());
        dusmanListesi.add(new Titan());
        dusmanListesi.add(new Zombi());
    }

    public void basla(){
        User u =new User("burak");
        while (true) {
            Oyuncu dusman = dusmanBelirle();
            while (true){
                System.out.println(u.getIsim()+"cani:"+u.getCan());
                System.out.println(dusman.getIsim()+"cani:"+dusman.getCan());
                Random rnd=new Random();
                Scanner sc=new Scanner(System.in);
                System.out.println("1-saldir\n"+"2-savun\n"+"bir seçim yapınız");
                int userSecim= sc.nextInt();
                int dusmanSecim=rnd.nextInt(2)+1;
                if(userSecim==dusmanSecim){
                    if(userSecim==2){
                        System.out.println("iki düşman birnirine bakıyor");
                    }
                    else {
                        int userHasar=u.atak();
                        int dusmanHaar=dusman.atak();
                        System.out.println(u.getIsim()+"hasarı "+userHasar);
                        System.out.println(dusman.getIsim()+"hasarı "+dusmanHaar);
                        u.setCan(u.getCan()-dusmanHaar);
                        dusman.setCan((dusman.getCan()-userHasar));
                    }
                } else if (userSecim>dusmanSecim) {
                    int userBlok=u.blok();
                    int dusmanHaar=dusman.atak();
                    if (dusmanHaar>userBlok){
                        System.out.println(dusman.getIsim()+"hasarı "+dusmanHaar);
                        u.setCan(u.getCan()-dusmanHaar);
                    }
                    else {
                        System.out.println("Blok Başarılı");
                    }

                }
                else {
                    int dusmanBlok=dusman.blok();
                    int userHasar=u.atak();
                    if(userHasar>dusmanBlok){
                        System.out.println(u.getIsim()+"hasarı "+userHasar);
                        dusman.setCan((dusman.getCan()-userHasar));
                    }
                    else {
                        System.out.println("blok başarılı");
                    }
                }
                if(u.getCan()<=0){
                    System.out.println("!!!!!ÖLDÜNÜZ!!!!!");
                    return;
                }
                if(dusman.getCan()<=0){
                    System.out.println("Kazandınız");
                    u.levelUp();
                    dusmanSayisi--;
                    break;
                }

            }


            if(dusmanSayisi<0){
                System.out.println("OYUNU KAZANDINIZ TEBRİK EDERİZ");
                break;
            }
        }
    }

    private Oyuncu dusmanBelirle() {
        Oyuncu o=new Ejderha();
        Random rnd =new Random();
        if(dusmanSayisi>0){
            int index= rnd.nextInt(dusmanListesi.size());
            o=dusmanListesi.get(index);
            dusmanListesi.remove(index);

        }


        return o;
    }
}
