import java.util.Scanner;

public class Licao_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean parar = false;
        do {
            System.out.println("Digite a uma opção \n 1.Tabuada \n 2.Mostrar frase \n 3.Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            while (opcao<1 || opcao >3){
                System.out.println("Digite uma opção válida.");
                System.out.println("Digite a uma opção \n 1.Tabuada \n 2.Mostrar frase \n 3.Sair");
                opcao = scanner.nextInt();
            }
            if(opcao == 1){
                System.out.println("Digite um número.");
                int n = scanner.nextInt();
                scanner.nextLine();
                tabuada(n);
            }
            else if(opcao ==2){
                System.out.println("Digite seu nome ou uma frase");
                String nome = scanner.nextLine();
                mostrarNome(nome);

            }
            else{
                System.out.println("Obrigado por utilizar o nosso sistema, espero que tenha gostado.");
                parar = true;
            }
        }while (!parar);
    }

    public static void tabuada(int n){
        int cont = 1;
        while (cont<=10){
            System.out.println(n*cont);
            cont++;
        }
    }

    public static void mostrarNome(String nome){
        System.out.println(nome);
    }
}
