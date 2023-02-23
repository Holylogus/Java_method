
package metodusok;


public class Metodusok {

 
    public static void main(String[] args) {
        kiir("Els� 10 sz�m �sszege:" + elso10SzamOsszege());
        kiir("K�t sz�m �sszege:" + osszead(7, 4));
        int szam1 = 7, szam2 = 4;
        int osszeg = osszead(szam1, szam2);
        kiir("%d + %d = %d\n".formatted(szam1, szam2, osszeg));
        //�rjunk ki 4 sz�m �sszeg�t
        int negySzamOsszeg = osszead(szam1, szam2)+osszead(szam1, szam2);
        kiir("4 Sz�m �sszege:"+ negySzamOsszeg);
        int szam3 = 3;
        int szam4 = 2;
        osszeg = osszead(szam3, szam4);
        osszeg += osszead(osszeg, szam2);
        double gyok = Math.sqrt(osszeg);
        kiir("%d+%d+%d gyoke = %4f\n".formatted(szam3,szam4,szam2,gyok));
        
        
 
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
