package br.com.heranca;

public class Main {
    public static void main(String[] args) {
        Ave andorinha = new Ave();
        Mamifero baleia = new Mamifero();

        andorinha.nome = "Andorita";
        andorinha.cor = "azul royal e branco";
        andorinha.emiteSom = true;
        andorinha.vivo = true;
        baleia.nome = "FreWily";
        baleia.cor = "preto e branco";
        baleia.emiteSom = true;
        baleia.vivo = true;
        andorinha.corDasPenas = "azul";
        andorinha.temPenas = true;
        andorinha.alturaDoVoo = 30L;
        baleia.consomeLeite = true;

        String baleiaEhMamifero = baleia.isMamifero();
        System.out.println(baleiaEhMamifero);

    }
}
