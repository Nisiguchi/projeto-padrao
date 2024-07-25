package facade;

import subsistemacep.cepApi;
import subsistemacrm.crmService;

public class fac {
    public void migrarCliente(String nome, String cep) {
        String cidade = cepApi.getInstancia().recuperarCidade(cep);
        String estado = cepApi.getInstancia().recuperarCidade(cep);


        crmService.gravarCliente(nome, cep, cidade, estado);

    }
}
