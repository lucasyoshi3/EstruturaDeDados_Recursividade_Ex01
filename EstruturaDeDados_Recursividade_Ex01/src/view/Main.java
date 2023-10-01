package view;
import java.util.*;
import controller.Somatorio;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("N: ");
		int n=sc.nextInt();
		Somatorio somatorio = new Somatorio();
		int soma=somatorio.recursiva(n);
		System.out.println("Resultado: "+soma);
	}
}
