public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    private String modelo;
    private String cor;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo....");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a pagina: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando musica: " + musica);
    }
}
