import java.util.Scanner;

public class Licao_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = 0;

        boolean parar = false;
        do {

            System.out.println("Digite seu nome: \n");
            String nomeUsuario = scanner.nextLine();
            System.out.println("Digite um número positivo: \n");
            n = scanner.nextInt();
            scanner.nextLine();
            if(n < 0){
                System.out.println("Digite apenas números positivos. \n");
                continue;
            }
            else{
                contadorCrescente(n);
                contadorDecrecente(n);
                contadorNome(nomeUsuario,n);
            }
            System.out.println("Deseja continuar? \n 1-Sim \n 2-Não");
            int respostaParar = scanner.nextInt();
            scanner.nextLine();

            if(respostaParar == 2){
                parar = true;
            }
            else{
                continue;
            }
        }while(!parar);
    }

    public static void contadorCrescente(int n){
        System.out.println("Contador Crescente:");
        for (int i =0; i<=n; i++){
            System.out.println(i);
        }
    }

    public static void contadorDecrecente(int n){
        System.out.println("Contador Decrecente:");
        for (int i =n; i>=0; i--){
            System.out.println(i);
        }
    }

    public static void contadorNome (String nomeUsuario, int n){
        int numeroLetra = nomeUsuario.length();

        if(numeroLetra>6){
            for(int i =1; i<=n; i++){
                System.out.println(nomeUsuario);
            }
        }
        else{
            System.out.println(nomeUsuario);
        }
    }
}


