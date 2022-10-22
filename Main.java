import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc1 = new Scanner (System.in);
    double num1, num2, soma, subtracao, divisao, multiplicacao, resto, res, potencia;
    System.out.print("Insira um número: ");
    num1 = sc1.nextDouble();
    System.out.print("Insira mais um número: ");
    num2 = sc1.nextDouble();
    
    soma = num1 + num2;
    System.out.println("O resultado da soma é: " + soma);

    subtracao = num1 - num2;
    System.out.println("O resultado da subtração é: " + subtracao);

    multiplicacao = num1 / num2;
    System.out.println("O resultado da divisão é: " + divisao);

    resto = num1 % num2;
    System.out.println("O resultado do resto da divisão é: " + resto);
}
}