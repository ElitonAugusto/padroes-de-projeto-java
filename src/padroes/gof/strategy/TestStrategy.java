package padroes.gof.strategy;

public class TestStrategy {

	public static void main(String[] args) {
		
		Coreografia samba = new CoreografiaSamba(); 
		Coreografia axe = new CoreografiaAxe(); 
		Coreografia tango = new CoreografiaTango();
		
		Bailarina bailarina = new Bailarina();
		bailarina.setCoreografia(samba);
		bailarina.dancar();
		bailarina.dancar();
		bailarina.dancar();
		bailarina.setCoreografia(axe);
		bailarina.dancar();
		bailarina.dancar();
		bailarina.dancar();
		bailarina.setCoreografia(tango);
		bailarina.dancar();
		bailarina.dancar();
		bailarina.dancar();

	}
}
