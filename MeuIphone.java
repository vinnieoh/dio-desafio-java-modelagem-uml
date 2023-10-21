// Interface ReprodutorMusical
interface ReprodutorMusical {
    public void tocar();
    public void pausar();
    public void selecionarMusica();
}

// Interface AparelhoTelefonico
interface AparelhoTelefonico {
    public void ligar();
    public void atender();
    public void iniciarCorreioVoz();
}

// Interface NavegadorInternet
interface NavegadorInternet {
    public void exibirPagina();
    public void adicionarNovaAba();
    public void atualizarPagina();
}

// Classe MeuiPhone implementando as interfaces
class MeuIphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // Implementações das funções da interface ReprodutorMusical
    public void tocar() {
        System.out.println("Música tocando...");
    }

    public void pausar() {
        System.out.println("Música pausada...");
    }

    public void selecionarMusica() {
        System.out.println("Música selecionada...");
    }

    // Implementações das funções da interface AparelhoTelefonico
    public void ligar() {
        System.out.println("Ligando...");
    }

    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    // Implementações das funções da interface NavegadorInternet
    public void exibirPagina() {
        System.out.println("Exibindo página da Internet...");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página da Internet...");
    }
}