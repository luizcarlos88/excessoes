import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
private static Scanner entrada;


	public Exception()
	{
		System.out.println("Numero negativo.");
	}

public static void main(String[] args) {
	int x, y = 1;
	
	System.out.println("digite o um numero para divisao");
	x = entrada.nextInt();
	System.out.println("digite o um numero para divisao");
	y = entrada.nextInt();
	if (x  > y){
         throw new ArithmeticException
         ("O valor 1 não pode ser maior que o valor 2");
	}
    if (x <= 0){
    	  throw new ArithmeticException
    	("o valor nao pode ser negativo");
    }
    float z = x/y;
	System.out.println(z);
	
	
	
	}}
        