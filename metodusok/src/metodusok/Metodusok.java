
package metodusok;


public class Metodusok {

 
    public static void main(String[] args) {
        kiir("Els� 10 sz�m �sszege:" + elso10SzamOsszege());
        kiir("K�t sz�m �sszege:" + osszead(7, 4));
        int szam1 = 7, szam2 = 4;
        int szam3 = 3;
        int szam4 = 2;
        int osszeg = osszead(szam1, szam2);
        kiir("%d + %d = %d\n".formatted(szam1, szam2, osszeg));
        //�rjunk ki 4 sz�m �sszeg�t
      
        kiir("4 Sz�m �sszege:"+ negySzamosszege(szam1, szam2, szam3, szam4));
        
        kiir("%d+%d+%d gyoke = %4f\n".formatted(szam3,szam4,szam2,gyokvonas(szam1, szam3, szam4)));
        
        
        
 
    }
    private static double gyokvonas(int a, int b, int c){
        int osszeg = osszead(a, b);
        osszeg += osszead(osszeg, c);
        double gyok = Math.sqrt(osszeg);
        return gyok;
            
    }
    private static int negySzamosszege(int a, int b, int c, int d){
        int osszeg = osszead(a, b);
        osszeg += osszead(c, d);
        return osszeg;
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
