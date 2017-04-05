
package katafizz;


public class Fizz {
    public String getFizz (int n){
        String resultado = String.valueOf(n);
    if (n%3==0){
    resultado= "Fizz";
    }

   
   return resultado;
    }
    
     public String getFuzz (int n){
        String resultado = String.valueOf(n);
    if (n%5==0){
    resultado= "Buzz";
    }
   
   return resultado;
    }
     
     public String getFizzBuzz (int n){
        String resultado = String.valueOf(n);
    if (n%5==0&&n%3==0){
    resultado= "FizzBuzz";
    }
   
   return resultado;
    }
}
