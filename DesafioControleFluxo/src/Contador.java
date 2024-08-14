import java.util.Scanner;

public class Contador {
    public static void main(String[] args){
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segumento parâmetro");
        int parametroDois = terminal.nextInt();


        try {
            //chamando método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        }
        catch (ParametrosInvalidosException exception){
            System.out.println(exception.mensagemErro);
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        //validar se parametroUm é maior que parametroDois e lançar exceção
        if(parametroUm >= parametroDois){
            throw new ParametrosInvalidosException("ParâmetroUm maior que ParâmetroDois");
        }

        for(int i = 1; i <= (parametroDois - parametroUm); i++){
            System.out.println("imprimindo número " + i);
        }

        int contagem = parametroDois - parametroUm;
    }
}
