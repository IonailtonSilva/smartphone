package funcionalidades;

public class testarPhone {
   
public static void main(String[] args) {

    telefoneSmart telefone = new telefoneSmart();

    telefone.nome = "Iphone";
    telefone.marca = "Apple";
    telefone.versao = 11;
    telefone.volume = 10;

    telefone.aumentodevolume(2);
    telefone.tocarmusica(false);
    telefone.controledefaixa(1, 1);
    telefone.reducaodevolume(2);

    telefone.realizarchamada(null);
    telefone.acessoNavegador(null);
    
    }
}
