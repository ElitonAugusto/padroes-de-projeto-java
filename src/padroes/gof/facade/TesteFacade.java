package padroes.gof.facade;

public class TesteFacade {

	public static void main(String[] args) {
		
		Facade facade = new Facade();
		facade.migrarCliente("Brenda", "88010-000");
	}
}
