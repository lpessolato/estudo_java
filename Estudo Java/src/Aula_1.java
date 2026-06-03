import java.util.Scanner;

public class Aula_1 {
    public void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Boas vindas!");

        System.out.println("Digite seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu CPF: ");
        String cpf = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Digite seu estado civil: ");
        String estadoCivil = scanner.nextLine();

        scanner.close();

        System.out.println("Seu nome é " + nome + ", seu CPF é " + cpf + ", sua idade é "+ idade+", seu peso é "+peso+", sua altura é "+altura+" e seu estado civil é "+ estadoCivil);

    }
}
