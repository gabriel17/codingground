public class PruebaTablaFactorial {
 public static void main (String [] args){
 for (int k=1; k<=20; k++)
 System.out.println(k + "! = " + factorial(k));
 }
 public static int factorial (int n) {
 int aux = 1;
 for (int i = 2; i<=n; i++)
 aux *= i; // aux = aux * i
 return aux;
 }
 }
