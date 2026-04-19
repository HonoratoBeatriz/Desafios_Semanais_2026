import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite um número inteiro");
    int numero = sc.nextInt();

    int quadrado = numero * numero;

    int quintaParte = numero/5;

    System.out.println("O quadrado de "+ numero + " é "+ quadrado);
    System.out.println("A quinta parte de "+ numero + " é "+ quintaParte);
}
