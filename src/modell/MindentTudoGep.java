package modell;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MindentTudoGep {

    private int[] lottoSzelveny;
    private int tottoSzelveny;
    private String[] dalok;

    public MindentTudoGep() {
        lottoSzelveny = new int[5];
        dalok = new String[10];

    }

    public MindentTudoGep(String dalok) {
        this();
    }

    public MindentTudoGep(String[] dalok) {
        this();
        this.dalok = dalok;
    }

    public void ujraindit() {

    }

    public String generalLottoSzelveny() {
        Random random = new Random();
        String szelveny = "";
        for (int i = 0; i < 4; i++) {
            lottoSzelveny[i] = random.nextInt();
            szelveny += lottoSzelveny[i];
            System.out.println(lottoSzelveny[i]);
            // lottoSzelveny[i].append;
        }
        return szelveny;

    }

    public String kerLottoSzelveny() {
        return "1,2,3,4,5";
    }

    public void generalTottoSzelveny() {
        this.tottoSzelveny();
    }

    public String kerTottoSzelveny() {
        String s = "";
        s += "1 2 3 ... 13 13+1";
        s += "x 1 2 ... x 1";
    }

    public String[] kerDal() {
        //Scanner src =new Scanner(System.in);
        Scanner src = new Scanner(System.in);
        dalok[0] = "Valami";
        dalok[1] = "Izee";
        dalok[2] = "AZZZ";
        for (int i = 0; i < 10; i++) {
            dalok[i]=src.nextLine();
        }
        return dalok[i];
    }

//    private String beker(String szoveg) {
//        System.out.println(szoveg);
//        return szoveg;
//    }
    public void ujDal(String dal) {
        for (int i = 3; i < 10; i++) {
            Scanner src = new Scanner(System.in);
            dalok[i] = src.toString();
        }
    }

}
