public class App {
    public static void main(String[] args) {
        Iphone modelo1 = new Iphone();
        modelo1.setModelo("Iphone7");
        modelo1.setCor("Branco");

        modelo1.ligar("Rodrigo");
        modelo1.atender();
        modelo1.iniciarCorreioVoz();

        modelo1.exibirPagina("google.com");
        modelo1.adicionarNovaAba();
        modelo1.atualizarPagina();

        modelo1.selecionarMusica("BLUE - Billie Eilish");
        modelo1.tocar();
        modelo1.pausar();
    }
}
