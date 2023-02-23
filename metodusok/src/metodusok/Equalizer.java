
package metodusok;

public class Equalizer {
    public static void main(String[] args) {
        eq();
        eq();
        eq();
        eq();
        eq();
    }
    private static void eq(){
        int random = (int) ((Math.random()*4)+3);
        eq(random);
        }
    
    private static void eq(int hossz){
        String szin = "\u001B[45m";
        for (int i = 0; i < hossz; i++) {
            System.out.print(szin + " ");
        }
        System.out.println("");
        
    }
    //Boolenes feladat rész hiányzik
}