package org.example;
/*Crie a hierarquia de classes utilizada como exemplo nesta aula:
crie a classe ContaEspecial (Figura 4.1) e ContaPoupanca (Figura 4.2),
crie os construtores dessas classes (Figuras 4.3 e 4.4),
crie o método reajustar na classe ContaPoupanca (Figura 4.5)
método sacar na classe ContaEspecial
(Figura 4.8).

2. Agora que temos vários tipos de contas, vamos alterar o programa que
iniciamos no exercício 3 da aula 2 e incrementamos no exercício 2 da aula

3. Nessa nova versão, quando o usuário escolher a opção 1 (criar nova
Conta) o sistema deve questionar o tipo de conta a ser criada dando como
opções 1 para Conta, 2 para ContaEspecial e 3 para ContaPoupanca.

Com base na resposta do usuário, o sistema deve instanciar o tipo correto de
conta (lembre-se que os argumentos necessários para instanciar um objeto variam
de acordo com o tipo da conta). Após criada, a conta continua
sendo inserida na lista. Não são necessárias alterações no resto do código
graças ao polimorfismo!
Note que no exercício 2 da aula 4 o único trecho de código que será alterado
devido ao fato de termos contas de tipos diferentes é o trecho que trata de
criação de contas. Todo o resto continua funcionando,*/

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Conta c = null;
        Scanner sc = new Scanner(System.in);
        int opcao;
        double deposito = 0;
        double saque = 0;
        double reajuste;
        ArrayList<Conta> contas = new ArrayList<>();
        do{
            System.out.println("Qual o tipo de conta você deseja?");
            System.out.println("1 - Conta");
            System.out.println("2 - Conta Especial");
            System.out.println("3 - Conta Poupança");
            System.out.println("4 - Deposito");
            System.out.println("5 - Saque");
            System.out.println("6 - Reajuste");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    c = new Conta(1, 0.00);
                    System.out.println("Conta criada com sucesso!");
                    break;
                case 2:
                    c = new ContaEspecial(2, 0.00, 100.00);
                    System.out.println("Conta Especial criada com sucesso!");
                    break;
                case 3:
                    c = new ContaPoupanca(3, 0.00);
                    System.out.println("Conta Poupança criada com sucesso!");
                    break;
                case 4:
                    System.out.println("Digite um valor a depositar: ");
                    deposito = sc.nextDouble();
                    c.depositar(deposito);
                    System.out.println(c.getSaldo());
                    break;
                case 5:
                    System.out.println("Digite um valor a sacar: ");
                    saque = sc.nextDouble();
                    c.sacar(saque);
                    System.out.println(c.getSaldo());
                    break;
                case 6:
                    System.out.println("Digite a taxa selic: ");
                    reajuste = sc.nextDouble();
                    ((ContaPoupanca) c).reajustar(reajuste);
                    System.out.println(c.getSaldo());
                    break;
            }
            contas.add(c);
        }while (opcao != 0);
    }
}