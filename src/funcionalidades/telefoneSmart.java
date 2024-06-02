package funcionalidades;

import java.util.Scanner;

public class telefoneSmart {


    String nome;
    String marca;
    int versao;
    int volume;

   
    public void aumentodevolume(int aumentarvol) {
        if (volume + aumentarvol > 100) {
            volume = 100;
            System.out.println("Volume máximo atingido!");
        } else {
            volume += aumentarvol;
            System.out.println("Volume aumentado para: " + volume + " pts");
        }
    }

    public void reducaodevolume(int baixarvol) {
        if (volume - baixarvol < 0) {
            volume = 0;
            System.out.println("Volume mínimo atingido!");
        } else {
            volume -= baixarvol;
            System.out.println("Volume reduzido para: " + volume + " pts");
        }
    }

    public void tocarmusica(boolean tocar) {
        if (tocar == true) {
            System.out.println("Iniciando a música...");
        } else {
            System.out.println("Música pausada...");
        }
    }

    public void controledefaixa(int avancarfaixa, int retrocederfaixa) {
        if (avancarfaixa == 0 && retrocederfaixa == 0 || (avancarfaixa == 1 && retrocederfaixa == 1)) {
            System.out.println("Comando inválido! Escolha entre avançar ou retroceder uma faixa.");
            return;
        }

        if (avancarfaixa == 1) {
            System.out.println("Avançando faixa...");
        } else if (retrocederfaixa == 1) {
            System.out.println("Retrocedendo faixa...");
        }
    }

    public void realizarchamada(String numerotel) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("\nPronto para realizar chamadas, digite o Nº telefone: ");
            numerotel = scanner.next();

            System.out.println("Discando Para numero: " + numerotel);
            System.out.println("Chamando...");
            System.out.println("Desligando...\n");

        }
 
    

    public void acessoNavegador(String meusite){

       Scanner scanner = new Scanner(System.in);
            System.out.println("Acessando Navegador...");
            System.out.println("Digite A URL: ");
            meusite = scanner.next();
            
            System.out.println("Acessando URL: "+"https://www." + meusite + ".com.br");
            
            int opcao;
            System.out.println("Digite 1 para NovaAba ou 2 para Atualizar");
            opcao = scanner.nextInt();
            
            switch(opcao){
                
                case 1 -> System.out.println("Abrindo Nova Aba");
                case 2 -> System.out.println("Atualizando");
                default -> System.out.println("Encerrando...");
            
        }scanner.close();
 }
    
}
