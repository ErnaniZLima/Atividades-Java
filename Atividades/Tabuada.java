import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) throws Exception{
    Scanner Teclado = new Scanner(System.in);

    int numero, valorFinal, i;
    try{
        System.out.print("Digite o Numero da tabuada que voce precisa: ");
        numero = Teclado.nextInt();

        System.out.print("Digite ate qual numero da tabuada que voce precisa: ");
        valorFinal = Teclado.nextInt();
        
        System.out.printf("Tabuada do %s \n\n", numero);

        for(i = 1;i <= valorFinal; i++){
            System.out.println("| "+ numero + " x " + i + " = "+ numero * i);
        }
    }catch(Exception error){
        System.out.printf("Voce Deve inserir um numero inteiro, Erro: %s", error);
    }

    Teclado.close();
    }
}
