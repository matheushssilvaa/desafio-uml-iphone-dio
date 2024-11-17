package app;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Implementação de métodos do ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void parar() {
        System.out.println("Música parada.");
    }

    // Implementação de métodos do AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + "...");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando a ligação...");
    }

    @Override
    public void receberChamada() {
        System.out.println("Recebendo chamada...");
    }

    // Implementação de métodos do NavegadorInternet
    @Override
    public void abrirPagina(String url) {
        System.out.println("Abrindo a página: " + url);
    }

    @Override
    public void fecharPagina() {
        System.out.println("Página fechada.");
    }
}
