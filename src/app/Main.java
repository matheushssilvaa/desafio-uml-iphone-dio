package app;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        // Testando o Reprodutor Musical
        iphone.tocar();
        iphone.pausar();
        iphone.parar();

        // Testando o Aparelho Telefônico
        iphone.ligar("123-456-789");
        iphone.receberChamada();
        iphone.desligar();

        // Testando o Navegador Internet
        iphone.abrirPagina("https://www.exemplo.com");
        iphone.fecharPagina();
    }
}
