import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite um valor em horas: ");
    double hora = sc.nextDouble();

    double seg = hora*3600;

    System.out.println(hora +" horas são "+seg+" segundos.");

    sc.close();
}
