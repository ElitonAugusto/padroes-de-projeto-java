package padroes.gof.strategy;

public class Bailarina {
	
	private Coreografia coreografia;

	public void setCoreografia(Coreografia coreografia) {
		this.coreografia = coreografia;
	}
	
	public void dancar() {
		coreografia.dancar();
	}
}
