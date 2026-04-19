import java.util.Scanner;

void main() {
    int c;

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o valor de a: ");
    int a = sc.nextInt();
    System.out.println("Digite o valor de b: ");
    int b = sc.nextInt();

    c = a;
    a = b;
    b = c;

    System.out.println("a: "+a);
    System.out.println("b: "+b);

    sc.close();
}
