package padroes.gof.facade.subsistema2.cep;

public class CepApi {
	
private static CepApi instancia = new CepApi();
	
	private CepApi() {
		super();
	}
	
	public static CepApi getInstancia() {
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "Florianopolis";
	}
	
	public String recuperarEstado(String cep) {
		return "Santa Catarina";
	}
}
