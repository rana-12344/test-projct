
package javaapplication14;
import java.util.ArrayList;


public class JavaApplication14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> p= new ArrayList <>();
        int sum=0;
        for ( int i=1; i<=10;i++) {
            p.add(i) ;
            sum+=i ;
        }
        System.out.println(p) ;
        System.out.println(sum) ;
        p.remove(9) ;
        System.out.println(p) ;
         p.add(70) ;
          System.out.println(p) ;
        // TODO code application logic here
    }
    
}
