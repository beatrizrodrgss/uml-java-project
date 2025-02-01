// Interface Reprodutor
interface ReprodutorMusical {
    void tocarMusica();
}

// Interface AparelhoTelefonico
interface AparelhoTelefonico {
    void fazerChamada();
}

// Interface NavegadorInternet
interface NavegadorInternet {
    void navegarInternet();
}

// Classe iPhone implementa todas as interfaces
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    
    // Implementação de tocar música
    @Override
    public void tocarMusica() {
        System.out.println("Tocando música...");
    }

    // Implementação de fazer chamada
    @Override
    public void fazerChamada() {
        System.out.println("Fazendo chamada...");
    }

    // Implementação de navegar na internet
    @Override
    public void navegarInternet() {
        System.out.println("Navegando na internet...");
    }

    public static void main(String[] args) {
        // Criar o objeto iPhone
        iPhone meuIphone = new iPhone();
        
        // Usar as funcionalidades do iPhone
        meuIphone.tocarMusica();
        meuIphone.fazerChamada();
        meuIphone.navegarInternet();
    }
}
