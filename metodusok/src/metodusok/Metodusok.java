
package metodusok;


public class Metodusok {

 
    public static void main(String[] args) {
        kiir("Els� 10 sz�m �sszege:" + elso10SzamOsszege());
        kiir("K�t sz�m �sszege:" + osszead(5, 2));
        int szam1 = 7, szam2 = 4;
        int osszeg = osszead(szam1, szam2);
        kiir("%d + %d = %d\n".formatted(szam1, szam2, osszeg));
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
