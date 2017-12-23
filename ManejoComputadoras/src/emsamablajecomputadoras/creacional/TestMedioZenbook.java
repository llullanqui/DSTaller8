package emsamablajecomputadoras.creacional;

public class TestMedioZenbook extends TestZenbook{
	
	public TestMedioZenbook() {}
	
	public TestMedioZenbook(Computador computador) {
		this.computador = computador;
		sucesor = new TestCompletoZenbook(computador);
	}
	
	public void handle() {
		if(!computador.getModelo().equals("Zenbook")) {
			error();
			return;
		}
		if(computador.getAlmacenamiento()!=500) {
			error();
			return;
		}
		sucesor.handle();
	}
}
