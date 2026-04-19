import java.util.Scanner;
void main() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Nome: ");
    String nome = sc.nextLine();

    System.out.println("Curso: ");
    String curso = sc.nextLine();

    System.out.println("Idade: ");
    int idade = sc.nextInt();

    System.out.println("Olá, "+nome+"! Você têm "+idade+" anos e faz "+curso+"!");
}
