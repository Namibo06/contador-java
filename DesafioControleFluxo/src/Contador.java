import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm,parametroDois);
        }catch (ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int paramentroUm,int parametroDois) throws ParametrosInvalidosException{
        if(paramentroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - paramentroUm;

        for (int i=0;i <= contagem;i++){
            System.out.println(i);
        }
    }
}
