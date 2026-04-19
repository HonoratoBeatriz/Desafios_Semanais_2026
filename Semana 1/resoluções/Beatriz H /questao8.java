import java.util.Scanner;

void main() {
    double soma, sub, multi, divisao;

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o primeiro valor: ");
    double a = sc.nextDouble();
    System.out.println("Digite o segundo valor: ");
    double b = sc.nextDouble();

    soma = a+b;
    sub= a-b;
    multi= a*b;
    divisao= a/b;

    System.out.println("Soma: "+soma+ "\nSubtração: "+sub+ "\nMultiplicação: "+multi+ "\nDivisão: "+divisao);
}
