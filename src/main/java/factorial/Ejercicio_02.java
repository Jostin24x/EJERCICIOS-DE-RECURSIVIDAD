package factorial;
/**
 *
 * @author ACER
 */
public class Ejercicio_02 {
    public static void main(String[] args){
        int n = 5;
        decre(n);
    }
    //método que imprime dígitos de n hasta 1
    //ejemplo: n=5 -> 54321
    //ejemplo: n=8 -> 87654321
    public static void decre(int n){
        if(n>0)
        {
            System.out.print(n);
            decre(n-1);
        }
        else
        System.out.println();
    }
}
