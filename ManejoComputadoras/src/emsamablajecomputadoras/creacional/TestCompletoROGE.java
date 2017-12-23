package emsamablajecomputadoras.creacional;

public class TestCompletoROGE extends TestRoge{

	public TestCompletoROGE() {}
	
	public TestCompletoROGE(Computador computador) {
		this.computador = computador;
		sucesor = null;
	}
	
	@Override
	protected void handle() {
		if(!computador.getPlaca().getModelo().equals("Strix")) {
			error();
			return;
		}
		if(!computador.getPlaca().getNumeracion().equals("x99")) {
			error();
			return;
		}
		satisfactorio();
	}

}
