import java.util.Scanner;

public class ContaTermina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numConta;
        String agencia , nomeCliente ;
        Double saldo ;

        
        System.out.println("Por favor, digite o Número da Agência !");
        agencia = scanner.nextLine();
        System.out.println("Por favor, digite o Número da sua conta !");
        numConta  = scanner.nextInt();

        scanner.nextLine();


        System.out.println("Digite o seu número");
        nomeCliente=scanner.nextLine();
        System.out.println("Digite o valor do saldo");
        saldo = scanner.nextDouble();

        System.out.println(" ======||||||=======");
        System.out.println("Olá" + nomeCliente + " obrigado por criar uma conta em nosso banco!! ");
        System.out.println(" Sua agência é:" + agencia  + " conta : " + numConta);
        System.out.println(" Seu saldo é :" + saldo +  "já está  disponível para saque");

        scanner.close();

      
        



    }
        
    }
    

