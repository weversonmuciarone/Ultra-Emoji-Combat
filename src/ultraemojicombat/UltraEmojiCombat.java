package ultraemojicombat;

public class UltraEmojiCombat {

public static void main(String[] args) {
     Lutador l [] = new Lutador [6];
        l[0] = new Lutador( "Pretty boy","Franca",31,10,2,3,1.75f,68.9f);
        l[1] = new Lutador ("Putscript","Brazil",29,14,2,3,1.68f,57.8f);
        l[2] = new Lutador ("Snapshadow","EUA",35,8,2,0,1.65f,80.9f);
        l[3] = new Lutador ("Dead Code","Australia",28,13,2,0,1.93f,81.6f);
        l[4] = new Lutador ("Spider","Brazil",37,5,3,4,1.70f,119.3f);
        l[5] = new Lutador ("Neard","EUA",30,12,2,4,1.81f,105.7f);

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[1], l[1]);
        UEC01.lutar();
    }
    
}
