public class Iphone implements NavegadorInternet, AparelhoTelefonico, ReprodutorMusical {
    @Override
    public void ligar(String numero)  {
        System.out.println("Ligando!");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada!");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz!");

    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo Página!");

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada!");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada!");

    }

    @Override
    public void tocar() {
        System.out.println("Música tocando!");

    }

    @Override
    public void pausar() {
        System.out.println("Música pausada!");

    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada!");

    }

    public static void main(String[] args) {
            Iphone iphone = new Iphone();

            iphone.ligar("123456789");
            iphone.atender();
            iphone.iniciarCorreioVoz();
            iphone.exibirPagina("www.google.com");
            iphone.adicionarNovaAba();
            iphone.atualizarPagina();
            iphone.tocar();
            iphone.pausar();
            iphone.selecionarMusica("I got a feeling");
        }
    }