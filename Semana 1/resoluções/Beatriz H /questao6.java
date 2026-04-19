import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite a nota 1: ");
    double nota1 = sc.nextDouble();
    System.out.println("Digite a nota 2: ");
    double nota2 = sc.nextDouble();
    System.out.println("Digite a nota 3: ");
    double nota3 = sc.nextDouble();

    System.out.println("Digite o peso da nota 1: ");
    double peso1 = sc.nextDouble();
    System.out.println("Digite o peso da nota 2: ");
    double peso2 = sc.nextDouble();
    System.out.println("Digite o peso da nota 3: ");
    double peso3 = sc.nextDouble();

    double soma = (nota1*peso1)+(nota2*peso2)+(nota3*peso3);
    double media = soma/(peso1+peso2+peso3);

    System.out.println("Média ponderada das notas: "+media);

    sc.close();
}
