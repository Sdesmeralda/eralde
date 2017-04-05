
package katafizz;


public class Fizz {
    public String getFizz (int n){
        String resultado = String.valueOf(n);
    if (n%3==0){
    resultado= "Fizz";
    }
   
   return resultado;
    }
}
