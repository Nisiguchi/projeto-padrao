package subsistemacep;

public class cepApi {

    private static cepApi instancia = new cepApi();

    private cepApi() {
        super();
    }
    
    public static cepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Araquara";
    }

    public String recuperarEstado(String cep) {
        return "SPO";
    }
}
