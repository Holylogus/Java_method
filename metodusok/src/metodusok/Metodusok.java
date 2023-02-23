
package metodusok;


public class Metodusok {

 
    public static void main(String[] args) {
        kiir("Elsõ 10 szám összege:" + elso10SzamOsszege());
        kiir("Két szám összege:" + osszead(7, 4));
        int szam1 = 7, szam2 = 4;
        int osszeg = osszead(szam1, szam2);
        kiir("%d + %d = %d\n".formatted(szam1, szam2, osszeg));
        //írjunk ki 4 szám összegét
        int negySzamOsszeg = osszead(szam1, szam2)+osszead(szam1, szam2);
        kiir("4 Szám összege:"+negySzamOsszeg);
    }
    private static int elso10SzamOsszege(){
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += i;
        }
       return osszeg;
    }
    private static int osszead(int a, int b){
        return a+b;
    }
    private static void kiir(String szoveg){
        System.out.println(szoveg);
    }
}   
