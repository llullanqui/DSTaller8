package emsamablajecomputadoras.creacional;

public class TestCompletoZenbook extends TestZenbook{
	
	public TestCompletoZenbook() {}
	
	public TestCompletoZenbook(Computador computador) {
		this.computador = computador;
		sucesor = null;
	}
	
	public void handle() {
		if(!computador.getPlaca().getModelo().equals("Prime")) {
			error();
			return;
		}
		if(!computador.getPlaca().getNumeracion().equals("Z370")) {
			error();
			return;
		}
		satisfactorio();
	}
}
