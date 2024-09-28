import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Boolean continuar = true;
        Scanner scanner = new Scanner(System.in);
        Float nota1, nota2, nota3, nota4, mediafinal;
        while(continuar) {
            System.out.println("Digite a nota da primeira prova: ");
            nota1 = scanner.nextFloat();
            System.out.println("Digite a nota da segunda prova: ");
            nota2 = scanner.nextFloat();
            System.out.println("Digite a nota da terceira prova: ");
            nota3 = scanner.nextFloat();
            System.out.println("Digite a nota da quarta prova: ");
            nota4 = scanner.nextFloat();

            mediafinal = (nota1 + nota2 + nota3 + nota4) / 4;

            if(mediafinal >= 7) {
                System.out.println("A média final do aluno foi : " + mediafinal);
                System.out.println("O aluno está aprovado com sucesso!");


            } else if (mediafinal >= 5) {
                System.out.println("A média final do aluno foi : " + mediafinal);
                System.out.println("O aluno está em recuperação!");

            } else {
                System.out.println("A média final do aluno foi : " + mediafinal);
                System.out.println("O aluno foi reprovado!");
            }
            System.out.println("Deseja calcular outra média? (s/n)");
            char resposta = scanner.next().charAt(0);
            continuar = (resposta == 's' || resposta == 'S');

        }
        scanner.close();
        System.out.println("Fim do programa");
    }
    }
